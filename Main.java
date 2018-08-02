package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main extends UserMainCode{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		UserMainCode obj = new UserMainCode();
		System.out.println("enter size of array");
		int size = Integer.parseInt(br.readLine());
		ArrayList arr = new ArrayList();
		while (size>0) {
			arr.add(no);
			System.out.println("enter no.");
			no = Integer.parseInt(br.readLine());
			size--
		}
		boolean result=obj.checkTripplets(arr);
	}

}
