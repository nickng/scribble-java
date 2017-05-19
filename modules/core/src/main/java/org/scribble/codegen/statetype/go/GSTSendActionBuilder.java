package org.scribble.codegen.statetype.go;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.scribble.codegen.statetype.STAPIBuilder;
import org.scribble.codegen.statetype.STSendActionBuilder;
import org.scribble.model.endpoint.EState;
import org.scribble.model.endpoint.actions.EAction;

public class GSTSendActionBuilder extends STSendActionBuilder
{

	@Override
	public String getSTActionName(STAPIBuilder api, EAction a)
	{
		return "Send_" + api.role + "_" + a.mid;
	}

	@Override
	public String buildArgs(EAction a)
	{
		return IntStream.range(0, a.payload.elems.size()) 
					.mapToObj(i -> "arg" + i + " " + a.payload.elems.get(i)).collect(Collectors.joining(", "));
	}

	@Override
	public String buildBody(STAPIBuilder api, EAction a, EState succ)
	{
		return 
				  IntStream.range(0, a.payload.elems.size())
				           .mapToObj(i -> "role" + api.role + "," + a.peer + " <- arg" + i).collect(Collectors.joining("\n"))
				+ "return " + buildReturn(api, succ);
	}
}
