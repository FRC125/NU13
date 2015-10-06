package com.nutrons.ultimateAscent.subsystems;

import com.nutrons.ultimateAscent.RobotMap;
import com.nutrons.ultimateAscent.commands.drivetrain.TankDriveCmd;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Camilo Gonzalez
 */
public class Drivetrain extends Subsystem {
    
    Talon leftMotor1 = new Talon(RobotMap.DRIVE_LEFT_MOTOR_1);
    Talon leftMotor2 = new Talon(RobotMap.DRIVE_LEFT_MOTOR_2);
    Talon rightMotor1 = new Talon(RobotMap.DRIVE_RIGHT_MOTOR_1);
    Talon rightMotor2 = new Talon(RobotMap.DRIVE_RIGHT_MOTOR_2);
    
    public void initDefaultCommand() {
        setDefaultCommand(new TankDriveCmd());
    }
    
    public void driveLR(double leftPower, double rightPower) {
        this.leftMotor1.set(leftPower);
        this.leftMotor1.set(leftPower);
        this.rightMotor1.set(rightPower);
        this.rightMotor2.set(rightPower);
    }
    
    public void stop() {
        driveLR(0,0);
    }
}
