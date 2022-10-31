package com.cydeo.step_definitions.shortvideo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber_StepDef {

    @Given("Rufat is hungry")
    public void rufat_is_hungry() {
        System.out.println("It is from Given");
    }

    @When("he eats some candy")
    public void he_eats_some_candy() {
        System.out.println("It is from When");
    }

    @Then("he will be happy")
    public void he_will_be_happy() {
        System.out.println("It is from then");
    }
}
