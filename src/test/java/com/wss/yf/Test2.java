package com.wss.yf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : Test
 * @Description :
 * @Author : 王松松
 * @Date: 2020-02-17 12:39
 */

public class Test2 {


    @Test
    void function1(){
        //1。获取数据

        String[] time1 = {"1:20","4:20"};
        String[] time2 = {"4:21","6:20"};
        String[] time3 = {"6:21","8:20"};

        List<String[]> listTime = new ArrayList<>();
        listTime.add(time1);
        listTime.add(time2);
        listTime.add(time3);

        //2。转换数据：把时间段，转化为每一分钟，对应的下标
        List<int[]> listIndex = new ArrayList<>();

        for(int i = 0 ;i < listTime.size();i++){


            String start = listTime.get(i)[0];//开始
            String srartH = start.split(":")[0];//开始小时(String)
            String srartM = start.split(":")[1];//开始分钟(String)
            int startHInt = Integer.valueOf(srartH);//开始小时(int)
            int startMInt = Integer.valueOf(srartM);//开始分钟(int)
            System.out.println("开始时间："+startHInt+"："+startMInt);

            String end = listTime.get(i)[1];//结束
            String endH = end.split(":")[0];//开始小时(String)
            String endM = end.split(":")[1];//开始分钟(String)
            int endHInt = Integer.valueOf(endH);//开始小时(int)
            int endMInt = Integer.valueOf(endM);//开始分钟(int)
            System.out.println("结束时间："+endHInt+"："+endMInt);



            int startIndex = startHInt*60 + startMInt-1;//开始时间下标
            int endIndex = endHInt*60 + endMInt-1;//结束时间下标

            System.out.println("index:"+startIndex+"-"+endIndex);

            int[] indexArray = {startIndex,endIndex};
            listIndex.add(indexArray);
        }
        //3。数据检查
        //先排序
//        for (int i = 0 ;i < listIndex.size();i ++){
//            System.out.println(listIndex.get(i)[0]);
//        }
//        System.out.println("-----排序完成--------");
//        for (int i = 0 ;i < listIndex.size()-1;i ++){
//            //判断3种情况：
//            //1。时间交叉《1
//            //2。时间差==1
//            //3。时间差》1
//            int q1 = listIndex.get(i)[1];//前一个值
//            int q2 = listIndex.get(i+1)[0];//后一个值
//            if(q2-q1==1){
//                System.out.println("没有问题");
//            }else if (q2-q1>1){
//                System.out.println("有问题");
//            }else if (q2-q1<1){
//                System.out.println("有问题");
//            }
//        }
        //3.放到数组
        System.out.println("------第三步------");
        //24小时的数组
        int[] array24H = new int[24*60];

        for (int i = 0 ;i < listIndex.size();i++){

            for (int j = listIndex.get(i)[0] ; j < listIndex.get(i)[1];j++){
                if(array24H[j] == 1){
                    System.out.println("数据重复");
                    return;
                }{
                    array24H[j] = 1;
                }
            }

        }

        //4。返回错误的时间






        System.out.println("你好");
    }

    public int[] toInt(String[] time){
        return null;
    }





}
