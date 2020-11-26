import java.io.*;

public class SolutionRunningTimeofAlgorithms {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size], k = 0, count = 0;
        String[] s = br.readLine().split("\\s+");
        for(String ss : s) arr[k++] = Integer.parseInt(ss);
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] > arr[j]) count++;
            }
        }
        System.out.print(count);
    }
}