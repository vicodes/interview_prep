package com.makemytrip;

import java.net.HttpURLConnection;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

class Test
{

    public static void main(String[] args)
    {
        String temp = "How";
        String nickname = temp;
        String content = "";
        if(temp.indexOf(' ') > -1) {
            nickname = temp.substring(0, temp.indexOf(' '));
            content = temp.substring(temp.indexOf(' ') + 1);
        }
        System.out.println(nickname);
        System.out.println(content);
    }
}