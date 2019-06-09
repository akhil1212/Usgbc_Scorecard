#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Download uploaded files in Green Cleaning Policy Form
# Feature Description: Download uploaded files in Green Cleaning Policy Form - Certified cleaning service which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Download files from Green Cleaning Policy Form


  
  #Scenario-1
  @SmokeTest
  Scenario: Downloading the files of Upload the Cleaning Contract
  Given User has to see the table of uploaded files on Cleaning Contract 
  When User downloads the uploaded files of Cleaning Contract
  Then User can see the downloaded file of Cleaning Contract successfully 
  
  
  #Scenario-2
  @SmokeTest
  Scenario: Downloading the files of information showing the contractor’s GS-42 for Certified cleaning service in GCP 
  Given User has to see the table of uploaded files on information showing the contractor’s GS-42 for Certified cleaning service in GCP  
  When User downloads the uploaded files of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP  
  Then User can see the downloaded file of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP
  