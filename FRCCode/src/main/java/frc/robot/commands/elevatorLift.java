// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Robot;
//import frc.robot.subsystems.Elevator;
//import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class elevatorLift extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public elevatorLift() {
    super();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.Elevator);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    boolean aPressed = Robot.driver.getAButton();
    boolean yPressed = Robot.driver.getYButton();

    if(aPressed){
      Robot.Elevator.lift(-0.3);
      System.out.println("A was pressed");
    }
    else if (yPressed) {
      System.out.println("Y was pressed");
      Robot.Elevator.lift(0.3);
    }
    else{
      System.out.println("Nothing was pressed");
      Robot.Elevator.lift(0);
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
