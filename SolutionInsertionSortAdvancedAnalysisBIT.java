
/**
 * @author [Milan Kushwah]
 * @create date 2020-06-12 17:34:28
 * @modify date 2020-06-12 17:34:28
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class SolutionInsertionSortAdvancedAnalysisBIT { 

	public static void main(String args[]) throws IOException{         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int size = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split("\\s+");
            int arr[] = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            //System.out.println(sort(arr, 0, size-1));
            System.out.println(getInverCount(arr, size));
        }

    } 
    
    private static int getInverCount(int arr[], int size){
        int inversionCount = 0;
        convert(arr, size);
        int BIT[] = new int[size+1];
        for(int i = 1; i < size; i++){
            BIT[i] = 0;
        }
        for(int i = size-1; i >=0; i--){
            inversionCount += getSum(BIT, i);
            updateBIT(BIT, size, arr[i], 1);
        }

        return inversionCount;
    }

    private static int getSum (int BIT[], int index ){
        int sum = 0;
        while(index > 0){
            sum += BIT[index];
            index -= index & (-index);
        }
        return sum;
    }

    private static void updateBIT (int BIT[], int n, int index, int val ){
        while(index<=n){
            BIT[index] += val;
            index += index & (-index);
        }
    }

    private static void convert(int arr[], int size){
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i = 0; i < size; i++){
            num.put(arr[i],i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < size; i++){
            pq.add(arr[i]);
        }
        int t = 1;
        while(pq.size()!=0){
            arr[num.get(pq.poll())] = t++;
        }
        System.out.println(Arrays.toString(arr));
    }


} 
