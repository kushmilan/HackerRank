/**
 * @author [Milan Kushwah]
 * @create date 2020-06-01 12:09:47
 * @modify date 2020-06-01 12:09:47
 * @desc [description]
 */



import java.io.*;
import java.math.BigInteger;

class XorSum{
	public static void main(String[] args)throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        System.out.println(xorSum(first, second));
    } 

    private static int xorSum(String first, String second){
        int m = 1000000007;
        BigInteger mo = new BigInteger(Integer.toString(m));
        BigInteger f = new BigInteger(first);
        BigInteger s = new BigInteger(second);
        int sum = 0;
        for(int i = 0; i < 314159; i++){
            BigInteger t = f.xor(s.shiftLeft(i)).mod(mo);
            sum = (sum % m + Integer.parseInt(t.toString()) % m) % m;
        }
        return sum;
    }
    
}