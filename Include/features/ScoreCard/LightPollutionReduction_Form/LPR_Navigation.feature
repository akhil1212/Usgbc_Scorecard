#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	21.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 21.05.2019
# Feature Name: Navigating to USGBC Light Pollution Reduction Form
# Feature Description: Navigating to USGBC Light Pollution Reduction Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Light Pollution Reduction Form

 #Scenario-1
 #
 @SmokeTest
  Scenario: User navigates to Light Pollution Reduction Form
    Given User should be on credits page 
    And User can see Light Pollution Reduction under Sustainable Sites section
    And User has to select the status to Attempted for Light Pollution Reduction 
    When User clicks on Light Pollution Reduction 
    And User has to click on FormV01 button of Light Pollution Reduction
    Then User should be able to see the Light Pollution Reduction form