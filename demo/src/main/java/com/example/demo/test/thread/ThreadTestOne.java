package com.example.demo.test.thread;
/**
 * Description: 创建一个测试线程
 * @author zx  
 * @date 2019年2月17日
 */
public class ThreadTestOne extends Thread{
    
    private String threadName;
    
    public ThreadTestOne(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        int runNember  = 5;
        for (int i = 0; i < runNember; i++) {  
            System.out.println(threadName + "   运行  :  " + i);  
//            try {  
//                sleep(1000);  
//            } catch (InterruptedException e) {  
//                e.printStackTrace();  
//            }  
        }  
    }   

}
