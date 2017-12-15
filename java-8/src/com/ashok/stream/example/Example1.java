package com.ashok.stream.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        String[] words = {"ashok", "ram", "kumar", "mohan","mohan"};
        Stream<String> s = Arrays.stream(words).filter(w -> w.length() > 3);
        Stream<String> s1 = Arrays.stream(words).map(String::toLowerCase);
        List<String> lWords = Stream.concat(s, s1).collect(Collectors.toList());
        System.out.println(lWords);

        List<String> uniqueWords
                = Stream.of("merrily", "merrily", "merrily", "gently").distinct().collect(Collectors.toList());
        System.out.println(uniqueWords);

        Optional<String> startsWithQ
                = Arrays.stream(words).filter(se -> se.startsWith("Q")).findFirst();
        System.out.println(startsWithQ.orElse("hdfg"));

        Stream<Integer> values = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> sum = values.reduce((x, y) -> x + y);
        System.out.println(sum.orElse(0));

        Stream<Integer> values1 = Stream.of(1, 2, 3, 4, 5);
        Integer sum1 = values1.reduce(7, (x, y) -> x + y);
        System.out.println(sum1);

        Stream<String> values2 = Stream.of("ashok", "ram", "kumar", "mohan");
        Integer sum3 = values2.reduce(0, (total, word) -> total + word.length(), (total1, total2) -> total1 + total2);
        System.out.println("sum3::" + sum3);

        Stream<String> values3 = Stream.of("ashok", "ram", "kumar", "mohan");
        System.out.println("values3.toArray()::" + values3.toArray());

        List<String> lists = new ArrayList(Arrays.asList(words));
        Set<String> sets = lists.stream().collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println(sets);

        List<String> lists1 = new ArrayList(Arrays.asList(words));
        Set<String> sets1 = lists1.stream().collect(Collectors.toSet());
        System.out.println(sets1);


    }
}
