
public class Mobile {
		String brandname;
		double price;
		String color;
		int resolusion;
		
		public void makeACall()
		{
			System.out.println("Calling...");
		}
		
		public double discount(){
			double dis = price*0.1;
			return dis;
		}
}
