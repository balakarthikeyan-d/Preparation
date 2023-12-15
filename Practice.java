import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
//        int[][] arr= {{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,0}};
        int[][] arr= {{1,1,1}};
//        int[][] arr= {{1,1},{1,1},{1,1}};
        System.out.println(Arrays.deepToString(cou(arr)));
    }

    /*
    * 0 1 0
    * 1 0 1
    * 1 0 0
    * diff[0][0] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0
    * */

    public static int[][] cou(int[][] grid){
        int out[][]=new int[grid.length][grid[0].length];
        int[] onesRArr=new int[grid.length];
        int[] zerosRArr=new int[grid.length];
        int[] onesCArr=new int[grid[0].length];
        int[] zerosCArr=new int[grid[0].length];
        int diagnol=0,row=0,col=0;
        double percent=(double)grid.length/(double)grid[0].length*100;
        if(percent>80 && percent<130) {
            while (true) {
                int[] temp = grid[diagnol];
                int onesRow = checkOnesRows(temp);
                int zerosRow = temp.length - onesRow;
                if (row < grid.length) {
                    onesRArr[row] = onesRow;
                    zerosRArr[row] = zerosRow;
                    row++;
                    if (row < grid.length)
                        diagnol++;
                }
                if (col < temp.length) {
                    int onesCol = checkOnesCols(grid, col);
                    int zerosCol = grid.length - onesCol;
                    onesCArr[col] = onesCol;
                    zerosCArr[col] = zerosCol;
                    col++;
                }
                if (row == grid.length && col == temp.length)
                    break;
            }
            for(int i=0;i< grid.length;i++){
                for (int j=0;j< grid[i].length;j++){
                    out[i][j]=onesRArr[i]+onesCArr[j]-zerosRArr[i]-zerosCArr[j];
                }
            }
        }
        else{
            int[] oneRow=new int[grid.length];
            int[] oneCol=new int[grid[0].length];
            Arrays.fill(oneRow, 0);
            Arrays.fill(oneCol, 0);
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    oneRow[i] += grid[i][j];
                    oneCol[j] += grid[i][j];
                }
            }
            for(int i=0;i< grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    out[i][j]=2 * oneRow[i] + 2 * oneCol[j] - grid.length - grid[0].length;
                }
            }
        }
        return out;
    }

    static int checkOnesRows(int[] temp){
        int add=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]==1){
                add++;
            }
        }
        return add;
    }
    static int checkOnesCols(int[][] mat,int i){
        int add=0;
        for(int j=0;j<mat.length;j++){
            if(mat[j][i]==1){
                add++;
            }
        }
        return add;
    }
}
