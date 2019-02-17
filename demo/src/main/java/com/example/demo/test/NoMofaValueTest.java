package com.example.demo.test;

/**
 * Description: 不可以使用魔法值
 * 
 * @author zx
 * @date 2019年2月17日
 */
public class NoMofaValueTest {
    public static void main(String[] args) {
        //这里的20就是魔法值，如果数组的声明与for循环相隔比较远，就很难知道 for循环里面的控制条件 i < 20 中 20 具体含义是什么。
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i]);
        }
        /*
         * 魔法数值使代码的可读性大大下降。
         * 如果同样的数值多次出现时，到底这些数值是不是带有同样的含义呢，谁也说不清楚。
         * 另一方面，如果本来应该使用相同数值的地方，一旦用错了，也很难发现
         */
        final int lengthOfArray = 20;
        int [] array1 = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++){
            System.out.print(array1[lengthOfArray]);
        }
    }
}
