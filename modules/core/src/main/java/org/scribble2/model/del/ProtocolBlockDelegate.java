package org.scribble2.model.del;


public abstract class ProtocolBlockDelegate extends CompoundInteractionDelegate
{
	/*@Override
	public WellFormedChoiceChecker enterWFChoiceCheck(ModelNode parent, ModelNode child, WellFormedChoiceChecker checker) throws ScribbleException
	{
		WellFormedChoiceEnv env = checker.peekEnv().push();
		checker.pushEnv(env);
		return checker;
	}*
	
	/*@Override
	public ProtocolBlock<? extends InteractionSequence<? extends InteractionNode>> leaveWFChoiceCheck(ModelNode parent, ModelNode child, WellFormedChoiceChecker checker, ModelNode visited) throws ScribbleException
	{
		WellFormedChoiceEnv env = checker.popEnv();
		//env = checker.popEnv().merge(env);
		//checker.pushEnv(env);
		setEnv(env);
		return (CompoundInteractionNode) visited;
	}*/
}
