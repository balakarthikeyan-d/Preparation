import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
//        int[][] arr= {{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,0}};
        int[][] arr= {{0,1},{1,0},{0,0}};
        System.out.println(Arrays.deepToString(cou(arr)));
    }

    /*
    * 0 1
    * 1 0
    * 0 0
    * diff[0][0] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0
    * */

    public static int[][] cou(int[][] grid){
        int out[][]=new int[grid.length][grid[0].length];
        for(int i=0;i< grid.length;i++){
            int zerosRow=checkZerosRows(grid[i]);
            int onesRow=grid.length-zerosRow;
            for(int j=0;j<grid[0].length;j++){
                int zeros=zerosCol(grid,j);
                int ones=grid[i].length-zeros;
                out[i][j]=onesRow+ones-zerosRow-zeros;
            }
        }
        return out;
    }
    static int zerosCol(int mat[][],int i){
        int col=0;
        for(int j=0;j<mat.length;j++){
            if(mat[j][i]==0){
                col++;
            }
        }
        return col;
    }
    static int checkZerosRows(int[] mat){
        int add=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i]==0){
                add++;
            }
        }
        return add;
    }
}
