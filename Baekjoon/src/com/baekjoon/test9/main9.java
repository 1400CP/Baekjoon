import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{

        // 5086번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){ // 여러 테스트 케이스
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
            int f = Integer.parseInt(st.nextToken()); // 첫 번째 수
            int m = Integer.parseInt(st.nextToken()); // 두 번째 수
            
            if(f == 0 && m == 0){ // 0 0 일 때
                break;
            }
            if(f !=0 && m % f == 0){ // 약수
                System.out.println("factor");
            }else if(m != 0 && f % m == 0){ // 배수
                System.out.println("multiple");
            }else{ // 둘 다 아닐 경우
                System.out.println("neither");
            }
        }
        br.close();

        // 2501번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int count = 0; // 결과값을 측정하기 위한 값을 지정함.
        for(int i=1; i<=N; i++){ // 약수의 값만큼 향상문을 해야 함. N번 지정해야 함.
            if(N%i==0){ // i번 필요하고 약수는 나머지 값이 0이 나와야 함.
                count++; // 약수를 측정하기 위한 count가 한번씩 카운트 되도록 함.
                if(count == K){ // K 값과 같아지도록 함.
                    System.out.println(i); // i값과 count값이 하나씩 같이 올라감.
                    return; // 향상문이 멈추도록 break 또는 return함.
                }
            }
        }
        System.out.println(0); // 향상문에서 약수값을 구했기 때문에 이외의 값은 0이 나오도록 함.

        // 9506번
        

    }
}