package com.example.demo.statictest;

/**  
 * Description: 测试静态块加载顺序
 * @author zx  
 * @date 2019年3月15日  
 */
public class TheStaticSequence {

	 static{
	        System.out.println(1);
	    }
	    static {
	        System.out.println(2);
	    }
	    static {
	        System.out.println(3);
	    }
	    public static void getWorld(){
	        System.out.println(5);
	    }
	    static {
	        System.out.println(4);
	    }
	
}
