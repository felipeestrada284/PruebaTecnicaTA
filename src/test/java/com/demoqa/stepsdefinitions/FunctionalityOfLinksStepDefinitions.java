package com.demoqa.stepsdefinitions;



import com.demoqa.tasks.ClickFirstLink;
import com.demoqa.tasks.FollowingLinksWillOpenNewTabTask;
import com.demoqa.tasks.FollowingLinksWillSendAnApiCallTask;
import com.demoqa.tasks.NavigateToLinksTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FunctionalityOfLinksStepDefinitions {


    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("navigate to the Elements section in the menu and select Links")
    public void navigateToTheElementsSectionInTheMenuAndSelectLinks() {
        theActorInTheSpotlight().attemptsTo(
                NavigateToLinksTask.inWidgets()
        );

    }

    @And("click on each of the available links and verify that the correct page loads and that the content is visible")
    public void clickOnEachOfTheAvailableLinksAndVerifyThatTheCorrectPageLoadsAndThatTheContentIsVisible() {
        theActorInTheSpotlight().attemptsTo(
               FollowingLinksWillOpenNewTabTask.inLinks(),
               FollowingLinksWillSendAnApiCallTask.inLinks()
        );
    }

    @And("get all the links and click on the first link in alphabetical order")
    public void getAllTheLinksAndClickOnTheFirstLinkInAlphabeticalOrder() {
        theActorInTheSpotlight().attemptsTo(
                ClickFirstLink.inAlphabeticalOrder()
        );
    }
}
