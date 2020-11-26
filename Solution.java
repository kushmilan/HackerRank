import java.util.Arrays;
import java.util.List;

class Result {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int arr[] = new int[k];
        Arrays.fill(arr, 0);
        for(int i = 0; i < s.size(); i++){
            arr[s.get(i) % k]++;
        }

        System.out.println(Arrays.toString(arr));
        if(k==2){
            if(arr[0]>0 && arr[1]>0){
                return 2;
            }else if(arr[0]>0 && arr[1]<0){
                return 1;
            }else{
                return 0;
            }
        }else{
            int num = 0;
            int len = 0;
            if(k %2 == 0){
                len = k/2;
            }else{
                len = k/2 + 1;
            }
            System.out.println(len);

            int p = arr.length-1;
            for(int i = 1;i<len;i++){
                num += Math.max(arr[i], arr[p]);
                System.out.println(arr[i]+" "+ arr[p--]);
                if((k%2==0)){
                    if( i == len-1 && arr[i]!=0){
                        //System.out.println("here!");
                        num++;
                    }
                }
            }
            
            if(arr[0]>0){
                num++;
            }
            return num;
        }
    }

}