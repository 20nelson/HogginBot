package frc.team6502.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    /*
       ___ ___    _
      / _ \_ _|  (_) __ ___   ____ _
     | | | | |   | |/ _` \ \ / / _` |
     | |_| | | _ | | (_| |\ V / (_| |
      \___/___(_)/ |\__,_| \_/ \__,_|
               |__/
     */

    public static Joystick joystick = new Joystick(0);

    private static final double Y_THRESHOLD = 0.1;
    private static final double T_THRESHOLD = 0.1;

    public static double getY(){
        if(Math.abs(joystick.getY()) > Y_THRESHOLD){
            return joystick.getY();
        } else {
            return 0;
        }
    }

    public static double getT(){
        if(Math.abs(joystick.getTwist()) > T_THRESHOLD){
            return joystick.getTwist();
        } else {
            return 0;
        }
    }

}
