public class Practice {
    public static void main(String[] args) {
        int a=000000000000000000000000100111111;
        int ham=0;
        for (int i=31;i>=0;i--){
            System.out.println((a>>i)&1);
        }
    }
}
