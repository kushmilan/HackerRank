/**
 * @author [Milan Kushwah]
 * @create date 2020-05-15 12:57:35
 * @modify date 2020-05-15 12:57:35
 * @desc [description]
 */

import java.io.*;
import java.util.*; 

class Solution{
    
    public static void main(String[] args)throws IOException{ 
        //File file = new File("input.txt"); BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        String str[] = br.readLine().split("\\s+");
        int size = Integer.parseInt(str[0]);
        int window = Integer.parseInt(str[1]);
        long arr[] = new long[size+1];
        long full = 0;
        for(int i = 1; i <= size; i++){
            arr[i] = Long.parseLong(br.readLine());
            full += arr[i];
        }
        System.out.println(solve(arr, full, window, size));
    } 
    
    private static long solve(long arr[], long full, int window, int size){
        long ar[] = new long[size + 1];
        Deque<Integer> d = new ArrayDeque<>();
        for(int i = 1; i <= window; i++){
            while(!d.isEmpty() && (ar[i - 1] + arr[i]) <= (ar[d.peekLast() - 1] + arr[d.peekLast()])){
                d.pollLast();
            }
            d.addLast(i);
            System.out.println(d);
        }
        for(int i = window + 1 ; i <= size; i++){
            while(!d.isEmpty() && (ar[i - 1] + arr[i]) <= (ar[d.peekLast() - 1] + arr[d.peekLast()])){
                d.pollLast();
            }
            d.addLast(i);
            System.out.println(d);
            ar[i] = (ar[d.peekFirst() - 1] + arr[d.peekFirst()]);
            if(d.peekFirst() == i-window){
                d.pollFirst();
            }
        }
        //System.out.println(full - ar[str.length]);
        return full - ar[size];
    }

}