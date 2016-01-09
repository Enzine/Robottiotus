import lejos.nxt.Sound;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import mielialat.*;
import toiminnot.*;
import javax.microedition.lcdui.Graphics;

public class Maini {
	
	public static void main(String[] args) throws Exception{
		
		TouchSensor tatsi = new TouchSensor(SensorPort.S1);
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S2);
		SoundSensor aani = new SoundSensor(SensorPort.S3, true); //vasen
		SoundSensor aani2 = new SoundSensor(SensorPort.S4, true); //oikea		

		Graphics graf = new Graphics();
		MoottorienLiikuttaja liikuttaja = new MoottorienLiikuttaja();
		MielialojenPiirtaja piirtaja = new MielialojenPiirtaja(graf);
		AanenSoittaja soittaja = new AanenSoittaja();
		Iloinen ilo = new Iloinen(piirtaja, soittaja, liikuttaja);
		Vihainen viha = new Vihainen(piirtaja, soittaja, liikuttaja);
		
		
		Sound.setVolume(80);
		ultra.continuous();
		
		while (true) {
			
			piirtaja.piirraOk();
			
			while (!tatsi.isPressed()) {
				liikuttaja.eteenpain();
				if (ultra.getDistance() < 50) {
					liikuttaja.kaannyVasemmalle(700);
				}
				if (aani.readValue() > 50) {
//					while (true) {
//						int aaniYks = aani.readValue();
//						int aaniKaks = aani2.readValue();
//						if (aani.readValue() > 40 && aani2.readValue() > 40) {
//							if (aani.readValue() - aani2.readValue() > -10 && aani.readValue() - aani2.readValue() < 10) {
//								break;
//							}
//							if (aaniYks < aaniKaks) {
//								kaannyVasemmalle(100);
//							} else {
//								kaannyOikealle(100);
//							}
//						}
//						Thread.sleep(100);
//						
//					}
//					
//					while (ultra.getDistance() > 50) {
//						liikuttaja.eteenpain();
//					}
					ilo.toteutus();
				}
			}
			viha.toteutus();
			
		}
	}
}