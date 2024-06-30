package org.joonzis.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		// 정수형 크기 6의 배열 lotto 선언
		int[] lotto = new int[6];
		// 정수형 크기 6의 배열 sel 선언
		int[] sel = new int[6];
		// 입력을 위한 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		// 랜덤 값 저장을 위한 Random 객체 생성
		Random ran = new Random();
		
		//******1. 각 배열에 데이터 저장********
		// lotto 배열에 랜덤 데이터 저장 - 각 인덱스에 저장
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45)+1;
			
			// 배열 내 값들과 비교하여 같으면 중복 제거
			for (int m = 0; m < i; m++) {
				if(lotto[m] == lotto[i]) {
					// 중복 값
					i--;
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(lotto));
		// sel 배열에 입력 데이터 저장 - 스캐너로 입력 받아서 저장
		System.out.println("6개의 숫자 입력 >> ");
		for (int i = 0; i < sel.length; i++) {
			sel[i] = sc.nextInt();
		}
		
		
		//******2. 각 배열 값 비교********
		String resultStr = "";
		int count = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < sel.length; j++) {
				if(lotto[i] == sel[j]) {
					count++;
					resultStr += lotto[i] + " ";
				}
			}
		}
		
		System.out.println("로또 번호 : " + Arrays.toString(lotto));
		System.out.println("선택 번호 : " + Arrays.toString(sel));
		System.out.println("맞은 개수 : " + count);
		System.out.println("맞은 값 : " + resultStr);
		
		
		
	}
}