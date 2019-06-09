#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in the Integrated Pest Management Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in Integrated Pest Management Form for both the options
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in the Integrated Pest Management Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying formdraft is not saved if there is no change made in the form
    Given User is on the Integrated Pest Management form
    When User will not modify any field on the Integrated Pest Management form
    Then User should not see saving of draft even after 10 seconds in Integrated Pest Management form

  #Scenario-2
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in textbox
    Given User should be able to see the textbox in Integrated Pest Management form
    When User modifies the textbox value in the Integrated Pest Management form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for change in textbox in Integrated Pest Management form

  #Scenario-3
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in narrative
    Given User should be able to see the narrative in Integrated Pest Management form
    When User modifies the narrative data in the Integrated Pest Management form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for narrative in Integrated Pest Management form

  #Scenario-4
  @SmokeTest
  Scenario: Verifying form draft is not saved if files are uploaded in the form
    Given User should be able to see Upload file on Integrated Pest Management form
    When User uploads any file on Integrated Pest Management form
    Then User should not see saving of draft even after 10 seconds in Integrated Pest Management

  #Scenario-5
  @SmokeTest
  Scenario: Verifying the form draft warning message is not retained when the form is saved
    Given User can see the Draft is saved automatically with date and time in Integrated Pest Management form
    And User can see the save button in Integrated Pest Management form
    When User saves the Integrated Pest Management form
    Then User verifies the form draft warning message is not retained in Integrated Pest Management form

  #Scenario-6
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the radio button in Integrated Pest Management form for In house IPM program
    When User clicks on the radio button of In house IPM program and waits for 10 seconds
    And User can see the Clear draft in Integrated Pest Management form
    And User clicks on Clear draft in Integrated Pest Management form
    Then User can see the draft is cleared in Integrated Pest Management form
    
    
  #Scenario-7
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login
    Given User can see the narrative in Integrated Pest Management form
    When User modifies narrative data in Integrated Pest Management form
    And User will logout from the Integrated Pest Management form
    Then User logs in again to Integrated Pest Management form
    And User should see the warning message is displayed with date and time at the top of the Integrated Pest Management form
    And User verifies draft version is not changed after logout and login in Integrated Pest Management form

    
    
   
