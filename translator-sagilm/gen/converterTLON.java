import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;


public class converterTLON extends TLONBaseListener {
    TLONParser parser;
    public converterTLON(TLONParser parser){this.parser=parser;}
/*
    @Override public void enterStat_block(TLONParser.Stat_blockContext ctx) { }
    @Override public void exitStat_block(TLONParser.Stat_blockContext ctx) { }

    @Override public void enterFuncion(TLONParser.FuncionContext ctx) { }
    @Override public void exitFuncion(TLONParser.FuncionContext ctx) { }


*/
    @Override public void enterIf_stat(TLONParser.If_statContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String type = "void";
        String re= "void";
        if ( ctx.condition_block()!=null ) {
            type = tokens.getText(ctx.condition_block(0).expr());}
            re= type.replaceAll("\\|\\|"," or ").replaceAll("log\\(","print ").replaceAll("\\)"," ").replaceAll("\\("," ");

        System.out.println("if"+" "+"\t"+re);
    }



    @Override public void enterAssignment(TLONParser.AssignmentContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String type = "void";
        if ( ctx.assignment()!=null ) {
            type = tokens.getText(ctx.assignment());}
        String args = tokens.getText(ctx.expr());
        System.out.println(tokens.getText(ctx.variable())+ctx.ASSIGN()+" "+args+";");
    }
    @Override public void enterLog(TLONParser.LogContext ctx) {
        System.out.println("print "+ctx.expr().getText().replaceAll("\\|\\|"," or ").replaceAll("true","True").replaceAll(" false\n","False"));}
    @Override public void enterRetornar(TLONParser.RetornarContext ctx) { System.out.println("return "+ctx.expr().getText()); }
    @Override public void enterImportar(TLONParser.ImportarContext ctx) {
        // need parser to get tokens
        org.antlr.v4.runtime.TokenStream tokens = parser.getTokenStream();

        if (ctx.ID() != null) {
            Iterator<TerminalNode> o = ctx.ID().iterator();
            if(ctx.FROM()!=null) {
                System.out.print("from " + o.next());
                System.out.println(" import "+o.next());
                while (o.hasNext()){
                    System.out.println(" import "+o.next());
                }

            }
           else{
                while (o.hasNext()) {
                    System.out.println(" import " + o.next());

                }
            }
        }
    }

}
