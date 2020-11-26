import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SolutionWeightedUniformStrings {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int arr[] = new int[27];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < s.length; i++){
            if(i > 0 && s[i] == s[i - 1] ){
                arr[s[i] - 96]++;
            }else if(i > 0 && s[i] == s[i - 1]){
                arr[s[i - 1] - 96] = 0;
            }else{
                arr[s[i] - 96] = 1;
            }
            set.add(arr[s[i] - 96] * (s[i] - 96));
        }
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            if(set.contains(Integer.parseInt(br.readLine()))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
