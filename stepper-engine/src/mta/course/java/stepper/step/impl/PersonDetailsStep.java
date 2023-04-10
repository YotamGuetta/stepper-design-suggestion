package mta.course.java.stepper.step.impl;

import mta.course.java.stepper.dd.impl.DataDefinitionRegistry;
import mta.course.java.stepper.step.api.AbstractStepDefinition;
import mta.course.java.stepper.step.api.DataDefinitionDeclarationImpl;
import mta.course.java.stepper.step.api.DataNecessity;
import mta.course.java.stepper.step.api.StepResult;

public class PersonDetailsStep extends AbstractStepDefinition {

    public PersonDetailsStep() {
        super("STEP 1", true);

        // step inputs
        addInput(new DataDefinitionDeclarationImpl("STRING_1", DataNecessity.MANDATORY, "First Name", DataDefinitionRegistry.STRING));
        addInput(new DataDefinitionDeclarationImpl("STRING_2", DataNecessity.OPTIONAL, "Last Name", DataDefinitionRegistry.STRING));
        addInput(new DataDefinitionDeclarationImpl("AGE", DataNecessity.MANDATORY, "Age", DataDefinitionRegistry.DOUBLE));

        // step outputs
        addOutput(new DataDefinitionDeclarationImpl("DETAILS", DataNecessity.NA, "Full Person Details", DataDefinitionRegistry.STRING));
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
