
public class checkstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "deloitte works for 9 hours *";
		char cArray[]=company.toCharArray();
		for(int i=0;i < cArray.length; i++) {
			if(Character.isAlphabetic(cArray[i])) {
				System.out.println(cArray[i] +" is char");
			}
			else if(Character.isDigit(cArray[i])) {
				System.out.println(cArray[i] +" is num");
			}
			else  if(Character.isWhitespace(cArray[i])){
				System.out.println(cArray[i] +" is space");
			}
		}
	}

}
