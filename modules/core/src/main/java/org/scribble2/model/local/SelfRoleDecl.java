package org.scribble2.model.local;

import org.scribble2.model.RoleDecl;
import org.scribble2.model.del.ModelDelegate;
import org.scribble2.model.name.simple.RoleNode;
import org.scribble2.model.name.simple.SimpleNameNode;
//import scribble2.sesstype.name.NameDeclaration;

public class SelfRoleDecl extends RoleDecl
{
	public SelfRoleDecl(RoleNode rn)
	{
		super(rn);
	}

	/*@Override
	public SelfRoleDecl visitChildren(ModelVisitor nv) throws ScribbleException
	{
		NameDecl<? extends PrimitiveNameNode> nd = super.visitChildren(nv);
		return new SelfRoleDecl(nd.ct, (RoleNode) nd.name);
	}*/

	@Override
	protected RoleDecl reconstruct(SimpleNameNode snn)
	{
		ModelDelegate del = del();
		RoleDecl rd = new RoleDecl((RoleNode) snn);
		rd = (RoleDecl) rd.del(del);
		return rd;
	}
	
	@Override
	public boolean isSelfRoleDecl()
	{
		return true;
	}

	/*@Override
	public String toString()
	{
		return AntlrConstants.SELF_KW + " " + this.name;
	}*/
}
