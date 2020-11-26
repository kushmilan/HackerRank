import java.io.*;
import java.util.Arrays;


//@SuppressWarnings("unchecked")
public class SolutionEmasSupercomputerBF{
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String str[] = br.readLine().split("\\s+");
        final int M = Integer.parseInt(str[0]);
        final int N = Integer.parseInt(str[1]);

        final String arr[][] = new String[M + 2][N + 2];
        
        for(String a[] : arr){
            Arrays.fill(a, "B");
        }
        for (int i = 1; i < M + 1; i++) {
            final String st[] = br.readLine().split("");
            int index = 0;
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = (st[index++]);
            }
        }
        
        int max = 1;
        
        
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {  
                String tempar[][] = copyArr(arr);              
                for(int m = 1; m < M + 1; m++){                    
                    for(int n = 0; n < N+1 ; n++){
                        int count = 0;
                        int countS = 0;
                        int index = 1;
                        if(tempar[i][j].equals("G") && tempar[m][n].equals("G") && (Math.abs(i-m) > 1 || Math.abs(j-n)>1)){
                            count = 1;
                            countS = 1;
                        }else{
                            continue;
                        }
                        while(tempar[i][j].equals("G") && tempar[i+index][j].equals("G") && tempar[i][j+index].equals("G") && tempar[i-index][j].equals("G") && tempar[i][j-index].equals("G") ){
                            tempar[i+index][j] = "B";
                            tempar[i-index][j] = "B";
                            tempar[i][j+index] = "B";
                            tempar[i][j-index] = "B";
                            count += 4;
                            //System.out.println("|"+i+" "+j+"|"+" "+count);
                            System.out.println("ans ("+i+" "+j+") ("+m+" "+n+"): "+(count*countS));
                            index++;
                            //printMatrix(arr, M, N);
                        }
                        index = 1;
                        while(tempar[m][n].equals("G") && tempar[m+index][n].equals("G") && tempar[m][n+index].equals("G") && tempar[m-index][n].equals("G") && tempar[m][n-index].equals("G") ){
                            tempar[m+index][n] = "B";
                            tempar[m-index][n] = "B";
                            tempar[m][n+index] = "B";
                            tempar[m][n-index] = "B";
                            countS += 4;
                            //System.out.println("|"+m+" "+n+"|"+" "+countS);
                            System.out.println("ans ("+i+" "+j+") ("+m+" "+n+"): "+(count*countS));
                            index++;                            
                            //printMatrix(arr, M, N);
                        }
                        System.out.println("-------------------------------------------------------");
                        int ans = count*countS;
                        //System.out.println("ans ("+i+" "+j+") ("+m+" "+n+"): "+ans);
                        max = Math.max(max, ans);                
                        tempar = copyArr(arr);
                    }
                }

            }
        }
        
        System.out.println(max);        
    }

    

    static void printMatrix(String[][] arr, int M, int N){
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(arr[i][j]);       
            }
            System.out.println();
        }
    }

    static String[][] copyArr(String arr[][]){
        String temp[][] = new String[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                temp[i][j] = arr[i][j];
            }
        }
        return temp;
    }
    
}