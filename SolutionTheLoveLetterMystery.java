import java.io.*;

public class SolutionTheLoveLetterMystery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            String s = br.readLine();
            int i = 0, j = s.length() -1, count = 0;
            while(i < j){
                count += Math.abs(s.charAt(i++) - s.charAt(j--));
                System.out.println(Math.abs(s.charAt(i++) - s.charAt(j--)));
            }
            System.out.println(count);
        }
    }
}