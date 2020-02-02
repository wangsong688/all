package com.wss.all.stream;


/**
 * Stream操作分类
 * 1。中间操作，无状态:元素的处理不受前面元素的影响
 * unordered()
 * filter()   过滤
 * map()
 * mapToInt()
 * mapToLong()
 * mapToDouble()
 * flatMap()
 * flatMapToInt()
 * flatMapToLong()
 * flatMapToDouble()
 * peek()      主要用来查看流中元素的数据状态
 * 2.中间操作，有状态：必须等到所有元素处理之后才知道最终结果
 * distinct()   去重
 * sorted()     排序
 * limit()      返回前n个元素（短路操作）
 * skip()       抛弃前n个元素
 *
 * 3.结束操作，非短路操作
 * forEach()  循环操作stream中的数据
 * forEachOrdered()
 * toArray()   返回六种元素对应的数组对象
 * reduce()    聚合操作，用来做统计
 * collect()   聚合操作，封装目标数据
 * max()   最大值
 * min()   最小值
 * count() 总数量
 *
 * 4.结束操作，短路操作：不用处理完全部的元素就可以返回结果
 * anyMatch()   所有数据，又一个符合条件，返回true
 * allMatch()   所有数据都符合条件，返回true
 * noneMatch()  所有数据都不符合条件，返回true
 * findFirst()  获取第一个元素
 * findAny()    获取任一元素
 */
public class StreamTest4 {
}
