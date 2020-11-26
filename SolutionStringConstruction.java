import java.io.*;
import java.util.*;

public class SolutionStringConstruction {
    public static void main(String[] args) throws IOException{
        //File file = new File(); BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            Set<Character> set = new HashSet<>();
            String s = br.readLine();
            int j = 0;
            while(j < s.length()){
                set.add(s.charAt(j++));
            }
            System.out.println(set.size());
        }        
    }
}
