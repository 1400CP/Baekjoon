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

        // 11720번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n개의 값의 합을 출력할 숫자.
        String[] s = br.readLine().split(""); // 배열값.
        
        int sum = 0; // int sum; 으로 입력할 경우 지정값이 없으므로 향상문에서 += 를 적용 못함.
        
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(s[i]); // n개의 값을 합하여 sum값에 더함.
        }
        br.close();
        System.out.println(sum); // 최종적으로 더해진 값을 출력.

        // 10809번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 객체 선언. append() 메소드로 추가.
        String s = br.readLine(); // 단어 명사.
        
        for(char c = 'a'; c <= 'z'; c++){
            sb.append(s.indexOf(c) + " "); // indexOf() 메소드로 단어 명사 검색.
        }
        
        System.out.print(sb);

        // 2675번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
               
        for(int i=0; i<T; i++){ // 반복회수
            String[] arr = br.readLine().split(" ");
            
            int a = Integer.parseInt(arr[0]); // 케이스 반복 횟수
            String s = arr[1]; // 문자열 s
            
            for(int j=0; j<s.length(); j++){ // 문자열 횟수
                for(int k=0; k<a; k++){ // 단어 반복 횟수
                    System.out.print(s.charAt(j)); // 출력 단어 찾기 및 단어 반복 횟수 먼저
                }
            }
            System.out.println(); // 이게 없으면 int i 향상문 출력이 안 됨
        }
        br.close(); // 이걸로 br.readLine()의 마지막을 닫음. 먼저 쓰면 향상문 1번으로 끝이 나버림.

        // 

    }
}
