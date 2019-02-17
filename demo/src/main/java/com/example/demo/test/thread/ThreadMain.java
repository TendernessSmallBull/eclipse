package com.example.demo.test.thread;

/**  
 * Description: 测试线程是乱序执行，start方法仅仅代表使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
 * @author zx  
 * @date 2019年2月17日  
 */ 
public class ThreadMain {

    public static void main(String[] args) {
        //ThreadExtThread测试
//        ThreadExtThread mTh1 = new ThreadExtThread("A线程");
//        ThreadExtThread mTh2 = new ThreadExtThread("B线程");
//        mTh1.start();
//        mTh2.start();
        //ThreadImpRunnable测试
        new Thread(new ThreadImpRunnable("C线程")).start();  
        new Thread(new ThreadImpRunnable("D线程")).start();  
    }

}
