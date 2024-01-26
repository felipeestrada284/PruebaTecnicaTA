package com.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.demoqa.userinterfaces.PracticeFormPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class StudentRegistrationFormTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PRACTICE_FORMS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_PRACTICE_FORMS),
                Enter.theValue("Felipe").into(INP_FIRST_NAME),
                Enter.theValue("Estrada").into(INP_LAST_NAME),
                Enter.theValue("felipe284@email.com").into(INP_EMAIL),
                Click.on(INP_GENDER_MALE),
                Enter.theValue("3148344744").into(INP_MOBILE),
                Click.on(INP_DATE_OF_BIRTH),
                Click.on(SELECT_DATE_OF_BIRTH),
                Scroll.to(SELECT_STATE),
                Click.on(BTN_SUBMIT)
        );
    }

    public static StudentRegistrationFormTask inForms(){
        return Tasks.instrumented(StudentRegistrationFormTask.class);
    }
}
