package org.joonzis.ex;

class Espresso{
	String origin;
	public Espresso() {
		
	}
	public Espresso(String origin) {
		this.origin = origin;
	}
	
	void taste() {
		System.out.println("쓰다");
	}
}

class Latte extends Espresso{
	String milk;
	public Latte() {}
	
	public Latte(String origin, String milk) {
		super(origin);
		this.milk = milk;
	}

	void taste() {
		//부모의 메서드를 사용하려면 아래와 같이
		super.taste();
		//자식의 메서드를 사용하려면 아래와 같이 재정의 
		System.out.println("근데 달다");
	}
}

public class Ex05_Metod_override {
	public static void main(String[] args) {
		Latte latte = new Latte("베트남", "서울우유");
		latte.taste();
				
	}
}
