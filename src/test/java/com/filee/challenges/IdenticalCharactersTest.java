package com.filee.challenges;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IdenticalCharactersTest {
    private static IdenticalCharacters identicalCharacters = null;

    @BeforeClass
    public static void setUp() {
        identicalCharacters = new IdenticalCharacters();
    }

    @AfterClass
    public static void tearDown() {
        identicalCharacters = null;
    }

    @Test
    public void testNullString() throws Exception {
        String actual = identicalCharacters.getUpdatedString(null, 0);
        Assert.assertEquals("", actual);
    }

    @Test
    public void testEmptyString() throws Exception {
        String actual = identicalCharacters.getUpdatedString("", 0);
        Assert.assertEquals("", actual);
    }


    @Test
    public void testStringWithNoDuplicates() throws Exception {
        String actual = identicalCharacters.getUpdatedString("uncopyrightable", 0);
        Assert.assertEquals("uncopyrightable", actual);
    }

    @Test
    public void testStringWithDuplicates() throws Exception {
        String actual = identicalCharacters.getUpdatedString("goodaaafteernoon", 0);
        Assert.assertEquals("go*oda*a*afte*erno*on", actual);
    }

    @Test
    public void testStringFromRandomStartPoint() throws Exception {
        String actual = identicalCharacters.getUpdatedString("goodaaafteernoon", 5);
        Assert.assertEquals("a*afte*erno*on", actual);
    }
}
