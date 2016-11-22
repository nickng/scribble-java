package org.scribble.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.scribble.main.RuntimeScribbleException;
import org.scribble.main.ScribbleException;
import org.scribble.sesstype.kind.ProtocolKind;

public abstract class MState<
		L,                             // Node label type (cosmetic)
		A extends MAction<K>,          // Edge type
		S extends MState<L, A, S, K>,  // State type
		K extends ProtocolKind         // Global/Local
>
{
	private static int count = 0;  // FIXME: factor out with ModelAction
	
	public final int id;

	protected final Set<L> labs;  // Was RecVar and SubprotocolSigs, now using inlined protocol for FSM building so just RecVar

	// **: clients should use the pair of getAllAcceptable/getSuccessors for correctness -- getAcceptable/accept don't support non-det
	//protected final LinkedHashMap<A, S> edges;  // Want predictable ordering of entries for e.g. API generation (state enumeration)*/
	protected final List<A> actions;
	protected final List<S> succs;
	
	public MState(Set<L> labs)  // Immutable singleton node
	{
		this.id = MState.count++;
		this.labs = new HashSet<>(labs);
		this.actions = new LinkedList<>();
		this.succs = new LinkedList<>();
	}
	
	protected void addLabel(L lab)
	{
		this.labs.add(lab);
	}
	
	protected final void removeEdge(A a, S s) throws ScribbleException
	{
		Iterator<A> ia = this.actions.iterator();
		Iterator<S> is = this.succs.iterator();
		while (ia.hasNext())
		{
			A tmpa = ia.next();
			S tmps = is.next();
			if (tmpa.equals(a) && tmps.equals(s))
			{
				ia.remove();
				is.remove();
				return;
			}
		}
		//throw new RuntimeException("No such transition to remove: " + a + "->" + s);
		throw new ScribbleException("No such transition to remove: " + a + "->" + s);  // Hack? EFSM building on bad-reachability protocols now done before actual reachability check
	}
	
	// Mutable (can also overwrite edges)
	//protected final void addEdge(A a, S s)
	public final void addEdge(A a, S s)  // FIXME: currently public for GMChecker building -- make a global version of EGraphBuilderUtil
	{
		//this.edges.put(a, s);
		Iterator<A> as = this.actions.iterator();  // Needed?..
		Iterator<S> ss = this.succs.iterator();
		while (as.hasNext())  // Duplicate edges preemptively pruned here, but could leave to later minimisation
		{
			A tmpa = as.next();
			S tmps = ss.next();
			if (tmpa.equals(a) && tmps.equals(s))
			{
				return;
			}
		}  // ..needed?
		this.actions.add(a);
		this.succs.add(s);
	}
	
	public final Set<L> getRecLabels()
	{
		return Collections.unmodifiableSet(this.labs);
	}
	
	// The "deterministic" variant, c.f., getAllTakeable
	public final List<A> getActions()
	{
		Set<A> as = new HashSet<>(this.actions);
		if (as.size() != this.actions.size())
		{
			throw new RuntimeScribbleException("[TODO] Non-deterministic state: " + this.actions + "  (Try -minlts if available)");  // This getter checks for determinism -- affects e.g. API generation  
		}
		//return as;
		return getAllActions();
	}

	public final List<A> getAllActions()
	{
		return Collections.unmodifiableList(this.actions);
	}
	
	public final boolean hasAction(A a)
	{
		return this.actions.contains(a);
	}

	public final S getSuccessor(A a)
	{
		Set<A> as = new HashSet<>(this.actions);
		if (as.size() != this.actions.size())
		{
			throw new RuntimeException("FIXME: " + this.actions);
		}
		return getSuccessors(a).get(0);
	}

	// For non-deterministic actions
	public final List<S> getSuccessors(A a)
	{
		return IntStream.range(0, this.actions.size())
			.filter((i) -> this.actions.get(i).equals(a))
			.mapToObj((i) -> this.succs.get(i))
			.collect(Collectors.toList());
	}
	
	public final List<S> getSuccessors()
	{
		Set<A> as = new HashSet<>(this.actions);
		if (as.size() != this.actions.size())
		{
			throw new RuntimeScribbleException("[TODO] Non-deterministic state: " + this.actions + "  (Try -minlts if available)");  // This getter checks for determinism -- affects e.g. API generation  
		}
		return getAllSuccessors();
	}

	public final List<S> getAllSuccessors()
	{
		return Collections.unmodifiableList(this.succs);
	}

	public final boolean isTerminal()
	{
		return this.actions.isEmpty();
	}

	public static <L, A extends MAction<K>, S extends MState<L, A, S, K>, K extends ProtocolKind>
			S getTerminal(S start)
	{
		if (start.isTerminal())
		{
			return start;
		}
		Set<S> terms = MState.getAllReachableStates(start).stream().filter((s) -> s.isTerminal()).collect(Collectors.toSet());
		if (terms.size() > 1)
		{
			throw new RuntimeException("Shouldn't get in here: " + terms);
		}
		return (terms.isEmpty()) ? null : terms.iterator().next();  // FIXME: return empty Set instead of null?
	}
	
	public boolean canReach(MState<L, A, S, K> s)
	{
		return MState.getAllReachableStates(this).contains(s);
	}

	// Note: doesn't implicitly include start (only if start is explicitly reachable from start, of course)
	/*public static <A extends ModelAction<K>, S extends ModelState<A, S, K>, K extends ProtocolKind>
			Set<S> getAllReachable(S start)*/
	@SuppressWarnings("unchecked")
	public static <L, A extends MAction<K>, S extends MState<L, A, S, K>, K extends ProtocolKind>
			Set<S> getAllReachableStates(MState<L, A, S, K> start)
	{
		Map<Integer, S> all = new HashMap<>();
		Map<Integer, S> todo = new LinkedHashMap<>();
		todo.put(start.id, (S) start);  // Suppressed: assumes ModelState subclass correctly instantiates S parameter
		while (!todo.isEmpty())
		{
			Iterator<S> i = todo.values().iterator();
			S next = i.next();
			todo.remove(next.id);
			/*if (all.containsKey(next.id))
			{
				continue;
			}
			all.put(next.id, next);*/
			for (S s : next.getAllSuccessors())
			{
				/*if (!all.containsKey(s.id) && !todo.containsKey(s.id))
				{
					todo.put(s.id, s);
				}*/
				if (!all.containsKey(s.id))
				{	
					all.put(s.id, s);
					//if (!todo.containsKey(s.id))  // Redundant
					{
						todo.put(s.id, s);
					}
				}
			}
		}
		return new HashSet<>(all.values());
	}

	@SuppressWarnings("unchecked")
	public static <L, A extends MAction<K>, S extends MState<L, A, S, K>, K extends ProtocolKind>
			//Set<A> getAllReachableActions(S start)
			Set<A> getAllReachableActions(MState<L, A, S, K> start)
	{
		Set<S> all = new HashSet<>();
		all.add((S) start);  // Suppressed: assumes ModelState subclass correctly instantiates S parameter
		all.addAll(MState.getAllReachableStates(start));
		Set<A> as = new HashSet<>();
		for (S s : all)
		{
			as.addAll(s.getAllActions());
		}
		return as;
	}

	@Override
	public int hashCode()
	{
		int hash = 73;
		hash = 31 * hash + this.id;
		return hash;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof MState))
		{
			return false;
		}
		return ((MState<?, ?, ?, ?>) o).canEquals(this) && this.id == ((MState<?, ?, ?, ?>) o).id;  // Good to use id, due to edge mutability
	}
	
	protected abstract boolean canEquals(MState<?, ?, ?, ?> s);

	@Override
	public String toString()
	{
		return Integer.toString(this.id);  // FIXME -- ?
	}
}
