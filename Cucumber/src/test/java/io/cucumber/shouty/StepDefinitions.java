package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    Person lucy;
    Person sean;
    private String messageFromSean;

    @Given("{person} is located/standing {int} meter(s) from Sean")
    public void lucy_is_located_meters_from_sean(Person person, Integer distance) {
        lucy = new Person("Lucy");
        sean = new Person("Sean");
        lucy.moveTo(distance);
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("Lucy should hear Sean's message about bagels")
    public void lucy_hears_sean_s_message() {
        assertEquals(messageFromSean, lucy.getMessagesHeard().get(0));
    }

}
