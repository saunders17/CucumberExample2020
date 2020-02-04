package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ExampleSteps {

    private Example _target;
    private String _actualResult;

    @Given("I am getting a word from the user")
    public void i_am_getting_a_word_from_the_user() {
        // Write code here that turns the phrase above into concrete actions
        _target = new Example();
    }

    @When("the user enters a word")
    public void the_user_enters_a_word() {
        // Write code here that turns the phrase above into concrete actions
        _actualResult = _target.getInput();
    }
    @Then("I should be told the word is {string}")
    public void i_should_be_told_the_word_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        String expectedResult = "FIS";
        assertEquals(expectedResult, _actualResult);
    }

}
