import java.util.Arrays;

public class SnakeMatrix {
    public static void main(String[] args) {
//        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=3,i=0,out=1;
        int a[][]=new int[n][n];
        while(i<n){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    a[i][j]=out;
                    out++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    a[i][j]=out;
                    out++;
                }
            }
            i++;
        }
//        System.out.println(Arrays.deepToString(a));
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
