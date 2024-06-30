package org.joonzis.ex;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {
	int[] randomArr = new int[6];
	int[] userArr = new int[6];
	ArrayList<Integer> answer = new ArrayList<>(); 
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	public LottoGame() {
		int firstCount = 0;
		while(firstCount < 6) {
			int ranNum = random.nextInt(45) + 1;
			boolean flag = false;
			for(int i = 0 ; i < firstCount ; i++) {
				if(randomArr[i] == ranNum) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				randomArr[firstCount] = ranNum;
				firstCount++;
			}
		}
		
		int secondCount = 0;
		System.out.println("중복되지 않는 숫자 여섯 개를 입력해 주세요.");
		while(secondCount < 6) {
			int userInput = sc.nextInt();
			boolean flag = false;
			for(int i = 0 ; i < secondCount ; i++) {
				if(userArr[i] == userInput) {
					System.out.println("중복된 번호입니다. 올바른 로또 번호를 입력해 주세요.");
					flag = true;
					break;
				}
			}
			if(!flag) {
				userArr[secondCount] = userInput;
				secondCount++;
			}
		}
	}
	
	void run() {
		
		int answer = 0;
		for(int i = 0 ; i < randomArr.length ; i++) {
			for(int j = 0 ; j < userArr.length ; j++) {
				if(randomArr[i] == userArr[j]) {
					this.answer.add(userArr[j]);
					answer++;
				}
			}
		}
		System.out.println(
				"추첨 결과 : " + this.answer.toString() + "\n" + 
				"맞추신 로또 번호는 " + answer + "개 입니다!"
		);
		
	}
	
}
