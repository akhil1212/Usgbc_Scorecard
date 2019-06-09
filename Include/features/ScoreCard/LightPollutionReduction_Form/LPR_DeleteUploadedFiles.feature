#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	25.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 26.05.2019
# Feature Name: Deleting the uploaded files in Light Pollution Reduction Form - Fixture Sheilding
# Feature Description: Deleting the uploaded files in Light Pollution Reduction Form - Fixture Sheilding which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Light Pollution Reduction Form

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from shielding information for each luminaire
    Given User has to see the table of uploaded files on shielding information for each luminaire
    When User deletes the uploaded files of shielding information for each luminaire
    Then User can see all the shielding information for each luminaire files are deleted

  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from site plan, with scale and any related site features
    Given User has to see the table of uploaded files on site plan, with scale and any related site features
    When User deletes the uploaded files of site plan, with scale and any related site features
    Then User can see all the site plan, with scale and any related site features files are deleted

  #Scenario-10
  @DeleteFiles
  Scenario: Deleting files from special circumstances for fixture shielding in Light Pollution Reduction
    Given User has to see the table of uploaded files on special circumstances for fixture shielding in LPR
    When User deletes the uploaded files of special circumstances for fixture shielding in LPR
    Then User can see the special circumstances for fixture shielding in LPR files deleted
