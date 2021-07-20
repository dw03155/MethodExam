package co.hazzys.exam;

public class MethodTest {
	//protected(기본,생략가능) - package 내에서만 사용 가능 
	void strTest() {
		System.out.println("void type test");
	}

	public String strTest2() {
		return "Hazzys"; //return 값
	}

	String strTest3() {
		String str = "Hello!";
		return str; // return 변수(객체)
	}
}
