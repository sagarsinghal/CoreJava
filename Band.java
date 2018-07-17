
public class Band {
		String bandName;
		String[] singers;
		String[] guitarists;
		String drummer, keyboardPlayer;
		
		public void setBandDetails(String bandName, String[] singers, String[] guitarists, String drummer, String keyboardPlayer) {
			this.bandName=bandName;
			this.singers  =singers;
			this.guitarists=guitarists;
			this.drummer=drummer;
			this.keyboardPlayer=keyboardPlayer;
			
		}
		
		public void printBanddetails() {
			System.out.println(this.bandName+ this.drummer+ this.guitarists+ this.singers+ this.keyboardPlayer);
		}
		
}
