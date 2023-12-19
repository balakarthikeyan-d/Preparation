import java.lang.reflect.Array;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[][] img={{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        System.out.println(Arrays.deepToString(cou(img)));
    }

    public static int[][] cou(int[][] img){
        int[][] out=new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++) {
                out[i][j] = calculate(i,j, img);
            }
        }
        return out;
    }
    public static int calculate(int i,int j,int[][] img){
        int out=0,count=0;
        for(int iIndex=-1;iIndex<=1;iIndex++){
            for(int jIndex=-1;jIndex<=1;jIndex++){
                int ni=i+iIndex;
                int nj=j+jIndex;
                if(ni<0 || nj<0 || ni>=img.length || nj>=img[i].length)
                    continue;
                out+=img[ni][nj];
                count++;
            }
        }
        return (int)Math.floor(out/count);
    }
}
