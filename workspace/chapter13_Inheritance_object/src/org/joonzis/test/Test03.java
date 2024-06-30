package org.joonzis.test;

class Employee {
	String name,dept;
	int salary;
	
	public Employee() {
	}
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	int pay(){
		return 0;
	}
	
	void output(){
		System.out.println(
				"사원 이름 : " + name + "\n" +
				"사원 부서 : " + dept
		);
	}
}
class SalaryWorker extends Employee{
	
	int salary;
	
	public SalaryWorker() {}
	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	@Override
	int pay() {
		return salary;
	}
	@Override
	void output() {
		super.output();
		System.out.println(
				"급여 : " + salary + "원"
		);
	}
}
class  SalesWorker extends SalaryWorker{
	
	int salary;
	
	double salesIncentive;
	
	public SalesWorker() {}
	public SalesWorker(String name, String dept, double salesIncentive, int salary) {
		super(name, dept, salary);
		this.salary = salary;
		this.salesIncentive = salesIncentive;
	}
	@Override
	int pay() {
		return super.pay(); 
	}
	
	int salesPay() {
		return (int) (pay() * salesIncentive);
	}
	
	int totalPay() {
		return pay() + salesPay(); 
	}
	
	@Override
	void output() {
		super.output();
		System.out.println(
				"사원의 인센티브 : " + salesPay() + "원 \n" +
				"사원의 총 급여 : " + totalPay() + "원"
		);
	}
	
}

class  PartTimeWorker extends Employee{
	int workTime, payPerHour;
	
	public PartTimeWorker() {
		
	}
	
	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
			this.workTime = workTime;
			this.payPerHour = payPerHour; 
	}

	@Override
	int pay() {
		return (workTime * payPerHour);
	}

	@Override
	void output() {
		super.output();
		System.out.println(
				"월급 : " + pay() + "원"
		);
	}
}

public class Test03 {
	public static void main(String[] args) {
		SalaryWorker salaryMan = new SalaryWorker("Martin", "마케팅부서", 1800000);
		SalesWorker salesMan = new SalesWorker("James", "영업부서", 0.2, 1800000);
		PartTimeWorker worker = new PartTimeWorker("Tom", "IT개발부서", 280, 12000);
		
		salaryMan.output();
		System.out.println();
		salesMan.output();
		System.out.println();
		worker.output();
	}
}
