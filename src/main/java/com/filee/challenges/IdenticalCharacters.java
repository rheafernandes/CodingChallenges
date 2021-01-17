package com.filee.challenges;


public class IdenticalCharacters {

    public String getUpdatedString(String originalString, int startPoint) {
        if(null == originalString || originalString.length() == 0)
            return "";
        StringBuilder updatedString = new StringBuilder();
        recursiveStringUpdate(originalString, updatedString, startPoint);
        return updatedString.toString();
    }

    private void recursiveStringUpdate(String original, StringBuilder updated, int index) {
        updated = updated.append(original.charAt(index));

        if (index == original.length() - 1)
            return;

        if (original.charAt(index) == original.charAt(++index))
            updated = updated.append("*");
        recursiveStringUpdate(original, updated, index);
    }

}
