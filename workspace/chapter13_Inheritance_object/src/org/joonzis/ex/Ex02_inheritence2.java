package org.joonzis.ex;

class Person{
	String name;
	void eat(String food){
		System.out.println( name + "씨는 " + food + " 을 먹습니다.");
	}
	void sleep(){
		System.out.println(name + "씨는 잠을 잡니다.");
	}
}

class Student extends Person{
	void study() {
		System.out.println("공부를 한다.");
	}
}

class Worker extends Person{
	void work() {
		System.out.println("일을 합니다.");
	}
}

public class Ex02_inheritence2 {
	public static void main(String[] args) {
		Worker worker = new Worker();
		Student student = new Student();
		
		worker.name = "James";
		student.name = "Martin";
		
		worker.eat("백반");
		student.sleep();
	}
}
