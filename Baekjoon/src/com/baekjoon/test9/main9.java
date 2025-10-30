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
    }
}