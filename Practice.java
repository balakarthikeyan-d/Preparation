import java.util.Set;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {
        int n=20,start=2,i=1,out=0,mod7=1;
        while(n!=mod7-1){
            out+=i;
            if(mod7%7==0){
                i=start;
                start++;
            }
            else {
                i++;
            }
            mod7++;
        }
        System.out.println(out);
    }
}
