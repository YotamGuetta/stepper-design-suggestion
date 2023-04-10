package mta.course.java.stepper.step.api;

import mta.course.java.stepper.dd.api.DataDefinition;

import java.util.List;

public interface StepDefinition {
    String name();
    boolean isReadonly();
    List<DataDefinitionDeclaration> inputs();
    List<DataDefinitionDeclaration> outputs();
    StepResult invoke();
}
