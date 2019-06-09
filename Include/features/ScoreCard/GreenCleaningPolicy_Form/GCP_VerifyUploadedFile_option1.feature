#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Verifying uploaded files in Green Cleaning Policy Form
# Feature Description: Verifying uploaded files in Green Cleaning Policy Form -  In-house green cleaning policy which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Green Cleaning Policy Form

  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files of the Green Cleaning Policy
    Given User has to see the table of uploaded files on Green Cleaning Policy
    Then User verifies the file name uploaded with the file name present in the table of the Green Cleaning Policy

 
  #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files of special circumstances for In-house green cleaning policy in GCP
    Given User has to see the table of uploaded files on special circumstances for In-house green cleaning policy in GCP
    Then User verifies the file name uploaded with the file name present in the table of special circumstances for In-house green cleaning policy in GCP
  