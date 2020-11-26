/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-05 16:13:07
 * @modify date 2020-05-05 16:13:07
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionLarrysArray{
    public static void main(String[] args) throws IOException{
        //File file = new File(); BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int size = Integer.parseInt(br.readLine());
            String ar[] = br.readLine().split("\\s+");
            int arr[] = new int[size];
            int index = 0;
            for(String s : ar)
                arr[index++] = Integer.parseInt(s);
            
            
            for(int i = 0; i < size; i++){
                for(int j = size - 3; j>=i;j--){
                    while(arr[j] > arr[j+1]  || arr[j] > arr[j+2]){
                        arr = rotate(arr, j);
                    }
                }
            }
            if(arr[size-2] <= arr[size-1]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }

    static int[] rotate(int arr[], int index){
        int temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = arr[index+2];
        arr[index+2] = temp;
        return arr;
    }
}

