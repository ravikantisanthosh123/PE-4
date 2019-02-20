package com.stackroute.pe4;

import java.util.regex.Pattern;

public class ReplaceString {
    public String replaceStringCharacters(String str, char ch1, char ch2,char ch3, char ch4)
    {
        String str1=str.replace(ch1,ch2);
        String str2=str1.replace(ch3,ch4);
        return str2;
    }
}
