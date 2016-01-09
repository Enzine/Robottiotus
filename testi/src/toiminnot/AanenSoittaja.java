package toiminnot;
import java.io.File;

import lejos.nxt.Sound;


public class AanenSoittaja {
	private File woof;
	private File whine;
	private File scared;
	
	public AanenSoittaja() {
		this.woof = new File("brk.wav");
		this.whine = new File("whi.wav");
		this.scared = new File("pup.wav");
	}
	
	public void soitaLeike(int volume, File leike) {
		Sound.setVolume(volume);
		Sound.playSample(leike);
	}

}
