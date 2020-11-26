import java.io.*;

public class SolutionStrangeCounter {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());
        long check = 0, i = 0;
        while(number > check){
            check = 3*((long)Math.pow(2, i++) - 1);
        }
        //System.out.println(check);
        System.out.print(check - number + 1);
    }
}
