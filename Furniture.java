class Cot{
	double price;
}

class Chair{
	double price;
}

class DinningTable{
	double price;
}
public class Furniture {
		public double calculationDiscount(Cot c) {
			return c.price*0.1;
		}
		
		public double calculationDiscount(Chair cc) {
			return cc.price*0.1;
		}
		
		public double calculationDiscount(DinningTable dt) {
			return dt.price*0.1;
		}

}
