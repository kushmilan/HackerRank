import java.io.*;
import java.util.HashSet;

public class SolutionStrongPassword {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        HashSet<String> set = new HashSet<>();
        set.add("Number"); set.add("Upper"); set.add("Lower"); set.add("special");        
        for(Character c : s){
            if((int)c >= 65 && (int)c <= 90){
                //System.out.println("U");
                if(set.contains("Upper")) set.remove("Upper");
            }else if((int)c >= 97 && (int)c <= 122){
                //System.out.println("L");
                if(set.contains("Lower")) set.remove("Lower");
            }else if((int)c >= 48 && (int)c <= 57){
                //System.out.println("N");
                if(set.contains("Number")) set.remove("Number");
            }else {
                //System.out.println("S");
                if(set.contains("special")) set.remove("special");
            }
        }
        if(size < 6){
            System.out.print(Math.max(set.size(), 6 - size));
        }else{
            System.out.print(set.size());
        }
    }
}
