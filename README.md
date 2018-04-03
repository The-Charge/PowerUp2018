# PowerUp2018
Code used during the 2018 Power Up Competitions

# Code Structure
Each function of the robot is assigned a subsystem. These subsystems contain all of the logic necessary to control that aspect of the robot. Commands are created to execute a specific function immediately or over a period of time. These commands require the subsystem that they act on.

# Subsystems
Each subsystem controls a specific function of the robot.  
	- **Claw**  
	 		Controls the pneumatic part of the claw.  
	- **Climber**  
	 		Enables the robot to climb on a small metal rod.  
	- **Collector**  
			Controls the wheels present inside the claw for one side.
	- **CubeSensor**  
			Senes cubes for easy pick-up
	- **DriveTrain**  
		  	Controls drive train (the wheels of the robot)
	- **Elevator**  
			Controls the elevator which transports the cubes up and down.  
	- **ReverseCollector**  
			Controls the wheels present inside the claw for the other side.
	- **Shifters**  
			Shift between high gear and low gear.  
	- **Shoulder**  
			Behaves like a mechanical shoulder. 
# Commands
Each command performs a simple event of a subsystem.
	
	- *AutonomousCommand.java*  
		Starts the autonomous code.
	- *AutonomousTextFirstChar.java*  
		Works with Pygame to provide exact values for autonomous path.
	- *AutonomousTextLeftLeft.java*  
		Works with Pygame to provide exact values for autonomous path.
	- *AutonomousTextLeftRight.java*  
	 	Works with Pygame to provide exact values for autonomous path.
	- *AutonomousTextLeftSecondChar.java*  
		Works with Pygame to provide exact values for autonomous path.	 
	- *AutonomousTextRightLeft.java*  
		Works with Pygame to provide exact values for autonomous path.
	- *AutonomousTextRightRight.java*  
		Works with Pygame to provide exact values for autonomous path.	  
	- *AutonomousTextRightSecondChar.java*  
		Works with Pygame to provide exact values for autonomous path.	  
	- *BrakeOff.java*  
		Sets the brakes on the elevator.
	- *BrakeOn.java*  
	  	Removes the brakes from the elevator.
	- *CheckCube.java*  
	  	Checks for a cube.
	- *ClawAndCollector.java*  
	 	Closes claw and runs the collector.
	- *ClimbDown.java*  
	  	Climbs down the metal rod.
	- *ClimbUp.java*  
		Climbs up the rod.
	- *CloseClaw.java*  
		Closes claw to secure the cube.
	- *DriveToCurrent.java*  
		Drives straight until it gets a current higher than specified value.
	- *DriveXFeetMotionMagic.java*  
		Drives X feet using Motion Magic
	- *ElevateToXPositionMotionMagic.java*  
		Elevates the cube to X position using Motion Magic.
	- *ElevateXSeconds.java*  
	 	Elevates the cube for X seconds.
	- *InvertDrive.java*  
	 	Reverses/inverts the drive train.
	- *LowerShoulder.java*  
		Lowers the shoulder.
	- *LowerShoulderAndCollect.java*  
	 	Lowers the shoulder and runs the collector.
	- *OpenClaw.java*  
 		Opens claw to take in a cube.
	- *OverrideElevator.java*  
	 	Overrides elevator's present action and elevates.
	- *OverrideSpeedHalf.java*  
		Overrides the drive train's present speed and sets it to it's half.
	- *OverrideSpeedQuarter.java*  
	 	Overrides the drive train's present speed and sets it to it's quarter.
	- *RaiseElevatorAndShoulder.java*  
		Raises elevator and shoulder.
	- *RaiseShoulder.java*  
		Raises the shoulder only.
	- *RaiseShoulderAndStopCollect.java*  
		Raises shoulder and stops the collector.
	- *RunCollector.java*  
		Runs the collector (makes the wheels move).
	- *ShiftHigh.java*  
		Shifts to high gear.
	- *ShiftLow.java*  
		Shifts to low gear.
	- *StationOneLeftScale.java*  
		Preset for auton when beginning at station one and aiming for left scale.  
	- *StationOneLeftSwitch.java*  
		Preset for auton when beginning at station one and aiming for left switch.  
	- *StationOneRightScale.java*  
		Preset for auton when beginning at station one and aiming for right scale. 
	- *StationOneRightSwitch.java*  
		Preset for auton when beginning at station one and aiming for right switch.  
	- *StationOneScale.java*  
		Preset for auton when beginning at station one and aiming for scale.  
	- *StationOneSwitch.java*  
		Preset for auton when beginning at station one and aiming for switch. 
	- *StationThreeLeftScale.java*  
		Preset for auton when beginning at station three and aiming for left scale. 
	- *StationThreeLeftSwitch.java  
		Preset for auton when beginning at station three and aiming for left switch.  
	- *StationThreeRightScale.java*  
		Preset for auton when beginning at station three and aiming for right scale.  
	- *StationThreeRightSwitch.java*  
		Preset for auton when beginning at station three and aiming for right switch.  
	- *StationThreeScale.java*  
		Preset for auton when beginning at station three and aiming for scale. 
	- *StationThreeSwitch.java*  
		Preset for auton when beginning at station three and aiming for switch. 
	- *StationTwoLeftSwitch.java*  
		Preset for auton when beginning at station two and aiming for left switch.  
	- *StationTwoRightSwitch.java*  
		Preset for auton when beginning at station two and aiming for right switch. 
	- *StationTwoSwitch.java*  
		Preset for auton when beginning at station two and aiming for left switch. 
	- *StopCollector.java*  
		Stops collector. 
	- *StopElevator.java*  
		Stops elevator.  
	- *TankDrive.java*  
	 	Enables robot to drive like a tank.
	- *ToggleLockStraight.java*  
		Makes the robot go straight.
	- *TurnNDegreesAbsolutePID.java*  
		Enables robot to turn N degrees absolute.
	- *WaitNSeconds.java*
		Waits for N seconds and does nothing.
		  
