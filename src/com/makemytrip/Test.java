package com.makemytrip;

import com.amazon.Node;

import java.net.HttpURLConnection;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

class Test
{

    private static boolean checkBusWithInvalidDuration(String duration){
        duration = duration.replace(":","").replace("0","");
        return duration.length()<1;
    }

    public static void main(String[] args)
    {
        System.out.println(checkBusWithInvalidDuration("00:15:00"));
        Integer.parseInt("s");
    }
}