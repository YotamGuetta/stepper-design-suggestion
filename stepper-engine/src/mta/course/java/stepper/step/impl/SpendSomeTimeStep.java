package mta.course.java.stepper.step.impl;

import mta.course.java.stepper.dd.impl.DataDefinitionRegistry;
import mta.course.java.stepper.flow.execution.context.StepExecutionContext;
import mta.course.java.stepper.step.api.AbstractStepDefinition;
import mta.course.java.stepper.step.api.DataDefinitionDeclarationImpl;
import mta.course.java.stepper.step.api.DataNecessity;
import mta.course.java.stepper.step.api.StepResult;

import java.util.concurrent.TimeUnit;

public class SpendSomeTimeStep extends AbstractStepDefinition {

    public SpendSomeTimeStep(){
        super("Spend Some Time", true);
        addInput(new DataDefinitionDeclarationImpl("TIME_TO_SPEND", DataNecessity.MANDATORY, "Total sleeping time (sec)", DataDefinitionRegistry.NUMBER));
    }

    @Override
    public StepResult invoke(StepExecutionContext context) {
        Integer seconds = context.getDataValue("TIME_TO_SPEND", Integer.class);

        if(seconds <= 0){
            addSummery("WARNING: "+seconds+" is not a positive number");
            context.storeStepLogLine(this.name(), getSummery());
            return StepResult.WARNING;
        }

        context.storeStepLogLine(this.name(), "About to sleep for " + seconds + " seconds…");

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            addSummery("WARNING: thread is interrupted while it is sleeping");
            context.storeStepLogLine(this.name(), getSummery());
            return StepResult.WARNING;
        }

        context.storeStepLogLine(this.name(), "Done sleeping…");

        return StepResult.SUCCESS;
    }
}
