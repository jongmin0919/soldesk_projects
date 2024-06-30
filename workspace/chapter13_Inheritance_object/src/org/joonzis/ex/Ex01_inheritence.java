package org.joonzis.ex;

class Parent{
	int number;
	void doParent() {
		System.out.println("doParent 호출");
	}
}

class Child extends Parent{
	void doChild() {
		System.out.println("doChild 호출");
	}
}

public class Ex01_inheritence {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println(c.number);
		c.doParent();
	}
}
