import java.io.*;

public class SolutionBeautifulBinaryString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print((Integer.parseInt(br.readLine()) - br.readLine().replaceAll("010", "").length())/3);
    }
}
