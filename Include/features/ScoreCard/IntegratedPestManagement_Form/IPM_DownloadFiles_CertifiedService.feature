#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Downloading the uploaded files in Integrated Pest Management Form - Certified IPM Service
# Feature Description: Downloading the uploaded files in Integrated Pest Management Form - Certified IPM Service which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Integrated Pest Management Form

#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of integrated pest management service contract
  Given User has to see the table of uploaded files on integrated pest management service contract
  When User downloads the uploaded files of integrated pest management service contract
  Then User can see the downloaded file of integrated pest management service contract
  
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of the information showing the contractor’s GreenPro, EcoWise, GreenShield
  Given User has to see the table of uploaded files on the information showing the contractor’s GreenPro, EcoWise, GreenShield
  When User downloads the uploaded files of the information showing the contractor’s GreenPro, EcoWise, GreenShield
  Then User can see the downloaded file of the information showing the contractor’s GreenPro, EcoWise, GreenShield
  
  
  #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of special circumstances for Integrated Pest Management
  Given User has to see the table of uploaded files on special circumstances for Integrated Pest Management
  When User downloads the uploaded files of special circumstances for Integrated Pest Management
  Then User can see the downloaded file of special circumstances for Integrated Pest Management