package frc.team6502.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team6502.robot.OI;
import frc.team6502.robot.Robot;
import frc.team6502.robot.RobotMap;
import frc.team6502.robot.commands.TeleopDrive;

public class Drivetrain extends Subsystem {

    /*
      ____       _           _             _          _
     |  _ \ _ __(_)_   _____| |_ _ __ __ _(_)_ __    (_) __ ___   ____ _
     | | | | '__| \ \ / / _ \ __| '__/ _` | | '_ \   | |/ _` \ \ / / _` |
     | |_| | |  | |\ V /  __/ |_| | | (_| | | | | |_ | | (_| |\ V / (_| |
     |____/|_|  |_| \_/ \___|\__|_|  \__,_|_|_| |_(_)/ |\__,_| \_/ \__,_|
                                                   |__/
     */

    private DifferentialDrive diff;

    private Spark leftSpark0;
    private Spark leftSpark1;
    private Spark rightSpark0;
    private Spark rightSpark1;

    private SpeedControllerGroup leftSparks;
    private SpeedControllerGroup rightSparks;

    public Drivetrain(){
        leftSpark0 = new Spark(RobotMap.leftDriveEscs[0]);
        leftSpark1 = new Spark(RobotMap.leftDriveEscs[1]);
        leftSparks = new SpeedControllerGroup(leftSpark0,leftSpark1);

        rightSpark0 = new Spark(RobotMap.rightDriveEscs[0]);
        rightSpark1 = new Spark(RobotMap.rightDriveEscs[1]);
        rightSparks = new SpeedControllerGroup(rightSpark0,rightSpark1);

        diff = new DifferentialDrive(leftSparks, rightSparks);
    }

    public void drive(double speed, double rotation){
        diff.arcadeDrive(speed, rotation);
    }

    @Override
    protected void initDefaultCommand() {
        new TeleopDrive().start();
    }
}
