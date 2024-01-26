package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormPage {
    public static final Target BTN_PRACTICE_FORMS = Target.the("button practice forms").locatedBy("//span[contains(text(), 'Practice Form')]");
    public static final Target INP_FIRST_NAME = Target.the("input first name").located(By.id("firstName"));
    public static final Target INP_LAST_NAME = Target.the("input last name").located(By.id("lastName"));
    public static final Target INP_EMAIL = Target.the("input email").located(By.id("userEmail"));
    public static final Target INP_GENDER_MALE = Target.the("input gender male").locatedBy("//label[contains(text(), 'Male')]");
    public static final Target INP_MOBILE = Target.the("input mobile").located(By.id("userNumber"));
    public static final Target INP_DATE_OF_BIRTH = Target.the("input date of birth").located(By.id("dateOfBirthInput"));
    public static final Target SELECT_DATE_OF_BIRTH = Target.the("select date of birth").locatedBy("//div[@aria-label='Choose Thursday, January 4th, 2024']");
    public static final Target SELECT_STATE = Target.the("select state").located(By.id("state"));
    public static final Target BTN_SUBMIT = Target.the("button submit").located(By.id("submit"));
    public static final Target TXT_MESSAGE = Target.the("text message").located(By.id("example-modal-sizes-title-lg"));


}
