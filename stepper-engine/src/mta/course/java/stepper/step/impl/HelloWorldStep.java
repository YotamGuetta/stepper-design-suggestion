package mta.course.java.stepper.step.impl;

import mta.course.java.stepper.step.api.AbstractStepDefinition;
import mta.course.java.stepper.step.api.StepResult;

public class HelloWorldStep extends AbstractStepDefinition {

    public HelloWorldStep() {
        super("Hello World", true);

        // no inputs

        // no outputs
    }

    @Override
    public StepResult invoke() {
        System.out.println("Hello world !");
        return StepResult.SUCCESS;
    }
}
