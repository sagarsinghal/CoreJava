
public class Employee {
		private int employeeId;
		private String employeeName;
		private double employeeSalary;
		
		Employee(int eid, String ename, double esalary){
			this.employeeId=eid;
			this.employeeName=ename;
			this.employeeSalary=esalary;
		}
		public double calculateBonus() {
			double bonus=0.0;
			if(this.employeeSalary<=5000)
				bonus = this.employeeSalary*0.2;
			else
				bonus=this.employeeSalary*0.1;
			
			return bonus;
		}
		public static int getCompanyName(){
			return 0;
		}
}
