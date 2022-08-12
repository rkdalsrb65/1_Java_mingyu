package adu.kh.array.ex;

public class ArrayExample {

	/* 배열 (자료구조)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고
	 *   각 변수들은 index를 이용하여 구분함.
	 * */
	
	
	// 변수 : 1개의 자료형, 1개의 값 저장
	// 배열 : 1개의 자료형, n개의 값 저장
	
	
	public void ex1() {
		
		// 배열 맛보기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		int sum1 = num1 + num2 + num3 + num4;
		
		System.out.println("합계 : " + sum1);

		// 배열 이용
		
		int[] arr = new int[4]; // [] : 배열기호
		// int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고
		// 이를 arr이라고 부름
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int sum2 = 0;
		for(int i=0; i<4; i++) { // i = 0, 1, 2, 3
			System.out.println(arr[i]);
			
			sum2 += arr[i];
		}
		
		System.out.println(sum2);
	}
	
	// int[] arr = new int[4]; -> int[]을 참조하는 변수 arr(int[] 시작 주소를 저장) = Heap 영역에 int형 변수 4개짜리 배열 할당(생성)
	
	
	public void ex2() {
		
		// int[]을 참조하는 변수 arr 선언

		int[] arr; // 배열 시작 주소를 저장하는 변수 (참조형, 4byte)
		
		arr = new int[4]; // heap 영역에 int형 변수 4개짜리 배열을 할당(생성)
		                  // 할당된 배열의 시작주소를 arr에 대입
		
		// 배열 길이(크기) : 4
		System.out.println("배열 길이 : " + arr.length);
		
		
		
	}
	
	
}
