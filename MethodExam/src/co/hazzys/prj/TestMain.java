package co.hazzys.prj;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
//		IntMethod intMethod = new IntMethod(); // IntMethod.java 실행
//
//		intMethod.sum(); //public procedure type(void method)
//
//		int val = intMethod.sub(); //public function type
//		System.out.println(val);
//
//		intMethod.multiple(); // private type

//		Calculator calculator = new Calculator(); // Calculator.java 실행
//		int c = calculator.sum(10, 20);
//		System.out.println(c);
//		calculator.sub(10.0f, 20); //float
//		calculator.sub(10^10, 20^10); //int
//		calculator.sub(10^10, 20^10); //long

		SelectionSort selectionSort = new SelectionSort(); // SelectionSort.java 실행
//		selectionSort.selectSort(); // 선택 정렬
//		
//		System.out.println(); // 선택 정렬
//		
//		int[] arr2 = { 5, 2, 4, 1, 3 };
//		Arrays.sort(arr2);
//		for (int n : arr2) {
//			System.out.print(n + "|");
//		}
		
		selectionSort.selectSort2();
	}
}
