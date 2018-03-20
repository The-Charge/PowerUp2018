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
import edu.wpi.first.wpilibj.SPI.Port;
import com.kauailabs.navx.frc.AHRS;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Solenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveTrainLeftFrontMotor;
    public static WPI_TalonSRX driveTrainLeftRearMotor;
    public static WPI_TalonSRX driveTrainRightFrontMotor;
    public static WPI_TalonSRX driveTrainRightRearMotor;
    public static AnalogGyro driveTrainDoNotUse;
    public static Solenoid shiftersSolenoid;
    public static Solenoid clawSolenoid;
    public static WPI_TalonSRX elevatorMotor;
    public static Solenoid elevatorBrakes;
    public static Encoder collectorEncoder;
    public static WPI_TalonSRX collectorMotor;
    public static Encoder reverseCollectorEncoder;
    public static WPI_TalonSRX reverseCollectorMotor;
    public static DigitalInput cubeSensorDigitalInput;
    public static DoubleSolenoid shoulderDoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static final int TIMEOUT_MS = 10;
	
    public static AHRS driveTrainAHRS;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFrontMotor = new WPI_TalonSRX(11);
        
        
        driveTrainLeftRearMotor = new WPI_TalonSRX(10);
        
        
        driveTrainRightFrontMotor = new WPI_TalonSRX(2);
        
        
        driveTrainRightRearMotor = new WPI_TalonSRX(3);
        
        
        driveTrainDoNotUse = new AnalogGyro(0);
        LiveWindow.addSensor("DriveTrain", "DoNotUse", driveTrainDoNotUse);
        driveTrainDoNotUse.setSensitivity(0.007);
        shiftersSolenoid = new Solenoid(0, 0);
        LiveWindow.addActuator("Shifters", "Solenoid", shiftersSolenoid);
        
        clawSolenoid = new Solenoid(0, 2);
        LiveWindow.addActuator("Claw", "Solenoid", clawSolenoid);
        
        elevatorMotor = new WPI_TalonSRX(5);
        
        
        elevatorBrakes = new Solenoid(0, 1);
        LiveWindow.addActuator("Elevator", "Brakes", elevatorBrakes);
        
        collectorEncoder = new Encoder(5, 6, false, EncodingType.k1X);
        LiveWindow.addSensor("Collector", "Encoder", collectorEncoder);
        collectorEncoder.setDistancePerPulse(1.0);
        collectorEncoder.setPIDSourceType(PIDSourceType.kRate);
        collectorMotor = new WPI_TalonSRX(7);
        
        
        reverseCollectorEncoder = new Encoder(2, 3, false, EncodingType.k1X);
        LiveWindow.addSensor("ReverseCollector", "Encoder", reverseCollectorEncoder);
        reverseCollectorEncoder.setDistancePerPulse(1.0);
        reverseCollectorEncoder.setPIDSourceType(PIDSourceType.kRate);
        reverseCollectorMotor = new WPI_TalonSRX(6);
        
        
        cubeSensorDigitalInput = new DigitalInput(7);
        LiveWindow.addSensor("CubeSensor", "DigitalInput", cubeSensorDigitalInput);
        
        shoulderDoubleSolenoid = new DoubleSolenoid(0, 3, 4);
        LiveWindow.addActuator("Shoulder", "DoubleSolenoid", shoulderDoubleSolenoid);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftRearMotor.follow(driveTrainLeftFrontMotor);
        driveTrainRightRearMotor.follow(driveTrainRightFrontMotor);
        //elevatorMotor.setInverted(true);
        //elevatorFollowerMotor.setInverted(true);
        driveTrainRightFrontMotor.setInverted(true);
        driveTrainRightRearMotor.setInverted(true);
        reverseCollectorMotor.setInverted(true);
        //reverseCollectorEncoder.setReverseDirection(true);
        collectorEncoder.setReverseDirection(true);
        
        driveTrainAHRS = new AHRS(Port.kMXP);
    }
}
