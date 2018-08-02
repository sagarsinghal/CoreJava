class places implements Cloneable{
	String name;
	String country;
	public places(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class clonedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		places p1 = new places("bombay", "india");
		places p2 = null;
		try {
			p2=(places)p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p1);
		System.out.println(p2);
	}

}
