
public class car {
		String carName;
		double milage,price;
		boolean luxuryType;
		
		public void setCarDetails(String carName, double milage, double price, boolean luxuryType) {
			this.carName=carName;
			this.milage=milage;
			this.price=price;
			this.luxuryType=luxuryType;
		
		}
		
		public void print() {
			System.out.println(carName+price+milage+luxuryType);
		}
}
