package mielialat;
import toiminnot.AanenSoittaja;
import toiminnot.MielialojenPiirtaja;
import toiminnot.MoottorienLiikuttaja;
import lejos.util.Delay;


public class Iloinen extends Mieliala {
	
	public Iloinen(MielialojenPiirtaja piirtaja, AanenSoittaja soittaja, MoottorienLiikuttaja liikuttaja) {
		super(piirtaja, soittaja, liikuttaja);
	}

	public void toteutus() {  // ympäri ja haukkuu
		soittaja.soitaWoof();
		piirtaja.piirraIloinen(piirtaja.getGraf());
		liikuttaja.pysahdy();
		Delay.msDelay(600);
		
		liikuttaja.ympari();
		soittaja.soitaWoof();
		Delay.msDelay(400);
		
		soittaja.soitaWoof();
		Delay.msDelay(700);
		
		soittaja.soitaWoof();
		Delay.msDelay(500);
		
		soittaja.soitaWoof();
		Delay.msDelay(500);
		
		piirtaja.getGraf().clear();
		piirtaja.piirraOk(piirtaja.getGraf());
		
	}
	



}
