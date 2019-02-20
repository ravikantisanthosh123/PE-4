package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfCharacters
{
    public int characterCount(String str, char ch)
    {
        int count=0;
        Pattern pattern = Pattern.compile(String.valueOf(ch));
        Matcher matcher = pattern.matcher(str);


        while (matcher.find()) {
            count++;

        }

        return count;
    }
}
