package org.fasttrackit.curs11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
       // nameToAge.get("Alex");
        nameToAge.put("Alex", 31);
        nameToAge.put("John", 20);
        nameToAge.put("Alex", 40);

        System.out.println(nameToAge);

        Set<String> keySet = nameToAge.keySet();
        for (String key:keySet){
            System.out.println(nameToAge.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getValue());
        }
    }
}
