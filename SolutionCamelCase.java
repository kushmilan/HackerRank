import java.io.*;

public class SolutionCamelCase {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s[] = br.readLine().toCharArray();
        int count = 1;
        for(Character c : s) if((int)c >= 65 && (int )c <= 90) count++;
        System.out.print(count);
    }
}
