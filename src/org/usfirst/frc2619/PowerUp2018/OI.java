// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2619.PowerUp2018;

import org.usfirst.frc2619.PowerUp2018.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton overrideSpeedQuarterBtn;
    public JoystickButton overrideSpeedHalfBtn;
    public Joystick leftJoystick;
    public JoystickButton invertDriveBtn;
    public JoystickButton lockStraightBtn;
    public JoystickButton shiftLowBtn;
    public JoystickButton shiftHighBtn;
    public JoystickButton climbDownBtn;
    public Joystick rightJoystick;
    public JoystickButton runCollectorReverseFastBtn;
    public JoystickButton lowerShoulderAndCollectBtn;
    public JoystickButton raiseShoulderAndStopCollectBtn;
    public JoystickButton openClawBtn;
    public JoystickButton closeClawBtn;
    public JoystickButton stopCollectorBtn;
    public JoystickButton runCollectorReverseSlowBtn;
    public JoystickButton overrideUpBtn;
    public JoystickButton stopElevatorUpBtn;
    public JoystickButton overrideDownBtn;
    public JoystickButton stopOverrideDown;
    public JoystickButton raiseShoulderBtn;
    public JoystickButton lowerShoulderBtn;
    public JoystickButton elevateToMaxBtn;
    public JoystickButton elevateToMinBtn;
    public JoystickButton elevateToSwitchBtn;
    public JoystickButton climbUpBtn;
    public JoystickButton elevateToScaleBtn;
    public Joystick buttonBox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        buttonBox = new Joystick(2);
        
        elevateToScaleBtn = new JoystickButton(buttonBox, 9);
        elevateToScaleBtn.whenPressed(new ElevateToXPositionMotionMagic(0.75));
        climbUpBtn = new JoystickButton(buttonBox, 7);
        climbUpBtn.whileHeld(new ClimbUp());
        elevateToSwitchBtn = new JoystickButton(buttonBox, 10);
        elevateToSwitchBtn.whenPressed(new ElevateToXPositionMotionMagic(0.4));
        elevateToMinBtn = new JoystickButton(buttonBox, 12);
        elevateToMinBtn.whenPressed(new ElevateToXPositionMotionMagic(0.13));
        elevateToMaxBtn = new JoystickButton(buttonBox, 11);
        elevateToMaxBtn.whenPressed(new ElevateToXPositionMotionMagic(1));
        lowerShoulderBtn = new JoystickButton(buttonBox, 3);
        lowerShoulderBtn.whenPressed(new LowerShoulder());
        raiseShoulderBtn = new JoystickButton(buttonBox, 3);
        raiseShoulderBtn.whenReleased(new RaiseShoulder());
        stopOverrideDown = new JoystickButton(buttonBox, 4);
        stopOverrideDown.whenReleased(new StopElevator());
        overrideDownBtn = new JoystickButton(buttonBox, 4);
        overrideDownBtn.whenPressed(new OverrideElevator(-0.1));
        stopElevatorUpBtn = new JoystickButton(buttonBox, 6);
        stopElevatorUpBtn.whenReleased(new StopElevator());
        overrideUpBtn = new JoystickButton(buttonBox, 6);
        overrideUpBtn.whenPressed(new OverrideElevator(0.5));
        runCollectorReverseSlowBtn = new JoystickButton(buttonBox, 5);
        runCollectorReverseSlowBtn.whenPressed(new RunCollector(-0.13));
        stopCollectorBtn = new JoystickButton(buttonBox, 2);
        stopCollectorBtn.whenReleased(new StopCollector());
        closeClawBtn = new JoystickButton(buttonBox, 8);
        closeClawBtn.whenReleased(new CloseClaw());
        openClawBtn = new JoystickButton(buttonBox, 8);
        openClawBtn.whenPressed(new OpenClaw());
        raiseShoulderAndStopCollectBtn = new JoystickButton(buttonBox, 2);
        raiseShoulderAndStopCollectBtn.whenReleased(new RaiseShoulder());
        lowerShoulderAndCollectBtn = new JoystickButton(buttonBox, 2);
        lowerShoulderAndCollectBtn.whenPressed(new LowerShoulderAndCollect());
        runCollectorReverseFastBtn = new JoystickButton(buttonBox, 1);
        runCollectorReverseFastBtn.whenPressed(new RunCollector(-.65));
        rightJoystick = new Joystick(1);
        
        climbDownBtn = new JoystickButton(rightJoystick, 7);
        climbDownBtn.whileHeld(new ClimbDown());
        shiftHighBtn = new JoystickButton(rightJoystick, 6);
        shiftHighBtn.whenPressed(new ShiftHigh());
        shiftLowBtn = new JoystickButton(rightJoystick, 4);
        shiftLowBtn.whenPressed(new ShiftLow());
        lockStraightBtn = new JoystickButton(rightJoystick, 5);
        lockStraightBtn.whenPressed(new ToggleLockStraight());
        invertDriveBtn = new JoystickButton(rightJoystick, 2);
        invertDriveBtn.whenPressed(new InvertDrive());
        leftJoystick = new Joystick(0);
        
        overrideSpeedHalfBtn = new JoystickButton(leftJoystick, 1);
        overrideSpeedHalfBtn.whileHeld(new OverrideSpeedHalf());
        overrideSpeedQuarterBtn = new JoystickButton(leftJoystick, 6);
        overrideSpeedQuarterBtn.whenPressed(new OverrideSpeedQuarter());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("BrakeOff", new BrakeOff());
        SmartDashboard.putData("BrakeOn", new BrakeOn());
        SmartDashboard.putData("CloseClaw", new CloseClaw());
        SmartDashboard.putData("InvertDrive", new InvertDrive());
        SmartDashboard.putData("LowerShoulder", new LowerShoulder());
        SmartDashboard.putData("OpenClaw", new OpenClaw());
        SmartDashboard.putData("OverrideElevator: 0.5", new OverrideElevator(0.5));
        SmartDashboard.putData("OverrideSpeedQuarter", new OverrideSpeedQuarter());
        SmartDashboard.putData("RaiseShoulder", new RaiseShoulder());
        SmartDashboard.putData("ShiftHigh", new ShiftHigh());
        SmartDashboard.putData("ShiftLow", new ShiftLow());
        SmartDashboard.putData("TankDrive", new TankDrive());
        SmartDashboard.putData("ToggleLockStraight", new ToggleLockStraight());
        SmartDashboard.putData("DriveXFeetMotionMagic: Feet5", new DriveXFeetMotionMagic(5));
        SmartDashboard.putData("DriveXFeetMotionMagic: Feet10", new DriveXFeetMotionMagic(10));
        SmartDashboard.putData("DriveXFeetMotionMagic: Feet20", new DriveXFeetMotionMagic(20));
        SmartDashboard.putData("DriveToCurrent: 0.1 Speed", new DriveToCurrent(0.1, 10));
        SmartDashboard.putData("StationOneScale", new StationOneScale());
        SmartDashboard.putData("StationThreeScale", new StationThreeScale());
        SmartDashboard.putData("StationOneSwitch", new StationOneSwitch());
        SmartDashboard.putData("StationTwoSwitch", new StationTwoSwitch());
        SmartDashboard.putData("StationThreeSwitch", new StationThreeSwitch());
        SmartDashboard.putData("StationOneLeftSwitch", new StationOneLeftSwitch());
        SmartDashboard.putData("StationOneRightSwitch", new StationOneRightSwitch());
        SmartDashboard.putData("StationOneLeftScale", new StationOneLeftScale());
        SmartDashboard.putData("StationOneRightScale", new StationOneRightScale());
        SmartDashboard.putData("StationTwoLeftSwitch", new StationTwoLeftSwitch());
        SmartDashboard.putData("StationTwoRightSwitch", new StationTwoRightSwitch());
        SmartDashboard.putData("StationThreeLeftSwitch", new StationThreeLeftSwitch());
        SmartDashboard.putData("StationThreeRightSwitch", new StationThreeRightSwitch());
        SmartDashboard.putData("StationThreeLeftScale", new StationThreeLeftScale());
        SmartDashboard.putData("StationThreeRightScale", new StationThreeRightScale());
        SmartDashboard.putData("TurnNDegreesAbsolutePID: 90", new TurnNDegreesAbsolutePID(90));
        SmartDashboard.putData("TurnNDegreesAbsolutePID: 180", new TurnNDegreesAbsolutePID(180));
        SmartDashboard.putData("TurnNDegreesAbsolutePID: -90", new TurnNDegreesAbsolutePID(-90));
        SmartDashboard.putData("TurnNDegreesAbsolutePID: 0", new TurnNDegreesAbsolutePID(0));
        SmartDashboard.putData("AutonomousTextFirstChar", new AutonomousTextFirstChar());
        SmartDashboard.putData("AutonomousTextLeftLeft", new AutonomousTextLeftLeft());
        SmartDashboard.putData("AutonomousTextLeftRight", new AutonomousTextLeftRight());
        SmartDashboard.putData("AutonomousTextRightLeft", new AutonomousTextRightLeft());
        SmartDashboard.putData("AutonomousTextRightRight", new AutonomousTextRightRight());
        SmartDashboard.putData("AutonomousTextLeftSecondChar", new AutonomousTextLeftSecondChar());
        SmartDashboard.putData("AutonomousTextRightSecondChar", new AutonomousTextRightSecondChar());
        SmartDashboard.putData("ClawAndCollector", new ClawAndCollector());
        SmartDashboard.putData("WaitNSeconds: 0", new WaitNSeconds(0));
        SmartDashboard.putData("ElevateXSeconds: halfSecond", new ElevateXSeconds(0.5));
        SmartDashboard.putData("ElevateXSeconds: oneSecond", new ElevateXSeconds(1));
        SmartDashboard.putData("ElevateXSeconds: 1.2sec", new ElevateXSeconds(1.2));
        SmartDashboard.putData("RaiseElevatorAndShoulder", new RaiseElevatorAndShoulder());
        SmartDashboard.putData("LowerShoulderAndCollect", new LowerShoulderAndCollect());
        SmartDashboard.putData("RaiseShoulderAndStopCollect", new RaiseShoulderAndStopCollect());
        SmartDashboard.putData("StopCollector", new StopCollector());
        SmartDashboard.putData("RunCollector: Forward", new RunCollector(0.5));
        SmartDashboard.putData("RunCollector: ReverseFast", new RunCollector(-0.5));
        SmartDashboard.putData("RunCollector: ReverseSlow", new RunCollector(-0.37));
        SmartDashboard.putData("StopElevator", new StopElevator());
        SmartDashboard.putData("ElevateToXPositionMotionMagic: max", new ElevateToXPositionMotionMagic(1));
        SmartDashboard.putData("ElevateToXPositionMotionMagic: min", new ElevateToXPositionMotionMagic(0));
        SmartDashboard.putData("ElevateToXPositionMotionMagic: switch", new ElevateToXPositionMotionMagic(0.3));
        SmartDashboard.putData("OverrideSpeedHalf", new OverrideSpeedHalf());
        SmartDashboard.putData("ClimbUp", new ClimbUp());
        SmartDashboard.putData("CheckCube", new CheckCube());
        SmartDashboard.putData("ClimbDown", new ClimbDown());
        SmartDashboard.putData("Drive7Feet", new Drive7Feet());
        SmartDashboard.putData("StationThreeRightSwitchOnly", new StationThreeRightSwitchOnly());
        //SmartDashboard.putData("StationThreeRightScaleOnly", new StationThreeRightScaleOnly());
        //SmartDashboard.putData("StationOneLeftSwitchOnly", new StationOneLeftSwitchOnly());
       // SmartDashboard.putData("StationOneLeftScaleOnly", new StationOneLeftScaleOnly());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS*/
	/*SmartDashboard.putNumber("Deadband", .1);
		SmartDashboard.putNumber("Root", 1);
		SmartDashboard.putNumber("Power", 3);*/
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getButtonBox() {
        return buttonBox;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

