package com.wss.all.stream;

/**
 * Stream 流的中间操作和最终操作
 *
 * 中间操作（intermediate)
 * 一个流可以后面跟随零个或多个 intermediate 操作。
 * 其目的主要是打开流，做出某种程度的数据映射/过滤，然后返回一个新的流，交给下一个操作使用。
 * 这类操作都是惰性化的（lazy），就是说，仅仅调用到这类方法，并没有真正开始流的遍历。
 * 其中最主要的中间操作有：map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip、 parallel、 sequential、 unordered
 * 最终操作（terminal）
 * 一个流只能有一个 terminal 操作，当这个操作执行后，流就被使用“光”了，无法再被操作。
 * 所以这必定是流的最后一个操作。
 * Terminal 操作的执行，才会真正开始流的遍历，并且会生成一个结果，或者一个 side effect。
 * 常用的最终操作有：forEach、 forEachOrdered、 toArray、 reduce、 collect、 min、 max、 count、 anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 iterator
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream 的特性可以归纳为：
 * 不是数据结构
 * 它没有内部存储，它只是用操作管道从 source（数据结构、数组、generator function、IO channel）抓取数据。
 * 它也绝不修改自己所封装的底层数据结构的数据。例如 Stream 的 filter 操作会产生一个不包含被过滤元素的新 Stream，而不是从 source 删除那些元素。
 * 所有 Stream 的操作必须以 lambda 表达式为参数
 * 不支持索引访问
 * 你可以请求第一个元素，但无法请求第二个，第三个，或最后一个。不过请参阅下一项。
 * 很容易生成数组或者 List
 * 惰性化
 * 很多 Stream 操作是向后延迟的，一直到它弄清楚了最后需要多少数据才会开始。
 * Intermediate 操作永远是惰性化的。
 * 并行能力
 * 当一个 Stream 是并行化的，就不需要再写多线程代码，所有对它的操作会自动并行进行的。
 * 可以是无限的
 * 集合有固定大小，Stream 则不必。limit(n) 和 findFirst() 这类的 short-circuiting 操作可以对无限的 Stream 进行运算并很快完成。
 */
public class StreamTest2 {

    /**
     * stream常见操作的使用
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1.构造流的常见方法
         */
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<String> stringStream = Stream.of("1", "2", "3");
        Stream<Double> doubleStream = Stream.of(1.2, 1.2, 1.2);

        String[] strArray = new String[]{"您好","北京","天安门"};
        Stream<String> strArray1 = Stream.of(strArray);
        Stream<String> stream = Arrays.stream(strArray);

        Stream<String> stream1 = Arrays.asList(strArray).stream();

        /**
         * 2.流转换为其他数据结构
         */
        Integer[] integers = integerStream.toArray(Integer[]::new);


        for (int i = 0; i < integers.length; i++) {
            System.out.println("integers[i] = " + integers[i]);
        }



        List<String> list = stringStream.collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }

        String s = stream1.collect(Collectors.joining()).toString();
        System.out.println("s = " + s);

    }
}
