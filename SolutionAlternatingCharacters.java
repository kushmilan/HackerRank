import java.io.BufferedReader;
import java.io.*;
import java.util.Stack;

/**
 * SolutionAlternatingCharacters
 */
public class SolutionAlternatingCharacters {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            System.out.println(alternatingCharacters(br.readLine()));
        }
    }

    static int alternatingCharacters(String str) {
        char[] s = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : s){
            if(stack.isEmpty()){
                stack.push(c);                
            }else if(stack.peek() == c){
    
            }else{
                stack.push(c);
            }
        }
        return str.length() - stack.size();
    }
}