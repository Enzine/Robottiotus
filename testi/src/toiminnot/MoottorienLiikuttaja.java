package toiminnot;
import lejos.nxt.Motor;


public class MoottorienLiikuttaja {
	private static final int PERUSNOPEUS = 400;
	private static final int PUOLINOPEUS = 200;
	private static final int TUPLANOPEUS = 800;

	public void pysahdy() {
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void pakita() {
		asetaNopeus(PUOLINOPEUS);
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void eteenpain() {
		asetaNopeus(PERUSNOPEUS);
		Motor.A.backward();
		Motor.B.backward();
	}
	
	/**
	 * 1. pysäyttää moottorin portissa A,
	 * 2. asettaa moottorien nopeudeksi 800 millisekuntia,
	 * 3. määrittää moottorin liikesuunnan taaksepäin portissa B ja
	 * 4. pysäyttää ohjelman kulun parametrina määritetyn kokonaisluvun verran (millisekuntia)
	 * @param ms
	 * @throws InterruptedException
	 */
	public void kaannyVasemmalle(int ms) throws InterruptedException {
		Motor.A.stop();
		asetaNopeus(TUPLANOPEUS);
		Motor.B.backward();
		Thread.sleep(ms);
	}
	/**
	 * 1. pysäyttää moottorin portissa B,
	 * 2. asettaa moottorien nopeudeksi 800 millisekuntia,
	 * 3. määrittää moottorin liikesuunnan taaksepäin portissa A ja
	 * 4. pysäyttää ohjelman kulun parametrina määritetyn kokonaisluvun verran (millisekuntia)
	 * @param ms
	 * @throws InterruptedException
	 */
	public void kaannyOikealle(int ms) throws InterruptedException {
		Motor.B.stop();
		asetaNopeus(TUPLANOPEUS);
		Motor.A.backward();
		Thread.sleep(ms);
	}
	
	public void ympari() {
		pysahdy();
		asetaNopeus(TUPLANOPEUS);
		Motor.A.backward();
	}
	
	/**
	 * 1. asettaa moottorin nopeuden parametrina annetuksi kokonaisluvuksi porteissa A ja B (millisekuntia)
	 * @param nopeus
	 */
	public void asetaNopeus(int nopeus) {
		Motor.A.setSpeed(nopeus);
		Motor.B.setSpeed(nopeus);
	}
}
