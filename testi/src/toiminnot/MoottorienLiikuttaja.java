package toiminnot;
import lejos.nxt.Motor;


public class MoottorienLiikuttaja {

	public void pysahdy() {
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void pakita() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void eteenpain() {
		asetaNopeus(400);
		Motor.A.backward();
		Motor.B.backward();
	}
	
	public void kaannyVasemmalle(int ms) throws InterruptedException {
		Motor.A.stop();
		asetaNopeus(800);
		Motor.B.backward();
		Thread.sleep(ms);
	}
	
	public void kaannyOikealle(int ms) throws InterruptedException {
		Motor.B.stop();
		asetaNopeus(800);
		Motor.A.backward();
		Thread.sleep(ms);
	}
	
	public void ympari() {
		pysahdy();
		asetaNopeus(800);
		Motor.A.backward();
	}
	
	public void asetaNopeus(int nopeus) {
		Motor.A.setSpeed(nopeus);
		Motor.B.setSpeed(nopeus);
	}
}
