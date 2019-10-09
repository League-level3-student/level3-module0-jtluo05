package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static //1. make a main method
	boolean atTop=false;
	public static void main(String[] args) {
		Robot[] robots=new Robot[5];
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i]=new Robot();
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	robots[4].moveTo(815, 525);
	robots[3].moveTo(635, 525);
	robots[2].moveTo(435, 525);
	robots[1].moveTo(235, 525);
	robots[0].moveTo(50, 525);
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
	Random r=new Random();
	
    	for (int i = 0; i < robots.length; i++) {
    		robots[i].setSpeed(20);
			robots[i].move(r.nextInt(50));
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

    	while (!atTop) {
    		for (int i = 0; i < robots.length; i++) {
    			robots[i].move(r.nextInt(50));
    			if (robots[i].getY()<=0) {
    			
					for (int j = 0; j < 1000; j++) {
						i++;
						System.out.println("Robot "+ i+" wins!");
						i--;
					robots[i].moveTo(500, 500);
					robots[i].penDown();
					robots[i].turn(40);
					robots[i].move(50);
					}
				}
    		
    			}
}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
}
	
}
