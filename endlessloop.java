import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class endlessloop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String city = br.readLine();
		ArrayList cityf = new ArrayList();
		while (!city.equals("stop")) {
			cityf.add(city);
			System.out.println("enter city name");
			city = br.readLine();

		}
		System.out.println(cityf);
	}

}