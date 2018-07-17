
public class shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		triangle cc = new triangle();
		square dt = new square();
		
		c.price=25;
		cc.price=15;
		cc.tax=20;
		dt.price=25;
		
		shapeo a = new shapeo();
		System.out.println(a.calculationDiscount(c));
		System.out.println(a.calculationDiscount(cc)) ;
		System.out.println(a.calculationDiscount(dt));
	}
}
