package mta.course.java.stepper.main;

import mta.course.java.stepper.flow.definition.api.FlowDefinition;
import mta.course.java.stepper.flow.definition.api.FlowDefinitionImpl;
import mta.course.java.stepper.flow.definition.api.StepUsageDeclarationImpl;
import mta.course.java.stepper.step.impl.HelloWorldStep;
import mta.course.java.stepper.step.impl.PersonDetailsStep;

public class Main {
    public static void main(String[] args) {

        FlowDefinition flow1 = new FlowDefinitionImpl("Flow 1", "Hello world");
        flow1.steps().add(new StepUsageDeclarationImpl(new HelloWorldStep()));
        flow1.validateFlowStructure();

        FlowDefinition flow2 = new FlowDefinitionImpl("Flow 2", "show two person details");
        flow2.steps().add(new StepUsageDeclarationImpl(new HelloWorldStep()));
        flow2.steps().add(new StepUsageDeclarationImpl(new PersonDetailsStep(), "Person 1 Details"));
        flow2.steps().add(new StepUsageDeclarationImpl(new PersonDetailsStep(), "Person 2 Details"));
        flow2.formalOutputs().add("DETAILS");
        flow2.validateFlowStructure();


    }
}
