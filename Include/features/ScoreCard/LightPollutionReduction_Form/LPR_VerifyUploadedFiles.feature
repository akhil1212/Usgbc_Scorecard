#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	25.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 26.05.2019
# Feature Name: Verifying uploaded files in Light Pollution Reduction Form - Fixture Sheilding
# Feature Description: Verifying uploaded files in Light Pollution Reduction Form - Fixture Sheilding which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Light Pollution Reduction Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of shielding information for each luminaire
    Given User has to see the table of uploaded files on shielding information for each luminaire
    Then User verifies the file name uploaded with the file name present in the table of shielding information for each luminaire

  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of site plan, with scale and any related site features
    Given User has to see the table of uploaded files on site plan, with scale and any related site features
    Then User verifies the file name uploaded with the file name present in the table of site plan, with scale and any related site features

  #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files of special circumstances for fixture shielding in Light Pollution Reduction
    Given User has to see the table of uploaded files on special circumstances for fixture shielding in LPR
    Then User verifies the file name uploaded with the file name present in the table of special circumstances for fixture shielding in LPR
