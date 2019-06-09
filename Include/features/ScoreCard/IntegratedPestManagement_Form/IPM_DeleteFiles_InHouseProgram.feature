#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Deleting the uploaded files in Integrated Pest Management Form - In-house IPM Program
# Feature Description: Deleting the uploaded files in Integrated Pest Management Form - In-house IPM Program which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Integrated Pest Management Form

#Scenario-1
  @DeleteFiles
  Scenario: Deleting files from integrated pest management plan
    Given User has to see the table of uploaded files on integrated pest management plan
    When User deletes the uploaded files of integrated pest management plan
    Then User can see all the integrated pest management plan files are deleted
    
    
    #Scenario-2
  @DeleteFiles
  Scenario: Deleting files from the examples of the documentation used by the project
    Given User has to see the table of uploaded files on the examples of the documentation used by the project
    When User deletes the uploaded files of the examples of the documentation used by the project
    Then User can see all the the examples of the documentation used by the project files are deleted
    
    
    #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from Pesticide application list
    Given User has to see the table of uploaded files on Pesticide application list
    When User deletes the uploaded files of Pesticide application list
    Then User can see all the Pesticide application list files are deleted