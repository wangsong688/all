package com.wss.all.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        /**
         * 流的操作
         */


        /**
         * map
         */
        Stream<String> stringStream1 = Stream.of("1a", "2b", "3c");
        stringStream1.map(String::toUpperCase)
                .forEach(s1 -> {
                    System.out.println("map -- s1 = " + s1);
                });


        /**
         * flatMap
         */
        Stream<List<Integer>> listStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> integerStream1 = listStream.flatMap((childList) -> childList.stream());
        integerStream1.forEach(integer -> System.out.println("flatMap -- integer = " + integer));

        /**
         * filter
         */

        Integer [] sixNums = {1,2,3,4,5,6};
        Stream.of(sixNums).filter(n -> n%2 == 0)
                .forEach(n -> System.out.println("filter -- n = " + n));

        /**
         * peek   对每一个元素进行操作，并返回一个新对stream
         */

        Stream.of("one","two","three").peek(s -> System.out.println("peek -- s = " + s))
        .forEach(s -> System.out.println("s = " + s));


        /**
         * reduce  把stream元素组合起来。
         */
        //字符串链接
        String reduce = Stream.of("a", "b", "c").reduce("333", String::concat);
        System.out.println("reduce = " + reduce);

        //求最小值
        Integer reduce1 = Stream.of(1, 2, 3, 4).reduce(0, Integer::min);
        System.out.println("reduce1 = " + reduce1);

        //求和
        Integer reduce2 = Stream.of(1, 2, 3, 4).reduce(10, Integer::sum);
        System.out.println("reduce2 = " + reduce2);

        Integer integer = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println("integer = " + integer);

        System.out.println("-----------limit skip-------------");
        /**
         * limit     返回stream前n个元素，
         * skip      扔掉前n个元素
         */

        List<Person> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person user = new Person(i,"name"+i);
            users.add(user);
        }
        users.stream()
                .map(Person::getName)
                .limit(10)
                .skip(5)
                .forEach(s -> System.out.println(" s = " + s));


        /**
         * sorted  排序
         */


        Stream.of(1,2,3,5,4)
                .sorted()
                .forEach(integer1 -> System.out.println("sorted 排序 (自然）= " + integer1));


        Stream.of(1,2,3,5,4)
                .sorted(Comparator.reverseOrder())
                .forEach(integer1 -> System.out.println("sorted 排序（逆序）= " + integer1));




    }
}

class Person{
    public int no;
    public String name;
    public Person(int no,String name){
        this.name = name;
        this.no = no;
    }
    public String getName(){
        System.out.println("name = " + name);
        return name;
    }
}
