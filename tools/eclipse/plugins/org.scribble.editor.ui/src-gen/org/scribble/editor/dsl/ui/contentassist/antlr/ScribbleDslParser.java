/*
* generated by Xtext
*/
package org.scribble.editor.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.scribble.editor.dsl.services.ScribbleDslGrammarAccess;

public class ScribbleDslParser extends AbstractContentAssistParser {
	
	@Inject
	private ScribbleDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.scribble.editor.dsl.ui.contentassist.antlr.internal.InternalScribbleDslParser createParser() {
		org.scribble.editor.dsl.ui.contentassist.antlr.internal.InternalScribbleDslParser result = new org.scribble.editor.dsl.ui.contentassist.antlr.internal.InternalScribbleDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModuleAccess().getAlternatives_5(), "rule__Module__Alternatives_5");
					put(grammarAccess.getImportDeclAccess().getAlternatives(), "rule__ImportDecl__Alternatives");
					put(grammarAccess.getGlobalProtocolDeclAccess().getAlternatives_8(), "rule__GlobalProtocolDecl__Alternatives_8");
					put(grammarAccess.getParameterDeclAccess().getAlternatives(), "rule__ParameterDecl__Alternatives");
					put(grammarAccess.getArgumentAccess().getAlternatives(), "rule__Argument__Alternatives");
					put(grammarAccess.getGlobalInteractionAccess().getAlternatives(), "rule__GlobalInteraction__Alternatives");
					put(grammarAccess.getMessageAccess().getAlternatives(), "rule__Message__Alternatives");
					put(grammarAccess.getLocalProtocolDeclAccess().getAlternatives_10(), "rule__LocalProtocolDecl__Alternatives_10");
					put(grammarAccess.getLlobalInteractionAccess().getAlternatives(), "rule__LlobalInteraction__Alternatives");
					put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
					put(grammarAccess.getModuleNameAccess().getGroup(), "rule__ModuleName__Group__0");
					put(grammarAccess.getModuleNameAccess().getGroup_1(), "rule__ModuleName__Group_1__0");
					put(grammarAccess.getImportModuleAccess().getGroup(), "rule__ImportModule__Group__0");
					put(grammarAccess.getImportModuleAccess().getGroup_2(), "rule__ImportModule__Group_2__0");
					put(grammarAccess.getImportMemberAccess().getGroup(), "rule__ImportMember__Group__0");
					put(grammarAccess.getImportMemberAccess().getGroup_4(), "rule__ImportMember__Group_4__0");
					put(grammarAccess.getPayloadTypeDeclAccess().getGroup(), "rule__PayloadTypeDecl__Group__0");
					put(grammarAccess.getMessageSignatureAccess().getGroup(), "rule__MessageSignature__Group__0");
					put(grammarAccess.getMessageSignatureAccess().getGroup_3(), "rule__MessageSignature__Group_3__0");
					put(grammarAccess.getMessageSignatureAccess().getGroup_3_1(), "rule__MessageSignature__Group_3_1__0");
					put(grammarAccess.getPayloadElementAccess().getGroup(), "rule__PayloadElement__Group__0");
					put(grammarAccess.getPayloadElementAccess().getGroup_0(), "rule__PayloadElement__Group_0__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup(), "rule__GlobalProtocolDecl__Group__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_3(), "rule__GlobalProtocolDecl__Group_3__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_3_2(), "rule__GlobalProtocolDecl__Group_3_2__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_6(), "rule__GlobalProtocolDecl__Group_6__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_8_1(), "rule__GlobalProtocolDecl__Group_8_1__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_8_1_2(), "rule__GlobalProtocolDecl__Group_8_1_2__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_8_1_2_2(), "rule__GlobalProtocolDecl__Group_8_1_2_2__0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getGroup_8_1_5(), "rule__GlobalProtocolDecl__Group_8_1_5__0");
					put(grammarAccess.getRoleDeclAccess().getGroup(), "rule__RoleDecl__Group__0");
					put(grammarAccess.getRoleDeclAccess().getGroup_2(), "rule__RoleDecl__Group_2__0");
					put(grammarAccess.getParameterDeclAccess().getGroup_0(), "rule__ParameterDecl__Group_0__0");
					put(grammarAccess.getParameterDeclAccess().getGroup_0_2(), "rule__ParameterDecl__Group_0_2__0");
					put(grammarAccess.getParameterDeclAccess().getGroup_1(), "rule__ParameterDecl__Group_1__0");
					put(grammarAccess.getParameterDeclAccess().getGroup_1_2(), "rule__ParameterDecl__Group_1_2__0");
					put(grammarAccess.getRoleInstantiationAccess().getGroup(), "rule__RoleInstantiation__Group__0");
					put(grammarAccess.getRoleInstantiationAccess().getGroup_1(), "rule__RoleInstantiation__Group_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_0(), "rule__Argument__Group_0__0");
					put(grammarAccess.getArgumentAccess().getGroup_0_1(), "rule__Argument__Group_0_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_1(), "rule__Argument__Group_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_1(), "rule__Argument__Group_1_1__0");
					put(grammarAccess.getGlobalProtocolBlockAccess().getGroup(), "rule__GlobalProtocolBlock__Group__0");
					put(grammarAccess.getGlobalMessageTransferAccess().getGroup(), "rule__GlobalMessageTransfer__Group__0");
					put(grammarAccess.getGlobalMessageTransferAccess().getGroup_5(), "rule__GlobalMessageTransfer__Group_5__0");
					put(grammarAccess.getGlobalChoiceAccess().getGroup(), "rule__GlobalChoice__Group__0");
					put(grammarAccess.getGlobalChoiceAccess().getGroup_4(), "rule__GlobalChoice__Group_4__0");
					put(grammarAccess.getGlobalRecursionAccess().getGroup(), "rule__GlobalRecursion__Group__0");
					put(grammarAccess.getGlobalContinueAccess().getGroup(), "rule__GlobalContinue__Group__0");
					put(grammarAccess.getGlobalParallelAccess().getGroup(), "rule__GlobalParallel__Group__0");
					put(grammarAccess.getGlobalParallelAccess().getGroup_2(), "rule__GlobalParallel__Group_2__0");
					put(grammarAccess.getGlobalInterruptibleAccess().getGroup(), "rule__GlobalInterruptible__Group__0");
					put(grammarAccess.getGlobalInterruptibleAccess().getGroup_1(), "rule__GlobalInterruptible__Group_1__0");
					put(grammarAccess.getGlobalInterruptAccess().getGroup(), "rule__GlobalInterrupt__Group__0");
					put(grammarAccess.getGlobalInterruptAccess().getGroup_1(), "rule__GlobalInterrupt__Group_1__0");
					put(grammarAccess.getGlobalDoAccess().getGroup(), "rule__GlobalDo__Group__0");
					put(grammarAccess.getGlobalDoAccess().getGroup_1(), "rule__GlobalDo__Group_1__0");
					put(grammarAccess.getGlobalDoAccess().getGroup_3(), "rule__GlobalDo__Group_3__0");
					put(grammarAccess.getGlobalDoAccess().getGroup_3_2(), "rule__GlobalDo__Group_3_2__0");
					put(grammarAccess.getGlobalDoAccess().getGroup_6(), "rule__GlobalDo__Group_6__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup(), "rule__LocalProtocolDecl__Group__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_5(), "rule__LocalProtocolDecl__Group_5__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_5_2(), "rule__LocalProtocolDecl__Group_5_2__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_8(), "rule__LocalProtocolDecl__Group_8__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_10_1(), "rule__LocalProtocolDecl__Group_10_1__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_10_1_2(), "rule__LocalProtocolDecl__Group_10_1_2__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_10_1_2_2(), "rule__LocalProtocolDecl__Group_10_1_2_2__0");
					put(grammarAccess.getLocalProtocolDeclAccess().getGroup_10_1_5(), "rule__LocalProtocolDecl__Group_10_1_5__0");
					put(grammarAccess.getLocalProtocolBlockAccess().getGroup(), "rule__LocalProtocolBlock__Group__0");
					put(grammarAccess.getLocalSendAccess().getGroup(), "rule__LocalSend__Group__0");
					put(grammarAccess.getLocalSendAccess().getGroup_3(), "rule__LocalSend__Group_3__0");
					put(grammarAccess.getLocalReceiveAccess().getGroup(), "rule__LocalReceive__Group__0");
					put(grammarAccess.getLocalChoiceAccess().getGroup(), "rule__LocalChoice__Group__0");
					put(grammarAccess.getLocalChoiceAccess().getGroup_4(), "rule__LocalChoice__Group_4__0");
					put(grammarAccess.getLocalRecursionAccess().getGroup(), "rule__LocalRecursion__Group__0");
					put(grammarAccess.getLocalContinueAccess().getGroup(), "rule__LocalContinue__Group__0");
					put(grammarAccess.getLocalParallelAccess().getGroup(), "rule__LocalParallel__Group__0");
					put(grammarAccess.getLocalParallelAccess().getGroup_2(), "rule__LocalParallel__Group_2__0");
					put(grammarAccess.getLocalinterruptibleAccess().getGroup(), "rule__Localinterruptible__Group__0");
					put(grammarAccess.getLocalinterruptibleAccess().getGroup_1(), "rule__Localinterruptible__Group_1__0");
					put(grammarAccess.getLocalThrowAccess().getGroup(), "rule__LocalThrow__Group__0");
					put(grammarAccess.getLocalThrowAccess().getGroup_2(), "rule__LocalThrow__Group_2__0");
					put(grammarAccess.getLocalThrowAccess().getGroup_5(), "rule__LocalThrow__Group_5__0");
					put(grammarAccess.getLocalCatchAccess().getGroup(), "rule__LocalCatch__Group__0");
					put(grammarAccess.getLocalCatchAccess().getGroup_2(), "rule__LocalCatch__Group_2__0");
					put(grammarAccess.getLocalDoAccess().getGroup(), "rule__LocalDo__Group__0");
					put(grammarAccess.getLocalDoAccess().getGroup_1(), "rule__LocalDo__Group_1__0");
					put(grammarAccess.getLocalDoAccess().getGroup_3(), "rule__LocalDo__Group_3__0");
					put(grammarAccess.getLocalDoAccess().getGroup_3_2(), "rule__LocalDo__Group_3_2__0");
					put(grammarAccess.getLocalDoAccess().getGroup_6(), "rule__LocalDo__Group_6__0");
					put(grammarAccess.getModuleAccess().getNameAssignment_1(), "rule__Module__NameAssignment_1");
					put(grammarAccess.getModuleAccess().getImportsAssignment_3(), "rule__Module__ImportsAssignment_3");
					put(grammarAccess.getModuleAccess().getTypesAssignment_4(), "rule__Module__TypesAssignment_4");
					put(grammarAccess.getModuleAccess().getGlobalsAssignment_5_0(), "rule__Module__GlobalsAssignment_5_0");
					put(grammarAccess.getModuleAccess().getLocalsAssignment_5_1(), "rule__Module__LocalsAssignment_5_1");
					put(grammarAccess.getImportModuleAccess().getNameAssignment_1(), "rule__ImportModule__NameAssignment_1");
					put(grammarAccess.getImportModuleAccess().getAliasAssignment_2_1(), "rule__ImportModule__AliasAssignment_2_1");
					put(grammarAccess.getImportMemberAccess().getNameAssignment_1(), "rule__ImportMember__NameAssignment_1");
					put(grammarAccess.getImportMemberAccess().getMemberAssignment_3(), "rule__ImportMember__MemberAssignment_3");
					put(grammarAccess.getImportMemberAccess().getAliasAssignment_4_1(), "rule__ImportMember__AliasAssignment_4_1");
					put(grammarAccess.getPayloadTypeDeclAccess().getSchemaAssignment_2(), "rule__PayloadTypeDecl__SchemaAssignment_2");
					put(grammarAccess.getPayloadTypeDeclAccess().getTypeAssignment_4(), "rule__PayloadTypeDecl__TypeAssignment_4");
					put(grammarAccess.getPayloadTypeDeclAccess().getLocationAssignment_6(), "rule__PayloadTypeDecl__LocationAssignment_6");
					put(grammarAccess.getPayloadTypeDeclAccess().getAliasAssignment_8(), "rule__PayloadTypeDecl__AliasAssignment_8");
					put(grammarAccess.getMessageSignatureAccess().getOperatorAssignment_1(), "rule__MessageSignature__OperatorAssignment_1");
					put(grammarAccess.getMessageSignatureAccess().getTypesAssignment_3_0(), "rule__MessageSignature__TypesAssignment_3_0");
					put(grammarAccess.getMessageSignatureAccess().getTypesAssignment_3_1_1(), "rule__MessageSignature__TypesAssignment_3_1_1");
					put(grammarAccess.getPayloadElementAccess().getNameAssignment_0_0(), "rule__PayloadElement__NameAssignment_0_0");
					put(grammarAccess.getPayloadElementAccess().getTypeAssignment_1(), "rule__PayloadElement__TypeAssignment_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getNameAssignment_2(), "rule__GlobalProtocolDecl__NameAssignment_2");
					put(grammarAccess.getGlobalProtocolDeclAccess().getParametersAssignment_3_1(), "rule__GlobalProtocolDecl__ParametersAssignment_3_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getParametersAssignment_3_2_1(), "rule__GlobalProtocolDecl__ParametersAssignment_3_2_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getRolesAssignment_5(), "rule__GlobalProtocolDecl__RolesAssignment_5");
					put(grammarAccess.getGlobalProtocolDeclAccess().getRolesAssignment_6_1(), "rule__GlobalProtocolDecl__RolesAssignment_6_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getBlockAssignment_8_0(), "rule__GlobalProtocolDecl__BlockAssignment_8_0");
					put(grammarAccess.getGlobalProtocolDeclAccess().getInstantiatesAssignment_8_1_1(), "rule__GlobalProtocolDecl__InstantiatesAssignment_8_1_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getArgumentsAssignment_8_1_2_1(), "rule__GlobalProtocolDecl__ArgumentsAssignment_8_1_2_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getArgumentsAssignment_8_1_2_2_1(), "rule__GlobalProtocolDecl__ArgumentsAssignment_8_1_2_2_1");
					put(grammarAccess.getGlobalProtocolDeclAccess().getRoleInstantiationsAssignment_8_1_4(), "rule__GlobalProtocolDecl__RoleInstantiationsAssignment_8_1_4");
					put(grammarAccess.getGlobalProtocolDeclAccess().getRoleInstantiationsAssignment_8_1_5_1(), "rule__GlobalProtocolDecl__RoleInstantiationsAssignment_8_1_5_1");
					put(grammarAccess.getRoleDeclAccess().getNameAssignment_1(), "rule__RoleDecl__NameAssignment_1");
					put(grammarAccess.getRoleDeclAccess().getAliasAssignment_2_1(), "rule__RoleDecl__AliasAssignment_2_1");
					put(grammarAccess.getParameterDeclAccess().getNameAssignment_0_1(), "rule__ParameterDecl__NameAssignment_0_1");
					put(grammarAccess.getParameterDeclAccess().getAliasAssignment_0_2_1(), "rule__ParameterDecl__AliasAssignment_0_2_1");
					put(grammarAccess.getParameterDeclAccess().getNameAssignment_1_1(), "rule__ParameterDecl__NameAssignment_1_1");
					put(grammarAccess.getParameterDeclAccess().getAliasAssignment_1_2_1(), "rule__ParameterDecl__AliasAssignment_1_2_1");
					put(grammarAccess.getRoleInstantiationAccess().getNameAssignment_0(), "rule__RoleInstantiation__NameAssignment_0");
					put(grammarAccess.getRoleInstantiationAccess().getAliasAssignment_1_1(), "rule__RoleInstantiation__AliasAssignment_1_1");
					put(grammarAccess.getArgumentAccess().getSignatureAssignment_0_0(), "rule__Argument__SignatureAssignment_0_0");
					put(grammarAccess.getArgumentAccess().getAliasAssignment_0_1_1(), "rule__Argument__AliasAssignment_0_1_1");
					put(grammarAccess.getArgumentAccess().getNameAssignment_1_0(), "rule__Argument__NameAssignment_1_0");
					put(grammarAccess.getArgumentAccess().getAliasAssignment_1_1_1(), "rule__Argument__AliasAssignment_1_1_1");
					put(grammarAccess.getGlobalProtocolBlockAccess().getActivitiesAssignment_2(), "rule__GlobalProtocolBlock__ActivitiesAssignment_2");
					put(grammarAccess.getGlobalMessageTransferAccess().getMessageAssignment_0(), "rule__GlobalMessageTransfer__MessageAssignment_0");
					put(grammarAccess.getGlobalMessageTransferAccess().getFromRoleAssignment_2(), "rule__GlobalMessageTransfer__FromRoleAssignment_2");
					put(grammarAccess.getGlobalMessageTransferAccess().getToRolesAssignment_4(), "rule__GlobalMessageTransfer__ToRolesAssignment_4");
					put(grammarAccess.getGlobalMessageTransferAccess().getToRolesAssignment_5_1(), "rule__GlobalMessageTransfer__ToRolesAssignment_5_1");
					put(grammarAccess.getMessageAccess().getParameterAssignment_1(), "rule__Message__ParameterAssignment_1");
					put(grammarAccess.getGlobalChoiceAccess().getRoleAssignment_2(), "rule__GlobalChoice__RoleAssignment_2");
					put(grammarAccess.getGlobalChoiceAccess().getBlocksAssignment_3(), "rule__GlobalChoice__BlocksAssignment_3");
					put(grammarAccess.getGlobalChoiceAccess().getBlocksAssignment_4_1(), "rule__GlobalChoice__BlocksAssignment_4_1");
					put(grammarAccess.getGlobalRecursionAccess().getLabelAssignment_1(), "rule__GlobalRecursion__LabelAssignment_1");
					put(grammarAccess.getGlobalRecursionAccess().getBlockAssignment_2(), "rule__GlobalRecursion__BlockAssignment_2");
					put(grammarAccess.getGlobalContinueAccess().getLabelAssignment_1(), "rule__GlobalContinue__LabelAssignment_1");
					put(grammarAccess.getGlobalParallelAccess().getBlocksAssignment_1(), "rule__GlobalParallel__BlocksAssignment_1");
					put(grammarAccess.getGlobalParallelAccess().getBlocksAssignment_2_1(), "rule__GlobalParallel__BlocksAssignment_2_1");
					put(grammarAccess.getGlobalInterruptibleAccess().getScopeAssignment_1_0(), "rule__GlobalInterruptible__ScopeAssignment_1_0");
					put(grammarAccess.getGlobalInterruptibleAccess().getBlockAssignment_2(), "rule__GlobalInterruptible__BlockAssignment_2");
					put(grammarAccess.getGlobalInterruptibleAccess().getInterruptsAssignment_5(), "rule__GlobalInterruptible__InterruptsAssignment_5");
					put(grammarAccess.getGlobalInterruptAccess().getMessagesAssignment_0(), "rule__GlobalInterrupt__MessagesAssignment_0");
					put(grammarAccess.getGlobalInterruptAccess().getMessagesAssignment_1_1(), "rule__GlobalInterrupt__MessagesAssignment_1_1");
					put(grammarAccess.getGlobalInterruptAccess().getRoleAssignment_3(), "rule__GlobalInterrupt__RoleAssignment_3");
					put(grammarAccess.getGlobalDoAccess().getScopeAssignment_1_0(), "rule__GlobalDo__ScopeAssignment_1_0");
					put(grammarAccess.getGlobalDoAccess().getMemberAssignment_2(), "rule__GlobalDo__MemberAssignment_2");
					put(grammarAccess.getGlobalDoAccess().getArgumentsAssignment_3_1(), "rule__GlobalDo__ArgumentsAssignment_3_1");
					put(grammarAccess.getGlobalDoAccess().getArgumentsAssignment_3_2_1(), "rule__GlobalDo__ArgumentsAssignment_3_2_1");
					put(grammarAccess.getGlobalDoAccess().getRolesAssignment_5(), "rule__GlobalDo__RolesAssignment_5");
					put(grammarAccess.getGlobalDoAccess().getRolesAssignment_6_1(), "rule__GlobalDo__RolesAssignment_6_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getNameAssignment_2(), "rule__LocalProtocolDecl__NameAssignment_2");
					put(grammarAccess.getLocalProtocolDeclAccess().getRoleAssignment_4(), "rule__LocalProtocolDecl__RoleAssignment_4");
					put(grammarAccess.getLocalProtocolDeclAccess().getParametersAssignment_5_1(), "rule__LocalProtocolDecl__ParametersAssignment_5_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getParametersAssignment_5_2_1(), "rule__LocalProtocolDecl__ParametersAssignment_5_2_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getRolesAssignment_7(), "rule__LocalProtocolDecl__RolesAssignment_7");
					put(grammarAccess.getLocalProtocolDeclAccess().getRolesAssignment_8_1(), "rule__LocalProtocolDecl__RolesAssignment_8_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getBlockAssignment_10_0(), "rule__LocalProtocolDecl__BlockAssignment_10_0");
					put(grammarAccess.getLocalProtocolDeclAccess().getInstantiatesAssignment_10_1_1(), "rule__LocalProtocolDecl__InstantiatesAssignment_10_1_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getArgumentsAssignment_10_1_2_1(), "rule__LocalProtocolDecl__ArgumentsAssignment_10_1_2_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getArgumentsAssignment_10_1_2_2_1(), "rule__LocalProtocolDecl__ArgumentsAssignment_10_1_2_2_1");
					put(grammarAccess.getLocalProtocolDeclAccess().getRoleInstantiationsAssignment_10_1_4(), "rule__LocalProtocolDecl__RoleInstantiationsAssignment_10_1_4");
					put(grammarAccess.getLocalProtocolDeclAccess().getRoleInstantiationsAssignment_10_1_5_1(), "rule__LocalProtocolDecl__RoleInstantiationsAssignment_10_1_5_1");
					put(grammarAccess.getLocalProtocolBlockAccess().getActivitiesAssignment_2(), "rule__LocalProtocolBlock__ActivitiesAssignment_2");
					put(grammarAccess.getLocalSendAccess().getMessageAssignment_0(), "rule__LocalSend__MessageAssignment_0");
					put(grammarAccess.getLocalSendAccess().getToRolesAssignment_2(), "rule__LocalSend__ToRolesAssignment_2");
					put(grammarAccess.getLocalSendAccess().getToRolesAssignment_3_1(), "rule__LocalSend__ToRolesAssignment_3_1");
					put(grammarAccess.getLocalReceiveAccess().getMessageAssignment_0(), "rule__LocalReceive__MessageAssignment_0");
					put(grammarAccess.getLocalReceiveAccess().getFromRoleAssignment_2(), "rule__LocalReceive__FromRoleAssignment_2");
					put(grammarAccess.getLocalChoiceAccess().getRoleAssignment_2(), "rule__LocalChoice__RoleAssignment_2");
					put(grammarAccess.getLocalChoiceAccess().getBlocksAssignment_3(), "rule__LocalChoice__BlocksAssignment_3");
					put(grammarAccess.getLocalChoiceAccess().getBlocksAssignment_4_1(), "rule__LocalChoice__BlocksAssignment_4_1");
					put(grammarAccess.getLocalRecursionAccess().getLabelAssignment_1(), "rule__LocalRecursion__LabelAssignment_1");
					put(grammarAccess.getLocalRecursionAccess().getBlockAssignment_2(), "rule__LocalRecursion__BlockAssignment_2");
					put(grammarAccess.getLocalContinueAccess().getLabelAssignment_1(), "rule__LocalContinue__LabelAssignment_1");
					put(grammarAccess.getLocalParallelAccess().getBlocksAssignment_1(), "rule__LocalParallel__BlocksAssignment_1");
					put(grammarAccess.getLocalParallelAccess().getBlocksAssignment_2_1(), "rule__LocalParallel__BlocksAssignment_2_1");
					put(grammarAccess.getLocalinterruptibleAccess().getScopeAssignment_1_0(), "rule__Localinterruptible__ScopeAssignment_1_0");
					put(grammarAccess.getLocalinterruptibleAccess().getBlockAssignment_2(), "rule__Localinterruptible__BlockAssignment_2");
					put(grammarAccess.getLocalinterruptibleAccess().getThrowAssignment_5(), "rule__Localinterruptible__ThrowAssignment_5");
					put(grammarAccess.getLocalinterruptibleAccess().getCatchesAssignment_6(), "rule__Localinterruptible__CatchesAssignment_6");
					put(grammarAccess.getLocalThrowAccess().getMessagesAssignment_1(), "rule__LocalThrow__MessagesAssignment_1");
					put(grammarAccess.getLocalThrowAccess().getMessagesAssignment_2_1(), "rule__LocalThrow__MessagesAssignment_2_1");
					put(grammarAccess.getLocalThrowAccess().getToRolesAssignment_4(), "rule__LocalThrow__ToRolesAssignment_4");
					put(grammarAccess.getLocalThrowAccess().getToRolesAssignment_5_1(), "rule__LocalThrow__ToRolesAssignment_5_1");
					put(grammarAccess.getLocalCatchAccess().getMessagesAssignment_1(), "rule__LocalCatch__MessagesAssignment_1");
					put(grammarAccess.getLocalCatchAccess().getMessagesAssignment_2_1(), "rule__LocalCatch__MessagesAssignment_2_1");
					put(grammarAccess.getLocalCatchAccess().getFromRoleAssignment_4(), "rule__LocalCatch__FromRoleAssignment_4");
					put(grammarAccess.getLocalDoAccess().getScopeAssignment_1_0(), "rule__LocalDo__ScopeAssignment_1_0");
					put(grammarAccess.getLocalDoAccess().getMemberAssignment_2(), "rule__LocalDo__MemberAssignment_2");
					put(grammarAccess.getLocalDoAccess().getArgumentsAssignment_3_1(), "rule__LocalDo__ArgumentsAssignment_3_1");
					put(grammarAccess.getLocalDoAccess().getArgumentsAssignment_3_2_1(), "rule__LocalDo__ArgumentsAssignment_3_2_1");
					put(grammarAccess.getLocalDoAccess().getRolesAssignment_5(), "rule__LocalDo__RolesAssignment_5");
					put(grammarAccess.getLocalDoAccess().getRolesAssignment_6_1(), "rule__LocalDo__RolesAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.scribble.editor.dsl.ui.contentassist.antlr.internal.InternalScribbleDslParser typedParser = (org.scribble.editor.dsl.ui.contentassist.antlr.internal.InternalScribbleDslParser) parser;
			typedParser.entryRuleModule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ScribbleDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ScribbleDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
