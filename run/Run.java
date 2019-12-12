package run;

import java.io.IOException;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Run {

    public static void main(String[] args) throws IOException {


        String filename = "test.c";
        
        
        CharStream charInput = new ANTLRFileStream(filename);
    
        
        
        if (args.length >= 1) {
            filename = args[0];
        }
        CharStream stream = null;
        if (filename != null) {
            stream = new ANTLRFileStream(filename);
        } else {
            stream = new ANTLRInputStream(System.in);
        }
    }
    
    }

 

    