import java.io.*;
import java.util.*;

public class SolutionLilysHomeWork {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[size];
        int arrE[] = new int[size];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(str[i]);
            arrE[i] = arr[i];
            map.put(arr[i], i);
        }
        int arrAsce[] = Arrays.copyOf(arr, size);
        Arrays.sort(arrAsce);
        int arrDesc[] = Arrays.copyOf(arr, size);
        Arrays.copyOf(arr, size);
        reverse(arrDesc, size);
        System.out.println(Math.min(Check(map, arr, arrAsce), Check(map, arr, arrDesc)));
    }



    private static void reverse(int[] arrDesc, int size) {
        Arrays.sort(arrDesc);
        int i = 0, j = size - 1;
        while(i < j){
            swap(arrDesc, i, j);
            i++; j--;
        }
    }

    private static int Check(Map<Integer, Integer> map, int[] arr, int[] arrE) {
        HashMap<Integer, Integer> m = new HashMap<>(map);
        int[] A = Arrays.copyOf(arr, arr.length);
        int size = arr.length;
        int swaps = 0;
        for(int i = 0; i < size; i++){
            if(A[i] != arrE[i]){
                swaps++;
                int from = m.get(arrE[i]);
                int to = m.get(A[i]);
                m.put(A[i], from);
                //m.put(arrE[i], to); Because we'll need this in future.
                swap(A, from, to);                
            }
        }        
        System.out.println(swaps);
        return swaps;
    }

    private static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
