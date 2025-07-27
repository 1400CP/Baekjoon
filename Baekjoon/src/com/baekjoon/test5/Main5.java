package com.baekjoon.test5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args){
        // 27866번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine(); // 글자 주어짐
        int I = Integer.parseInt(br.readLine()); // 출력할 단어 번호
        
        System.out.print(S.charAt(I-1)); // 0번부터 시작하기 때문에 -1 추가
        // charAt 메소드를 통해 글자 추출.

        // 2743번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        System.out.println(s.length());

        // 9086번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String s;
        
        for(int i=0; i<T; i++){
            s = br.readLine();
            System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
        }
        br.close();

        // 11654번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = (int)s.charAt(0);
        br.close();
        
        System.out.println(i);

        

    }
}
