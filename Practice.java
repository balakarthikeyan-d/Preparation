import java.lang.reflect.Array;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<List<String>> paths=new ArrayList<>();
        String[] g={"B","C","D","B","C","A"};
        List<String> path=new ArrayList<>(2);
        for(int i=0;i< g.length;i++){
            path.add(g[i]);
            if(path.size()==2){
                paths.add(new ArrayList<>(path));
                path.clear();
            }
        }
        System.out.println(cou(paths));
    }

    public static String cou(List<List<String>> paths){
        String endPath=paths.get(0).get(1);
        paths.remove(0);
        for(int i=1;i< paths.size();i++){
            boolean flag=false;
            for(int j=0;j<paths.size() && !flag;j++){
                String startPath=paths.get(j).get(0);
                if(startPath.equals(endPath)){
                    endPath=paths.get(j).get(1);
                    flag=true;
                    paths.remove(j);
                }
            }
            if(!flag){
                return endPath;
            }
        }
        return "";
    }
}
