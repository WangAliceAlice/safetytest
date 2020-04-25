// Generated from C:/Users/wanga/IdeaProjects/safetytest/src\frame.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link frameParser}.
 */
public interface frameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link frameParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(frameParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(frameParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(frameParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(frameParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void enterPragmaName(frameParser.PragmaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void exitPragmaName(frameParser.PragmaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void enterPragmaValue(frameParser.PragmaValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void exitPragmaValue(frameParser.PragmaValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(frameParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(frameParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void enterVersionOperator(frameParser.VersionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void exitVersionOperator(frameParser.VersionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVersionConstraint(frameParser.VersionConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVersionConstraint(frameParser.VersionConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(frameParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(frameParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(frameParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(frameParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(frameParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(frameParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(frameParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(frameParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void enterContractPart(frameParser.ContractPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void exitContractPart(frameParser.ContractPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(frameParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(frameParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(frameParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(frameParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(frameParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(frameParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(frameParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(frameParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void enterModifierInvocation(frameParser.ModifierInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void exitModifierInvocation(frameParser.ModifierInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(frameParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(frameParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(frameParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(frameParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(frameParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(frameParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(frameParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(frameParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(frameParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(frameParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(frameParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(frameParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(frameParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(frameParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(frameParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(frameParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(frameParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(frameParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(frameParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(frameParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameterList(frameParser.FunctionTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameterList(frameParser.FunctionTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameter(frameParser.FunctionTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameter(frameParser.FunctionTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(frameParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(frameParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(frameParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(frameParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(frameParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(frameParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(frameParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(frameParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(frameParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(frameParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(frameParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(frameParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(frameParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(frameParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(frameParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(frameParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(frameParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(frameParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(frameParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(frameParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(frameParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(frameParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(frameParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(frameParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(frameParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(frameParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(frameParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(frameParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(frameParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(frameParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(frameParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(frameParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(frameParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(frameParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(frameParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(frameParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(frameParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(frameParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(frameParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(frameParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(frameParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(frameParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(frameParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(frameParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(frameParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(frameParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(frameParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(frameParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(frameParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(frameParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yuyu}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterYuyu(frameParser.YuyuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yuyu}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitYuyu(frameParser.YuyuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(frameParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(frameParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code other}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOther(frameParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code other}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOther(frameParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code huo}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHuo(frameParser.HuoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code huo}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHuo(frameParser.HuoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifyuju}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfyuju(frameParser.IfyujuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifyuju}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfyuju(frameParser.IfyujuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsquare}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketsquare(frameParser.BracketsquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsquare}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketsquare(frameParser.BracketsquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(frameParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(frameParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulity}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulity(frameParser.MulityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulity}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulity(frameParser.MulityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleback}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDoubleback(frameParser.DoublebackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleback}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDoubleback(frameParser.DoublebackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fei}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFei(frameParser.FeiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fei}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFei(frameParser.FeiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doublebefore}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDoublebefore(frameParser.DoublebeforeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doublebefore}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDoublebefore(frameParser.DoublebeforeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deny2}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDeny2(frameParser.Deny2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code deny2}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDeny2(frameParser.Deny2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(frameParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(frameParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yu}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterYu(frameParser.YuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yu}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitYu(frameParser.YuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code huohuo}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHuohuo(frameParser.HuohuoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code huohuo}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHuohuo(frameParser.HuohuoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(frameParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(frameParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deny}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDeny(frameParser.DenyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deny}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDeny(frameParser.DenyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexaddsub}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComplexaddsub(frameParser.ComplexaddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexaddsub}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComplexaddsub(frameParser.ComplexaddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yidong}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterYidong(frameParser.YidongContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yidong}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitYidong(frameParser.YidongContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare1}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare1(frameParser.Compare1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code compare1}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare1(frameParser.Compare1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code special}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(frameParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code special}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(frameParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketcircle}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketcircle(frameParser.BracketcircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketcircle}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketcircle(frameParser.BracketcircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code circle}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCircle(frameParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code circle}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCircle(frameParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(frameParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(frameParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chengcheng}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChengcheng(frameParser.ChengchengContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chengcheng}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChengcheng(frameParser.ChengchengContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(frameParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(frameParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(frameParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(frameParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(frameParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(frameParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(frameParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(frameParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(frameParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(frameParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(frameParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(frameParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(frameParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(frameParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(frameParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(frameParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(frameParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(frameParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(frameParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(frameParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(frameParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(frameParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(frameParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(frameParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(frameParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(frameParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(frameParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(frameParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(frameParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(frameParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(frameParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(frameParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(frameParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(frameParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(frameParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(frameParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(frameParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(frameParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(frameParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(frameParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(frameParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(frameParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(frameParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(frameParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(frameParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(frameParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(frameParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(frameParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(frameParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(frameParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#elementaryTypeNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeNameExpression(frameParser.ElementaryTypeNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#elementaryTypeNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeNameExpression(frameParser.ElementaryTypeNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(frameParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(frameParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(frameParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(frameParser.IdentifierContext ctx);
}