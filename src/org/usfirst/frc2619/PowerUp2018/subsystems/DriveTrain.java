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

import org.usfirst.frc2619.PowerUp2018.RobotMap;
import org.usfirst.frc2619.PowerUp2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
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
    
	private final int MAX_TICKS_PER_SECOND = 8691;
    public final double TICKS_PER_FOOT = 4420;
    
    public double MotionMagicP = 2;
    public double MotionMagicI = 0.001;
    public double MotionMagicD = 0;
    public double MotionMagicF = 0.72;
    public int MotionMagicAcceleration = 4000;
    public int MotionMagicVelocity = 11000;
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
    
    public void run(double leftSpeed, double rightSpeed) {
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
}

