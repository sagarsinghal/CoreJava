class employee1{
	double salary;
	String name;
	int eid;
	String dept;
	Address add;

	employee1(double salary, String name, int eid, String dept, Address add){
		this.eid=eid;
		this.dept=dept;
		this.salary=salary;
		this.name=name;
		this.add=add;
	}
	
	public void print() {
		System.out.println(this.name+this.dept+this.eid+this.salary);
		add.printa();
	}
	
}

class Address{
	int flatno;
	String apt;
	String main;
	String cross;
	String city;
	long pincode;
	
	Address(int flatno, String apt, String main, String cross, String city, long pincode){
		this.apt=apt;
		this.flatno=flatno;
		this.main=main;
		this.cross=cross;
		this.city=city;
		this.pincode=pincode;
	}
	
	public void printa() {
		System.out.println(this.flatno+this.apt+this.main+this.cross+this.city+this.pincode);
	}
}
public class hasademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address(112,"srt","main","cr","tn",234567l);
		employee1 e=new employee1(12345.6,"peter",123,"finance",a);
		e.print();
	}

}
