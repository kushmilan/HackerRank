/**
 * @author [Milan Kushwah]
 * @create date 2020-06-12 17:34:28
 * @modify date 2020-06-12 17:34:28
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SolutionInsertionSortAdvancedAnalysis { 

    static int temp[] = new int[100000];

	private static long merge(int arr[], int l, int m, int r){ 
        long swap = 0;
        int i = l, j = m, k =l;

        while(i < m && j<=r){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;i++;
            }else{
                temp[k] = arr[j];
                k++;j++;
                swap += m-i;
            }
        }

        while(i<m){
            temp[k] = arr[i];
            k++;i++;
        }
        while(j<=r){
            temp[k] = arr[j];
            k++;j++;
        }
        while(l<=r){
            arr[l] = temp[l];
            l++;
        }

        return swap;
	} 

	private static long sort(int arr[], int l, int r){ 
        long swap = 0;
        if (l < r) { 
			int m = l+ (r - l)/2; 
			swap += sort(arr, l, m); 
			swap += sort(arr, m + 1, r);    
			swap += merge(arr, l, m+1, r); 
        } 
        return swap;
    } 
   
	public static void main(String args[]) throws IOException{         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int size = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split("\\s+");
            int arr[] = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(sort(arr, 0, size-1));
        }

	} 

} 
