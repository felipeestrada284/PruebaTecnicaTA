package com.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demoqa.userinterfaces.HomePage.BTN_ELEMENTS;
import static com.demoqa.userinterfaces.LinksPage.BTN_LINKS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class NavigateToLinksTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BTN_ELEMENTS, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_ELEMENTS),
                WaitUntil.the(BTN_LINKS, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BTN_LINKS),
                Click.on(BTN_LINKS)
        );

    }

    public static NavigateToLinksTask inWidgets(){
        return Tasks.instrumented(NavigateToLinksTask.class);
    }
}
