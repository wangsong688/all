package com.wss.all.stream;

import java.util.Arrays;

/**
 * stream 可视化操作
 * debug
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5).stream()
                .filter(integer -> integer % 2 == 0 || integer % 3 ==0)
                .map(integer -> integer * integer)
                .forEach(System.out::println);
    }
}
