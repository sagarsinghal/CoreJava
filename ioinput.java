import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ioinput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.println("hj");
		
		String myName = br.readLine();
		
		System.out.println("hja" +myName);
	}

}
