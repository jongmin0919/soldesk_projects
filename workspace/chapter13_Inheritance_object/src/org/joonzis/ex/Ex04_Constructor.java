package org.joonzis.ex;

class Animal{
	String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	String personName;
	
	public Dog(String personName) {
		super();
		this.name = personName;
	}
	
	public Dog(String name, String personName) {
		super(name);
		this.personName = personName;
	}
	
	void whoAmI1() {
	 System.out.println("내 이름은 : " + super.name + "이고" + "주인은" + personName + "입니다.");
	}
	void whoAmI2() {
		 System.out.println("내 이름은 : " + name + "이고" + "주인은" + personName + "입니다.");
	}
}

public class Ex04_Constructor {
	public static void main(String[] args) {
		Dog dog1 = new Dog("김씨");
		Dog dog2 = new Dog("정씨", "멍멍이");
		Dog dog3 = new Dog("광씨", "발발이");
		
		dog1.whoAmI1();
		dog2.whoAmI1();
		dog3.whoAmI2();
	}
}
