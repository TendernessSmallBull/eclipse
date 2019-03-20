package com.example.demo.statictest;

/**
 * Description: 执行顺序
 * 
 * @author zx
 * @date 2019年3月15日
 */
public class TheStaticImpl {
	
	public static int X = 300;
	
	static {
		System.out.println(X);
		X = 200;
		System.out.println(X);
	}
	
}
