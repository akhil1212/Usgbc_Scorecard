#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On:
# Feature Name: Filling the Green Cleaning Policy Form - Certified cleaning service 
# Feature Description: Filling the Green Cleaning Policy Form - Certified cleaning service which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Policy Form

#Scenario-1
  @SmokeTest
  Scenario: User selects an option Certified Cleaning Service
    Given User should see the radio button option CertifiedCleaningService
    When User clicks on Certified Cleaning Service option
    Then User should see the contents for Certified Cleaning Service

 	#Scenario-2
  @SmokeTest
  Scenario: User uploads files of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy
    Given User should be able to see the Add File button of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy
    Then User uploads file of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy
  
    #Scenario-3
  @SmokeTest
  Scenario: User fills the green cleaning service is certified by
    Given User should be able to see the textbox for green cleaning service is certified by
    When User enters the green cleaning service is certified by
    Then User should be able to see the entered value in green cleaning service is certified by
    
  #Scenario-4
  @SmokeTest
  Scenario: User uploads files of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy
    Given User should be able to see the Add File button of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy
    Then User uploads file of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy
    
  #Scenario-5
  @SmokeTest
  Scenario: User has to save the form in GCP
    Given User can see the save button in GCP
    When User clicks on save button in GCP
    Then User should see Form data saved successfully message in GCP
    
  #Scenario-6
  @SmokeTest
  Scenario: To save the Green Cleaning Policy Form
    Given User can see the generate pdf icon on the top of the Green Cleaning Policy Form   
    When User clicks on generate pdf icon to download the file in Green Cleaning Policy Form
    Then User has to verify Uploaded the Cleaning Contract with downloaded pdf file in Green Cleaning Policy Form
    And User had to verify the data in green cleaning service is certified by with downloaded pdf file
    And User has to verify Uploaded the information showing the contractor’s GS-42 with downloaded pdf file in Green Cleaning Policy Form
    #And User has to verify the cleaning service html editor with downloaded pdf file in Green Cleaning Policy Form
    #And User has to verify the Special Circumstances html editor with downloaded pdf file in Green Cleaning Policy Form
    #And User has to verify Uploaded additional documentation with downloaded pdf file in Green Cleaning Policy Form
     And User changes the status to mark for review for GCP form

    
    
    