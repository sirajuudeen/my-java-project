package org.example;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testClass {
    public static void main(String[] args) {
      /*  int a[] ={3,2,1,3,2,5};
        Arrays.stream(a).filter(Collectors.partitioningBy(i-> i % 2==0)).sum();

        int index = IntStream.range(0, list.size())
                .filter(i -> list.get(i).equals(targetInteger))
                .findFirst()
                .orElse(-1);

        OptionalInt indexOpt = IntStream.range(0, users.size())
                .filter(i -> searchName.equals(users.get(i)))
                .findFirst();*/

        String str="hello";
        str.concat("world");
        System.out.println(str);

        String str5="hello";
        str5=str5.concat(" word");
        System.out.println(str5);
        System.out.println("Chagnes applied 5");


    }
}
