import java.io.*;

public class SolutionGameofThronesFirst {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int i = 0;
        for(char c : s){
            i ^=(1 << (c - 'a' + 1));
        }
        if(s.length % 2 == 0){
            if(Integer.bitCount(i) == 0) System.out.println("YES");                
            else System.out.println("NO");
        }else{
            if(Integer.bitCount(i) > 0) System.out.println("YES");                
            else System.out.println("NO");
        }
        
    }    
}
