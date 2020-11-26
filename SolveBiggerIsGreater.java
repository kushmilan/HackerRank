/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-07 16:13:58
 * @modify date 2020-05-07 16:13:58
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

public class SolveBiggerIsGreater{
    public static void main(String[] args)throws IOException {
        //File file = new File("input.txt"); 
        //BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter writer = new PrintWriter("OBiggerIsGreater.txt", "UTF-8");
        //writer.println(justify(bricks, T));
        //System.out.print(justify(bricks, T));
        
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            String inp = br.readLine();
            String temp = biggerIsGreater(inp);
            //String temp = biggerIGreater(br.readLine());
            if(inp.equals(temp)){
                System.out.println("no answer");
            }else if(compare(inp, temp)){
                System.out.println("no answer");
            }else{
                System.out.println(temp);
            }
            //writer.println(temp);
        }
        br.close();
        //writer.close();
    }

    static String biggerIsGreater(String str){
        if(str.length()==1){
            return str;
        }
        if(str.length()==2){
            if(str.charAt(0)<str.charAt(1)){
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return sb.reverse().toString();
            }else{
                return "no answer";
            }
        }
        char arr[] = str.toCharArray();
        char max = arr[arr.length-1];
        int index = 0;
        int count = 0;
        for(int i = arr.length -2; i >= 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                //System.out.println(i+" "+max+" "+arr[i]);
                continue;
            }else{
                //System.out.println(i+" "+max+" "+arr[i]);
                count++;
                index = i;
                break;
            }
        }
        //System.out.println("index: "+index);
        if(count==0){
           // System.out.println("here");
            return "no answer";
        }
        int inext = 0;

        for(int i = arr.length -1; i > 0; i--){
            if(arr[index] < arr[i]){
                inext = i;
                //System.out.println("inext: "+inext);
                break;
            }else{
                continue;
            }
        }
        //System.out.println("inext: "+inext);
        char temp = arr[inext];
        arr[inext] = arr[index];
        arr[index] = temp;

        StringBuilder pre = new StringBuilder();
        StringBuilder post = new StringBuilder();
        for(int i = 0; i <=index; i++){
            pre.append(arr[i]);
        }
        for(int i = arr.length-1; i > index; i--){
            post.append(arr[i]);
        }
        //pre.append(str.substring(0, index));
        //post.append(str.substring(index+1, str.length()));
        //System.out.println(post);
        return pre.append(post).toString();
    }

    static boolean compare(String str, String temp){
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) > temp.charAt(i)){
                return true;
            }else if(str.charAt(i) < temp.charAt(i)){
                break;
            }
        }
        return false;
    }
}