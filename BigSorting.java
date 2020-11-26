import java.io.*;
import java.util.Arrays;

public class BigSorting {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int size = Integer.parseInt(br.readLine());
        String s[] = new String[size];
        for(int i = 0; i < size; i++) s[i] = br.readLine();
        String sss[] = bigSorting(s);
        
        for(String ss : sss) System.out.println(ss);

    }

    public static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, (a , b) -> {
            if(a.length() != b.length()) return a.length() - b.length();

            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)) return a.charAt(i) - b.charAt(i);
            } 

            return 0;
        });
        return unsorted;
    }

}