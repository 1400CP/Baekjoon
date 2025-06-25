package com.baekjoon.test3;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        // 2739번
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i=1; i<10; i++){
                System.out.println(a + " * "  + i + " = " + (a*i));
        }

        // 10950번
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();

        // 10950번 2)
        int T = sc.nextInt();
        int arr[] = new int[T];

        for(int i=0; i<T; i++){
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            arr[i] = a1 + b1;
        }
        sc.close();

        for(int j:arr){
            System.out.println(j);
        }
    }
}
