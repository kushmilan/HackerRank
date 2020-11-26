/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-19 00:24:59
 * @modify date 2020-04-19 00:24:59
 * @desc [description]
 */


import java.io.*;
import java.util.*;

class PickingNumbers {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[T];
        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int count = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < T; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            for(int j = 0; j < T; j++){
                if(i!=j){
                    if(Math.abs(arr[i]-arr[j]) ==1 || Math.abs(arr[i]-arr[j]) ==0){
                        if(check(list, arr[j])){
                            list.add(arr[j]);
                        }
                    }
                }   
            }
            System.out.println(list);
            count = Math.max(count, list.size());
        }
        System.out.println(count);
    }

    static boolean check(ArrayList<Integer> list, int num){
        for(int a : list){
            if(Math.abs(num - a) == 1 || Math.abs(num - a) == 0){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}