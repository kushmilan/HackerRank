import java.io.*;
import java.util.*;

public class SolutionTwoStrings {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            if(check(br.readLine(), br.readLine())){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    private static boolean check(String one, String two) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < one.length(); i++){
            set.add(one.charAt(i));
        }
        for(int i = 0; i < two.length(); i++){
            if(set.contains(two.charAt(i))) return true;
        }
        return false;
    }
}
