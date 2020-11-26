import java.io.*;

public class SolutuionPalindromeIndex {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            char s[] = br.readLine().toCharArray();
            int i = 0, j = s.length - 1;
            while(i < j){
                if(s[i] != s[j]) break;
                i++;j--;
            }
            if(i > j){
                System.out.println("-1");
            }else{
                if(check(i, j-1, s)){
                    System.out.println(j);
                }else if(check(i + 1, j, s)){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean check(int i, int j, char s[]){
        while(i < j){
            if(s[i] != s[j]) return false;
            i++;j--;
        }
        return true;
    }
}