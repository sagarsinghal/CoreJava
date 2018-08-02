
public class Myenumdemo {
	
	enum weekday {Sunday, monday, tuesday};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		weekday[] w= weekday.values();
		for(weekday w1:w)
			System.out.println(w1);
		
		System.out.println(weekday.tuesday);
	}

}
