/**  
 * Title: Test.java  
 * Description:描述 
 * @author zx  
 * @date 2019年3月15日  
 * @version 1.0  
 */  
package com.example.demo.test;

/**  
 * Description: 叶凯面试题 
 * @author zx  
 * @date 2019年3月15日  
 */
public class Test {

	public static void main(String[] args) {
		Object aObject  = null;
		Character dCharacter = new Character('A');
		System.out.println(dCharacter.isLowerCase(dCharacter));
		Boolean aBoolean = new Boolean("Ok");
		System.out.println(aBoolean);
		
		String aString = new String("bs");
		String bString = new String("bs");
		System.out.println(aString==bString);
		
		int a[][] = new int[111][111];
		
		String aString2 = "notaaaaassssoooooo ";
		int indexOf = aString2.indexOf("o");
		System.out.println(indexOf);
	}
}
