package com.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.demoqa.userinterfaces.SliderPage.TXT_SLIDER_VALUE;

public class verifyNumberShown implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TXT_SLIDER_VALUE.resolveFor(actor).getText();
    }

    public static Question<String> onSlider(){
        return new verifyNumberShown();
    }
}
