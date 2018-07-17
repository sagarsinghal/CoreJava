
public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj = new Mobile();
		obj.brandname="samsung";
		obj.color="black";
		obj.price=25000;
		obj.resolusion=1080;
		double a=obj.discount();
		System.out.println(a);
	}

}
