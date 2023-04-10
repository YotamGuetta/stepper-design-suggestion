package mta.course.java.stepper.flow.definition.api;

import mta.course.java.stepper.flow.definition.api.StepUsageDeclaration;

import java.util.List;

public interface FlowDefinition {
    String name();
    String description();
    List<StepUsageDeclaration> steps();
    List<String> formalOutputs();
    void validateFlowStructure();
}
