package toiminnot;
import lejos.nxt.Motor;


public class MoottorienLiikuttaja {
	private static final int PERUSNOPEUS = 400;
	private final int PUOLINOPEUS = 200;
	private final int TUPLANOPEUS = 800;

	public void pysahdy() {
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void pakita() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void eteenpain() {
		asetaNopeus(PERUSNOPEUS);
		Motor.A.backward();
		Motor.B.backward();
	}
	
	public void kaannyVasemmalle(int ms) throws InterruptedException {
		Motor.A.stop();
		asetaNopeus(TUPLANOPEUS);
		Motor.B.backward();
		Thread.sleep(ms);
	}
	
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
	
	public void asetaNopeus(int nopeus) {
		Motor.A.setSpeed(nopeus);
		Motor.B.setSpeed(nopeus);
	}
}
