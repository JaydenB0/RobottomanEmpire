package org.team1515.robottomanempire.commands;

import org.team1515.robottomanempire.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RetractFrontClimber extends Command {

    public RetractFrontClimber() {
        requires(Robot.climber);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void execute() {
        Robot.climber.retractFront();
    }

}