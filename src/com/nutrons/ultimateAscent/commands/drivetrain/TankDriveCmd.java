package com.nutrons.ultimateAscent.commands.drivetrain;

import com.nutrons.ultimateAscent.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class TankDriveCmd extends CommandBase {
    
    public TankDriveCmd() {
       requires(dt);
    }

    protected void initialize() {
    }

    protected void execute() {
        dt.driveLR(oi.getLeftDrive(), oi.getRightDrive());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        dt.stop();
    }

    protected void interrupted() {
        end();
    }
}
