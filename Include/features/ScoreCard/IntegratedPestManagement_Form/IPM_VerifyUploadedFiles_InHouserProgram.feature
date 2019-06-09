#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Verifying uploaded files in Integrated Pest Management Form - In-house IPM Program
# Feature Description:Verifying uploaded files in Integrated Pest Management Form for In-house IPM Program
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Integrated Pest Management Form
      
  #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files for integrated pest management plan
    Given User has to see the table of uploaded files on integrated pest management plan
    Then User verifies the file name uploaded with the file name present in the table of integrated pest management plan

   #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files for the examples of the documentation used by the project
    Given User has to see the table of uploaded files on the examples of the documentation used by the project
    Then User verifies the file name uploaded with the examples of the documentation used by the project
    
   #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files for Pesticide application list
    Given User has to see the table of uploaded files on Pesticide application list
    Then User verifies the file name uploaded with the file name present in the table of Pesticide application list