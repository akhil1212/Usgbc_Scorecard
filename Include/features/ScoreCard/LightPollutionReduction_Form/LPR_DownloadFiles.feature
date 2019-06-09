#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	27.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 27.05.2019
# Feature Name: Downloading the uploaded files in Light Pollution Reduction Form - Perimeter Measurements
# Feature Description: Downloading the uploaded files in Light Pollution Reduction Form - Perimeter Measurements which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Light Pollution Reduction Form

#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of shielding information for each luminaire
  Given User has to see the table of uploaded files on shielding information for each luminaire 
  When User downloads the uploaded files of shielding information for each luminaire
  Then User can see the downloaded file of shielding information for each luminaires succesfully 
  
  #Scenario-2
  @SmokeTest
   Scenario: Downloading the files of site plan, with scale and any related site features
  Given User has to see the table of uploaded files on site plan, with scale and any related site features
  When User downloads the uploaded files of site plan, with scale and any related site features
  Then User can see the downloaded file of site plan, with scale and any related site features
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of special circumstances for fixture shielding in LPR  
  Given User has to see the table of uploaded files on special circumstances for fixture shielding in LPR  
  When User downloads the uploaded files of special circumstances for fixture shielding in LPR  
  Then User can see the downloaded file of special circumstances for fixture shielding in LPR  
