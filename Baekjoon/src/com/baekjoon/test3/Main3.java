package com.baekjoon.test3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException{
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

        // 8393번 -2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a2 = Integer.parseInt(str[0]);
        int sum = 0;

        for(int i=1; i<=a2 ; i++){
            sum+=i;
        }
        System.out.println(sum);

        // 25304번
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        sc.close();
        
        if(sum == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // 25304 - 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=1; i<=N; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            sum += a * b;
        }

        if(sum == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // 25304 - 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a * b;
        }

        if(sum == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // 25314번 -1
        int a = sc.nextInt();
        sc.close();
        for(int i=1; i<=a/4; i++){
            System.out.printf("long ");
        }
        System.out.println("int");
        
        // 25314번 -2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i=1; i<=a/4; i++){
            System.out.printf("long ");
        }
        System.out.println("int");

        // 15552번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b);
        }
        br.close();
        bw.flush();
        bw.close();

        // 11024
        for(int i=1; i<=T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
                if(a>0 && b<10){
                    bw.write("Case #"+ i +": " + (a+b) + "\n");
                }
        }
        br.close();
        bw.flush();
        bw.close();

        // 11022

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a>0 && b<10){
                bw.write("Case #" + i +": " + a + " + " + b + " = " +(a+b) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

        // 2438
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        

        // 2439
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                bw.write(" ");
            }
            for(int k=1; k<=i; k++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();

        // 10952
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0){
                break;
            }
            bw.write(A+B+"\\n");
        }
        br.close();
        bw.flush();
        bw.close();

        // 10951
        String str;

        while((str=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A+B+"\\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }    
}
