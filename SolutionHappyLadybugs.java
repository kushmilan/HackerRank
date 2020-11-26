import java.io.*;
import java.util.HashSet;

public class SolutionHappyLadybugs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            HashSet<Character> set = new HashSet<>();
            int size = Integer.parseInt(br.readLine());
            char arr[] = br.readLine().toCharArray();
            for(char c : arr) set.add(c);
            if(hasUnique(arr)){
                System.out.println("NO");
            }else if(!set.contains('_') && alreadyHappy(arr)){
                System.out.println("YES");
            }else if(set.contains('_')){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }            

        }
    }


    private static boolean alreadyHappy(char arr[]) {
        for (int i=0;i<arr.length-1;i++) {
            if (i == 0 && arr[i] != arr[i + 1]) {
                return false;
            }
            else if (arr[i] != arr[i+1] && arr[i] != arr[i-1]){
                return false;
            }
        }        
        return true;
    }

    public static boolean hasUnique(char arr[]) {
        int[] ascii = new int[26];
        
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != '_') {
                ascii[(int)arr[i]-65]++;
            }
        }
        
        for (int i=0;i<26;i++) {
            if (ascii[i] == 1) {
                return true;
            }
        }
        
        return false;
    }

}
