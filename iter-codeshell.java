package com.team1398.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.Alliance;
import edu.wpi.first.wpilibj.Timer;


public class Robot extends IterativeRobot {
	Joystick drivestick = new Joystick(1);
    Joystick stick = new Joystick(2);		//stick for lift? launch?
	RobotDrive drive = new RobotDrive(1, 2);


    public void autonomousInit() {
		public Alliance color = GetAlliance();
        public int pos =  GetLocation;	//Get starting position during autonomos mode
		}
	
	public void autonomosPeriodic() {
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
	
	public void teleopInit() {
		  public SpeedController lf, rF, lR, rR;
		  lF = new Talon(4, 1);	//Controllers (e.g. lF = left-Front)
      rF = new Talon(4, 2);
      lR = new Talon(4, 3);
      rR = new Talon(4, 4);
	}
	
	
    public void teleopPeriodic() {
         
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
