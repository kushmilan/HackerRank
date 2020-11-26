/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-06 14:14:20
 * @modify date 2020-05-06 14:14:20
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionTheFullCountingSort{
    public static void main(String[] args) throws IOException{
        //File file = new File(); BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder[] ar=new StringBuilder[101];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new StringBuilder("");
        }
        for(int i = 0; i < t/2; i++){
            String a[] = br.readLine().split("\\s+");
            int n = Integer.parseInt(a[0]);
            ar[n].append("-"+" ");
        }
        for(int i = 0; i < t/2; i++){
            String a[] = br.readLine().split("\\s+");
            int n = Integer.parseInt(a[0]);
            ar[n].append(a[1]+" ");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 101; i++){
            sb.append(ar[i]);
        }
        
        //int numberLeft = Integer.parseInt((val.substring(0, val.length()/2).isEmpty())? "0" : val.substring(0, val.length()/2));
        //int numberRight = Integer.parseInt((val.substring(val.length()/2).isEmpty()) ? "0" : val.substring(val.length()/2));         

        System.out.println(sb);
    }

}