package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LIST_CATEGORY_CARDS = Target.the("button forms").locatedBy("//div[@class='category-cards']");
    public static final Target BTN_FORMS = Target.the("button forms").locatedBy("//h5[contains(text(), 'Forms')]");
    public static final Target BTN_ELEMENTS = Target.the("button elements").locatedBy("//h5[contains(text(), 'Elements')]");
    public static final Target BTN_WIDGETS = Target.the("button Widgets").locatedBy("//h5[contains(text(), 'Widgets')]");
}
