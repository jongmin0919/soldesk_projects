package org.joonzis.test;

class Human {
	String name; 
	int age;
	public Human() {}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void output(){
		System.out.print(
				"이름은 : " + name + "\n" +
				"나이는 : " + age + "\n"
		);
	}
}
class Student extends Human{
	
	String school;
	
	public Student() {};
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	@Override
	void output() {
		super.output();
		System.out.println(
				"다니는 학교는 " + school + "입니다."
		);
	}
	
	
}
class  Worker extends Human{
	
	String job;
	
	public Worker() {};
	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}
	
	@Override
	void output() {
		super.output();
		System.out.println(
				"저의 직업은 " + job + "입니다."
		);
	}
}

public class Test01 {
	public static void main(String[] args) {
		Student student = new Student("Martin", 18, "광명고등학교");
		Worker worker = new Worker("James", 27, "프리랜서");
		
		student.output();
		worker.output();
	}
}
