package week2;
import java.util.*;

public class DestinationCity2_2_3 {

    public static String destCity(List<List<String>> paths) {

        if(paths.size() == 1)
            return paths.get(0).get(1);

        Map<String, String> map = new HashMap<>();
        for(List<String> path: paths){
            map.put(path.get(0), path.get(1));
        }

        String destination = paths.get(0).get(0);
        while(map.containsKey(destination)){
            destination = map.get(destination);
        }

        return destination;
    }
    public static void main(String[] args) {


        List<String> list1=Arrays.asList("B","C");
        List<String> list2=Arrays.asList("D","B");
        List<String> list3=Arrays.asList("C","A");
        List<List<String>>  listoflist=Arrays.asList(list1,list2,list3);
        String  result=destCity( listoflist);
        System.out.println(result);
    }

}
