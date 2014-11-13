/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class SteepleChaseRacer extends Racer {
	
	public SteepleChaseRacer(int y) {
		super(y);
	}

	/**
	 * Re-implement the method to allow for jumping hurdles of any height
	 */
	@Override
	public void jumpRight() {
		turnLeft();
		while (!this.rightIsClear()) {
			move();
		}
		turnRight();
		move();
		turnRight();
		while (this.frontIsClear()) {
			move();
		}
		turnLeft();
	}

}
