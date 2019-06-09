#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 03.06.2019
# Feature Name: Filling the Integrated Pest Management Form - Certified IPM service
# Feature Description: Filling the Integrated Pest Management Form - Certified IPM service which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Integrated Pest Management Form

  #Scenario-1
  @SmokeTest
  Scenario: User selects an option Certified IPM service
    Given User should see the radio button option Certified IPM service
    When User clicks on Certified IPM service option
    Then User should see the contents for Certified IPM service option

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for integrated pest management service contract
    Given User should be able to see the Add File button for integrated pest management service contract
    Then User uploads file for integrated pest management service contract

  #Scenario-3
  @SmokeTest
  Scenario: User fills the text in integrated pest management service is certified and in good standing with
    Given User should be able to see the textbox for integrated pest management service is certified and in good standing with
    When User enters the data for integrated pest management service is certified and in good standing with
    Then User should be able to see the entered value in integrated pest management service is certified and in good standing with

  #Scenario-4
  @SmokeTest
  Scenario: User uploads files for the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Given User should be able to see the Add File button for the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Then User uploads file for the information showing the contractor’s GreenPro, EcoWise, GreenShield

  #Scenario-5
  @SmokeTest
  Scenario: User has to save the form
    Given User can see the save button
    When User clicks on save button
    Then User should see Form data saved successfully message

  
  #Scenario-6
  @SmokeTest
  Scenario: To verify the generated pdf for In house IPM program in Integrated Pest Management Form
    Given User can see the generate pdf icon on the top of the form
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded integrated pest management service contract with downloaded pdf file
    And User has to verify the data in integrated pest management service is certified and in good standing with with downloaded pdf file
    And User has to verify Uploaded the information showing the contractor’s GreenPro, EcoWise, GreenShield with downloaded pdf file

  #Scenario-7
  @SmokeTest
  Scenario: User verify the data entered after refreshing the Certified IPM service in Integrated Pest Management form
    Given User has to refresh the form
    Then User verifies the entered value in integrated pest management service is certified and in good standing with
    And User changes the status to ready for review for the IMP form
