import java.io.*;
import java.util.*;

public class SolutionProblemSolving{    
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
        String s[] = br.readLine().split("\\s+");
        int size = Integer.parseInt(s[0]);
        int range = Integer.parseInt(s[1]);
        String[] str = br.readLine().split("\\s+");
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for(int i = 0; i < size; i++){
            set.add(arr[i]);
        }
        int count = 0;
        //Iterator e = set.iterator();  
        
        Iterator value = set.iterator(); 
        while (value.hasNext()) { 
            System.out.print(value.next()+" "); 
        }
        System.out.println();

        while(set.size()!=0){
            int temp = set.iterator().next();
            set.remove(temp);
            //System.out.print(temp);
            count++;
            while(set.contains(temp+range)){
                temp = temp + range;   
                set.remove(temp);             
            }
            //System.out.println();
        }
        System.out.println(count);
       }       
    }
    
}