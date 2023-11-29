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
        StringBuilder output=new StringBuilder();
        for(int i=a1.length()-1;i>=0;i--){
            int out=Character.getNumericValue(a1.charAt(i))+Character.getNumericValue(b1.charAt(i))+carry;
            switch (out){
                case 1:
                    carry=0;
                    output.append(1);
                    break;
                case 2:
                    carry=1;
                    output.append(0);
                    break;
                case 3:
                    carry=1;
                    output.append(1);
                    break;
                case 0:
                    carry=0;
                    output.append(0);
                    break;
            }
        }
        if(carry!=0)
            output.append(1);
        output.reverse();
        System.out.println(output);
        System.out.println(Integer.parseInt(output.toString(),2));
//        System.out.println(Integer.parseInt(a1,2)+Integer.parseInt(b1,2));
    }
}
