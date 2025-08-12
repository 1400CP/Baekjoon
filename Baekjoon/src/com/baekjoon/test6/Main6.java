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
        

    }
}
