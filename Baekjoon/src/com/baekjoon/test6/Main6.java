package com.baekjoon.test6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args){
        //25083번-1
        String s = "         ,r'\"7" +
                   "r`-_   ,'  ,/" +
                   " \\. \". L_r'" +
                   "   `~\\/" +
                   "      |\n" +
                   "      |";
        System.out.print(s);

        //25083번-2
        System.out.print("         ,r'\"7\n");
        System.out.print("r`-_   ,'  ,/\n");
        System.out.print(" \\. \". L_r'\n");
        System.out.print("   `~\\/\n");
        System.out.print("      |\n");
        System.out.print("      |\n");

        //3003번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        rook = rook - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knight = knight - Integer.parseInt(st.nextToken());
        pawn = pawn - Integer.parseInt(st.nextToken());
        
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");

        //2444번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=N; i++){
            for(int j=0; j<N-i; j++){
                sb.append(" ");
            }
            for(int j=0; j<(2*i)-1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        for(int i=N-1; i>=1; i--){
            for(int j=0; j<N-i; j++){
                sb.append(" ");
            }
            for(int j=0; j<(2*i)-1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        br.close();
        System.out.print(sb);

        //10988번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString())){
                System.out.println(1);
        }else{
                System.out.println(0);
        }
        br.close();

        //1157번(1)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];    // 영단어 26개
        String str1 = br.readLine();
        
        for(int i=0; i<str1.length(); i++){ // 향상문
            if('a' <= str1.charAt(i) && str1.chatAt(i) <= 'z'){ // 소문자 범위
                arr[str1.charAt(i) - 97]++; // 97='a'
            }else{
                arr[str1.charAt(i) - 65]++; // 65='A'
            }
        }
        
        int max = -1; // 최대치값
        char str2 = '?'; // 출력값
        
        for(int i=0; i<26; i++){ // 향상문
            if(arr[i] > max){ // 최대치값보다 크다
                max = arr[i];
                str2 = (char)(i+65); // 대문자
            }else if(arr[i] == max){ // 최대치값과 같다
                str2 = '?'; // 향상문과 여러개가 겹친다. ?표 정적
            }
        }
        br.close();
        System.out.println(str2); // 출력.
        // 다만 str.charAt(i)가 인식을 못했다. 이유는 나도 모른다.

        //1157번(2)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase(); // 대문자로
        int[] arr = new int[26]; // 영단어 26개
        
        for(int i=0; i<str.length(); i++){ // 대문자 길이만큼 향상문
            int num = str.charAt(i) - 'A'; // str영단어에서 65를 뺀 숫자
            arr[num]++; // 배열에 하나씩 더하고 향상문 실시
        }
        
        int max = 0; // 최댓값
        char answer = '?'; // 출력값
        
        for(int i=0; i<arr.length; i++){ // 배열 길이만큼 향상문
            if(arr[i] > max){ // 문자열에 있는 값 중에서 대문자를 확인함.
                max = arr[i]; // arr[num]에서 이미 65 이상부터 시작함.
                answer = (char)(i+'A'); // 향상문으로 A~Z까지 체크 가능함.
            }else if(arr[i] == max){ // 배열에 있는 값이 0? 대문자로 불가능.
                answer = '?';
            }
        }
        br.close();
        System.out.println(answer);

    }
}
