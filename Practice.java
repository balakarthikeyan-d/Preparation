import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;
public class Practice {
    public static void main(String[] args) {
        int[] arr= {1,2,2,2,2,2,2,3};
        System.out.println(cou(arr));
    }

    public static int cou(int[] arr){
        int count=1,temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp==arr[i]){
                count++;
                if(((double) count/ arr.length)*100>25){
                    return temp;
                }
            }
            else{
                temp=arr[i];
                count=1;
            }
        }
        return temp;
    }
}
