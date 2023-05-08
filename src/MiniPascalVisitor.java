// Generated from MiniPascal.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link MiniPascalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Code_Block}
	 * labeled alternative in {@link MiniPascalParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_Block(MiniPascalParser.Code_BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link MiniPascalParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MiniPascalParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySpecifier}
	 * labeled alternative in {@link MiniPascalParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySpecifier(MiniPascalParser.ArraySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexRange}
	 * labeled alternative in {@link MiniPascalParser#index_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexRange(MiniPascalParser.IndexRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MiniPascalParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(MiniPascalParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MiniPascalParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(MiniPascalParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MiniPascalParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MiniPascalParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompountStatement}
	 * labeled alternative in {@link MiniPascalParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompountStatement(MiniPascalParser.CompountStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link MiniPascalParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(MiniPascalParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link MiniPascalParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniPascalParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniPascalParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatStatement}
	 * labeled alternative in {@link MiniPascalParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link MiniPascalParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link MiniPascalParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link MiniPascalParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link MiniPascalParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(MiniPascalParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link MiniPascalParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MiniPascalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterDeclaration}
	 * labeled alternative in {@link MiniPascalParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(MiniPascalParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MiniPascalParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link MiniPascalParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MiniPascalParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expresion}
	 * labeled alternative in {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiniPascalParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MiniPascalParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(MiniPascalParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierTerminal}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierTerminal(MiniPascalParser.IdentifierTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberTerminal}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTerminal(MiniPascalParser.NumberTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringTerminal}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTerminal(MiniPascalParser.StringTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharTerminal}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharTerminal(MiniPascalParser.CharTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenParentsExpression}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenParentsExpression(MiniPascalParser.BetweenParentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotFactorOperator}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactorOperator(MiniPascalParser.NotFactorOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueOperator}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueOperator(MiniPascalParser.TrueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseOperator}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseOperator(MiniPascalParser.FalseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNonTerminal}
	 * labeled alternative in {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNonTerminal(MiniPascalParser.VariableNonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link MiniPascalParser#index_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(MiniPascalParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MiniPascalParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MiniPascalParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MiniPascalParser.MulopContext ctx);
}