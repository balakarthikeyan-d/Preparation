import java.util.Set;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {
        String num="00012233342222";
        Set<String> perfect=new TreeSet<>();
        char ch='-';
        String perfectNums="";
        for(int i=0;i+1<num.length();i++){
            ch=num.charAt(i);
            if(perfectNums.equals("")){
                perfectNums+=String.valueOf(ch);
            }
            if(ch==num.charAt(i+1)){
                perfectNums+=String.valueOf(ch);
                if(perfectNums.length()==3){
                    perfect.add(perfectNums);
                    ch='-';
                    perfectNums="";
                }
            }
            else{
                ch='-';
                perfectNums="";
            }
        }
        Object[] out= perfect.stream().toArray();
        String result=out.length==0?"":out[out.length-1].toString();
        System.out.println(result);
    }
}
