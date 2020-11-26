import java.io.*;
import java.util.*;

public class SolutionThreeDSurfaceArea{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str[] = br.readLine().split("\\s+");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int arr[][] = new int[M+2][N+2];
            for(int[] a : arr)
                Arrays.fill(a, 0);
            for(int i = 1; i < M+1; i++){
                String st[] = br.readLine().split("\\s+");
                int index = 0;
                for(int j = 1; j < N+1; j++){
                    arr[i][j] = Integer.parseInt(st[index++]);
                }
            }
            /*
            for(int[] a : arr){
                System.out.println(Arrays.toString(a));
            }
            */
            int count = 0;
            for(int i = 1; i < M+1; i++){
                for(int j = 1; j < N+1; j++){
                    if(arr[i-1][j] < arr[i][j] || arr[i-1][j] == 0 ){
                        //System.out.println(i+" "+j+" Upper"+(arr[i][j] - arr[i-1][j]));
                        count += arr[i][j] - arr[i-1][j]; //Upper
                    }
                    if(arr[i][j-1] < arr[i][j] || arr[i][j-1] == 0){
                        //System.out.println(i+" "+j+" left "+(arr[i][j] - arr[i][j-1]));
                        count += arr[i][j] - arr[i][j-1]; //left
                    }
                    if(arr[i+1][j] < arr[i][j] || arr[i+1][j] == 0){
                        //System.out.println(i+" "+j+" down "+(arr[i][j] - arr[i+1][j]));
                        count += arr[i][j] - arr[i+1][j]; //down
                    }
                    if(arr[i][j+1] < arr[i][j] || arr[i][j+1] == 0){
                        //System.out.println(i+" "+j+" right "+(arr[i][j] - arr[i][j+1]));
                        count += arr[i][j] - arr[i][j+1]; //right
                    }
                    count += 1; //UpperMost area
                    //System.out.println(i + " "+j +" "+ (Math.abs(arr[i-1][j] - arr[i][j]) + Math.abs(arr[i][j-1] - arr[i][j]) +
                    //Math.abs(arr[i+1][j] - arr[i][j])+Math.abs(arr[i][j+1] - arr[i][j])+ 1));
                }
            }
            System.out.println(count+(M*N));

        //}

    }

}
