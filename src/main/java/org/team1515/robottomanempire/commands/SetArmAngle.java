package org.team1515.robottomanempire.commands;

import org.team1515.robottomanempire.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetArmAngle extends Command {

    private double target;

    private static final double THRESHOLD = 2.0;
    private static final double TIMEOUT = 3; 

    public SetArmAngle(double target) {
        this.target = target;
        setTimeout(TIMEOUT);
        requires(Robot.arm);
    }

    @Override
    protected void execute() {
        Robot.arm.setAngle(target);
    }

    @Override
    protected boolean isFinished() {
        double actual = Robot.arm.getAngle();
        boolean isWithinThreshold = Math.abs(target - actual) <= THRESHOLD;
        return isWithinThreshold || isTimedOut();
    }

}