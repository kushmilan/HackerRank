import java.io.*;
import java.util.*;

public class SolutionSherlockandtheValidString {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char charArr[] = br.readLine().toCharArray();
        int arr[] = new int[26], max = Integer.MIN_VALUE;
        for(Character c : charArr) arr[c - 97]++;
        Arrays.sort(arr);
        int i = 0;
        while(arr[i] == 0) i++;
        int min = arr[i];
        max = arr[25];
        String output = "NO";
        if(max == min) output = "YES";
        else if((max - min == 1 && max > arr[24]) || (min == 1 && arr[i+1]== max)) output = "YES";
        System.out.print(output);
    }
}
