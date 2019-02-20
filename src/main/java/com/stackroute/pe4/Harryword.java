package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harryword
{
    public String FindHarryword(String str, String word)
    {
        Pattern pattern=Pattern.compile(word);
        Matcher matcher=pattern.matcher(str);

        if(matcher.find())
            return ("Is "+word+" here ? true");
        else
            return ("Is "+word+" here ? false");

    }
}
