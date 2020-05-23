// Generated from C:/Users/wanga/IdeaProjects/safetytest/src\frame.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link frameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface frameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link frameParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(frameParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#pragmaDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaDirective(frameParser.PragmaDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#pragmaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaName(frameParser.PragmaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#pragmaValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaValue(frameParser.PragmaValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(frameParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#versionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionOperator(frameParser.VersionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#versionConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionConstraint(frameParser.VersionConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(frameParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#importDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(frameParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(frameParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(frameParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#contractPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractPart(frameParser.ContractPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVariableDeclaration(frameParser.StateVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(frameParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(frameParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#constructorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition(frameParser.ConstructorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#modifierDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierDefinition(frameParser.ModifierDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#modifierInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierInvocation(frameParser.ModifierInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(frameParser.FunctionDefinitionContext ctx) ;
	/**
	 * Visit a parse tree produced by {@link frameParser#returnParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnParameters(frameParser.ReturnParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(frameParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#eventDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefinition(frameParser.EventDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(frameParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(frameParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(frameParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(frameParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#eventParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameterList(frameParser.EventParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#eventParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameter(frameParser.EventParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameterList(frameParser.FunctionTypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameter(frameParser.FunctionTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(frameParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(frameParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedTypeName(frameParser.UserDefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(frameParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(frameParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#storageLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageLocation(frameParser.StorageLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(frameParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(frameParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(frameParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(frameParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(frameParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#requireStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequireStatement(frameParser.RequireStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(frameParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#revertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevertStatement(frameParser.RevertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(frameParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(frameParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(frameParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineAssemblyStatement(frameParser.InlineAssemblyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(frameParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(frameParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(frameParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(frameParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(frameParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(frameParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(frameParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(frameParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(frameParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeName(frameParser.ElementaryTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yuyu}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYuyu(frameParser.YuyuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(frameParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code other}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(frameParser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code huo}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHuo(frameParser.HuoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifyuju}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfyuju(frameParser.IfyujuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsquare}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsquare(frameParser.BracketsquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(frameParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulity}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulity(frameParser.MulityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleback}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleback(frameParser.DoublebackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fei}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFei(frameParser.FeiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doublebefore}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublebefore(frameParser.DoublebeforeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deny2}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeny2(frameParser.Deny2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(frameParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yu}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYu(frameParser.YuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code huohuo}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHuohuo(frameParser.HuohuoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(frameParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deny}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeny(frameParser.DenyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexaddsub}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexaddsub(frameParser.ComplexaddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yidong}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYidong(frameParser.YidongContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare1}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare1(frameParser.Compare1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code special}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(frameParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketcircle}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketcircle(frameParser.BracketcircleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code circle}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(frameParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(frameParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chengcheng}
	 * labeled alternative in {@link frameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChengcheng(frameParser.ChengchengContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(frameParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(frameParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#nameValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValueList(frameParser.NameValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(frameParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(frameParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(frameParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyBlock(frameParser.AssemblyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyItem(frameParser.AssemblyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyExpression(frameParser.AssemblyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCall(frameParser.AssemblyCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLocalDefinition(frameParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyAssignment(frameParser.AssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierOrList(frameParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierList(frameParser.AssemblyIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyStackAssignment(frameParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(frameParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblySwitch(frameParser.AssemblySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCase(frameParser.AssemblyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionDefinition(frameParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionReturns(frameParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFor(frameParser.AssemblyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIf(frameParser.AssemblyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLiteral(frameParser.AssemblyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#subAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssembly(frameParser.SubAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(frameParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#elementaryTypeNameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeNameExpression(frameParser.ElementaryTypeNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(frameParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link frameParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(frameParser.IdentifierContext ctx);
}