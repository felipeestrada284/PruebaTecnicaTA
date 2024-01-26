package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LinksPage {
    public static final Target BTN_LINKS = Target.the("button links").locatedBy("//span[contains(text(), 'Links')]");
    public static final Target BTN_SIMPLE_LINK_HOME = Target.the("simple link").located(By.id("simpleLink"));
    public static final Target BTN_DYNAMIC_LINK_HOME = Target.the("dynamic link").located(By.id("dynamicLink"));
    public static final Target LIST_LINKS = Target.the("list links").locatedBy("//div[@id='linkWrapper']/p/a");
    public static final Target BTN_LINK_CREATED = Target.the("link crated").located(By.id("created"));
    public static final Target BTN_LINK_NO_CONTENT = Target.the("link no content").located(By.id("no-content"));
    public static final Target BTN_LINK_MOVED = Target.the("link moved").located(By.id("moved"));
    public static final Target BTN_LINK_BAD_REQUEST = Target.the("link bad request").located(By.id("bad-request"));
    public static final Target BTN_LINK_UNAUTHORIZED = Target.the("link unauthorized").located(By.id("unauthorized"));
    public static final Target BTN_LINK_FORBIDDEN = Target.the("link forbidden").located(By.id("forbidden"));
    public static final Target BTN_LINK_NOT_FOUND = Target.the("link not found").located(By.id("invalid-url"));
    public static final Target TXT_LINK_RESPONSE = Target.the("link response").located(By.id("linkResponse"));

}
