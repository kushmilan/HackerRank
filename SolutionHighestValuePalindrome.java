import java.io.*;

public class SolutionHighestValuePalindrome {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int arr[] = new int[n];
        String st[] = br.readLine().split("");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        //System.out.println(Arrays.toString(arr));
        int error = 0;
        for(int i = 0, j = n - 1; i < n / 2; i++, j--){
            if(arr[i] != arr[j]) error++;
        }
        //System.out.println(error+ " " + k);
        String answer = highestValue(arr, error, k, n);
        System.out.print(answer);

    }

    private static String highestValue(int[] arr, int error, int k, int n) {
        if(error > k){
            return "-1";
        }else if(n == 1 && k >= 1){
            return "9";
        }else{
            for(int i = 0, j = n - 1; i < n / 2; i++, j--){
                if(arr[i] == 9 || arr[j] == 9 && k >= error){
                    arr[i] = 9;
                    arr[j] = 9;
                    //System.out.println(arr[i] + " " + arr[j]);
                    error--; k--;
                }else if(arr[i] != arr[j] && k > error){
                    arr[i] = 9;
                    arr[j] = 9;
                    error--; k-=2;
                    //System.out.println("Same: " + arr[i] + " " + arr[j]);
                }else{
                    arr[i] = Math.max(arr[i], arr[j]);
                    arr[j] = arr[i];
                    error--; k--;
                    //System.out.println("Diffrent: " + arr[i] + " " + arr[j]);
                }
            }
            if(k != 0){
                
            }
        }
        //System.out.println(Arrays.toString(arr));
        String ret = "";
        for(int i = 0; i < n; i++){
            ret += arr[i];
        }
        return ret;
    }

}