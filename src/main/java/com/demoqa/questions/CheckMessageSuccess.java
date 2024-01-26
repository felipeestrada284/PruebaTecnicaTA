package com.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demoqa.userinterfaces.PracticeFormPage.TXT_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckMessageSuccess implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_MESSAGE, isVisible()).forNoMoreThan(60).seconds()
        );
        return TXT_MESSAGE.resolveFor(actor).getText();
    }

    public static Question<String> onForm(){
        return new CheckMessageSuccess();
    }
}
