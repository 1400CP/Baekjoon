import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)IOException{
        //2745번-1 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int result = 0;
        int power = 1; // 이건 왜 하는 거지? 이게 B의 제곱이 된다고? 왜??
        
        for(int i=N.length()-1; i>=0; i--){
            char alpha = N.charAt(i);
            if('A' <= alpha && alpha <= 'Z'){ // 대문자일 경우는 파악했음
                result += (alpha - 'A' + 10) * power;
            }else{
                result += (alpha - '0') * power;
            }
            power *= B; // 이게 왜 다음 자리 가중치가 되는 거지?
        }
        br.close();
        System.out.println(result);

        //챗GPT 해설 추가.
        // ZZZZZ = 35 * (36^4) + 35 * (36^3) + 35 * (36^2) + 35 * (36^1) + 35 * (36^0)
        // 따라서 for향상문에서 int i=N.length()-1; i>=0; i-- 가 되어야 함. 역순이 되어야 하기 때문

        //2745-2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int result = Integer.parseInt(N, B); // 그냥 이렇게 하면 된다고 하네요?
        System.out.println(result); // 이게 N의 B 제곱으로 인식하면서 for 향상문 등 다 생략되나봐요.

        //11005
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken()); // 10진법 N
        int B = Integer.parseInt(st.nextToken()); // 알파벳 대문자(숫자로 표현)
        
        String result = Integer.toString(N, B).toUpperCase(); // 결과값이 대문자로 나와야 하기 때문
        System.out.println(result);

        //2720
        
    }
}