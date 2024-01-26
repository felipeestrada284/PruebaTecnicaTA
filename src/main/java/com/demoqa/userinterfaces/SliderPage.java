package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SliderPage {
    public static final Target BTN_SLIDER = Target.the("button slider").locatedBy("//span[contains(text(), 'Slider')]");
    public static final Target BTN_RANGE_SLIDER = Target.the("button range slider").locatedBy("//input[@class= 'range-slider range-slider--primary']");
    public static final Target TXT_SLIDER_VALUE = Target.the("slider value").locatedBy("//div[@class='range-slider__tooltip__label']");

}
