import java.io.*;
import java.util.Stack;

public class SolutionHackerRankinaString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            Stack<Character> stack = new Stack<>();
            String s = "hackerrank";
            for(int i = s.length() - 1; i >= 0; i--){
                stack.push(s.charAt(i));
            }
            char[] check = br.readLine().toCharArray();
            for(int i = 0; i < check.length; i++){
                if(check[i] == stack.peek()) stack.pop();
                if(stack.isEmpty()) break;
            }
            if(stack.isEmpty()) System.out.println("YES");   
            else System.out.println("NO");
        }
    }
}
