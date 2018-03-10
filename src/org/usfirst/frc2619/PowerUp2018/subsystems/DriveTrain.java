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
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.kauailabs.navx.frc.AHRS;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX leftFrontMotor = RobotMap.driveTrainLeftFrontMotor;
    private final WPI_TalonSRX leftRearMotor = RobotMap.driveTrainLeftRearMotor;
    private final WPI_TalonSRX rightFrontMotor = RobotMap.driveTrainRightFrontMotor;
    private final WPI_TalonSRX rightRearMotor = RobotMap.driveTrainRightRearMotor;
    private final AnalogGyro doNotUse = RobotMap.driveTrainDoNotUse;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final static double SPEED_P_CONSTANT = 0.3;
	private final static double SPEED_I_CONSTANT = 0.001;
	private final static double SPEED_D_CONSTANT = 0.0;
	private final static double SPEED_F_CONSTANT = 0.12;
    
    public double speedP = SPEED_P_CONSTANT;
	public double speedI = SPEED_I_CONSTANT;
	public double speedD = SPEED_D_CONSTANT;
	public double speedF = SPEED_F_CONSTANT;
	
	//Change after testing
	private static final double ELEVATOR_POS_TWO = 0.75;
	private static final double ELEVATOR_POS_THREE = 0.50;
	
	private final int MAX_TICKS_PER_SECOND = 8691;
    public final double TICKS_PER_FOOT = 4320;
    
    public double MotionMagicP = 2;
    public double MotionMagicI = 0.001;
    public double MotionMagicD = 0;
    public double MotionMagicF = 0.72;
    public int MotionMagicAcceleration = 2000;
    public int MotionMagicVelocity = 6000;
    public int MotionMagicPIDIndex = 0;
    public int MotionMagicPIDSlot = 0;
    public double MotionMagicDistance;
    
    public final double TIMEOUT = 0.002;
    private final AHRS ahrs = RobotMap.driveTrainAHRS;
    public double turn_outer_speed;
	public final double TURN_OUTER_SPEED_DEFAULT = 0.5;
	public double turn_inner_speed;
	public final double TURN_INNER_SPEED_DEFAULT = -0.5;
    
    public boolean isReversed = false;
    public boolean driveLocked = false;
    public boolean speedOverriden = false;
    
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new TankDrive());

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
    
    public void driveTrainInit() {
    	leftFrontMotor.setNeutralMode(NeutralMode.Brake);
    	leftRearMotor.setNeutralMode(NeutralMode.Brake);
    	rightFrontMotor.setNeutralMode(NeutralMode.Brake);
    	rightRearMotor.setNeutralMode(NeutralMode.Brake);
    }
    
    public void run(double l, double r) {
    	double leftSpeed = l;
    	double rightSpeed = r;
    	
    	if (speedOverriden) {
	    	//if (Robot.elevator.wasForward) {
	    		/*if (Robot.elevator.getElevatorPos() == 2) {
	    			leftSpeed = l * ELEVATOR_POS_TWO;
	    			rightSpeed = r * ELEVATOR_POS_TWO;
	    		}
	    		else if (Robot.elevator.getElevatorPos() == 3) {
	    			leftSpeed = l * ELEVATOR_POS_THREE;
	    			rightSpeed = r * ELEVATOR_POS_THREE;
	    		}*/ 
	    		leftSpeed = l *.25;
	    		rightSpeed = r *.25;
	    	//}
	    	/*else if (!Robot.elevator.wasForward) {
	    		if (Robot.elevator.getElevatorPos() == 1) {
	    			leftSpeed = l * ELEVATOR_POS_TWO;
	    			rightSpeed = r * ELEVATOR_POS_TWO;
	    		}
	    		else if (Robot.elevator.getElevatorPos() == 2) {
	    			leftSpeed = l * ELEVATOR_POS_THREE;
	    			rightSpeed = r * ELEVATOR_POS_THREE;
	    		}
	    	}*/
    	}
    	if (driveLocked) {
			double avSpeed = (leftSpeed + rightSpeed) / 2.0;
			leftSpeed = avSpeed;
			rightSpeed = avSpeed;
			if (!isReversed) {
				leftFrontMotor.set(leftSpeed);
				rightFrontMotor.set(rightSpeed);
			} 
			else {
				leftFrontMotor.set(-1 * leftSpeed);
				rightFrontMotor.set(-1 * rightSpeed);
			}
		} 
    	else if (!isReversed) {
			leftFrontMotor.set(leftSpeed);
			rightFrontMotor.set(rightSpeed);
		} 
    	else {
			leftFrontMotor.set(-1 * leftSpeed);
			rightFrontMotor.set(-1 * rightSpeed);
		}
    }
    
    public void stop() {
    	leftFrontMotor.set(0);
    	rightFrontMotor.set(0);
    }
    
    public void setPercentVBus() {
    	leftFrontMotor.set(ControlMode.PercentOutput, 0);
    	rightFrontMotor.set(ControlMode.PercentOutput, 0);
    }
    
    
    public void MotionMagicInit(double distance) {
    	MotionMagicDistance = distance;
    	leftFrontMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, MotionMagicPIDIndex, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, MotionMagicPIDIndex, RobotMap.TIMEOUT_MS);
    	
    	leftFrontMotor.selectProfileSlot(MotionMagicPIDSlot, MotionMagicPIDIndex);
    	rightFrontMotor.selectProfileSlot(MotionMagicPIDSlot, MotionMagicPIDIndex);
    	
    	leftFrontMotor.config_kP(0, MotionMagicP, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.config_kI(0, MotionMagicI, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.config_kD(0, MotionMagicD, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.config_kF(0, MotionMagicF, RobotMap.TIMEOUT_MS);
    	
    	rightFrontMotor.config_kP(0, MotionMagicP, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.config_kI(0, MotionMagicI, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.config_kD(0, MotionMagicD, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.config_kF(0, MotionMagicF, RobotMap.TIMEOUT_MS);
    	
    	leftFrontMotor.configMotionAcceleration(MotionMagicAcceleration, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.configMotionCruiseVelocity(MotionMagicVelocity, RobotMap.TIMEOUT_MS);
    	
    	rightFrontMotor.configMotionAcceleration(MotionMagicAcceleration, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.configMotionCruiseVelocity(MotionMagicVelocity, RobotMap.TIMEOUT_MS);
    	
    	leftFrontMotor.setSelectedSensorPosition(0, MotionMagicPIDIndex, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.setSelectedSensorPosition(0, MotionMagicPIDIndex, RobotMap.TIMEOUT_MS);
    	
    	MotionMagicDistance *= TICKS_PER_FOOT;
    	leftFrontMotor.set(ControlMode.MotionMagic, MotionMagicDistance);
    	rightFrontMotor.set(ControlMode.MotionMagic, MotionMagicDistance);
    }
    
    public boolean isAtPIDDestination() {
		return (Math.abs(this.leftFrontMotor.getSelectedSensorPosition(MotionMagicPIDIndex) - MotionMagicDistance) < 500);// || this.leftFrontMotor.getSelectedSensorPosition(MotionMagicPIDIndex) < -MotionMagicDistance + 6000)
	}
    
    public void initSpeedMode() {    	
    	leftFrontMotor.set(ControlMode.Velocity, 0);
    	rightFrontMotor.set(ControlMode.Velocity, 0);
    	
    	leftFrontMotor.config_kP(1, speedP, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.config_kI(1, speedI, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.config_kD(1, speedD, RobotMap.TIMEOUT_MS);
    	leftFrontMotor.config_kF(1, speedF, RobotMap.TIMEOUT_MS);

    	rightFrontMotor.config_kP(1, speedP, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.config_kI(1, speedI, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.config_kD(1, speedD, RobotMap.TIMEOUT_MS);
    	rightFrontMotor.config_kF(1, speedF, RobotMap.TIMEOUT_MS);
    	
    	leftFrontMotor.selectProfileSlot(1, 0);
    	rightFrontMotor.selectProfileSlot(1, 0);
    }
    
    public void setSpeedPID(double setSpeed) {
		leftFrontMotor.set(ControlMode.Velocity, MAX_TICKS_PER_SECOND * setSpeed);
		rightFrontMotor.set(ControlMode.Velocity, MAX_TICKS_PER_SECOND * setSpeed);
		SmartDashboard.putNumber("Current", getCurrent());
	}
    
    public double getCurrent() {
		return leftFrontMotor.getOutputCurrent();
	}
    
    public double getYaw() {
    	return ahrs.getYaw();
    }
    
    public void writeDashboardValues() {
    	SmartDashboard.putBoolean("Inverted",isReversed);
    }
}

