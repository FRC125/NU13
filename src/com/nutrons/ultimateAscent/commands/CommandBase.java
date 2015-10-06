package com.nutrons.ultimateAscent.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.nutrons.ultimateAscent.OI;
import com.nutrons.ultimateAscent.subsystems.Drivetrain;

/**
 * 
 * @author Camilo Gonzalez
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static Drivetrain dt = new Drivetrain();

    public static void init() {
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
