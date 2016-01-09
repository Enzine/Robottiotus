package mielialat;
import toiminnot.AanenSoittaja;
import toiminnot.MielialojenPiirtaja;
import lejos.util.Delay;


public class Iloinen extends Mieliala {
	
	public Iloinen(MielialojenPiirtaja piirtaja, AanenSoittaja soittaja) {
		super(piirtaja, soittaja);
	}

	public void toteutus() {  // ympäri ja haukkuu
		soittaja.soitaWoof();
		piirtaja.piirraIloinen(piirtaja.getGraf());
		piirtaja.getLiikuttaja().pysahdy();
		Delay.msDelay(600);
		
		piirtaja.getLiikuttaja().ympari();
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