import javax.swing.plaf.synth.SynthSpinnerUI;

class FirstThread{
	public synchronized void run(){
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
	}
}

class SecondThread extends Thread{
	FirstThread f =new FirstThread();
	public void run(){  
		for(int i = 15; i<=20; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread t1 =new FirstThread();
		SecondThread t2=new SecondThread();
		SecondThread t3=new SecondThread();
		//t1.start();
		t2.start();
		t3.start();
	}

}
