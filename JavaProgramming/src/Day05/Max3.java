﻿package Day05;

import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	
		int a = sc.nextInt();
		System.out.print("b의 값：");	
		int b = sc.nextInt();
		System.out.print("c의 값：");	
		int c = sc.nextInt();
		int max = a;
		
		/*
		이곳에 적절한 코드를 넣으세요
		*/
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}

		System.out.println("최댓값은 " + max + "입니다.");
	}
}