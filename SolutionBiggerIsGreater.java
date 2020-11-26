import java.io.*;
import java.util.*;

public class SolutionBiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        int letterCount[] = new int[26];
        Arrays.fill(letterCount, 0);
        for(int i = 0; i < w.length(); i++){
            letterCount[(int)w.charAt(i) - 97]++; 
            //System.out.println((int)w.charAt(i) - 97);
        }
        //System.out.println(Arrays.toString(letterCount));
        String temp = "";
        for(int i = 25; i >= 0; i--){
            for(int j = 0; j< letterCount[i]; j++){
                temp += Character.toString((char)(97+i));
                //System.out.println(temp);
            }
        }
        if(w.equals(temp)){
            return "no answer";
        }else{
            return temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            System.out.println(biggerIsGreater(br.readLine()));
        }
    }
}
