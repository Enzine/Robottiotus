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
		perusnopeudella();
		Motor.A.backward();
		Motor.B.backward();
	}
	
	public void kaannyVasemmalle(int ms) throws InterruptedException {
		Motor.A.stop();
		tuplanopeudella();
		Motor.B.backward();
		Thread.sleep(ms);
	}
	
	public void kaannyOikealle(int ms) throws InterruptedException {
		Motor.B.stop();
		tuplanopeudella();
		Motor.A.backward();
		Thread.sleep(ms);
	}
	
	public void ympari() {
		pysahdy();
		tuplanopeudella();
		Motor.A.backward();
	}
	
	public void perusnopeudella() {
		Motor.A.setSpeed(400);
		Motor.B.setSpeed(400);
	}
	
	public void puolinopeudella() {
		Motor.A.setSpeed(200);
		Motor.B.setSpeed(200);
	}
	
	public void tuplanopeudella() {
		Motor.A.setSpeed(800);
		Motor.B.setSpeed(800);
	}
}
