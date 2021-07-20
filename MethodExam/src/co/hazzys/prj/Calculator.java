package co.hazzys.prj;

public class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void sub(float f, int b) { // Overloading(다형성)
		System.out.println(f - b);
	}

	public long sub(long a, long b) {
		return a - b;
	}
}
