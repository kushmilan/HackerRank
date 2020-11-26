import java.io.*;

public class SolutionMakingAnagrams {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] first = br.readLine().toCharArray();
        char[] second = br.readLine().toCharArray();
        int ar[] = new int[27];
        int arr[] = new int[27];
        for(char c : first){
            ar[c - 'a']++;
        } 
        for(char c : second){
            arr[c - 'a']++;
        }
        int count = 0;        
        for(int i = 0; i < 27; i++){
            if(ar[i] > 0 && arr[i] > 0){
                count += Math.abs(ar[i] - arr[i]);
            }else{
                count += ar[i];
                count += arr[i];
            }
        }
        System.out.println(count);

    }
}
