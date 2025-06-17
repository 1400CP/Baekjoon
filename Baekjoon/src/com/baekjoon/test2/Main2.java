package com.baekjoon.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
        // 1330번
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        
        if(A > B){
            System.out.println(">");
        }else if(A < B ){
            System.out.println("<");
        }else if(A == B){
            System.out.println("==");
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int C = Integer.parseInt(a[0]);
        int D = Integer.parseInt(a[1]);
        
        if(C > D){
            System.out.println(">");
        }else if(C < D){
            System.out.println("<");
        }else if(C == D){
            System.out.println("==");
        }

	}

}
