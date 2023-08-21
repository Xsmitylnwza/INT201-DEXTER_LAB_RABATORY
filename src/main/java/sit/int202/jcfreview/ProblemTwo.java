package sit.int202.jcfreview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProblemTwo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int data[] = {1,2,3,5,8,7,9,6,4};
        int need = 10;
        for(int i = 0; i< data.length;i++){
            int number = data[i];
            int require = need - number;
            if(map.get(require) == null) {
                map.put(number,i);
            }else {
                System.out.println("("+i+", "+map.get(require) + ")");
                map.put(number,i);
            }
        }
        System.out.println();
    }
}
