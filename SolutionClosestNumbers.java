
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-06 14:14:20
 * @modify date 2020-05-06 14:14:20
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SolutionClosestNumbers{
    public static void main(String[] args) throws IOException{
        //File file = new File(); BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int arr[] = new int[t];
        String ar[] = br.readLine().split("\\s+");
        int index = 0;
        for(int i = 0; i < t; i++){
            arr[index] = Integer.parseInt(ar[index++]);
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min = Math.min(min, Math.abs(arr[i]-arr[i-1]));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])==min){
                sb.append(arr[i-1]+" "+arr[i]+" ");
            }
        }
        System.out.print(sb);
        
    }

}