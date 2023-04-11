package org.fasttrackit.curs11;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
       // nameToAge.get("Alex");
        nameToAge.put("Alex", 31);
        nameToAge.put("John", 20);
        nameToAge.put("Alex", 40);
        for (int i=0; i<1000000; i++){
            nameToAge.put("Name " + i,i);
        }
        long time, time2;

        System.out.println(nameToAge);
        long start = System.currentTimeMillis();
        Set<String> keySet = nameToAge.keySet();
        for (String key:keySet){
            System.out.println(nameToAge.get(key));
        }

        time = System.currentTimeMillis() - start;

        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getValue());
        }
        time2 = System.currentTimeMillis() - start;
        System.out.println("execution time " + time);
        System.out.println("execution time2 " + time2);


    }

}
