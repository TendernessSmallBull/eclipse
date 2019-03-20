package com.example.demo.statictest;

/**
 * Description: 静态测试类
 * 类加载:Java命令的作用是启动虚拟机，虚拟机通过输入流，从磁盘上将字节码文件(.class文件)中的内容读入虚拟机，并保存起来的过程就是类加载。
 * 
 * 类加载特性 : 在虚拟机的生命周期中一个类只被加载一次。 类加载的原则：延迟加载，能少加载就少加载，因为虚拟机的空间是有限的。 类加载的时机：
 * 1）第一次创建对象要加载类. 
 * 2）调用静态方法时要加载类,访问静态属性时会加载类。 
 * 3）加载子类时必定会先加载父类。 
 * 4）创建对象引用不加载类. 
 * 5)子类调用父类的静态方法时 
 * 	(1)当子类没有覆盖父类的静态方法时，只加载父类，不加载子类 
 * 	(2)当子类有覆盖父类的静态方法时，既加载父类，又加载子类
 * 6）访问静态常量，如果编译器可以计算出常量的值，则不会加载类,
 * 例如:public static final int a=123;否则会加载类,
 * 例如:public static final int a = math.PI。
 * 
 * @author zx
 * @date 2019年3月15日
 */
public class StaticBlockTest {

	public static void main(String args[]) {
		/**
		 * static四种加载方式
		 */
		// 1、Class.forName方式加载，static语句块在类加载时便加载，且只加载一次
		// try {
		// Class.forName("com.example.demo.statictest.TheStaticTest");
		// Class.forName("com.example.demo.statictest.TheStaticTest");
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		// //2、直接创建对象时加载
		// new TheStaticLoad();
		// new TheStaticLoad();
		// //3、调用静态方法
		// TheStaticLoad.display();
		// //4、调用静态常量时是不加载的，编译器可以计算出常量的值，则不会加载类，否则会加载类
		// System.out.println(TheStaticLoad.X);//会加载静态代码块
		// System.out.println(TheStaticLoad.Y);//不会加载静态代码块
		/**
		 * static加载顺序 1、当一个类中有多个static{}的时候，按照static{}的定义顺序，从前往后执行
		 * 2、先执行完static{}语句块的内容，才会执行调用语句
		 */
		// TheStaticSequence.getWorld();
		/**
		 * static执行顺序 如果静态变量在定义的时候就赋给了初值(如 static int X=100)，那么赋值操作也是在类加载的时候完成的，
		 * 并且当一个类中既有static{}又有static变量的时候，同样遵循“先定义先执行”的原则；
		 */
		System.out.println("最终的X值为：" + TheStaticImpl.X);
	}
}
