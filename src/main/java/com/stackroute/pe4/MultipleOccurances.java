package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances {
    public String[] multipleOccurancesFunction(String string, String word)
    {
        String str="";
        Pattern pattern=Pattern.compile(word);
        Matcher m = pattern.matcher(string);
        while(m.find())
        {
            str+="Found at: "+m.start()+" - "+m.end()+",";
        }
        String[] output = str.split(",");
        return output;
    }
}
