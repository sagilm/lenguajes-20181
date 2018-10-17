

import java.io.File;
import java.io.FileInputStream;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import  org.antlr.v4.runtime.tree.*;

public class converterRunner {
    public static void main(String[]args) throws Exception {
    try{

            System.setIn(new FileInputStream(new File("/Users/alexander/Documents/translator/gen/in02.txt")) );;

        ANTLRInputStream input = new ANTLRInputStream(System.in);
        //System.out.println(input);
        TLONLexer lexer = new TLONLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TLONParser parser = new TLONParser(tokens);
        ParseTree tree = parser.parse(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        converterTLON extractor = new converterTLON(parser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
            }catch (Exception e){
                System.err.println("Error Rider :"+ e);
    }
    }
}

