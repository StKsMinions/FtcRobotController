package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class Tele_Op extends LinearOpMode {
    driveTrain drive_train;
    frontFeeder feeder;

    @Override
    public void runOpMode() throws InterruptedException {
//        drive_train = new driveTrain(hardwareMap);
        feeder = new frontFeeder(hardwareMap);
        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {

//            double y = -gamepad1.left_stick_y; // Remember, Y stick value is reversed
//            double x = gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
//            double rx = gamepad1.right_stick_x;
//            drive_train.moverobot(y, x, rx);
            boolean rightBumper = gamepad1.right_bumper;
            if (rightBumper){
                feeder.activateCollection();
            }
        }
    }

}