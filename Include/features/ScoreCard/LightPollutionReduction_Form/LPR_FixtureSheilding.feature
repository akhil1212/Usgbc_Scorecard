#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	21.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 23.05.2019
# Feature Name: Filling the Light Pollution Reduction Form - Fixture Sheilding
# Feature Description: Filling the Light Pollution Reduction Form - Fixture Sheilding which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Filling the Light Pollution Reduction Form

  #Scenario-1
  @SmokeTest
  Scenario: User selects an option Fixture Shielding option
    Given User should see the radio button option Fixture Shielding
    When User clicks on Fixture Shielding option
    Then User should see the contents for Fixture Shielding option

  #Scenario-2
  @SmokeTest
  Scenario: User clicks the checkbox for the fixture exceeds 2,500 lamp lumens under Fixture Shielding
    Given User should be able to see the checkbox for the fixture exceeds 2500 lamp lumens
    When User clicks on the check box for the fixture exceeds 2500 lamp lumens
    Then User should be able to see the checkbox checked for for the fixture exceeds 2500 lamp lumens

  #Scenario-3
  @SmokeTest
  Scenario: User uploads files of shielding information for each luminaire
    Given User should be able to see the Add File button of shielding information for each luminaire
    Then User uploads file of shielding information for each luminaire

  #  Then User can see the uploaded files for shielding information for each luminaire
  #Scenario-4
  @SmokeTest
  Scenario: User fills the Percent increase in illumination from lights off to lights on (%)
    Given User should be able to see the textbox for Percent increase in illumination from lights off to lights on
    When User enters the percentage value for Percent increase in illumination from lights off to lights on
    Then User should be able to see the entered value in Percent increase in illumination from lights off to lights on

  #Scenario-5
  @SmokeTest
  Scenario: User uploads files of site plan, with scale and any related site features
    Given User should be able to see the Add File button for site plan with scale and any related site features
    Then User uploads file for site plan with scale and any related site features

  #   Then User can see the uploaded files for site plan with scale and any related site features
  #Scenario-6
  @SmokeTest
  Scenario: User uploads files of special circumstances for fixture shielding in Light Pollution Reduction
    Given User should be able to see the Add File button of special circumstances for fixture shielding in Light Pollution Reduction
    Then User uploads file of special circumstances for fixture shielding in Light Pollution Reduction

  #  Then User can see the uploaded files for special circumstances for fixture shielding in Light Pollution Reduction
  #Scenario-7
  @SmokeTest
  Scenario: User feeds narrative text under Special Circumstances text box for fixture shielding in Light Pollution Reduction
    Given User should see the editor for Special Circumstances for fixture shielding in Light Pollution Reduction
    When User feeds long narrative text for Special Circumstances text box for fixture shielding in Light Pollution Reduction
    Then User should see the narrative text persist on Special Circumstances text box for fixture shielding in Light Pollution Reduction

  #Scenario-8
  @SmokeTest
  Scenario: User has to save the form
    Given User can see the save button
    When User clicks on save button
    Then User should see Form data saved successfully message

  #Scenario-9
  @SmokeTest
  Scenario: To verify the generated pdf for Fixture Shielding of Light Pollution Reduction Form
    Given User can see the generate pdf icon on the top of the form   
    When User clicks on generate pdf icon to download the file
    Then User has to verify Uploaded shielding information with downloaded pdf file
    And User had to verify the data in Percent increase in illumination with downloaded pdf file
    And User has to verify Uploaded site plan with downloaded pdf file
    And User has to verify the Special Circumstances html editor with downloaded pdf file
    And User has to verify Uploaded additional documentation with downloaded pdf file

  #Scenario-10
  @SmokeTest
  Scenario: User verify the data entered after refreshing the fixture shielding in Light Pollution Reduction form
    Given User has to refresh the form
    Then User verifies the entered value in Percent increase in illumination from lights off to lights on
    And User verifies the narrative text of Special Circumstances html editor box for Light Pollution Reduction form
