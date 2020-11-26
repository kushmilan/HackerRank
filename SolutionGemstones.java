import java.io.*;
import java.util.*;

public class SolutionGemstones {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();
        int start = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        for(char c : s) set.add(c);
        for (int t = start - 1; t > 0; t--) {
            char[] temp = br.readLine().toCharArray();            
            Set<Character> tempSet = new HashSet<>();
            for(char c : temp) tempSet.add(c);
            set.retainAll(tempSet);
        }
        System.out.println(set.size());
    }
}
