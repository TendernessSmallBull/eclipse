package com.example.demo.test;

import java.util.HashMap;
import java.util.Map;
/**
 * Description: 创建HashMap为什么要初始化大小（默认16）
 * @author zx  
 * @date 2019年2月17日
 */
public class MapInitialCapacityTest {

    public static void main(String[] args) {
        int aHundredMillion = 10000000;
        //未初始化容量
        Map < Integer, Integer > map = new HashMap <>();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map.put(i, i);
        }
        long s2 = System.currentTimeMillis();
        System.out.println("未初始化容量，耗时 ： " + (s2 - s1));
        //初始化容量5000000
        Map < Integer, Integer > map1 = new HashMap <>(aHundredMillion / 2);
        long s5 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map1.put(i, i);
        }
        long s6 = System.currentTimeMillis();
        System.out.println("初始化容量" + aHundredMillion / 2 + "，耗时 ： " + (s6 - s5));
        //初始化容量10000000
        Map < Integer, Integer > map2 = new HashMap <>(aHundredMillion);
        long s3 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map2.put(i, i);
        }
        long s4 = System.currentTimeMillis();
        System.out.println("初始化容量为" + aHundredMillion + "，耗时 ： " + (s4 - s3));
        //初始化容量16    
        Map < Integer, Integer > map3 = new HashMap <>(16);
        long s7 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map3.put(i, i);
        }
        long s8 = System.currentTimeMillis();
        System.out.println("初始化容量为16，耗时 ： " + (s8 - s7));

    }

}
