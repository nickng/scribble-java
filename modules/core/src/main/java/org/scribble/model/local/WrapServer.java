package org.scribble.model.local;

import org.scribble.model.global.GWrapServer;
import org.scribble.sesstype.Payload;
import org.scribble.sesstype.name.Op;
import org.scribble.sesstype.name.Role;

public class WrapServer extends IOAction
{
	public WrapServer(Role peer)
	{
		super(peer, Op.EMPTY_OPERATOR, Payload.EMPTY_PAYLOAD);
	}
	
	@Override
	public Connect toDual(Role self)
	{
		return new Connect(self);
	}

	@Override
	public GWrapServer toGlobal(Role self)
	{
		return new GWrapServer(self, this.peer);
	}
	
	@Override
	public int hashCode()
	{
		int hash = 1063;
		hash = 31 * hash + super.hashCode();
		return hash;
	}
	
	@Override
	public boolean isAccept()
	{
		return true;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof WrapServer))
		{
			return false;
		}
		return ((WrapServer) o).canEqual(this) && super.equals(o);
	}

	public boolean canEqual(Object o)
	{
		return o instanceof WrapServer;
	}

	@Override
	protected String getCommSymbol()
	{
		return "??wrap";
	}
}
