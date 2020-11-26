import java.io.*;
import java.util.Arrays;

public class SolutionFunnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            char[] s = br.readLine().toCharArray();
            int ar[] = new int[s.length -1];
            int arr[] = new int[s.length - 1];
            for(int i = 0; i < ar.length; i++){
                ar[i] = (int)Math.abs(s[i + 1] - s[i]);
            }
            s = reverse(s, s.length);
            //System.out.println(Arrays.toString(s));
            for(int i = 0; i < ar.length; i++){
                arr[i] = (int)Math.abs(s[i + 1] - s[i]);
            }
            if(Arrays.equals(ar, arr)){
                System.out.println("Funny");
            }else{
                System.out.println("Not Funny");
            }
        }
    }

    static char[] reverse(char a[], int n){ 
        char t; 
        for (int i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
        return a;
    }
}
