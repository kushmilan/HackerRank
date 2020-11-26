import java.io.*;
import java.util.*;

public class SolutionFlatlandSpaceStations{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("\\s+");
        int size = Integer.parseInt(s[0]);
        int station = Integer.parseInt(s[1]);
        String str[] = br.readLine().split("\\s+");
        int arr[] = new int[station];
        for(int i = 0; i < station; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int ans = arr[0];
        for(int i = 1; i < station; i++){
            ans = Math.max(ans, (arr[i] - arr[i - 1])/2);
        }
        ans = Math.max((size - 1 - arr[station - 1]), ans);
        System.out.print(ans);
    }
}
