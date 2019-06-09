#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Verifying uploaded files in Green Cleaning Policy Form
# Feature Description: Verifying uploaded files in Green Cleaning Policy Form - Certified cleaning service which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Green Cleaning Policy Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of Cleaning Contract
    Given User has to see the table of uploaded files on Cleaning Contract
    Then User verifies the file name uploaded with the file name present in the table of Cleaning Contract

  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of information showing the contractor’s GS-42 for Certified cleaning service in GCP
    Given User has to see the table of uploaded files on information showing the contractor’s GS-42 for Certified cleaning service in GCP
    Then User verifies the file name uploaded with the file name present in the table of information showing the contractor’s GS-42 for Certified cleaning service in GCP

 