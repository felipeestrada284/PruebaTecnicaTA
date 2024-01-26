package com.demoqa.tasks;

import com.demoqa.interactions.ChangeWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demoqa.userinterfaces.LinksPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FollowingLinksWillOpenNewTabTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BTN_SIMPLE_LINK_HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SIMPLE_LINK_HOME),
                ChangeWindow.on(),
                WaitUntil.the(BTN_DYNAMIC_LINK_HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_DYNAMIC_LINK_HOME),
                ChangeWindow.on()
        );

    }

    public static FollowingLinksWillOpenNewTabTask inLinks(){
        return Tasks.instrumented(FollowingLinksWillOpenNewTabTask.class);
    }
}
