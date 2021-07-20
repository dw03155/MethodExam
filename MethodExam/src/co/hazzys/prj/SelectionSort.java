package co.hazzys.prj;

public class SelectionSort { // 선택정렬1
	private int[] arr = { 5, 2, 4, 1, 3 };

	public void selectSort() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // ascending sort : 오름차순 , decending sort : 내림차순
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int n : arr) {
			System.out.print(n + "|");
		}
	}

	public void selectSort2() { // 선택정렬2 - update
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		for (int n : arr) {
			System.out.print(n + "|");
		}
	}
	//bubble sort : 인접한 두 숫자를 비교해서 자리를 바꾸는 방식
	//quick sort : 중간 숫자를 하나 선택해서 양 옆의 그룹을 작고 큰 수로 옮기는 방식, 재귀함수(factorial(n), 구현하기 쉬운 장점) 활용 //재귀호출
}
