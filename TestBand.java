
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band b1 =new Band();
		Band b2 =new Band();
		String as[] ={"as","as1"};
		String ag[]={"ag","ag1"};
		String bs[] ={"bs","bs1"};
		String bg[]={"bg","bg1"};
		
		b1.setBandDetails("a", as , ag , " ad", " ak");
		b2.setBandDetails("b",  bs,  bg , " bd", " bk");
		b1.printBanddetails();
		b2.printBanddetails();
	}

}
