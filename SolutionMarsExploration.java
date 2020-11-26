import java.io.*;

public class SolutionMarsExploration {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s[] = br.readLine().toCharArray();
        int count = 0;
        for(int i = 0; i < s.length; i+=3){
            if(s[i] != 'S') count++;
            if(s[i + 1] != 'O') count++;
            if(s[i + 2] != 'S') count++;
        }
        System.out.print(count);
    }
}
