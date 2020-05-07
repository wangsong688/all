package com.wss.all.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序
 */
public class LamdbaSort {
    public static void main(String[] args) {
        LamdbaSort.testIntegerSort();
        LamdbaSort.testStringSort();
        LamdbaSort lamdbaSort = new LamdbaSort();
        lamdbaSort.testObjectSort();;
    }

    /**
     * 数字排序
     */
    public static void testIntegerSort() {
        List<Integer> list = Arrays.asList(4, 2, 5, 3, 1);
        System.out.println(list);//执行结果：[4, 2, 5, 3, 1]
        //升序
        list.sort((a, b) -> a.compareTo(b.intValue()));
        System.out.println(list);//执行结果：[1, 2, 3, 4, 5]
        //降序
        list.sort((a, b) -> b.compareTo(a.intValue()));
        System.out.println(list);//执行结果：[5, 4, 3, 2, 1]
    }

    /**
     * 字符串排序
     */
    public static void testStringSort() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("cc");
        list.add("bb");
        list.add("ee");
        list.add("dd");
        System.out.println(list);//执行结果：aa, cc, bb, ee, dd
        //升序
        list.sort((a, b) -> a.compareTo(b.toString()));
        System.out.println(list);//执行结果：[aa, bb, cc, dd, ee]
        //降序
        list.sort((a, b) -> b.compareTo(a.toString()));
        System.out.println(list);//执行结果：[ee, dd, cc, bb, aa]
    }


    /**
     * 对象串排序
     */
    public void testObjectSort() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("1三炮", 48));
        list.add(new Person("2老王", 35));
        list.add(new Person("34小明", 8));
        list.add(new Person("4叫兽", 70));
        System.out.println(list); //执行结果：[Person{name='三炮', age=48}, Person{name='老王', age=35}, Person{name='小明', age=8}, Person{name='叫兽', age=70}]
        //按年龄升序
        list.sort((a, b) -> Integer.compare(a.age, b.getAge()));
        System.out.println(list);//执行结果：[Person{name='小明', age=8}, Person{name='老王', age=35}, Person{name='三炮', age=48}, Person{name='叫兽', age=70}]
        //按年龄降序
        list.sort((a, b) -> Integer.compare(b.age, a.getAge()));
        System.out.println(list);//执行结果：[Person{name='叫兽', age=70}, Person{name='三炮', age=48}, Person{name='老王', age=35}, Person{name='小明', age=8}]
        //如果按姓名排序，其实就是按字符串排序一样
        list.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("list = " + list);
    }

    class Person {
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
