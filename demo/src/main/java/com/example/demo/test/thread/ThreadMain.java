package com.example.demo.test.thread;

/**  
 * Description: 测试线程是乱序执行，start方法仅仅代表使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
 * @author zx  
 * @date 2019年2月17日  
 */ 
public class ThreadMain {

    public static void main(String[] args) {
        ThreadTestOne mTh1 = new ThreadTestOne("A线程");
        ThreadTestOne mTh2 = new ThreadTestOne("B线程");
        mTh1.start();
        mTh2.start();
    }

}
