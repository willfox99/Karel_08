/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class BoxTopRacer extends Racer {
	
	public BoxTopRacer(int y) {
		super(y);
	}

	/**
	 * Re-implement the method to allow for jumping hurdles of any width
	 */
	@Override
	public void jumpRight() {
		turnLeft();
		while (!this.rightIsClear()) {
			move();
		}
		turnRight();
		move();
		while(!this.rightIsClear()){
			move();
		}
		turnRight();
		while (this.frontIsClear()) {
			move();
		}
		turnLeft();
	}

}
