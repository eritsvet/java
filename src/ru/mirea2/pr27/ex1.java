package ru.mirea2.pr27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ex1 {

    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("32");
        hashSet.add("656");
        hashSet.add("8848");


        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }

}