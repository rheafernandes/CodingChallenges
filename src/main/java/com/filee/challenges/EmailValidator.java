package com.filee.challenges;

import java.util.regex.Pattern;

public class EmailValidator {
    //https://help.returnpath.com/hc/en-us/articles/220560587-What-are-the-rules-for-email-address-syntax-#:~:text=The%20recipient%20name%20may%20be,Digits%20from%200%20to%209

    public boolean isValid(String input) {
        return Pattern.matches("([a-zA-Z0-9]+)@[a-zA-Z0-9]+\\.+[a-zA-Z0-9]{3}", input);
    }


}
