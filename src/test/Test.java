package test;

import java.util.Arrays;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] lottoNum = new int[6];
		System.out.println("제외 값은 몇개인가요? 없으면 0으로 해주세요");
		int n = sc.nextInt();
		int[] exceptionNum = new int[n];
		System.out.println("제외할로또값을 입력하시오");
		if (n != 0) {
			for (int i = 0; i < exceptionNum.length; i++) {
				System.out.print("제외값은:");
				exceptionNum[i] = sc.nextInt();
			}
		}

		System.out.println("몇장을 살것인가요??");
		int q = sc.nextInt();
		int[] han = new int[q];
		for (int w = 0; w < han.length; w++) {
			for (int i = 0; i < lottoNum.length; i++) {

				lottoNum[i] = (int) (Math.random() * 45 + 1);
				for (int j = 0; j < exceptionNum.length; j++) {

					if (lottoNum[i] == exceptionNum[j]) {
						i--;
						break;
					}

				}
				for (int k = 0; k < lottoNum.length; k++) {
					if (i != k && lottoNum[i] == lottoNum[k]) {
						i--;
						break;
					}
				}
			}
			
			
		
			System.out.println("구매번호 :" + Arrays.toString(lottoNum)); //Arrays.toString :: 값 표현을 [ 배열[1], 배열[2].....이런식으로 한다.

		}
	}

}
	

