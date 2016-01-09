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
	
	public void soitaWoof() {
		Sound.setVolume(100);
		Sound.playSample(woof);
	}
	
	public void soitaWhine() {
		Sound.setVolume(80);
		Sound.playSample(whine);
	}
	
	public void soitaScared() {
		Sound.setVolume(80);
		Sound.playSample(scared);
	}

}
