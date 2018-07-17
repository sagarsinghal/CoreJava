
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee (12,"guru",2134.2);
		double bonus=e1.calculateBonus();
		System.out.println(bonus);
		
		System.out.println(Employee.getCompanyName());
		
		Employee e2 = new Employee(12,"guru",2134.2);
		System.out.println(e2.getCompanyName());
	}

}
  