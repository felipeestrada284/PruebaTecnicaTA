package com.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static com.demoqa.userinterfaces.HomePage.LIST_CATEGORY_CARDS;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.core.Serenity.getWebdriverManager;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.MatcherAssert.assertThat;


public class ChangeWindow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = getWebdriverManager().getCurrentDriver();

        String mainWindow = driver.getWindowHandle();


        // Captures the identifiers of all open windows
        for (String window : getDriver().getWindowHandles()) {
            // Change to new window
            if (!window.equals(mainWindow)) {
                getDriver().switchTo().window(window);


                actor.attemptsTo(
                        // Validar que la URL contiene cierto texto esperado
                        Ensure.thatTheCurrentPage().currentUrl().contains("https://demoqa.com")

                );

                // Validate that the content is visible
                WaitUntil.the(LIST_CATEGORY_CARDS, isVisible()).forNoMoreThan(20).seconds();
                Ensure.that(LIST_CATEGORY_CARDS).isDisabled();


                // Close the new window
                getDriver().close();
            }
        }

        // Return to the main window
        driver.switchTo().window(mainWindow);
    }

    public static ChangeWindow on(){
        return Tasks.instrumented(ChangeWindow.class);
    }
}
