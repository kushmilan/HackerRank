import java.io.*;
import java.util.*;

public class TwoCharacters{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int size = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < size; i++){
            set.add(s.charAt(i));
        }
        List<Character> list = new ArrayList<>();
        
        for(char e : set) list.add(e);
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                max = Math.max(max, twoCharacters(s, list, i, j));
            }
        }

        System.out.print(max);

    }

    public static int twoCharacters(String s, List<Character> list, int i, int j) {
        String temp = "";
        for(int k = 0; k < s.length(); k++){
            if(s.charAt(k) == list.get(i) || s.charAt(k) == list.get(j)) temp += s.charAt(k);
        }

        for(int k = 0; k < temp.length() - 1; k++){
            if(temp.charAt(k) == temp.charAt(k + 1)) return 0;
        }

        return temp.length();
    }

}