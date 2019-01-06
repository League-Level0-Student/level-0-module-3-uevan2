//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
			Robot robot = new Robot();
		//3. Ask the user what color they would like the robot to draw
			for(int x = 0; x <100; x++) {
				
			
			String color = JOptionPane.showInputDialog("What color would you like to see the robot draw? (roygbv)");
		//5. Use an if/else statement to set the pen color that the user requested
			
			robot.setSpeed(20);
			
			
				if(color.equals("red")){
				robot.setPenColor(210, 5, 5);
				}
				else if(color.equals("orange")){
				robot.setPenColor(210, 100, 5);
				}
				else if(color.equals("yellow")){
				robot.setPenColor(210, 185, 5);
				}
				else if(color.equals("green")){
				robot.setPenColor(5, 220, 5);
				}
				else if(color.equals("blue")){
				robot.setPenColor(5, 5, 220);
				}
				else if(color.equals("purple")){
					robot.setPenColor(160, 5, 160);
				}
				else {
				System.out.println("you didn't enter a valid color");
				robot.setRandomPenColor();
				}
			
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
			robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
				robot.penDown();
				robot.move(5*x+100);
				robot.turn(120);
				robot.move(5*x+100);
				robot.turn(120);
				robot.move(5*x+100);
				robot.turn(120);
			}
	}
}