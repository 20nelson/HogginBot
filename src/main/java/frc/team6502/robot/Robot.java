package frc.team6502.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

    /*
      ____       _           _      _
     |  _ \ ___ | |__   ___ | |_   (_) __ ___   ____ _
     | |_) / _ \| '_ \ / _ \| __|  | |/ _` \ \ / / _` |
     |  _ < (_) | |_) | (_) | |_ _ | | (_| |\ V / (_| |
     |_| \_\___/|_.__/ \___/ \__(_)/ |\__,_| \_/ \__,_|
                                 |__/
     */

    @Override
    public void robotInit() {

    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() { }
}