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
    public Joystick leftJoystick;
    public JoystickButton lockStraightBtn;
    public JoystickButton invertDriveBtn;
    public JoystickButton shiftLowBtn;
    public JoystickButton shiftHighBtn;
    public JoystickButton overrideSpeedBtn;
    public Joystick rightJoystick;
    public JoystickButton openClawBtn;
    public JoystickButton closeClawBtn;
    public JoystickButton elevateToZeroBtn;
    public JoystickButton elevateToOneBtn;
    public JoystickButton elevateToTwoBtn;
    public JoystickButton elevateToThreeBtn;
    public JoystickButton elevateToFourBtn;
    public JoystickButton elevateToFiveBtn;
    public JoystickButton elevateToSixBtn;
    public JoystickButton runCollectorForwardBtn;
    public JoystickButton runCollectorReverseFastBtn;
    public JoystickButton runCollectorReverseSlowBtn;
    public JoystickButton overrideUpBtn;
    public JoystickButton overrideDownBtn;
    public JoystickButton raiseShoulderBtn;
    public JoystickButton lowerShoulderBtn;
    public Joystick buttonBox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        buttonBox = new Joystick(2);
        
        lowerShoulderBtn = new JoystickButton(buttonBox, 16);
        lowerShoulderBtn.whenPressed(new LowerShoulder());
        raiseShoulderBtn = new JoystickButton(buttonBox, 15);
        raiseShoulderBtn.whenPressed(new RaiseShoulder());
        overrideDownBtn = new JoystickButton(buttonBox, 14);
        overrideDownBtn.whileHeld(new OverrideElevator(false));
        overrideUpBtn = new JoystickButton(buttonBox, 13);
        overrideUpBtn.whileHeld(new OverrideElevator(true));
        runCollectorReverseSlowBtn = new JoystickButton(buttonBox, 12);
        runCollectorReverseSlowBtn.whileHeld(new RunCollectorReverse(-.025));
        runCollectorReverseFastBtn = new JoystickButton(buttonBox, 11);
        runCollectorReverseFastBtn.whileHeld(new RunCollectorReverse(-.05));
        runCollectorForwardBtn = new JoystickButton(buttonBox, 10);
        runCollectorForwardBtn.whenPressed(new RunCollectorForward());
        elevateToSixBtn = new JoystickButton(buttonBox, 9);
        elevateToSixBtn.whenPressed(new ElevateToXPos(6));
        elevateToFiveBtn = new JoystickButton(buttonBox, 8);
        elevateToFiveBtn.whenPressed(new ElevateToXPos(5));
        elevateToFourBtn = new JoystickButton(buttonBox, 7);
        elevateToFourBtn.whenPressed(new ElevateToXPos(4));
        elevateToThreeBtn = new JoystickButton(buttonBox, 6);
        elevateToThreeBtn.whenPressed(new ElevateToXPos(3));
        elevateToTwoBtn = new JoystickButton(buttonBox, 5);
        elevateToTwoBtn.whenPressed(new ElevateToXPos(2));
        elevateToOneBtn = new JoystickButton(buttonBox, 4);
        elevateToOneBtn.whenPressed(new ElevateToXPos(1));
        elevateToZeroBtn = new JoystickButton(buttonBox, 3);
        elevateToZeroBtn.whenPressed(new ElevateToXPos(0));
        closeClawBtn = new JoystickButton(buttonBox, 2);
        closeClawBtn.whenPressed(new CloseClaw());
        openClawBtn = new JoystickButton(buttonBox, 1);
        openClawBtn.whenPressed(new OpenClaw());
        rightJoystick = new Joystick(1);
        
        overrideSpeedBtn = new JoystickButton(rightJoystick, 6);
        overrideSpeedBtn.whenPressed(new OverrideSpeed());
        shiftHighBtn = new JoystickButton(rightJoystick, 4);
        shiftHighBtn.whenPressed(new ShiftHigh());
        shiftLowBtn = new JoystickButton(rightJoystick, 3);
        shiftLowBtn.whenPressed(new ShiftLow());
        invertDriveBtn = new JoystickButton(rightJoystick, 2);
        invertDriveBtn.whenPressed(new InvertDrive());
        lockStraightBtn = new JoystickButton(rightJoystick, 5);
        lockStraightBtn.whenPressed(new ToggleLockStraight());
        leftJoystick = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("CloseClaw", new CloseClaw());
        SmartDashboard.putData("ElevateToXPos: Elevate to 0", new ElevateToXPos(0));
        SmartDashboard.putData("ElevateToXPos: Elevate to 1", new ElevateToXPos(1));
        SmartDashboard.putData("ElevateToXPos: Elevate to 2", new ElevateToXPos(2));
        SmartDashboard.putData("ElevateToXPos: Elevate to 3", new ElevateToXPos(3));
        SmartDashboard.putData("ElevateToXPos: Elevate to 4", new ElevateToXPos(4));
        SmartDashboard.putData("ElevateToXPos: Elevate to 5", new ElevateToXPos(5));
        SmartDashboard.putData("ElevateToXPos: Elevate to 6", new ElevateToXPos(6));
        SmartDashboard.putData("InvertDrive", new InvertDrive());
        SmartDashboard.putData("LowerShoulder", new LowerShoulder());
        SmartDashboard.putData("OpenClaw", new OpenClaw());
        SmartDashboard.putData("OverrideElevator: Up", new OverrideElevator(true));
        SmartDashboard.putData("OverrideElevator: Down", new OverrideElevator(false));
        SmartDashboard.putData("OverrideSpeed", new OverrideSpeed());
        SmartDashboard.putData("RaiseShoulder", new RaiseShoulder());
        SmartDashboard.putData("RunCollectorForward", new RunCollectorForward());
        SmartDashboard.putData("RunCollectorReverse: fast", new RunCollectorReverse(-.37));
        SmartDashboard.putData("RunCollectorReverse: slow", new RunCollectorReverse(-.20));
        SmartDashboard.putData("SenseCube", new SenseCube());
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
        SmartDashboard.putData("StartElevator", new StartElevator());
        SmartDashboard.putData("ClawAndCollector", new ClawAndCollector());
        SmartDashboard.putData("WaitNSeconds", new WaitNSeconds(0));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		SmartDashboard.putNumber("Deadband", .1);
		SmartDashboard.putNumber("Root", 1);
		SmartDashboard.putNumber("Power", 3);
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

