public class SpiralMatrix {
    public static void main(String[] args) {
        int n=3,start=0,end=n,outData=1;
        int[][] out=new int[n][n];
        while (outData<=n*n){
            for(int hor=start;hor<end;hor++){
                out[start][hor]=outData;
                outData++;
            }
            start++;
            for(int ver=start;ver<end;ver++){
                out[ver][end-1]=outData;
                outData++;
            }
            end--;
            for(int revHor=end-1;revHor>=start-1;revHor--){
                out[end][revHor]=outData;
                outData++;
            }
            for(int revVer=end-1;revVer>=start;revVer--){
                out[revVer][start-1]=outData;
                outData++;
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(out[i][j]+" ");
            }
            System.out.println();
        }
    }
}
