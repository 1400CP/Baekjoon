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

        //2720_1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        for(int i=0; i<A; i++){
            int C = Integer.parseInt(br.readLine());
            int Q = 0; // 쿼터
            int D = 0; // 다임
            int N = 0; // 니켈
            int P = 0; // 페니

            if(25 <= C){
                Q += (C/25);
                C = C%25; // 거슬러야 할 돈 계산
            }
            if(10 <= C){
                D += (C/10);
                C = C%10;
            }
            if(5 <= C){
                N += (C/5);
                C = C%5;
            }
            if(1 <= C){
                P = C;
            }

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
        br.close();

        //2720_2(간단화)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int i = 0; i < A; i++) { // 테스트 개수만큼 향상문 설정
            int C = Integer.parseInt(br.readLine()); // 거슬러 줄 금액
            int Q = C / 25; // 쿼터
            C %= 25; // 테스트 케이스 남김
            int D = C / 10; // 다임
            C %= 10; // 테스트 케이스 남김
            int N = C / 5; // 니켈
            C %= 5; // 테스트 케이스 남김
            int P = C; // 페니, 숫자 1이기 때문에 동등

            System.out.println(Q + " " + D + " " + N + " " + P);
        }

        br.close();

        // 2903_1번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int result = 2;
        
        for(int i=0; i<N; i++){
            result = (result + (result-1));            
        }
        System.out.println(result * result);
        br.close();

        // 2903_2번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int result = 2;
        
        for(int i=0; i<N; i++){
            result = (result + (result-1));            
        }
        System.out.println((int)Math.pow(result, 2)); // 제곱 공식을 적용
        br.close();

        // 2292번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 주어지는 수
        
        int room = 1; // 방의 정적 수
        int count = 2; // 지나가는 방의 정적 수 
        
        if(N == 1){ // 주어지는 수가 1일 때
           System.out.println(1); // N값이 1이기 때문에 무조건 1이 출력
        }else{
           while(count <= N){ // 지나가는 방이 2 이상이 될 경우
              count = count + (6 * room); // 숫자가 2 이상이 되고, 6의 배수가 되기 때문에 다음과 같음
              room++; // 최소 방의 개수는 6의 배수로 계산됨.
           }
           System.out.println(room); // 최소 방의 개수 출력.
        }
        br.close();

        // 1193번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        
        int line = 1; // 대각선상의 칸 개수
        int sum = 0; // 직전의 대각선상의 칸의 합
        
        while(true){
            if(X <= sum + line){
                if(line % 2 == 1){ // 홀수
                    // 분자는 큰 수부터 시작
                    // 분자는 대각선상의 칸 개수 - (주어진 값(X) - 직전 대각선 칸의 합 - 1) <- 왜 이럴까?
                    // 분모는 주어진 값(X) - 직전 대각선 칸의 합
                    System.out.println((line - (X - sum - 1)) + "/" + (X - sum));
                    break;
                }else{ // 짝수
                    // 홀수와 반대로 작성하면 됨.
                    System.out.println((X - sum) + "/" + (line - (X - sum - 1)));
                    break;
                }
            }else{
                sum += line;
                line++;
            }
        }
        br.close();

        // 2869번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 오르는 길이
        int B = Integer.parseInt(st.nextToken()); // 떨어지는 길이
        int V = Integer.parseInt(st.nextToken()); // 최종 목표 길이
        
        if(V <= A){
            System.out.println(1);
            br.close();
            return;
        }
        
        int A1 = A - B; // 하루에 올라가는 양
        int B1 = V - B; // 마지막날은 안 빼니까 미리 빼놓기
        int days = B1 / A1;

        if(B1 % A1 != 0){ // 궁금한 게 이렇게 될 경우 소수점이 나오면 결과값은 정수로 그냥 출력되나?
            days++;
        }
        System.out.println(days); // int로 적어놔서 소수점은 그냥 알아서 삭제되는 거였다~
    }
}