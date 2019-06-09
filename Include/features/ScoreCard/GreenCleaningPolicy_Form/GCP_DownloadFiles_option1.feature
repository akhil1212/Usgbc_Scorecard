#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Download uploaded files in Green Cleaning Policy Form
# Feature Description: Download uploaded files in Green Cleaning Policy Form - In-house green cleaning policy which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Green Cleaning Policy Form


#Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload the Green Cleaning Policy
  Given User has to see the table of uploaded files on Green Cleaning Policy 
  When User downloads the uploaded files of Green Cleaning Policy
  Then User can see the downloaded file of Green Cleaning Policy successfully 
  
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of special circumstances for In-house green cleaning policy in GCP 
  Given User has to see the table of uploaded files on special circumstances for In-house green cleaning policy in GCP  
  When User downloads the uploaded files of special circumstances for In-house green cleaning policy in GCP  
  Then User can see the downloaded file of special circumstances for In-house green cleaning policy in GCP