Feature: practice form and navigate elements and slider

  Background: : Verify the registration form
    Given that the user is on the demoqa page

  Scenario: Verify carousel functionality
    When navigate to the Slider section in the menu and drag the slider to position three
    Then verify that the number shown is three