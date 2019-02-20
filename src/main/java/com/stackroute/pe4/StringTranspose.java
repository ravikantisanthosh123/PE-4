package com.stackroute.pe4;

public class StringTranspose {
    public String transposeofWords(String str) {
        String[] string = str.split(" ");
        String temp="";
        for(int i=0;i<string.length;i++)
        {
            StringBuffer sbf = new StringBuffer(string[i]);
            temp+=sbf.reverse()+" ";
        }
        temp=temp.trim();
        return temp;
    }


}


