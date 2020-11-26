import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SolutionPangrams {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();
        char[] arr = br.readLine().replace(" ", "").toCharArray();
        for(char c : arr) set.add(Character.toLowerCase(c));
        if(set.size() == 26){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}
