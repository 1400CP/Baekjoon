package com.baekjoon.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
    // 1000번
        System.out.println(A+B);
    // 1001번
        System.out.println(A-B);
    // 10998번
        System.out.println(A*B);
    // 10869번
        System.out.println(A / B);
        System.out.println(A % B);
        
        // 2) StringBuilder()
        StringBuilder sb = new StringBuilder();
        sb.append(A+B);
        sb.append('\n');
        sb.append(A-B);
        sb.append('\n');
        sb.append(A*B);
        sb.append('\n');
        sb.append(A/B);
        sb.append('\n');
        sb.append(A%B);
        System.out.print(sb);
        
        // 3) BufferedWriter(OutputStreamWriter)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((A+B) + "\\n");
        bw.write((A-B) + "\\n");
        bw.write((A*B) + "\\n");
        bw.write((A/B) + "\\n");
        bw.write((A%B) + "\\n");

        bw.flush();
        bw.close();
        
        // 4) BufferedReader(InputStreamReader)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int C = Integer.parseInt(str[0]);
        int D = Integer.parseInt(str[1]);

        System.out.println(C+D);
        System.out.println(C-D);
        System.out.println(C*D);
        System.out.println(C/D);
        System.out.println(C%D);
        
        double E = sc.nextInt();
        double F = sc.nextInt();
    // 1008번
        System.out.println(E/F);
    
    // 10171번
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");

    // 10172번
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        
	}
}
