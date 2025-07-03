package com.baekjoon.test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException{

        // 10807번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if(N >= 1 && N <= 100){
            int[] arr = new int[N];
            int count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int a = Integer.parseInt(br.readLine());

            for(int j=0; j<arr.length; j++){
                if(a == arr[j]){
                    count++;
                }
            }
            System.out.println(count); // bw.write는 String형이기 때문에 int 불가.

            br.close();
            bw.flush();
            bw.close();
        }

        // 10871
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        if(N>=1 && N<=10000 && X>=1 && X<=10000){
            st = new StringTokenizer(br.readLine(), " ");

            for(int i=0; i<N; i++){
                int a = Integer.parseInt(st.nextToken());
                if(a<X){
                    bw.write(a+" ");
                }
            }

            br.close();
            bw.flush();
            bw.close();
        }

        // 10818
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);

        br.close();
        bw.flush();
        bw.close();

        // 2562
        int[] arr = new int[9];

        int max = arr[0];
        int count = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max){
                max = arr[i];
                count = i+1;
            }
        }

        br.close();
        System.out.println(max);
        System.out.println(count);

        // 10810
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int F = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for(int j=F; j<=S; j++){
                arr[j-1] = B;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        // 
        
    }
}
