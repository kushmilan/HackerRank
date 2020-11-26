/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @desc [description]
 */

import java.io.*;

public class FraudulentActivityNotificationsSolution {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[n];
        int i = 0;
        for(String st : str){
            arr[i++] = Integer.parseInt(st);
        }        
        System.out.println(answer(arr, n, d));
        System.out.print(activityNotifications(arr, d));
    }    

    private static int answer(int arr[], int size, int d){
        int count = 0;
        int countArr[] = new int[201];
        for(int i = 0; i < d; i++) countArr[arr[i]]++;
        for(int i = d; i < size; i++){            
            double currentMedian = getMedian(countArr, d, 201);
            if(arr[i] >= 2 * currentMedian) count++;
            countArr[arr[i - d]]--;
            countArr[arr[i]]++;
        }
        return count;
    }

    private static double getMedian(int[] countArr, int d, int max) {
        double median = 0;
        if(d % 2 == 0){
            int count = 0, m1 = 0, m2 = 0;
            for(int i = 0; i < max; i++) {
                count += countArr[i];
                if(m1 == 0 && count >= d/2) m1 = i;
                if(m2 == 0 && count >= d/2 + 1){
                    m2 = i; break;
                } 
            }    
            median = (m1 + m2)/2.0;
        }else{
            int count = 0;
            for(int i = 0; i < max; i++){
                count += countArr[i];
                if(count >= d/2){
                    median = i; 
                    break;
                } 
            }    
        }
        System.out.print(median+" ");
        return median;
    }

    static int activityNotifications(int[] expenditure, int d) {;

        int notificationCount = 0;

        int[] data = new int[201];
        for (int i = 0; i < d; i++) {
            data[expenditure[i]]++;
        }

        for (int i = d; i < expenditure.length; i++) {

            double median = getMedian(d, data);

            if (expenditure[i] >= 2 * median) {
                notificationCount++;

            }

            data[expenditure[i]]++;
            data[expenditure[i - d]]--;

        }

        return notificationCount;

    }

    private static double getMedian(int d, int[] data) {
        double median = 0;
        if (d % 2 == 0) {
            Integer m1 = null;
            Integer m2 = null;
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                count += data[j];
                if (m1 == null && count >= d/2) {
                    m1 = j;
                }
                if (m2 == null && count >= d/2 + 1) {
                    m2 = j;
                    break;
                }
            }
            median = (m1 + m2) / 2.0;
        } else {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                count += data[j];
                if (count > d/2) {
                    median = j;
                    break;
                }
            }
        }
        return median;
    }
}
