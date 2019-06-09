#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On:
# Feature Name: Filling the Green Cleaning Policy Form - In-house green cleaning policy 
# Feature Description: Filling the Green Cleaning Policy Form - In-house green cleaning policy which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Green Cleaning Policy Form

  #Scenario-1
  @SmokeTest
  Scenario: User selects an option In-house green cleaning policy
    Given User should see the radio button option In-house green cleaning policy
    When User clicks on In-house green cleaning policy option
    Then User should see the contents for In-house green cleaning policy option
    
 #Scenario-2
  @SmokeTest
  Scenario: User Upload the Green Cleaning Policy
    Given User should be able to see the Add File button for Green Cleaning Policy
    Then User uploads file for Green Cleaning Policy
    
    #Scenario-3
    @SmokeTest
    Scenario: User feeds narrative text under cleaning service text box for fixture shielding in Light Pollution Reduction
    Given User should see the editor for cleaning service for In-house green cleaning policy in Green Cleaning Policy
    When User feeds long narrative text for cleaning service text box for In-house green cleaning policy in Green Cleaning Policy
    Then User should see the narrative text persist on cleaning service text box for In-house green cleaning policy in Green Cleaning Policy
        
    #Scenario-4
  @SmokeTest
  Scenario: User uploads files of special circumstances for In-house green cleaning policy in Green Cleaning Policy
    Given User should be able to see the Add File button of special circumstances for In-house green cleaning policy in Green Cleaning Policy
    Then User uploads file of special circumstances for In-house green cleaning policy in Green Cleaning Policy

  #Scenario-5
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for In-house green cleaning policy in Green Cleaning Policy
    Given User should see the editor for Special Circumstances for In-house green cleaning policy in Green Cleaning Policy
    When User feeds long narrative text for Special Circumstances text box for In-house green cleaning policy in Green Cleaning Policy
    Then User should see the narrative text persist on Special Circumstances text box for In-house green cleaning policy in Green Cleaning Policy
    
	#Scenario-6
  @SmokeTest
  Scenario: User has to save the form in GCP
    Given User can see the save button in GCP
    When User clicks on save button in GCP
    Then User should see Form data saved successfully message in GCP
    
  #Scenario-7
  @SmokeTest
  Scenario: To save the Green Cleaning Policy Form
    Given User can see the generate pdf icon on the top of the Green Cleaning Policy Form   
    When User clicks on generate pdf icon to download the file in Green Cleaning Policy Form
    Then User has to verify Uploaded Green Cleaning Policy with downloaded pdf file in Green Cleaning Policy Form    
    And User has to verify the cleaning service html editor with downloaded pdf file in Green Cleaning Policy Form
    And User has to verify the Special Circumstances html editor with downloaded pdf file in Green Cleaning Policy Form
    And User has to verify Uploaded additional documentation with downloaded pdf file in Green Cleaning Policy Form

  #Scenario-8
  @SmokeTest
  Scenario: User verify the data entered after refreshing the In-house green cleaning policy in Green Cleaning Policy form
    Given User has to refresh the form
    Then User verifies the narrative text of cleaning service html editor box for Green Cleaning Policy form
    And User verifies the narrative text of Special Circumstances html editor box for Green Cleaning Policy form
    
    
    
    
    
    