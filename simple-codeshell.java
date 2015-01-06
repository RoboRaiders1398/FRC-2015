package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Alliance;
import edu.wpi.first.wpilibj.Timer;


public class Robot extends SimpleRobot {
	Joystick l_stick = new Joystick(1);
    	Joystick r_stick = new Joystick(2);
	RobotDrive drive = new RobotDrive(1, 2);


  public void autonomous() {
		Alliance color = GetAlliance();
        	int pos =  GetLocation;	//Get starting position during autonomos mode
		switch (pos) {
		case 1: 	//if starting position is 1
			break;
		case 2:		//if starting position is 2
			break;
		case 3:		//if starting position is 3
			break;
		default:	//catchall.... just in case...
			break;
		}
		
    }

    public void operatorControl() {
        SpeedController lF = new Talon(4, 1);	//Controllers (e.g. lF = left-Front)
        SpeedController rF = new Talon(4, 2);
        SpeedController lR = new Talon(4, 3);
        SpeedController rR = new Talon(4, 4);
         
         while (isOperatorControl() && isEnabled()) {	//main control loop
            double x1 = l_stick.getX();
            double y1 = l_stick.getY();
            double r1 = 0.0;
			 
			double x2 = r_stick.getX();
            double y2 = r_stick.getY();
            double r2 = 0.0;
             

            drive.tankDrive(l_stick, r_stick);
             
         }
    }
}
