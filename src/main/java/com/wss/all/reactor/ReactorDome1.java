package com.wss.all.reactor;

import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReactorDome1{
    public static void main(String[] args) {
        Flux.just(1,2,3,4).subscribe(System.out::println);
        Flux.just(1);

        Integer[] array = {1,2,3,4};
        Flux.fromArray(array);

        List<Integer> integers = Arrays.asList(array);
        Flux.fromIterable(integers);

        Stream<Integer> stream = integers.stream();
        Flux.fromStream(stream);


        //数据信号
        //错误信号
        //完成信号

        //操作符：对数据流，进行一道道的操作，比如流水线
        //1map：元素映射为新的元素
        //flatmap：元素映射为流
        Flux.just(1,2,3,4).map(integer -> integer*integer).subscribe(System.out::println);





    }
}
