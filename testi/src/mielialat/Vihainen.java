package mielialat;
import toiminnot.AanenSoittaja;
import toiminnot.MielialojenPiirtaja;
import toiminnot.MoottorienLiikuttaja;


public class Vihainen extends Mieliala {
	
	public Vihainen(MielialojenPiirtaja piirtaja, AanenSoittaja soittaja, MoottorienLiikuttaja liikuttaja) {
		super(piirtaja, soittaja, liikuttaja);
	}

	public void toteutus() throws InterruptedException {
		soittaja.soitaWhine();
		piirtaja.piirraVihainen(piirtaja.getGraf());
		Thread.sleep(800);
		
		soittaja.soitaScared();
		liikuttaja.puolinopeudella();
		liikuttaja.pakita();
		Thread.sleep(1500);
		
		liikuttaja.pysahdy();
		Thread.sleep(2000); 	//mahdollista nyt sammuttaa painamalla ESCAPE+ENTER!
	}



}
