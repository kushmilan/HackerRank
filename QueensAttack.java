import java.io.*;

public class QueensAttack {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str[] = br.readLine().split("\\s+");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        String strF[] = br.readLine().split("\\s+");
        int R = Integer.parseInt(strF[0]);
        int C = Integer.parseInt(strF[1]);
        
        int left  = C - 1;        
        int right = M - C;        
        int up    = M - R;
        int down  = R - 1;
        int upleft    = (up  >= left)   ? left : up;
        int upright   = (up >= right)   ? right : up;        
        int downleft  = (down  >= left) ? left : down;        
        int downright = (down >= right) ? right : down;
        
        
        for (int t = N; t > 0; t--) {
            String strC[] = br.readLine().split("\\s+");
            int row = Integer.parseInt(strC[0]);
            int col = Integer.parseInt(strC[1]);

            if(row == R && col < C){
                if(C - col -1 < left){
                    left = C - col - 1;
                }
            }else if(row == R && col > C){
                if(col - C - 1 < right){
                    right = col - C - 1;
                }
            }else if(col == C && row > R){ 
                if(row - R - 1 < up){
                    up = row - R - 1;
                }
            }else if(col == C && row < R){
                if(R - row -1 < down){
                    down = R - row -1;
                }
            }else if(row > R && col < C){
                if(row - R == col - C){
                    if(row - R - 1 < upleft){
                        upleft = row - R - 1;
                    }
                }
            }else if(row > R && col > C){
                if(row - R == col - C){
                    if(row - R - 1 < upright){
                        upright = row - R -1;
                    }
                }
            }else if(row < R && col < C){
                if(row - R == col - C){
                    if(R - row - 1 < downleft){
                        downleft = R - row - 1;
                    }
                }
            }else if(row < R && col > C){
                if(row - R == col - C){
                    if(R - row - 1 < downright){
                        downright = R - row - 1;  
                    }
                }

            }
        }
        System.out.println(up);
        System.out.println(down);
        System.out.println(right);
        System.out.println(left);
        System.out.println(upright);
        System.out.println(upleft);
        System.out.println(downleft);
        System.out.println(downright);

        System.out.print(left + right + up + down + upright + upleft + downleft + downright);
    }



}
