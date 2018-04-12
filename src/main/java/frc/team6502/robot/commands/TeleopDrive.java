package frc.team6502.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team6502.robot.OI;
import frc.team6502.robot.RobotMap;

public class TeleopDrive extends Command {

    @Override
    protected void initialize() {
        requires(RobotMap.kDrivetrain);
    }

    @Override
    protected void execute() {
        RobotMap.kDrivetrain.drive(OI.getY(), OI.getT());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }
}
