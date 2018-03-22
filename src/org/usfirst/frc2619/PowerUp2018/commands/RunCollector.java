// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2619.PowerUp2018.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2619.PowerUp2018.Robot;

/**
 *
 */
public class RunCollector extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private double m_speed;
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private boolean in = true;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public RunCollector(double speed) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        m_speed = speed;

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collector);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.reverseCollector);
        requires(Robot.cubeSensor);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	in = Robot.collector.getIn(m_speed);
    	this.setTimeout(2);
    	Robot.collector.setOutput(m_speed);
    	Robot.reverseCollector.setOutput(m_speed);
    	Robot.collector.enable();
    	Robot.reverseCollector.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	if (in)
    		return !Robot.oi.buttonBox.getRawButton(2);
    	else
    		return this.isTimedOut() && (!Robot.oi.buttonBox.getRawButton(1) && !Robot.oi.buttonBox.getRawButton(5));
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.collector.stop();
    	Robot.reverseCollector.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
