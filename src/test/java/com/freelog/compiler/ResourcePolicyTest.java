package com.freelog.compiler;

import static org.junit.Assert.assertTrue;

import java.io.*;

import org.junit.Test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Unit test for simple App.
 */
public class ResourcePolicyTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void parseContract() throws Exception
    {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-cases/resource_service/simple_contract");
        ANTLRInputStream input = new ANTLRInputStream (inputStream);
        ResourcePolicyLexer lexer = new ResourcePolicyLexer (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ResourcePolicyParser parser = new ResourcePolicyParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.policy();
        System.out.println(tokens.getTokens());
        System.out.println(tree.toStringTree(parser));
        
        for ( Token token : tokens.getTokens()) {
            System.out.println(token.getText());
        }
        assertTrue( true );
    }
}
