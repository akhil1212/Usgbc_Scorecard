#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Verifying the AutoSaveAsDraft functionality in the Green Cleaning Policy Form
# Feature Description: Verifying the AutoSaveAsDraft functionality in the Green Cleaning Policy Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the AutoSaveAsDraft functionality in the Green Cleaning Policy Form

  
  #Scenario-1
  @SmokeTest
  Scenario: Verifying form draft is not saved if no change in the form in GCP
    Given User is on the Formv01 of Green Cleaning Policy form
    When User will not modify any field on the Green Cleaning Policy form
    Then User should not see saving of draft even after 10 seconds in Green Cleaning Policy form

  #Scenario-2
  @SmokeTest
  Scenario: Verifying form draft is not saved if upload files in the form in GCP
    Given User should be able to see Upload fle on Green Cleaning Policy form
    When User uploads any file on Green Cleaning Policy form
    Then User should not see saving of draft even after 10 seconds in GCP

  #Scenario-3 
  @SmokeTest
 Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in cleaning service narrative 
    Given User should be able to see the cleaning service narrative in Green Cleaning Policy form
    When User modifies the cleaning service narrative data in the Green Cleaning Policy form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for cleaning service narrative in Green Cleaning Policy form
    
  #Scenario-4
  @SmokeTest
  Scenario: Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative
    Given User should be able to see the Special Circumstances narrative in Green Cleaning Policy form
    When User modifies the Special Circumstances narrative data in the Green Cleaning Policy form form and waits for 10 seconds
    Then User can see the draft is saved automatically with date and time for Special Circumstances narrative in Green Cleaning Policy form

	#Scenario-5
	@SmokeTest	
	 Scenario: Verifying the form draft warning message is not retained when the form is saved in GCP
    Given User can see the Draft is saved automatically with date and time in Green Cleaning Policy form
    And User can see the save button in Green Cleaning Policy form
    When User saves the Green Cleaning Policy form
    Then User verifies the form draft warning message is not retained in Green Cleaning Policy form
    
    
    #Scenario-6
  @SmokeTest
  Scenario: Verification of Clear Draft functionality
    Given User can see the radio button in Green Cleaning Policy form for Certified cleaning service
    When User clicks on the radio button of Certified cleaning service and waits for 10 seconds
    And User can see the Clear draft in Green Cleaning Policy form
    And User clicks on Clear draft in Green Cleaning Policy form
    Then User can see the draft is cleared in Green Cleaning Policy form
    
    
  #Scenario-7
  @SmokeTest
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login
    Given User can see the narrative in Green Cleaning Policy form
    When User modifies narrative data in Green Cleaning Policy form
    And User will logout from the Green Cleaning Policy form
    Then User logs in again to Green Cleaning Policy form
    And User should see the warning message is displayed with date and time at the top of the Green Cleaning Policy form
    And User verifies draft version is not changed after logout and login in Green Cleaning Policy form
    
  