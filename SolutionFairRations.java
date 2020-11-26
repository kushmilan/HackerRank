import java.io.*;

public class SolutionFairRations {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[size];
        int sum = 0;
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(str[i]);
            sum += arr[i];
        }
        if(sum % 2 == 0){
            System.out.print("NO");
        }else{
            int count = 0;
            for(int i = 0; i < size - 1; i++){
                if(arr[i] % 2 != 0){
                    arr[i]++;
                    arr[i + 1]++;
                    count += 2;
                }
            }
            System.out.print(count);
        }
        
    }
}
