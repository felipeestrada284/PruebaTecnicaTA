package com.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demoqa.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class NavigateToPracticeFormTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_FORMS, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BTN_FORMS),
                Click.on(BTN_FORMS)
        );
    }

    public static NavigateToPracticeFormTask inForms(){
        return Tasks.instrumented(NavigateToPracticeFormTask.class);
    }
}
