package concurrentDemo;

public  class A extends B{
	public String a="a";  
	@Override
	public void f1() {
		System.err.println("333");
		super.f1();
	}
	@Override
	void f2() {
		System.err.println("111");
	}
	public static void main(String[] args) {
		B a = new A();
		a.f1();
	}
}
abstract class B {
	public void f1() {
		System.err.println("222");
		f2();
	}
	abstract void f2();
	
}
