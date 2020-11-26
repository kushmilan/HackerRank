/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-19 13:41:45
 * @modify date 2020-04-19 13:41:45
 * @desc [description]
 */

import java.io.*;

class MatrixLayerRotation{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("\\s+");
        int R = Integer.parseInt(str[0]);
        int C = Integer.parseInt(str[1]);
        int Rotation = Integer.parseInt(str[2]);
        int arr[][] = new int[R][C];
        for(int i = 0; i < R; i++){
            String s[] = br.readLine().split("\\s+");
            for(int j = 0; j < C; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        int r1 = 0, c1 = 0, r2 = R-1, c2 = C-1;
        //System.out.println(r1+" "+ r2+" "+c1+" "+c2);
        int num =0;
        while(Math.min(R,C)/2 - num > 0){
            //System.out.println("stringBeforeRotation "+stringBeforeRotation(arr, r1, c1, r2, c2));
            //System.out.println("stringAfterRotation "+stringAfterRotation(stringBeforeRotation(arr, r1, c1, r2, c2), Rotation));
            arr = changeAfterRotation(arr, r1, c1, r2, c2, stringAfterRotation(stringBeforeRotation(arr, r1, c1, r2, c2), Rotation));
            
            r1++;r2--;
            c1++;c2--;
            num ++;
        }
        //arr = changeAfterRotation(arr, r1, c1, r2, c2, stringAfterRotation(stringBeforeRotation(arr, r1, c1, r2, c2), Rotation));
        //arr = changeAfterRotation(arr, r1+1, c1+1, r2-1, c2-1, stringAfterRotation(stringBeforeRotation(arr, r1+1, c1+1, r2-1, c2-1), Rotation));
        /*
        System.out.println(stringBeforeRotation(arr, r1, c1, r2, c2));
        System.out.println(stringAfterRotation(stringBeforeRotation(arr, r1, c1, r2, c2), 2));
        arr = changeAfterRotation(arr, r1, c1, r2, c2, stringAfterRotation(stringBeforeRotation(arr, r1, c1, r2, c2), 2));
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println(stringBeforeRotation(arr, r1+1, c1+1, r2-1, c2-1));
        */
        //System.out.println(stringAfterRotation("1 2 3 4 5 6", 600));
        System.out.println("------------------------------------------------");

        for(int[] a : arr){
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    static String stringBeforeRotation(int arr[][], int r1, int c1, int r2, int c2){
        String temp = "";  
        for(int i = c1; i <= c2; i++){
            temp += arr[r1][i]+" ";
            //System.out.println(temp);
        }

        for(int i = r1+1; i <= r2; i++){
            temp += arr[i][c2]+" ";
            //System.out.println(temp);
        }

        for(int i = c2-1; i >= c1; i--){
            temp += arr[r2][i]+" ";
            //System.out.println(temp);
        }

        for(int i = r2-1 ; i > r1; i--){
            temp += arr[i][c1]+" ";
            //System.out.println(temp);
        }
        return temp.trim();
    }

    static int[][] changeAfterRotation(int arr[][], int r1, int c1, int r2, int c2, String str){
        int index = 0;
        String arrS[] = str.split("\\s+");
        for(int i = c1; i <= c2; i++){
            //System.out.println(index+" "+arrS[index]);
            arr[r1][i] = Integer.parseInt(arrS[index++]);
            //System.out.println(temp);
        }

        for(int i = r1+1; i <= r2; i++){
            //System.out.println(index+" "+arrS[index]);
            arr[i][c2] = Integer.parseInt(arrS[index++]);
            //System.out.println(temp);
        }

        for(int i = c2-1; i >= c1; i--){
            //System.out.println(index+" "+arrS[index]);
            arr[r2][i] = Integer.parseInt(arrS[index++]);
            //System.out.println(temp);
        }

        for(int i = r2-1 ; i > r1; i--){
            //System.out.println(index+" "+arrS[index]);
            arr[i][c1] = Integer.parseInt(arrS[index++]);
            //System.out.println(temp);
        }
        return arr;
    }

    static String stringAfterRotation(String temp, int Rotation){
        int tempLength = 0;
        for(int i =0;i<temp.length();i++){
            if(temp.charAt(i)==' '){
                tempLength++;
            }
        }
        tempLength++;
        Rotation = Rotation % tempLength;
        int r = 0, index = 0;
        if(Rotation == 0){
            return temp;
        }else{
            while(r != Rotation){
                while(temp.charAt(index)!=' '){
                    index++;
                }
                index++;
                r++;
            }
        }
        return (temp.substring(index, temp.length())+" "+temp.substring(0, index));
    }

}