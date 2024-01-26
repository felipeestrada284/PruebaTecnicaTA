Feature: practice form and navigate elements and slider

  Scenario: Verify the registration form
    Given that the user is on the demoqa page
    When navigating to the Forms section in the menu and selecting Practice Form
    And fill out the form with the information
    Then submit the form and verify that a success message is displayed with the details of the submitted form
