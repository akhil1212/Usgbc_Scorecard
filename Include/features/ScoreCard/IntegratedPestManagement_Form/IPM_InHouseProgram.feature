#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 03.06.2019	
# Feature Name: Filling the Integrated Pest Management Form - In-house IPM program
# Feature Description: Filling the Integrated Pest Management Form - In-house IPM program which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Integrated Pest Management Form

  
  #Scenario-1
  @SmokeTest
  Scenario: User selects an option In-house IPM program
    Given User should see the radio button option for In-house IPM program
    When User clicks on In-house IPM program option
    Then User should see the contents for In-house IPM program option

  #Scenario-2
  @SmokeTest
  Scenario: User uploads files for integrated pest management plan
    Given User should be able to see the Add File button for integrated pest management plan
    Then User uploads file for integrated pest management plan

  #Scenario-3
  @SmokeTest
  Scenario: User uploads files for the examples of the documentation used by the project
    Given User should be able to see the Add File button for the examples of the documentation used by the project
    Then User uploads file for the examples of the documentation used by the project

  #Scenario-4
  @SmokeTest
  Scenario: User uploads files for Pesticide application list
    Given User should be able to see the Add File button for Pesticide application list
    Then User uploads file for Pesticide application list

  #Scenario-5
  @SmokeTest
  Scenario: User uploads files of special circumstances for In house IPM program in Integrated Pest Management
    Given User should be able to see the Add File button of special circumstances for In house IPM program in Integrated Pest Management
    Then User uploads file of special circumstances for In house IPM program in Integrated Pest Management

  #Scenario-6
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for In house IPM program in Integrated Pest Management
    Given User should see the editor for Special Circumstances for In house IPM program in Integrated Pest Management
    When User feeds long narrative text for Special Circumstances text box for In house IPM program in Integrated Pest Management
    Then User should see the narrative text persist on Special Circumstances text box for In house IPM program in Integrated Pest Management
    
    
  #Scenario-7
  @SmokeTest
  Scenario: User has to save the form
    Given User can see the save button
    When User clicks on save button
    Then User should see Form data saved successfully message
    
   #Scenario-8
  @SmokeTest
  Scenario: To verify the generated pdf for In house IPM program in Integrated Pest Management Form
    Given User can see the generate pdf icon on the top of the form   
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded integrated pest management plan with downloaded pdf file
    And User has to verify Uploaded examples of the documentation used by the project with downloaded pdf file
    And User has to verify Uploaded Pesticide application list with downloaded pdf file
    And User has to verify the Special Circumstances html editor for In house IPM program with downloaded pdf file
    And User has to verify Uploaded additional documentation for In house IPM program with downloaded pdf file
    
  #Scenario-9
  @SmokeTest
  Scenario: User verify the data entered after refreshing the In house IPM program in Integrated Pest Management Form
    Given User has to refresh the form
    Then  User verifies the narrative text of Special Circumstances html editor box for Integrated Pest Management Form
    And User changes the status to ready for review for the IMP form
