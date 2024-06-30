package org.joonzis.test;

class Computer {
	String model; 
	int price;
	
	public Computer() {}
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	void output(){
		System.out.print(
				"기종은 : " + model + "\n" +
				"가격은 : " + price + "\n"
		);
	}
}
class Tablet extends Computer{
	int battery;
	
	public Tablet() {};
	public Tablet(String model, int price, int battery) {
		super(model, price);
		this.battery = battery;
	}
	@Override
	void output() {
		super.output();
		System.out.println("배터리는 " + battery + "% 남았습니다.");
	}
	
	
}
class  Notebook extends Computer{
	int battery;
	String pen;
	
	public Notebook() {};
	public Notebook(String model, int price, int battery, String pen) {
		super(model, price);
		this.pen = pen;
		this.battery = battery;
	}
	
	@Override
	void output() {
		super.output();
		System.out.println(
				"배터리는 " + battery + "% 남았습니다. \n" +
				"사용하는 펜은 " + pen + "입니다."
		);
	}
}

public class Test02 {
	public static void main(String[] args) {
		Tablet tab = new Tablet("갤럭시 탭8", 700000, 70);
		Notebook laptop = new Notebook("Legion Y920", 1500000, 90, "1세대 팬");
		
		tab.output();
		System.out.println();
		laptop.output();
	}
}
