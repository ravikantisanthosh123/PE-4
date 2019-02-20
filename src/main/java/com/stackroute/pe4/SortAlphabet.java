package com.stackroute.pe4;

import java.util.Arrays;

public class SortAlphabet {
    public String sortAlphabetWords(String str)

    {
        String string=str.replaceAll("\\s","");
        char temp[]=string.toCharArray();
        Arrays.sort(temp);
        String sort=new String(temp);
        return sort;


    }
}
