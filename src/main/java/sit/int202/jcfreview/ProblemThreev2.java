package sit.int202.jcfreview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProblemThreev2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        if(!file.exists()){
            System.out.println(file.getName() + " does NOT exist !!!!");
            return;
        }
        Scanner sc = new Scanner(file);
        Map<String, List<Integer >> map = new HashMap<>(132);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, " .(){},0123456789[];");
            int index = 0;
            while (stk.hasMoreElements()) {
                String word = stk.nextToken();
                if(map.get(word) == null){
                    map.put(word,new LinkedList<>());
                }
                map.get(word).add(++index);
            }
        }
        sc.close();
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()) {
            System.out.print(entry.getKey() + "("+ entry.getValue().size()+ "): ");
            for(Integer i: entry.getValue()){
                System.out.print("@" + i+ " ");
            }
            System.out.println();
        }

    }
}
