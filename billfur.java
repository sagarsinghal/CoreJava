
public class billfur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cot c = new Cot();
		Chair cc = new Chair();
		DinningTable dt = new DinningTable();
		
		c.price=25000;
		cc.price=1500;
		dt.price=2500;
		
		Furniture a = new Furniture();
		System.out.println(a.calculationDiscount(c));
		a.calculationDiscount(cc);
		a.calculationDiscount(dt);
	}

}
