import java.io.*;
import java.util.Stack;

public class SolutionSuperReducedString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s[] = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character c : s){
            if(stack.isEmpty()){
                stack.push(c);
            }else if(stack .peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }        
        if(stack.isEmpty()){
            System.out.print("Empty String");
        }else{
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            System.out.print(sb.reverse().toString());
        }        
    }
}
