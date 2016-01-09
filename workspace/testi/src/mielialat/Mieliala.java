package mielialat;
import toiminnot.AanenSoittaja;
import toiminnot.MielialojenPiirtaja;


public abstract class Mieliala {
	protected MielialojenPiirtaja piirtaja;
	protected AanenSoittaja soittaja;
	
	public Mieliala(MielialojenPiirtaja piirtaja, AanenSoittaja soittaja) {
		this.piirtaja = piirtaja;
		this.soittaja = soittaja;
	}
	
	abstract void toteutus();
	
}
