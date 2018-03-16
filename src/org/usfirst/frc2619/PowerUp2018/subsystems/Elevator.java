// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2619.PowerUp2018.subsystems;

import org.usfirst.frc2619.PowerUp2018.Robot;
import org.usfirst.frc2619.PowerUp2018.RobotMap;
import org.usfirst.frc2619.PowerUp2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Elevator extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	private final static double SPEED_P_CONSTANT = 0.0001;
	private final static double SPEED_I_CONSTANT = 0.00001;
	private final static double SPEED_D_CONSTANT = 0.0;
	private final static double SPEED_F_CONSTANT = 0.0;
	
    private static final int MAX_TICKS_PER_SEC = 93410;
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX motor = RobotMap.elevatorMotor;
    private final WPI_TalonSRX followerMotor = RobotMap.elevatorFollowerMotor;
    private final Solenoid brakes = RobotMap.elevatorBrakes;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
	double SpeedP = SPEED_P_CONSTANT;
	double SpeedI = SPEED_I_CONSTANT;
	double SpeedD = SPEED_D_CONSTANT;
	double SpeedF = SPEED_F_CONSTANT;

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initSpeedPercentageMode() {
		motor.set(ControlMode.Velocity, 0);

		motor.selectProfileSlot(1, 0);

		motor.configNominalOutputForward(0, RobotMap.TIMEOUT_MS);
		motor.configNominalOutputReverse(0, RobotMap.TIMEOUT_MS);
	}
    
	public void set(double percentSpeed) {
		motor.set(ControlMode.Velocity, MAX_TICKS_PER_SEC * percentSpeed);
	}

	public void stop() {
		motor.set(ControlMode.Velocity, 0);
		motor.disable();
		brakeOn();
	}
	
    public void writeDashboardDebugValues() {
    	SmartDashboard.putBoolean("UpperLimitSwitch", motor.getSensorCollection().isFwdLimitSwitchClosed());
        SmartDashboard.putBoolean("LowerLimitSwitch", motor.getSensorCollection().isRevLimitSwitchClosed());
    }
    
    public void readDashboardControlValues() {
		SpeedP = SmartDashboard.getNumber("ShooterSpeedP", SPEED_P_CONSTANT);
		SpeedI = SmartDashboard.getNumber("ShooterSpeedI", SPEED_I_CONSTANT);
		SpeedD = SmartDashboard.getNumber("ShooterSpeedD", SPEED_D_CONSTANT);
		SpeedF = SmartDashboard.getNumber("ShooterSpeedF", SPEED_F_CONSTANT);

		// set CANTalon PIDs
		motor.config_kP(1, SpeedP, RobotMap.TIMEOUT_MS);
		motor.config_kI(1, SpeedI, RobotMap.TIMEOUT_MS);
		motor.config_kD(1, SpeedD, RobotMap.TIMEOUT_MS);
		motor.config_kF(1, SpeedF, RobotMap.TIMEOUT_MS);
	}
    
    public void writeDefaultDashboardValues() {
		SmartDashboard.putNumber("ShooterSpeedP", SPEED_P_CONSTANT);
		SmartDashboard.putNumber("ShooterSpeedI", SPEED_I_CONSTANT);
		SmartDashboard.putNumber("ShooterSpeedD", SPEED_D_CONSTANT);
		SmartDashboard.putNumber("ShooterSpeedF", SPEED_F_CONSTANT);
	}

    public boolean checkLimitSwitches() {
    	if (motor.getSensorCollection().isFwdLimitSwitchClosed()) {
    		resetPosBottom();
    		return true;
    	}
    	else if (motor.getSensorCollection().isRevLimitSwitchClosed()) {
    		resetPosTop();
    		return true;
    	}
    	return false;
    }
    
    public boolean checkBottomLimitSwitch() {
    	if (motor.getSensorCollection().isFwdLimitSwitchClosed()) {
    		resetPosBottom();
    		return true;
    	}
    	return false;
    }
    
    public boolean checkTopLimitSwitch() {
    	if (motor.getSensorCollection().isRevLimitSwitchClosed()) {
    		resetPosTop();
    		return true;
    	}
    	return false;
    }
    
    public void resetPosTop() {
    	
    }
    
    public void resetPosBottom() {
    	
    }
    
    public void brakeOn() {
    	brakes.set(false);
    }
    
    public void brakeOff() {
    	brakes.set(true);
    }
}

