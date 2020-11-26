import java.io.*;

public class SolutionAnagram {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            String s = br.readLine();
            if(s.length() % 2 == 0){
                char[] first = s.substring(0, s.length()/2).toCharArray();
                char[] second = s.substring(s.length()/ 2, s.length()).toCharArray();
                int arr[] = new int[27];
                int count = 0;
                for(char c : first) arr[c - 'a' + 1]++;
                for(char c : second){
                    if(arr[c - 'a' + 1] >= 1){
                        arr[c - 'a' + 1]--;
                    }else{
                        count ++;
                    }
                }
                System.out.println(count);
            }else{
                System.out.println(-1);
            }
            
        }
    } 
}
