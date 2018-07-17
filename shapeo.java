class Circle{
		double price;
	}

	class triangle{
		double price;
		double tax;
	}

	class square{
		double price;
	}
public class shapeo {
			public double calculationDiscount(Circle c) {
				return c.price*c.price*3.14;
			}
			
			public double calculationDiscount(triangle cc) {
				return cc.price*cc.tax*0.2;
			}
			
			public double calculationDiscount(square dt) {
				return dt.price*dt.price;
			}

	}