import java.io.*;

public class SolutionConnectedCellsinaGrid {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split("\\s+");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){ //row
            for(int j = 0; j < m; j++){ //column
                if(arr[i][j] == 1){
                    int temp = 0;
                    if(i - 1 >= 0 && j - 1 >= 0){
                        temp = Math.max(temp, arr[i - 1][j - 1] + 1);
                    }
                    if( j - 1 >= 0){
                        temp = Math.max(temp, arr[i][j - 1] + 1);
                    }
                    if(i + 1 < n && j - 1 >= 0){
                        temp = Math.max(temp, arr[i + 1][j - 1] + 1);
                    }
                    if(i + 1 < n ){
                        temp = Math.max(temp, arr[i + 1][j] + 1);
                    }
                    if(i + 1 < n && j + 1 < m){
                        temp = Math.max(temp, arr[i + 1][j + 1] + 1);
                    }
                    if( j + 1 < m){
                        temp = Math.max(temp, arr[i][j + 1] + 1);
                    }
                    if(i - 1 >= 0 && j + 1 < m){
                        temp = Math.max(temp, arr[i - 1][j + 1] + 1);
                    }
                    if(i - 1 >= 0 ){
                        temp = Math.max(temp, arr[i - 1][j] + 1);
                    }
                    max = Math.max(temp, max);
                }                
            }
        }
        System.out.println(max);

    }
}
