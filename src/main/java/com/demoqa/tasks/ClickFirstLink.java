package com.demoqa.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.demoqa.userinterfaces.LinksPage.LIST_LINKS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickFirstLink implements Task {

    public static ClickFirstLink inAlphabeticalOrder() {
        return instrumented(ClickFirstLink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> links = LIST_LINKS.resolveAllFor(actor);


        ArrayList<String> linkTexts = new ArrayList<>();
        for (WebElementFacade link : links) {
            linkTexts.add(link.getText());

        }

        Collections.sort(linkTexts);

        String firstLinkText = linkTexts.get(0);
        links.stream()
                .filter(link -> link.getText().equals(firstLinkText))
                .findFirst()
                .ifPresent(WebElement::click);

    }

}
