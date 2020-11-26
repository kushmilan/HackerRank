import java.io.*;
import java.util.*;

public class SolutionStick {

    static void cutTheSticks(int[] arr) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(count != arr.length){
            int min = minNum(arr);
            int cut = 0;
            for(int i = 0; i < arr.length; i++ ){
                if(arr[i]!=0 && min <= arr[i]){
                    cut++;
                    arr[i] = arr[i] - min;
                    if(arr[i]==0){
                        count++;
                    }
                }                
            }
            list.add(cut);
            System.out.println(cut);
        }
    }

    static int minNum(int[] arr){
        int mini = 100000;
        for(int i = 0; i< arr.length; i++){ 
            if(arr[i]!=0){
                mini = Math.min(mini, arr[i]);
            }            
        }
        return mini;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split("\\s+");
        int ar[] = new int[str.length];
        int index = 0;
        for(String s : str){
            ar[index++] = Integer.parseInt(s);
        }
        cutTheSticks(ar);
    }
}
