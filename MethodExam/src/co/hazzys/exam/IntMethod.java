package co.hazzys.exam;

public class IntMethod {
	// public - 다른 class에서도 사용 가능, instance 사용 가능
	// private - class 본체에서만 사용 가능, instance 사용 불가
	// 			-생성자를 통해서 값 전달하거나/setter를 통해서 값 전달

	//procedure type (void method) - 전달인자 있음, return값 또는 return객체(변수) 없음
	//function type () - 전달인자 없음, return값 또는 return객체(변수) 필요
	
	public void sum() { //public procedure type(void method)
		int a = 100;
		int b = 200;
		System.out.println(a + b);
	}

	public int sub() { //public function type
		int a = 200;
		int b = 100;
		return a - b;
	}

	private void mul() { // private type
		int a = 100;
		int b = 200;
		System.out.println(a * b);
	}

	public void multiple() {
		mul();// private method 호출
	}

}
