package com.example.demo.statictest;

/**
 * Description: 静态测试类
 * 
 * @author zx
 * @date 2019年3月15日
 */
public class TheStaticLoad {

	public static int X = 100;

	public final static int Y = 200;

	public TheStaticLoad() {
		System.out.println("Test构造函数执行");
	}
	static {
		System.out.println("static语句块执行");
	}
	public static void display() {
		System.out.println("静态方法被执行");
	}
	public void display_1() {
		System.out.println("实例方法被执行");
	}
}
