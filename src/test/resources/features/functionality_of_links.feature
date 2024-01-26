Feature: practice form and navigate elements and slider

  Background: Verify the registration form
    Given that the user is on the demoqa page

  Scenario: Verify the functionality of links
    When navigate to the Elements section in the menu and select Links
    And click on each of the available links and verify that the correct page loads and that the content is visible
    And get all the links and click on the first link in alphabetical order
