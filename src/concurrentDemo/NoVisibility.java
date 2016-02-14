package concurrentDemo;

import javax.xml.transform.Source;

public class NoVisibility {
	private static boolean ready;
	private static int number;
	private volatile long aaa;
	public String aasdsad="111";
	public static void main(String[] args) {
	}
	public void method1(){
		method2();
	}
	public static void  method2(){
		A a = new  A();
		System.out.println(a.a);
		
	}
}
