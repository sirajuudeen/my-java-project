package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateNumber {
public static void main(String[] args) {

    List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89, 45, 45, 15,1,1);
    Set<Integer> setList = new HashSet<>();
    listOfIntegers.stream()
            .filter(n -> !setList.add(n))
            .forEach(System.out::println);
        System.out.println("Duplicate numbers are:Changes 1 " + setList);
    }

}
