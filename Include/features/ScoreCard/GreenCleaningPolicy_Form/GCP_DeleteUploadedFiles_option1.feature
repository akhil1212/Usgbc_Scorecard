#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Delete uploaded files in Green Cleaning Policy Form
# Feature Description: Delete uploaded files in Green Cleaning Policy Form - In-house green cleaning policy which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Green Cleaning Policy

  #Scenario-1
  @DeleteFiles
  Scenario: Deleting files from In-house green cleaning policy
  	Given User has to see the table of uploaded files on Green Cleaning Policy
    When User deletes the uploaded files of Green Cleaning Policy
    Then User can see all the Green Cleaning Policy are deleted

  #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from special circumstances for In-house green cleaning policy in Green Cleaning Policy
    Given User has to see the table of uploaded files on special circumstances for In-house green cleaning policy in GCP
    When User deletes the uploaded files of special circumstances for In-house green cleaning policy in GCP
    Then User can see the special circumstances for In-house green cleaning policy in GCP files deleted
