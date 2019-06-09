#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Delete uploaded files in Green Cleaning Policy Form
# Feature Description: Delete uploaded files in Green Cleaning Policy Form - Certified cleaning service which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Green Cleaning Policy

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from Cleaning Contract
    Given User has to see the table of uploaded files on Cleaning Contract
    When User deletes the uploaded files of Cleaning Contract
    Then User can see all the Cleaning Contract are deleted

  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy
    Given User has to see the table of uploaded files on information showing the contractor’s GS-42 for Certified cleaning service in GCP
    When User deletes the uploaded files of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP
    Then User can see the special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP files deleted
