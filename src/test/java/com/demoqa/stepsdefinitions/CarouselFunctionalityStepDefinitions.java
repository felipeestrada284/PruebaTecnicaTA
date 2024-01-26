package com.demoqa.stepsdefinitions;


import com.demoqa.questions.verifyNumberShown;
import com.demoqa.tasks.NavigateToSliderTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CarouselFunctionalityStepDefinitions {


    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("navigate to the Slider section in the menu and drag the slider to position three")
    public void navigateToTheSliderSectionInTheMenuAndDragTheSliderToPositionThree() {
        theActorInTheSpotlight().attemptsTo(
                NavigateToSliderTask.inWidgets()
        );
    }
    @Then("verify that the number shown is three")
    public void verifyThatTheNumberShownIsThree() {
        theActorInTheSpotlight().should(
                seeThat(
                        "The number shown was: ",
                        verifyNumberShown.onSlider(),
                        equalTo("3")
                )
        );
    }


}
