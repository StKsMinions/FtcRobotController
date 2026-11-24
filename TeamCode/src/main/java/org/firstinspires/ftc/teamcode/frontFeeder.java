package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class frontFeeder {
    private DcMotor feederMotor;

    public frontFeeder(HardwareMap hwMap) {
        // Declare our motors
        // Make sure your ID's match your configuration
        feederMotor = hwMap.dcMotor.get("test");
    }

    public void activateCollection(){
        feederMotor.setPower(1);
    }
}

