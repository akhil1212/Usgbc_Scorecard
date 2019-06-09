#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	28.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 28.05.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in the Light Pollution Reduction Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in the Light Pollution Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in the Light Pollution Reduction Form

  
  #Scenario-1
  @SmokeTest
  Scenario: Verifying formdraft is not saved if no change in the form
    Given User is on the Formv01 of Light Polluton Reduction form
    When User will not modify any field on the Light Polluton Reduction form
    Then User should not see saving of draft even after 10 seconds in Light Polluton Reduction form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if upload files in the form
    Given User should be able to see Upload fle on Light Polluton Reduction form
    When User uploads any file on Light Polluton Reduction form
    Then User should not see saving of draft even after 10 seconds

  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Checkbox
    Given User should be able to see the checkbox in Light Polluton Reduction form
    When User modifies the checkbox in the Light Polluton Reduction form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for checkbox in Light Polluton Reduction form

  #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in narrative
    Given User should be able to see the narrative in Light Polluton Reduction form
    When User modifies the narrative data in the Light Polluton Reduction form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in Light Polluton Reduction form

  #Scenario-5
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in textbox
    Given User should be able to see the textbox in Light Polluton Reduction form
    When User modifies the textbox value in the Light Polluton Reduction form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for change in textbox in Light Polluton Reduction form

  #Scenario-6
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Light Polluton Reduction form
    And User can see the save button in Light Polluton Reduction form
    When User saves the Light Polluton Reduction form
    Then User verifies the form draft warning message is not retained in Light Polluton Reduction form

  #Scenario-7
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the narrative in Light Polluton Reduction form
    When User modifies the narrative data in Light Polluton Reduction form form and waits for 10 seconds
    And User can see the Clear draft in Light Polluton Reduction form
    And User clicks on Clear draft in Light Polluton Reduction form
    Then User can see the draft is cleared in Light Polluton Reduction form

  #Scenario-8
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time
    Given User can see the narrative in Light Polluton Reduction form
    When User modifies narrative data in Light Polluton Reduction form
    And User will logout from the Light Polluton Reduction form
    And User logs in again to Light Polluton Reduction form
    Then User should see the warning message is displayed with date and time at the top of the Light Polluton Reduction form
    And User verifies draft version is not changed after logout and login in Light Polluton Reduction form
  