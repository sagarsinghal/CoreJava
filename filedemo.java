import java.io.File;

public class filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:/guru/test1/mynewfile");
		
		if (f.exists()) {
			System.out.println("exists");
		}
	}

}
