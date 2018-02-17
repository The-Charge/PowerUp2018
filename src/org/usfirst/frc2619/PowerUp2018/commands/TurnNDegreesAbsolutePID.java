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

import edu.wpi.first.wpilibj.command.PIDCommand;
import org.usfirst.frc2619.PowerUp2018.Robot;
import org.usfirst.frc2619.PowerUp2018.RobotMap;

/**
 *
 */
public class TurnNDegreesAbsolutePID extends PIDCommand {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private double m_angle;
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TurnNDegreesAbsolutePID(double angle) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        super("TurnNDegreesAbsolutePID", 0.03, 0.0, 0.001, 0.02);
        getPIDController().setInputRange(-180.0, 180.0);
        getPIDController().setContinuous(true);
        getPIDController().setAbsoluteTolerance(1.0);
        getPIDController().setOutputRange(-0.5, 0.5);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        m_angle = angle;

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    @Override
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

    	return RobotMap.driveTrainAHRS.pidGet();
    }

    @Override
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);

    	int sign = (int) Math.signum(output);
		double minSpeed = 0.23;
		double finalOutput = sign * Math.max(minSpeed, Math.abs(output));

		RobotMap.driveTrainLeftFrontMotor.pidWrite(finalOutput);
		RobotMap.driveTrainRightFrontMotor.pidWrite(-finalOutput);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	this.setTimeout(3);
		getPIDController().setSetpoint(m_angle);
		Robot.driveTrain.setPercentVBus();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	return isTimedOut() || getPIDController().onTarget();
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.driveTrain.stop();
    	Robot.driveTrain.setPercentVBus();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
