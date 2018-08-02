import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writefiledemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos =new FileOutputStream("c:\\deloitte\\sample.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes("helo world \r\n");
		dos.writeBytes("helo world \n");
		dos.close();
		fos.close();
	}

}
