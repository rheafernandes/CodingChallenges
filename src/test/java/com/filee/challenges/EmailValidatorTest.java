package com.filee.challenges;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmailValidatorTest {
    private static EmailValidator emailValidator = null;

    @BeforeClass
    public static void setUp() {
        emailValidator = new EmailValidator();
    }

    @AfterClass
    public static void tearDown() {
        emailValidator = null;
    }

    @Test
    public void testNullString() throws Exception {
        Assert.assertFalse(emailValidator.isValid(null));
    }

    @Test
    public void testEmptyString() throws Exception {
        Assert.assertFalse(emailValidator.isValid(""));
    }


    @Test
    public void testValidEmail_1() throws Exception {
        Assert.assertTrue(emailValidator.isValid("abc@gmail.com"));
    }

    @Test
    public void testValidEmail_2() throws Exception {
        Assert.assertTrue(emailValidator.isValid("abc@gmail.co.in"));
    }

    @Test
    public void testInvalidEmail_1() throws Exception {
        Assert.assertFalse(emailValidator.isValid("@gmail.com"));
    }

    @Test
    public void testInvalidEmail_2() throws Exception {
        Assert.assertFalse(emailValidator.isValid("abcgmail.co.in"));
    }

    @Test
    public void testInvalidEmail_3() throws Exception {
        Assert.assertFalse(emailValidator.isValid("abc@gmailcoin"));
    }

}
