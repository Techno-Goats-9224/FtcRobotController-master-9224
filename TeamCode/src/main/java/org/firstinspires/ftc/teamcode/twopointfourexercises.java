package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;



@TeleOp(name="Basic: Iterative OpMode", group="Iterative Opmode")

public class twopointfourexercises extends OpMode
{

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {

    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */

    @Override
    public void init_loop() {

    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {

    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    double fs;
    double ss;
    @Override
    public void loop() {
            if (gamepad1.b == false) {
                fs = gamepad1.left_stick_y;
                ss = gamepad1.left_stick_x;
            } else {
                fs = gamepad1.left_stick_x;
                ss = gamepad1.left_stick_y;
            }
                telemetry.addData("Forward speed", fs);
                telemetry.addData("Side speed", ss);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }

}
