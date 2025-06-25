package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        String a = "아무개";
        String b = "남";
        int c = 20;
        double d = 180.5;
        System.out.println("키 " + d + "cm인 " + c + "살 " + b + "자 " + a + "님 반갑습니다 ^^");

        int a1 = 23;
        int b1 = 7;
        System.out.println("더하기 결과 : " + (a1 + b1));
        System.out.println("빼기 결과 : " + (a1 - b1));
        System.out.println("곱하기 결과 : " + (a1 * b1));
        System.out.println("나누기 몫 결과" + (a1 % b1));

        double c1 = 13.5;
        double d1 = 41.7;
        System.out.println("면적 : " + c1 * d1);
        System.out.println("둘레 : " + (c1*d1) * 2);

        String a2 = "apple";
        String a3 = a2.substring(0,1);
        String a4 = a2.substring(1,2);
        String a5 = a2.substring(2,3);
        System.out.println("첫 번째 문자 : " + a3);
        System.out.println("두 번째 문자 : " + a4);
        System.out.println("세 번째 문자 : " + a5);
    }
}
