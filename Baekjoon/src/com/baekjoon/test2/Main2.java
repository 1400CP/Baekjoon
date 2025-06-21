package com.baekjoon.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
        // 1330번
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
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
        
        // 9498번
        if(A >= 90){
            System.out.println("A");
        }else if(A >= 80){
            System.out.println("B");
        }else if(A >= 70){
            System.out.println("C");
        }else if(A >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        // System.out.print((A>=90) ? "A" : (A>=80) ? "B" : (A>=70) ? "C" : (A>=60) ? "D" : "F");
        
        // 2753번
        if((A%4 == 0) && (A%100 != 0 || A%400 == 0)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        // 14681번

        if(x > 0 && y > 0){
            System.out.println("1");
        }else if(x > 0 && y < 0){
            System.out.println("4");
        }else if(x < 0 && y < 0){
            System.out.println("3");
        }else if(x < 0 && y > 0){
            System.out.println("2");
        }

        if(x > 0 && y > 0){
            System.out.println("1");
        }else if (x < 0 && y > 0){
            System.out.println("2");
        }else if (x < 0 && y < 0){
            System.out.println("3");
        }else if (x > 0 && y < 0){
            System.out.println("4");
        }

        // 2884번
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        if(h >= 0 && h <= 23 && m >= 0 && m <= 59){
            if(m < 45){
            h--;
            m = 60 - (45 - m);
                if(h < 0){
                    h = 23;
                }
                System.out.println(h + " " + m);
            }else{
                System.out.println(h + " " + (m - 45));
            }
        }

        // 2525번
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        sc.close();
        int min = a1 * 60 + b1 + c1;
        int hour = min/60%24;
        int minute = min % 60;

        if(a1 >= 0 && a1 <= 23 && b1 >= 0 && b1 <= 59 && c1 >= 0 && c1 <= 1000){
            System.out.println(hour + " " + minute);
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(br.readLine());
        sc.close();
        int min2 = a2 * 60 + b2 + c2;
        int hour2 = min2/60%24;
        int minute2 = min2 % 60;

        if(a1 >= 0 && a1 <= 23 && b1 >= 0 && b1 <= 59 && c1 >= 0 && c1 <= 1000){
            System.out.println(hour2 + " " + minute2);
        }

	}

}
