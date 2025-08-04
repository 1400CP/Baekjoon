package com.baekjoon.test5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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


        // 1152번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // Tokenizer 사용법
        
        System.out.println(st.countTokens()); // countTokens()로 세는 법 알아두기.


        // 2908번-1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" "); // 주어지는 세자리 숫자를 배열로
        
        br.close();
        
        int a = Integer.parseInt(new StringBuilder().append(arr[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(arr[1]).reverse().toString());
        // StringBuilder에 대해 다시 공부

        System.out.println(a>b?a:b); // 삼항 연산자로 첫번째 숫자가 나오도록 함

        // 2908번-2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 배열로 나타낼 것을 StringTokenizer로 나타내기

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        // 위의 append(arr[])을 st.nextToken() - 다음 토큰 값으로 대체하여 나타냄.

        br.close();
        
        System.out.println(a>b?a:b); // 삼항 연산자로 첫번째 숫자가 나오도록 함

        // 5622번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine(); // 주어지는 단어
        // ABC, DEF, GHI, JKL, MNO, PQRS, TUV, WXYZ, OPERATOR
        int count = 0; // 더할 시간
        
        int k = s.length(); // 단어의 길이(더할 시간 계산)
        
        for(int i=0; i<k; i++){ // 향상문으로 단어 길이와 단어를 찾음
            switch(s.charAt(i)){ // 단어의 case로 더할 숫자를 추가
                case 'A' : case 'B' : case 'C' : // 각 케이스를 줄여서 이렇게 사용
                    count += 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    count += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    count += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    count += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    count += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    count += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    count += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.println(count); // 카운트를 출력

        // 11718번-1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = ""; // 입력받을 문자
        
        while((s = br.readLine()) != null){ // null이 아닐 경우 무한 반복
            System.out.println(s); // 그대로 출력
        }

        // 11718번-2(for문 사용 불가)
        String s = ""; // 입력받을 문자

        for(int i=0; i<100; i++){ // 컴파일 에러 발생
            String s = br.readLine(); // for문으로 int i값을 br.readLine()에 줄 수 없음
            System.out.println(s); // 그대로 출력
        }
    }
}
