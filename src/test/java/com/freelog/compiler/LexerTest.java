package com.freelog.compiler;

import static org.junit.Assert.assertTrue;

import java.io.*;

import org.junit.Test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Unit test for simple App.
 */
public class LexerTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void parseTokens() throws Exception
    {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-cases/token/tokens");
        ANTLRInputStream input = new ANTLRInputStream (inputStream);
        LexToken lexer = new LexToken (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        System.out.println(tokens.getTokens());
        assertTrue( true );
    }
}
