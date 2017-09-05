package org.scribble.ext.go.core.main;

import java.nio.file.Path;

import org.scribble.ext.go.ast.ParamAstFactory;
import org.scribble.ext.go.ast.ParamAstFactoryImpl;
import org.scribble.ext.go.core.model.endpoint.ParamCoreEModelFactory;
import org.scribble.ext.go.core.model.endpoint.ParamCoreEModelFactoryImpl;
import org.scribble.ext.go.main.ParamJob;
import org.scribble.ext.go.parser.scribble.ParamAntlrToScribParser;
import org.scribble.ext.go.parser.scribble.ParamScribbleAntlrWrapper;
import org.scribble.main.MainContext;
import org.scribble.main.ScribbleException;
import org.scribble.main.resource.ResourceLocator;
import org.scribble.parser.scribble.ScribbleAntlrWrapper;
import org.scribble.util.ScribParserException;

public class ParamCoreMainContext extends MainContext
{
	// Load main module from file system
	public ParamCoreMainContext(boolean debug, ResourceLocator locator, Path mainpath, boolean useOldWF, boolean noLiveness, boolean minEfsm,
			boolean fair, boolean noLocalChoiceSubjectCheck, boolean noAcceptCorrelationCheck, boolean noValidation)
					throws ScribParserException, ScribbleException
	{
		super(debug, locator, mainpath, useOldWF, noLiveness, minEfsm, fair, noLocalChoiceSubjectCheck, noAcceptCorrelationCheck, noValidation);
	}

	@Override
	public ParamJob newJob()
	{
		return new ParamJob(this.debug, this.getParsedModules(), this.main, this.useOldWF, this.noLiveness, this.minEfsm, this.fair,
				this.noLocalChoiceSubjectCheck, this.noAcceptCorrelationCheck, this.noValidation,
				this.af, this.ef, this.sf);
	}

	@Override
	protected ScribbleAntlrWrapper newAntlrParser()
	{
		return new ParamScribbleAntlrWrapper();
	}
	
	@Override
	protected ParamAntlrToScribParser newScribParser()
	{
		return new ParamAntlrToScribParser();
	}
	
	@Override
	protected ParamAstFactory newAstFactory()
	{
		return new ParamAstFactoryImpl();
	}
	
	@Override
	protected ParamCoreEModelFactory newEModelFactory()
	{
		return new ParamCoreEModelFactoryImpl();  // HACK FIXME
	}
	
	/*@Override
	protected SModelFactory newSModelFactory()
	{
		//return new ParamSModelFactoryImpl();
		return new ParamCoreSModelFactoryImpl();  // HACK FIXME
	}*/
}
