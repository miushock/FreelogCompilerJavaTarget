package com.freelog.compiler;

import static org.junit.Assert.assertTrue;

import java.io.*;

import org.junit.Test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Unit test for simple App.
 */
public class ExpressionTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void parseExpressions() throws Exception
    {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-cases/expression/expressions");
        ANTLRInputStream input = new ANTLRInputStream (inputStream);
        ExpressionLexer lexer = new ExpressionLexer (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.expression();
        System.out.println(tokens.getTokens());
        System.out.println(tree.toStringTree(parser));
        
        for ( Token token : tokens.getTokens()) {
            System.out.println(token.getText());
        }
        assertTrue( true );
    }
}
