// Generated from /Users/alexander/Documents/translator/TLON.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLONParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(TLONParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#from_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_input(TLONParser.From_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#from_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_file(TLONParser.From_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TLONParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#compound_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stat(TLONParser.Compound_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#simple_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stat(TLONParser.Simple_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TLONParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(TLONParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(TLONParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(TLONParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(TLONParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(TLONParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#importar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportar(TLONParser.ImportarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(TLONParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(TLONParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(TLONParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TLONParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#accessarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessarray(TLONParser.AccessarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TLONParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(TLONParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(TLONParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(TLONParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(TLONParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(TLONParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(TLONParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(TLONParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(TLONParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(TLONParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(TLONParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(TLONParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(TLONParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(TLONParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(TLONParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(TLONParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAtom(TLONParser.ArrayAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objetoAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetoAtom(TLONParser.ObjetoAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessToarray}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessToarray(TLONParser.AccessToarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessVariable}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessVariable(TLONParser.AccessVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(TLONParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(TLONParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLONParser#keyvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyvalue(TLONParser.KeyvalueContext ctx);
}