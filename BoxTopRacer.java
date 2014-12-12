/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * Will Fox
 *
 */
 
 
public class BoxTopRacer extends Racer {
	
	public BoxTopRacer(int y) {
      
            super(y);
    }

	@Override
	public void jumpRight() {
   
   turnLeft();
         int n = 0;
         while(!rightIsClear()) {
             move();
             n++;
         }
         turnRight();
         move();
         while(!rightIsClear()) {
             move();
         }
         turnRight();
         for(int k = 1; k <= n; k++) {
             move();
         }
         turnLeft();
		
	}

}
