
public class PasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "Icecube1!";
		char cArray[] = company.toCharArray();
		int alpha = 0, dig = 0, spc = 0;
		if (cArray.length > 5 && cArray.length-1 < 10) {
			for (int i = 0; i < cArray.length; i++) {
				if (Character.isUpperCase(cArray[i])) {
					alpha = 1;
				} else if (Character.isDigit(cArray[i])) {
					dig = 1;
				} else if (Character.isWhitespace(cArray[i])) {
					System.out.println(cArray[i] + " space not allowed");
				} else if(Character.isLowerCase(cArray[i])){
					
				}
				else {
					spc=1;
				}
			}
		} else {
			System.out.println(" size error");
		}
		if (alpha == 1 && dig == 1 && spc == 1) {
			System.out.println("correct password");
		} else {
			System.out.println("wrong password");
		}
	}
}
