import java.io.*;

public class SolutionManasaAndStones {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int n = Integer.parseInt(br.readLine().trim()) - 1;
            int aa = Integer.parseInt(br.readLine().trim());
            int bb = Integer.parseInt(br.readLine().trim());
            int a = Math.min(aa, bb);
            int b = Math.max(aa, bb);
            int current = a * n;
            int difference = b - a;
            int last = b * n;            
            if(a == b){
                System.out.println(current);
            }else{
                StringBuilder sb = new StringBuilder();
                while(current <= last){
                    sb.append(current +" "); 
                    current += difference;
                }
                System.out.println(sb.toString());
            }
        }
    }
}
