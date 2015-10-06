
package com.nutrons.ultimateAscent;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    Joystick driverPad = new Joystick(1);
    
    public OI() {
        
    }
    
    public double getLeftDrive() {
        return this.driverPad.getRawAxis(2);
    }
    
    public double getRightDrive() {
        return -this.driverPad.getRawAxis(4);
    }
}

