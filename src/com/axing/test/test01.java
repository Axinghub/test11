package com.axing.test;

import java.math.BigInteger;

public class test01 {
    public static void main(String[] args) {
        BigInteger a= BigInteger.valueOf(1);

        for (long i = 1; i <10001 ; i++) {
            BigInteger b= BigInteger.valueOf(i);
            a=a.multiply(b);
        }

        System.out.println(a.toString());
    }
}
