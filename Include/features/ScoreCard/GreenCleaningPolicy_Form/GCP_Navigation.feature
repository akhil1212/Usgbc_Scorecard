#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil														                                             					        Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Navigating to USGBC Green Cleaning Policy Form
# Feature Description: Navigating to USGBC Green Cleaning Policy Form after login
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Navigating to Green Cleaning Policy Form

 #Scenario-1
 #
 @SmokeTest
  Scenario: User navigates to Green Cleaning Policy Form
    Given User should be on credits page 
    And User can see Green Cleaning Policy under Indoor Environmental Quality section
    And User has to select the status to Attempted for Green Cleaning Policy 
    When User clicks on Green Cleaning Policy 
    And User has to click on FormV01 button of Green Cleaning Policy
    Then User should be able to see the Green Cleaning Policy form