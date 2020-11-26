import java.io.*;
import java.util.*;

public class SolutionTheBombermanGame{
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String str[] = br.readLine().split("\\s+");
        final int M = Integer.parseInt(str[0]);
        final int N = Integer.parseInt(str[1]);
        final int n = Integer.parseInt(str[2]);
        final String arr[][] = new String[M + 2][N + 2];
    
        for (int i = 1; i < M + 1; i++) {
            final String st[] = br.readLine().split("");
            int index = 0;
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = (st[index++]);
            }
        }

        final String arrTwo[][] = new String[M + 2][N + 2];
        for (final String[] a : arrTwo)
            Arrays.fill(a, "O");

        String arrThree[][] = new String[M + 2][N + 2];
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                arrThree[i][j] = arrTwo[i][j];
            }
        }
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                //System.out.println(arr[i][j]+" "+arrThree[i][j]);
                if(arr[i][j].equals("O")){
                    arrThree[i][j] = ".";
                    arrThree[i - 1][j] = ".";
                    arrThree[i + 1][j] = ".";
                    arrThree[i][j - 1] = ".";
                    arrThree[i][j + 1] = ".";
                }
            }
        }
        
        final String arrFour[][] = new String[M + 2][N + 2];
        for (final String[] a : arrFour)
            Arrays.fill(a, "O");
        
        String arrFive[][] = new String[M + 2][N + 2];
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                arrFive[i][j] = arrFour[i][j];
            }
        }
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (arrThree[i][j].equals("O")) {
                    arrFive[i][j] = ".";
                    arrFive[i - 1][j] = ".";
                    arrFive[i + 1][j] = ".";
                    arrFive[i][j - 1] = ".";
                    arrFive[i][j + 1] = ".";
                }
            }
        }
        
        if(n==1){
            printMatrix(arr, M, N);
        }else if(n%2 == 0){
            printMatrix(arrTwo, M, N);
        }else if(n%4==1){
            printMatrix(arrFive, M, N);
        }else if(n%4==3){
            printMatrix(arrThree, M, N);
        }


    }

    static void printMatrix(String[][] arr, int M, int N){
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(arr[i][j]);       
            }
            System.out.println();
        }
    }
}
