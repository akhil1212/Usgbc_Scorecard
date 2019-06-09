#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Downloading the uploaded files in Integrated Pest Management Form - In-house IPM program
# Feature Description: Downloading the uploaded files in Integrated Pest Management Form - In-house IPM program which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Integrated Pest Management Form


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of integrated pest management plan
  Given User has to see the table of uploaded files on integrated pest management plan
  When User downloads the uploaded files of integrated pest management plan
  Then User can see the downloaded file of integrated pest management plan
  
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of the examples of the documentation used by the project
  Given User has to see the table of uploaded files on the examples of the documentation used by the project
  When User downloads the uploaded files of the examples of the documentation used by the project
  Then User can see the downloaded file of the examples of the documentation used by the project
  
  
   #Scenario-3
  @SmokeTest
  Scenario: Downloading the files of Pesticide application list
  Given User has to see the table of uploaded files on Pesticide application list
  When User downloads the uploaded files of Pesticide application list
  Then User can see the downloaded file of Pesticide application list