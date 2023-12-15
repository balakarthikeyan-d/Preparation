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
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<paths.size();i++){
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String startingPoint=paths.get(0).get(0);
        while(map.get(startingPoint)!=null){
            startingPoint=map.get(startingPoint);
        }
        return startingPoint;
    }
}
