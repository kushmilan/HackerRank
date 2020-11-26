import java.io.*;

public class SolutionCaesarCipher{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String encrypt = br.readLine();
        int rotate = (Integer.parseInt(br.readLine()))%26;        
        StringBuilder sb = new StringBuilder(encrypt);
        for(int i = 0; i < size; i++){        
            char c = sb.charAt(i);
            if(c == '-'){
            }else{
                if((int)c >= 65 && (int)c <= 90){
                    if((char)(c + rotate) > 90){
                        sb.setCharAt(i, (char)(c + rotate - 26));
                    }else{
                        sb.setCharAt(i, (char)(c + rotate));
                    }                    
                }else if((int)c >= 97 && (int)c <= 122){
                    if((int)c + rotate > 122){
                        sb.setCharAt(i, (char)(c + rotate - 26));    
                    }else{
                        sb.setCharAt(i, (char)(c + rotate));
                    }                    
                }
            }           
        }
        System.out.print(sb.toString());
    }
}
