package Day06;

public abstract class Employee {   //부모 클래스 생성 
	int num;
	String name;
	double pay; //연봉
	
	public Employee(int num, String name, double pay) { 
		this.num = num;
		this.name = name;
		this.pay = pay;
	}
	
	public void ShowEmployeeInfo() {
		System.out.println("사번 : " + num );
		System.out.println("이름 : " + name);
	}
	
	public abstract double getMonthPay();  
}
