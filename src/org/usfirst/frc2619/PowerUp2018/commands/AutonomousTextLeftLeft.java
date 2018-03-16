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

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc2619.PowerUp2018.subsystems.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;
import java.io.File;

/**
 *
 */
public class AutonomousTextLeftLeft extends CommandGroup {


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
    public AutonomousTextLeftLeft() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS
    	boolean fileRead = false;
    	addSequential(new ShiftLow());
    	try {
    		File fi = new File("/home/lvuser/pygameLL.txt");
			Scanner reader = new Scanner(new FileReader(fi));
			while(reader.hasNext()) {
				String line = reader.nextLine();
				if ((line != null)&&(line.length()>=3)) {
					fileRead = true;
					if (line.charAt(0) == '0') {
						if (line.charAt(2) == '0') {
							addSequential(new DriveXFeetMotionMagic(Double.parseDouble(line.substring(4))));
						}
						else if (line.charAt(2) == '2') {
							addSequential(new RunCollector(-.37));
						}
						else if (line.charAt(2) == '3') {
							if (line.charAt(4) == '1') {
								addSequential(new DriveToCurrent(.07, 1));
							}
							else {
								addSequential(new DriveToCurrent(.2, 5));
							}
						}
						else if (line.charAt(2) == '4') {
							addSequential(new TurnNDegreesAbsolutePID(Double.parseDouble(line.substring(4))));
						
						}
						else {
							addSequential(new WaitNSeconds(Double.parseDouble(line.substring(4))));
						}
					}
					else {
						if (line.charAt(4) == '2') {
					    	addParallel(new BrakeOff());
					    	addSequential(new LowerShoulder());
					    	addSequential(new ElevateXSeconds(0.8));						}
						else {
					    	addParallel(new BrakeOff());
					    	addSequential(new LowerShoulder());
							//addParallel(new ElevateToXPos(4));
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (!fileRead) {
				addSequential(new DriveXFeetMotionMagic(5));
			}
		}
    	
    } 
}
