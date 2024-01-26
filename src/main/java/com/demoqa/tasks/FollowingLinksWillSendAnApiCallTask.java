package com.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.demoqa.userinterfaces.LinksPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FollowingLinksWillSendAnApiCallTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BTN_LINK_CREATED, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_LINK_CREATED),
                Scroll.to(TXT_LINK_RESPONSE),
//                Ensure.that(TXT_LINK_RESPONSE.resolveFor(actor).getText()).contains("201"),
                Click.on(BTN_LINK_NO_CONTENT),
                Click.on(BTN_LINK_MOVED),
                Click.on(BTN_LINK_BAD_REQUEST),
                Click.on(BTN_LINK_UNAUTHORIZED),
                Click.on(BTN_LINK_FORBIDDEN),
                Click.on(BTN_LINK_NOT_FOUND)

        );

    }

    public static FollowingLinksWillSendAnApiCallTask inLinks(){
        return Tasks.instrumented(FollowingLinksWillSendAnApiCallTask.class);
    }
}
