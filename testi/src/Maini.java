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
		SoundSensor aaniV = new SoundSensor(SensorPort.S3, true); //vasen
		SoundSensor aaniO = new SoundSensor(SensorPort.S4, true); //oikea		

		Graphics graf = new Graphics();
		MoottorienLiikuttaja liikuttaja = new MoottorienLiikuttaja();
		MielialojenPiirtaja piirtaja = new MielialojenPiirtaja(graf);
		AanenSoittaja soittaja = new AanenSoittaja();
		Iloinen ilo = new Iloinen(piirtaja, soittaja, liikuttaja);
		Vihainen viha = new Vihainen(piirtaja, soittaja, liikuttaja);
		
		
		Sound.setVolume(80);
		ultra.continuous();
		while (!tatsi.isPressed()) {
			if (aaniV.readValue() > 50) {
				liikuttaja.pysahdy();
				while (true) {
					int aaniVasen = aaniV.readValue();
					int aaniOikea = aaniO.readValue();
					if (aaniV.readValue() > 30 && aaniO.readValue() > 30) {
						if (aaniV.readValue() - aaniO.readValue() > -5 && aaniV.readValue() - aaniO.readValue() < 5) {
							break;
						}
						if (aaniVasen < aaniOikea) {
							liikuttaja.kaannyOikealle(200);
						} else {
							liikuttaja.kaannyVasemmalle(200);
						}
						
					} else {
						break;
					}
					
					Thread.sleep(800);
				}
				ilo.toteutus();
			}
		}
		
//		while (true) {
//			
//			piirtaja.piirraOk();
//			
//			while (!tatsi.isPressed()) {
//				liikuttaja.eteenpain();
//				if (ultra.getDistance() < 50) {
//					liikuttaja.kaannyVasemmalle(700);
//				}
//				if (aaniV.readValue() > 50) {
//					liikuttaja.pysahdy();
//					while (true) {
//						int aaniVasen = aaniV.readValue();
//						int aaniOikea = aaniO.readValue();
//						if (aaniV.readValue() > 40 && aaniO.readValue() > 40) {
//							if (aaniV.readValue() - aaniO.readValue() > -5 && aaniV.readValue() - aaniO.readValue() < 5) {
//								break;
//							}
//							if (aaniVasen < aaniOikea) {
//								liikuttaja.kaannyOikealle(100);
//							} else {
//								liikuttaja.kaannyVasemmalle(100);
//							}
//						} else {
//							break;
//						}
//						
//						Thread.sleep(1000);
//					}
//					
//					while (ultra.getDistance() > 50) {
//						liikuttaja.eteenpain();
//					}
//					ilo.toteutus();
//				}
//			}
//			viha.toteutus();
//			
//		}
	}
}