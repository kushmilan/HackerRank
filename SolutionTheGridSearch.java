import java.io.*;

public class SolutionTheGridSearch{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            String str[] = br.readLine().split("\\s+");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            String[] arr = new String[M];
            for(int i = 0;i < M; i++){
                arr[i] = br.readLine();
            }
            String st[] = br.readLine().split("\\s+");
            int m = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            String ar[] = new String[m];
            for(int i = 0; i < m; i++){
                ar[i] = br.readLine();
            }
            System.out.println(finalCheck(arr, ar));
        }

    }

    static String finalCheck(String arr[], String ar[]){
        int temp = 0;
        while(temp < arr.length){
            if(arr[temp].contains(ar[0])){
                //System.out.println("here");
                if(check(arr, ar, temp)){
                    return "YES";
                }else{
                    temp++;
                }
            }else{
                temp++;
            }
        }
        return "NO";
    }

    /*
    static boolean check(String arr[], String ar[], int index){
        int tempa = 0;
        int temp = index;
        if(arr[temp].contains(ar[0])){
            tempa = 0;
            String contain = containSub(arr[temp], ar[tempa]);
            temp++;tempa++;
            while(tempa < ar.length){
                //System.out.println("Yes");
                if(arr[temp].contains(ar[tempa])){
                    //System.out.println(arr[temp]+" "+ar[tempa]);
                    if(contain.equals(containSub(arr[temp], ar[tempa]))){
                        temp++; tempa++;
                    }else{
                        return false;    
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    */

    static boolean check(String arr[], String ar[], int index){
        int tempa = 0;
        int temp = index;
        if(arr[temp].contains(ar[0])){
            tempa = 0;
            String contain = containSub(arr[temp], ar[tempa]);
            temp++;tempa++;
            while(tempa < ar.length){
                //System.out.println("Yes");
                if(arr[temp].contains(ar[tempa])){
                    //System.out.println(arr[temp]+" "+ar[tempa]);
                    if(contain.equals(containSub(arr[temp], ar[tempa]))){
                        temp++; tempa++;
                    }else if(checkLen(containSub(arr[temp], ar[tempa]), arr, temp, ar, tempa)){                        
                        contain = containSub(arr[temp], ar[tempa]);
                        temp++; tempa++;
                    }else{
                        return false;    
                    }
                }else{
                    return false;
                }
            }
        }
        return true;

    }





    static boolean checkLen(String str, String arr[], int index, String ar[], int indexar){
        String s[] = str.split("\\s+");
        int min = Integer.parseInt(s[0]);
        int max = Integer.parseInt(s[1]);
        //System.out.println("--------------");
        //if(index!=0 && indexar!=0){
            //System.out.println(min+" "+max);
            //System.out.println(arr[index-1].substring(min, max));
            //System.out.println(ar[indexar-1]);
            if(arr[index-1].substring(min, max).equals(ar[indexar-1])){
                //System.out.println("Hereeeeeeeeeeee");
                return true;
            }
        //}

        return false;
    }


    static String containSub(String str, String sub){
        int start = 0;
        int end = 0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==sub.charAt(0)){
                start = i;
                end = i;
                int star = 0;
                while(end < str.length()){
                    if(str.charAt(end)==sub.charAt(star)){
                        //System.out.println(str.charAt(star));
                        end++;star++;
                    }else{
                        start = 0;
                        end = 0;
                        break;
                    }
                    //System.out.println(end + " "+ start);
                    if(end - start == sub.length()){
                        return start+" "+end;
                    }
                }
            }
        }
        return "";
    }

}
