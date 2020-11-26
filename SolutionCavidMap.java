import java.io.*;

public class SolutionCavidMap {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        String[][] arr = new String[grid.length][grid.length];
        for(int i = 0; i < grid.length; i++){
            arr[i] = grid[i].split("");            
        }
        String[][] arrCopy = new String[grid.length][grid.length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                arrCopy[i][j] = arr[i][j];
            }
        }
        
        for(int i = 1; i < grid.length - 1; i++){
            for(int j = 1; j < grid.length - 1; j++){
                int a = Integer.parseInt(arr[i][j]);
                if((a > Integer.parseInt(arr[i][j - 1])) && (a > Integer.parseInt(arr[i][j + 1])) && (a > Integer.parseInt(arr[i - 1][j])) && (a > Integer.parseInt(arr[i + 1][j]))){
                    arrCopy[i][j] = "X";
                }
            }
        }
        for(int i = 0; i < grid.length; i++){
            String temp = "";
            for(int j = 0; j < grid.length; j++){
                temp += arrCopy[i][j];
            }
            grid[i] = temp;
        }
        return grid;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] grid = new String[n];
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine();
        }
        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        br.close();
    }
}
