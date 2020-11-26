import java.io.*;

public class SolutionServiceLane{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sr[] = br.readLine().split("\\s+");
        int T = Integer.parseInt(sr[0]);
        int P = Integer.parseInt(sr[1]);
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[T];
        for (int t = 0; t < T; t++) {
            arr[t] = Integer.parseInt(str[t]);
        }
        for (int t = P; t > 0; t--) {
            String s[] = br.readLine().split("\\s+");
            System.out.println(serviceLane(arr, Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
    }

    static int serviceLane(int arr[], int min, int max){
        int m = Integer.MAX_VALUE;
        for(int i = min; i <= max; i++ ){
            m = Math.min(m, arr[i]);
        }
        return m;
    }

}
