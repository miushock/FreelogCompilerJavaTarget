package com.freelog.compiler;

import static org.junit.Assert.assertTrue;

import java.io.*;

import org.junit.Test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Unit test for simple App.
 */
public class EntityTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void parseEntities() throws Exception
    {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-cases/entity/entities");
        ANTLRInputStream input = new ANTLRInputStream (inputStream);
        EntityLexer lexer = new EntityLexer (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EntityParser parser = new EntityParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.entity_bracket();
        System.out.println(tokens.getTokens());
        System.out.println(tree.toStringTree(parser));
        assertTrue( true );
    }
}
