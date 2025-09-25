import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        // 2738번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print((A[i][j]+B[i][j])+" ");
            }
            System.out.println();
        }

        //2566번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int x = 1;
        int y = 1;
        
        int[][] row1 = new int[9][9];
        
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++){
                row1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(row1[i][j]>max){
                    max = row1[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(x+" "+y);

        // 10798번
        

    }
}