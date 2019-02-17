package com.example.demo.test.thread;

/**  
 * Description: 创建一个测试线程（实现Runnable方法）
 * @author zx  
 * @date 2019年2月17日  
 */ 
public class ThreadImpRunnable implements Runnable {

    private String name;

    public ThreadImpRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runNember  = 5;
        for (int i = 0; i < runNember; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
