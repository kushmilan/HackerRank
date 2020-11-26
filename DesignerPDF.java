/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-19 00:24:59
 * @modify date 2020-04-19 00:24:59
 * @desc [description]
 */


import java.io.*;

class DesignerPDF {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("\\s+");        
        String ch = br.readLine();
        int arr[] = new int[26];
        int index = 0;
        for(String s : str){
            arr[index++] = Integer.parseInt(s);
        }
        int max = 0;
        for(int i = 0; i < ch.length(); i++){
            if(arr[(int)(ch.charAt(i)) - 97] > max){
                max = arr[(int)(ch.charAt(i)) - 97];
            }
        }
        System.out.println(max * ch.length());
    }

}