package mta.course.java.stepper.step.impl;

import mta.course.java.stepper.dd.impl.number.DoubleDataDefinition;
import mta.course.java.stepper.dd.impl.string.StringDataDefinition;
import mta.course.java.stepper.step.api.AbstractStepDefinition;
import mta.course.java.stepper.step.api.DataDefinitionDeclarationImpl;
import mta.course.java.stepper.step.api.DataNecessity;
import mta.course.java.stepper.step.api.StepResult;

public class PersonDetailsStep extends AbstractStepDefinition {

    public PersonDetailsStep() {
        super("STEP 1", true);

        // step inputs
        addInput(new DataDefinitionDeclarationImpl("STRING_1", DataNecessity.MANDATORY, "First Name", new StringDataDefinition()));
        addInput(new DataDefinitionDeclarationImpl("STRING_2", DataNecessity.OPTIONAL, "Last Name", new StringDataDefinition()));
        addInput(new DataDefinitionDeclarationImpl("AGE", DataNecessity.MANDATORY, "Age", new DoubleDataDefinition()));

        // step outputs
        addOutput(new DataDefinitionDeclarationImpl("DETAILS", DataNecessity.NA, "Full Person Details", new StringDataDefinition()));
    }

    @Override
    public StepResult invoke() {
        // fetch inputs here, somehow

        // logic
        System.out.println("Hello world");

        // add outputs here, somehow

        // return result
        return StepResult.SUCCESS;
    }
}
