package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Mini-Challenge", group="Mini-Challenge")
public class DriveMode extends OpMode {
    private DcMotor leftMotorBack;
    private DcMotor rightMotorFront;
    private DcMotor leftMotorFront;
    private DcMotor rightMotorBack;

    @Override
    public void init() {
        leftMotorBack = hardwareMap.get(DcMotor.class, "left_motor_back");
        rightMotorFront = hardwareMap.get(DcMotor.class, "right_motor_front");
        leftMotorFront = hardwareMap.get(DcMotor.class, "left_motor_front");
        rightMotorBack = hardwareMap.get(DcMotor.class, "right_motor_back");
        telemetry.addData("Status", "TeleOp Initialized");
        telemetry.update();
    }

    @Override
    public void loop() {
        double leftPower = gamepad1.left_stick_y;
        double rightPower = gamepad1.right_stick_y;

        leftMotorBack.setPower(leftPower);
        rightMotorFront.setPower(rightPower);
        leftMotorFront.setPower(leftPower);
        rightMotorBack.setPower(rightPower);
    }
}