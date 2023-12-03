public class Practice {
    public static void main(String[] args) {
        int[][] points={{1,1},{3,4},{-1,0}};
        int out=0;
        for(int i=0;i+1<points.length;i++){
            int[] a=points[i];
            int[] b=points[i+1];
            while(true){
                if(a[0]>b[0] && a[1]>b[1]){
                    a[0]=a[0]-1;
                    a[1]=a[1]-1;
                    out++;
                    continue;
                }
                if(a[0]<b[0] && a[1]<b[1]){
                    a[0]=a[0]+1;
                    a[1]=a[1]+1;
                    out++;
                    continue;
                }
                if(a[0]>b[0] && a[1]<b[1]){
                    a[0]=a[0]-1;
                    a[1]=a[1]+1;
                    out++;
                    continue;
                }
                if(a[0]<b[0] && a[1]>b[1]){
                    a[0]=a[0]+1;
                    a[1]=a[1]-1;
                    out++;
                    continue;
                }
                if(a[0]==b[0] && a[1]>b[1]){
                    a[1]=a[1]-1;
                    out++;
                    continue;
                }
                if(a[0]>b[0] && a[1]==b[1]){
                    a[0]=a[0]-1;
                    out++;
                    continue;
                }
                if(a[0]==b[0] && a[1]<b[1]){
                    a[1]=a[1]+1;
                    out++;
                    continue;
                }
                if(a[0]<b[0] && a[1]==b[1]){
                    a[0]=a[0]+1;
                    out++;
                    continue;
                }
                if(a[0]==b[0] && a[1]==b[1]){
                    break;
                }
            }
        }
        System.out.println(out);
    }
}
