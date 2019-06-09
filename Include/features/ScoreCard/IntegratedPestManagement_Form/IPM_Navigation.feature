#-------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                           Reviewer    :
# Date   : 	03.06.2019											                                                           Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 03.06.2019
# Feature Name: Navigating to USGBC Integrated Pest Management Form
# Feature Description: Navigating to USGBC Integrated Pest Management Form after login
#-------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Integrated Pest Management Form

 #Scenario-1
 @SmokeTest
  Scenario: User navigates to Integrated Pest Management Form
    Given User should be on credits page 
    And User can see Integrated Pest Management under Indoor Environmental Quality section
    And User has to select the status to Attempted for Integrated Pest Management 
    When User clicks on Integrated Pest Management 
    And User has to click on FormV01 button of Integrated Pest Management
    Then User should be able to see the Integrated Pest Management form