import java.io.*;
import java.util.*;


@SuppressWarnings("unchecked")
public class SolutionEmasSupercomputer{
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String str[] = br.readLine().split("\\s+");
        final int M = Integer.parseInt(str[0]);
        final int N = Integer.parseInt(str[1]);

        final String arr[][] = new String[M + 2][N + 2];
    
        for(String a[] : arr){
            Arrays.fill(a, "B");
        }
        for (int i = 1; i < M + 1; i++) {
            final String st[] = br.readLine().split("");
            int index = 0;
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = (st[index++]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        HashMap<String, Integer> set = new HashMap();
        //printMatrix(arr, M, N);
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                int count = 1;
                int index = 1;
                String s = i+" "+j;
                while(arr[i][j].equals("G") && arr[i+index][j].equals("G") && arr[i][j+index].equals("G") && arr[i-index][j].equals("G") && arr[i][j-index].equals("G") ){
                    /*
                    arr[i+index][j] = "B";
                    arr[i-index][j] = "B";
                    arr[i][j+index] = "B";
                    arr[i][j-index] = "B";
                    */
                    count += 4;
                    
                    //System.out.println("here");
                    /*
                    System.out.println(index);
                    arr[i+index][j] = "B";
                    System.out.println(i+index+" "+j);
                    System.out.println(arr[i+index][j]);
                    arr[i-index][j] = "B";
                    System.out.println(i-index+" "+j);
                    System.out.println(arr[i-index][j]);
                    arr[i][j+index] = "B";
                    System.out.println(i+" "+(j+index));
                    System.out.println(arr[i][j+index]);
                    arr[i][j-index] = "B";
                    System.out.println(i+" "+(j-index));
                    System.out.println(arr[i][j-index]);
                    System.out.println("|"+i+" "+j+"|");
                    */

                    if(set.containsKey(i+index+" "+j) && set.get(i+index+" "+j) <= count){
                        set.remove(i+index+" "+j);
                    }else if(set.containsKey(i-index+" "+j) && set.get(i-index+" "+j) <= count){
                        set.remove(i-index+" "+j);
                    }else if(set.containsKey(i+" "+j + index) && set.get(i+" "+j + index) <= count){
                        set.remove(i+" "+j + index);
                    }else if(set.containsKey(i+" "+(j-index)) && set.get(i+" "+(j-index)) <= count){
                        set.remove(i+" "+(j-index));
                    }

                    System.out.println("|"+i+" "+j+"|"+" "+count);
                    index++;
                    printMatrix(arr, M, N);
                }
                set.put(s,count);
                list.add(count);
            }
        }
        /*
        System.out.println("---------------------------------------------");
        System.out.println(list);
        System.out.println("---------------------------------------------");
        printMatrix(arr, M, N);
        */
        //System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0)*list.get(1));

    }

    static void printMatrix(String[][] arr, int M, int N){
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(arr[i][j]);       
            }
            System.out.println();
        }
    }
}
