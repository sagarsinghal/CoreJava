abstract class person6{
	public boolean doesHeSleep() {
		System.out.println(" sleeps");
		return true;
	}
	
	public abstract void whatDoYouDo();
	
	public boolean doYouSpeak() {
		return true;
	}
	public abstract boolean doesHeDrive();
	
}

class trainer6 extends person6{
	public void whatDoYouDo() {
		
	}
	
	public boolean doesHeDrive() {
		return true;
	}
}
abstract class employee6 extends person6{
	public abstract boolean a();
}

class driver extends employee6{
public void whatDoYouDo() {
		
	}
	
	public boolean doesHeDrive() {
		return true;
	}
	
	public boolean a() {
		return true; 
	}
	
}

public class abstractdemo{
	public static void main(String[] args) {
		driver d=new driver();
		System.out.println(""+d.doesHeSleep());
	}
}
