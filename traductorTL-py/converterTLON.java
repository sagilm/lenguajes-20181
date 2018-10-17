

public class converterTLON extends TLONBaseListener {
    TLONParser parser;
    public converterTLON(TLONParser parser){this.parser=parser;}
/*
    @Override public void enterStat_block(TLONParser.Stat_blockContext ctx) { }
    @Override public void exitStat_block(TLONParser.Stat_blockContext ctx) { }

    @Override public void enterFuncion(TLONParser.FuncionContext ctx) { }
    @Override public void exitFuncion(TLONParser.FuncionContext ctx) { }
    @Override public void enterImportar(TLONParser.ImportarContext ctx) { }
    @Override public void enterFrom_input(TLONParser.From_inputContext ctx) { }
*/
    @Override public void enterLog(TLONParser.LogContext ctx) { System.out.println("print "+ctx.expr());}
    @Override public void enterRetornar(TLONParser.RetornarContext ctx) { System.out.println("return "+ctx.expr()); }
}
