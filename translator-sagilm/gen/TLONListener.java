// Generated from /Users/alexander/Documents/translator/TLON.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLONParser}.
 */
public interface TLONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLONParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TLONParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TLONParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#from_input}.
	 * @param ctx the parse tree
	 */
	void enterFrom_input(TLONParser.From_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#from_input}.
	 * @param ctx the parse tree
	 */
	void exitFrom_input(TLONParser.From_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#from_file}.
	 * @param ctx the parse tree
	 */
	void enterFrom_file(TLONParser.From_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#from_file}.
	 * @param ctx the parse tree
	 */
	void exitFrom_file(TLONParser.From_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TLONParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TLONParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#compound_stat}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stat(TLONParser.Compound_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#compound_stat}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stat(TLONParser.Compound_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#simple_stat}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stat(TLONParser.Simple_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#simple_stat}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stat(TLONParser.Simple_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TLONParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TLONParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(TLONParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(TLONParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(TLONParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(TLONParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(TLONParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(TLONParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(TLONParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(TLONParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(TLONParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(TLONParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#importar}.
	 * @param ctx the parse tree
	 */
	void enterImportar(TLONParser.ImportarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#importar}.
	 * @param ctx the parse tree
	 */
	void exitImportar(TLONParser.ImportarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(TLONParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(TLONParser.RetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(TLONParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(TLONParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(TLONParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(TLONParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TLONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TLONParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#accessarray}.
	 * @param ctx the parse tree
	 */
	void enterAccessarray(TLONParser.AccessarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#accessarray}.
	 * @param ctx the parse tree
	 */
	void exitAccessarray(TLONParser.AccessarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TLONParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TLONParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(TLONParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(TLONParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(TLONParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(TLONParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(TLONParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(TLONParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(TLONParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(TLONParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(TLONParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(TLONParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(TLONParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(TLONParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(TLONParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(TLONParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(TLONParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(TLONParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(TLONParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(TLONParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(TLONParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(TLONParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(TLONParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(TLONParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(TLONParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TLONParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(TLONParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(TLONParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(TLONParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(TLONParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(TLONParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(TLONParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(TLONParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterArrayAtom(TLONParser.ArrayAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitArrayAtom(TLONParser.ArrayAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objetoAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterObjetoAtom(TLONParser.ObjetoAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objetoAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitObjetoAtom(TLONParser.ObjetoAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessToarray}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAccessToarray(TLONParser.AccessToarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessToarray}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAccessToarray(TLONParser.AccessToarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessVariable}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAccessVariable(TLONParser.AccessVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessVariable}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAccessVariable(TLONParser.AccessVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(TLONParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link TLONParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(TLONParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(TLONParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(TLONParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLONParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(TLONParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLONParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(TLONParser.KeyvalueContext ctx);
}