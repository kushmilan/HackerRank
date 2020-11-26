/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-08 14:09:17
 * @modify date 2020-05-08 14:09:17
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SolutionACMICPCTeam{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split("\\s+");
        int size = Integer.parseInt(a[0]);
        BigInteger[] arr = new BigInteger[size];
        int i = 0;
        for (int t = size ; t > 0; t--) {
            arr[i++] = new BigInteger(br.readLine(), 2);
        }
        int max = 0;
        int ways = 0;

        for(int j = 0; j < size; j++){
            for(int k = j+1; k < size; k++ ){
                BigInteger temp =arr[j].or(arr[k]);
                //System.out.println(temp);
                int c = temp.bitCount();
                if(c > max){
                    max = c;
                    ways = 1;
                } else if(c == max){
                    ways++;
                }
            }
        }
        System.out.println(max);
        System.out.println(ways);

    }

}



/*abstract

static int[] acmTeam(String[] topic) {
        int ar[] = new int[2];
        int max = 0;
        int ways = 0;
        int m[] = new int[topic[0].length()+1];
        Arrays.fill(m, 0);
        List<HashSet<Integer>> s = new ArrayList<>();
        for(int i = 0; i<topic.length; i++){
            s.add(new HashSet<Integer>());
        }
        for(int i = 0; i<topic.length; i++){
            s.get(i).addAll(indexes(topic[i]));
        }
        for(int i = 0; i<topic.length; i++){
            Set<Integer> temp = new HashSet<>();
            temp.addAll(s.get(i));
            for(int j = i;j<topic.length;j++){
                Set<Integer> t = new HashSet<>();
                t.addAll(s.get(j));
                t.addAll(temp);
                m[t.size()]++;
                max = Math.max(max, t.size());
            }
        }
        ar[0] = max;
        ar[1] = m[max];
        return ar;
    }


*/