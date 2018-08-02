interface TvRemote {
	public abstract void switchOff();
	public abstract void switchOn();
	public abstract void changeChanel();
	public abstract void IncreaseVolume();
	public abstract void decreaseVolume();
}

class sony implements TvRemote{

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("off");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("on");
	}

	@Override
	public void changeChanel() {
		// TODO Auto-generated method stub
		System.out.println("changing");
	}

	@Override
	public void IncreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("increasing");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("decreasing");
	}
	
}
public class interfacedemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sony s=new sony();
		s.switchOn();
		s.changeChanel();
		s.IncreaseVolume();
		s.decreaseVolume();
		s.switchOff();
	}

}
