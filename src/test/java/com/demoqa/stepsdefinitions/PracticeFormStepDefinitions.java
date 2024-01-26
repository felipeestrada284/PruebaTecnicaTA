package com.demoqa.stepsdefinitions;

import com.demoqa.questions.CheckMessageSuccess;
import com.demoqa.tasks.NavigateToPracticeFormTask;
import com.demoqa.tasks.StudentRegistrationFormTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.demoqa.userinterfaces.PracticeFormPage.TXT_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PracticeFormStepDefinitions {


    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the user is on the demoqa page")
    public void thatTheUserIsOnTheDemoqaPage() {
        theActorCalled("felipe").wasAbleTo(Open.url("https://demoqa.com/"));
    }
    @When("navigating to the Forms section in the menu and selecting Practice Form")
    public void navigatingToTheFormsSectionInTheMenuAndSelectingPracticeForm() {
        theActorInTheSpotlight().attemptsTo(
                NavigateToPracticeFormTask.inForms()
        );
    }
    @When("fill out the form with the information")
    public void fillOutTheFormWithTheInformation() {
        theActorInTheSpotlight().attemptsTo(
                StudentRegistrationFormTask.inForms()
        );
    }
    @Then("submit the form and verify that a success message is displayed with the details of the submitted form")
    public void submitTheFormAndVerifyThatASuccessMessageIsDisplayedWithTheDetailsOfTheSubmittedForm() {
        theActorInTheSpotlight().should(
                seeThat("The Success Message Is Displayed: ",
                        CheckMessageSuccess.onForm(),
                        equalTo("Thanks for submitting the form")
                )

        );
    }


}
