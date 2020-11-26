import java.io.*;

public class SolutionBetweenTwoSets{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sr[] = br.readLine().split("\\s+");
        int T = Integer.parseInt(sr[0]);
        int P = Integer.parseInt(sr[1]);
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[T];
        String st[] = br.readLine().split("\\s+");
        int arrTwo[] = new int[P];
        for (int t = 0; t < T; t++) {
            arr[t] = Integer.parseInt(str[t]);
        }
        for (int t = 0; t < P; t++) {
            arrTwo[t] = Integer.parseInt(st[t]);
        }
        int lcm = lcm(arr);
        int gcd = gcd(arr);
        int count = 0;
        for(int i = lcm; i <= gcd; i+=lcm){
            if(lcm % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    static int gcd(int arr[]){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            result = gcd(result, arr[i]);
        }
        return result;
    }

    static int gcd(int a , int b){
        while(b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int arr[]){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            result = lcm(result, arr[i]);
        }
        return result;
    }

    static int lcm(int a, int b){
        return a *(b / gcd(a, b));
    }


}
