package co.hazzys.exam;

public class MainApp {
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		methodTest.strTest(); //void type
		
		String name = methodTest.strTest2();  //return (값) type
		System.out.print(name);
		
		String str = methodTest.strTest3();  //return 객체(변수) type
		System.out.print(str);
	}
}
