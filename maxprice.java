import java.util.Arrays;

public class maxprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {234,576,987,498,678,509}; int max =0;
		for (int i=0;i<5;i++) {
			if(a[i]>max)
				 max = a[i];		
		}
		System.out.println(max+"is maximum");
	}
}
