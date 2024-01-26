package com.demoqa.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static com.demoqa.userinterfaces.HomePage.BTN_WIDGETS;
import static com.demoqa.userinterfaces.SliderPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class NavigateToSliderTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();


        actor.attemptsTo(
                WaitUntil.the(BTN_WIDGETS, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BTN_WIDGETS),
                Click.on(BTN_WIDGETS),
                Scroll.to(BTN_SLIDER),
                WaitUntil.the(BTN_SLIDER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SLIDER),
                WaitUntil.the(BTN_RANGE_SLIDER, isVisible()).forNoMoreThan(20).seconds()
                /*Click.on(BTN_RANGE_SLIDER),
                Enter.keyValues(Keys.ARROW_LEFT).into(BTN_RANGE_SLIDER)*/
        );

        WebElement slider = driver.findElement(By.xpath("//*[@id='sliderContainer']/div/span/input"));
        new Actions(driver).dragAndDropBy(slider, -240, 0).perform();


        String txtSlider = TXT_SLIDER_VALUE.resolveFor(actor).getText();

    }

    public static NavigateToSliderTask inWidgets(){
        return Tasks.instrumented(NavigateToSliderTask.class);
    }
}
