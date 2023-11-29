public class BinaryAdd {
    public static void main(String[] args) {
        String a1="10111",b1="10011";
        if(a1.length()!=b1.length()){
            if(a1.length()<b1.length()){
                a1=String.format("%"+b1.length()+"s",a1).replace(' ','0');
            }
            else{
                b1=String.format("%"+a1.length()+"s",b1).replace(' ','0');
            }
        }
        int carry=0;
        String output="";
        for(int i=a1.length()-1;i>=0;i--){
            int out=Character.getNumericValue(a1.charAt(i))+Character.getNumericValue(b1.charAt(i))+carry;
            switch (out){
                case 1:
                    carry=0;
                    output=1+output;
                    break;
                case 2:
                    carry=1;
                    output=0+output;
                    break;
                case 3:
                    carry=1;
                    output=1+output;
                    break;
                case 0:
                    carry=0;
                    output=0+output;
                    break;
            }
        }
        if(carry!=0)
            output=1+output;
        System.out.println(output);
        System.out.println(Integer.parseInt(output,2));
//        System.out.println(Integer.parseInt(a1,2)+Integer.parseInt(b1,2));
    }
}
