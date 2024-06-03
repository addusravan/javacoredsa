package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountJava8 {
    public static void main(String[] args) {
        int[]r={1,2,3,2,1,2,3};

        HashMap<Integer,Integer>f=new HashMap<>();


//        char[]s=str.toCharArray();

        for(int c:r) {
            if (f.containsKey(c)) {
               f.put(c, f.get(c) + 1);
            } else {
                f.put(c, 1);
            }
        }

        System.out.println("=========="+f);


        Set<Map.Entry<Integer, Integer>> entrySet = f.entrySet();

        int maxCount = 0;

        int maxChar = 0;

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();

                maxChar = entry.getKey();
            }
        }



        System.out.println("Maximum Occurring char and its count :");

        System.out.println(maxChar+" : "+maxCount);


    }


}

