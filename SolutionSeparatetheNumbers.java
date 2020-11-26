import java.io.*;

public class SolutionSeparatetheNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            String s = br.readLine().trim();
            boolean check = false;
            long ans = 0;
            for(int i = 1; i <= s.length()/2; i++){
                long num = Long.parseLong(s.substring(0, i));
                ans = num;
                //System.out.println(ans+"--------------");
                String te = num + "";
                while(te.length() < s.length()){
                    num += 1;
                    te += num;                    
                }
                if(te.equals(s)){
                    check = true;
                    break;
                }
            }
            if(check){
                System.out.println("YES "+ans);
            }else{
                System.out.println("NO");
            }
        }
    }
}