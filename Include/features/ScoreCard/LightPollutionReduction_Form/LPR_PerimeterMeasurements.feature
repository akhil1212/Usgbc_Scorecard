#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	23.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 23.05.2019
# Feature Name: Filling the Light Pollution Reduction Form - Perimeter Measurements
# Feature Description: Filling the Light Pollution Reduction Form - Perimeter Measurements which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Light Pollution Reduction Form

  #Scenario-1
  @SmokeTest
  Scenario: User selects an option Perimeter Measurements option
    Given User should see the radio button option Perimeter Measurements
    When User clicks on Perimeter Measurements option
    Then User should see the contents for Perimeter Measurements option

  #Sceanrio-2
  @SmokeTest
  Scenario: Feeding the data to the Table Site lighting measurements of Perimeter Measurements
    Given User can see the Table Site lighting measurements of Perimeter Measurements
    When User enters the details of Measurements ID,Illumantion Level
    Then User can see the calculated value of Percent Increase of the Table Site lighting measurements of Perimeter Measurements

  #Scenario-3
  @SmokeTest
  Scenario: User has to save the form
    Given User can see the save button
    When User clicks on save button
    Then User should see Form data saved successfully message

  #Scenario-4
  @SmokeTest
  Scenario: User verify the data entered after refreshing the perimeter measurements in Light Pollution Reduction form
    Given User has to refresh the form
    Then User verifies the data present in the table site lighting measurements with the entered data

  #Scenario-5
  @SmokeTest
  Scenario: To verify the generated pdf for Perimeter Measurements of Light Pollution Reduction Form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify the Site lighting measurements table with downloaded pdf file
    And User had to verify the data in Percent increase in illumination with downloaded pdf file
    And User has to verify Uploaded site plan with downloaded pdf file
    And User has to verify the Special Circumstances html editor with downloaded pdf file
    And User has to verify Uploaded additional documentation with downloaded pdf file
    And User changes the status to mark for review for the form
