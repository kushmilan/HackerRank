/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-08 14:09:17
 * @modify date 2020-05-08 14:09:17
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionBeautifulTriplets{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split("\\s+");
        int size = Integer.parseInt(a[0]);
        int d = Integer.parseInt(a[1]);
        String s[] = br.readLine().split("\\s+");
        int[] arr = new int[size];
        for (int t = 0 ; t < size; t++) {
            arr[t] = Integer.parseInt(s[t]);
        }

    }

    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        for(int i = 0;i < arr.length - 2; i++){
            int temp = arr[i] + d;
            if(set.contains(temp)){
                int tem = temp + d;
                if(set.contains(tem)){
                    count++;
                }
            }
        }
        return count;
    }

}


/*abstract
Unoptimize

static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        for(int i = 0;i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if((arr[j] - arr[i] == d)){
                    for(int k = j+1; k< arr.length; k++){
                        if(arr[k]-arr[j]==d){
                            count++;
                        }
                    }                    
                }
            }
        }
        return count;
    }

*/