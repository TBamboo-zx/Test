package com.zx.test;

import java.util.UUID;

public class Test01 {
    public static void main(String[] args) {
        UUID uuid  = UUID.randomUUID();
        String  s = uuid.toString();
        System.out.println(s);

         String s1 = s.replaceAll("-","");
        System.out.println(s1);

    }
}
