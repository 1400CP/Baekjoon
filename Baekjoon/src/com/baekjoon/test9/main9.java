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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            }
            
            int[] arr = new int[n];        // 배열, 약수의 배열
            int sum = 0;        // 약수들의 합
            int index = 0;        // 약수를 담을 인덱스
            
            for(int i=1; i<n; i++){
                if(n%i == 0){        // 약수일 때를 가정
                    arr[index++] = i;        // 약수를 배열에 저장
                    sum += i;        // 약수의 합을 계산
                }
            }
            
            if(sum != n){        // 약수의 합이 n과 다를 경우 (완전수가 아님)
                System.out.println(n + " is NOT perfect.");
                continue;
            }
            
            System.out.print(n + " = "); // 완전수 앞부분 출력
            
            for(int i=0; i<index; i++){ // 배열에 저장된 약수를 출력
                if(i == index-1){        // 약수를 출력해야 하는데, 자신이 값인 경우를 제외하기 위하여(?)
                    System.out.print(arr[i]);
                }else{        // 약수를 끝까지 출력함.
                    System.out.print(arr[i] + " + ");
                }
            }
            System.out.println();
        }
        br.close();


        // 1978번-1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫 자연수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int isPrime; // 소수를 알아내는 코드이름인데 boolean을 안 쓰고 하는 걸 가져와봄.
        int count = 0; // 출력할 소수 합.
        
        for(int i=0; i<N; i++){
            isPrime = Integer.parseInt(st.nextToken()); // 두 번째 수
            for(int j=2; j<=isPrime; j++){ // 소수 계산하는 향상문, 2부터 시작.
                if(j==isPrime){ // j값과 두 번째 수가 같은 값이 소수.
                    count++;    // 이때만 출력++
                }
                if(isPrime%j==0){    // 두 번째 수를 j로 나눴을 때 소수가 아니기 때문에 다시 향상문으로.
                    break;
                }
            }
        }
        System.out.println(count); // 출력
        br.close();

        // 1978번-2 (대규모 작업 시, boolean으로 소수를 따로 구별)
        /*
        import java.io.*;
        import java.util.*;

        public class Main {

            // public ❌
            // static ❌
            // → 일반 인스턴스 메서드
            boolean isPrime(int n) {
                if (n < 2) return false;

                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) return false;
                }

                return true;
            }

            public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                int count = 0;

                // ⭐ non-static 메서드를 쓰기 위해 Main 인스턴스를 만든다
                Main m = new Main();

                for (int i = 0; i < N; i++) {
                    int num = Integer.parseInt(st.nextToken());
                    if (m.isPrime(num)) count++;
                }

                System.out.println(count);
                br.close();
            }
        }
        */
        


    }
}