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
  Scenario: Verifying draft version is not changed and warning message is displayed with date and time after logout and login
    Given User can see the narrative in Integrated Pest Management form
    When User modifies narrative data in Integrated Pest Management form
    And User will logout from the Integrated Pest Management form
    Then User logs in again to Integrated Pest Management form
    And User should see the warning message is displayed with date and time at the top of the Integrated Pest Management form
    And User verifies draft version is not changed after logout and login in Integrated Pest Management form