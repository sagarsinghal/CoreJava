interface comparision{
	public void whichisgreater();
}

class employee4 implements comparision{
	employee4(String n, int i){
		
	}
	@Override
	public employee4 whichisgreater(object o1, object o2) {
		// TODO Auto-generated method stub
		employee4 e1 = employee4(o1);
		employee4 e2 = employee4(o2);
		if()
	}
	
}

class apple implements comparision{
	apple(String n, int i){
		
	}
	@Override
	public void whichisgreater() {
		// TODO Auto-generated method stub
		
	}
	
}
public class testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee4 e1=new employee4("emp1", 25000);
		employee4 e2=new employee4("emp2", 35000);
		employee4 e3=new employee4(null, 0);
		e3.whichisgreater(e1,e2);
		apple a1=new apple("kashmir", 23000);
		apple a2=new apple("washimgton", 33000);
		apple a3=new apple(null, 0);
		a3.whichisgreater(a1,a2);
	}

}
