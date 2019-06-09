#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Deleting the uploaded files in Integrated Pest Management Form - Certified IPM Service
# Feature Description: Deleting the uploaded files in Integrated Pest Management Form - Certified IPM Service which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the uploaded files in Integrated Pest Management Form

#Scenario-1
  @DeleteFiles
  Scenario: Deleting files from integrated pest management service contract
    Given User has to see the table of uploaded files on integrated pest management service contract
    When User deletes the uploaded files of integrated pest management service contract
    Then User can see all the integrated pest management service contract files are deleted

#Scenario-2
  @DeleteFiles
  Scenario: Deleting files from the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Given User has to see the table of uploaded files on the information showing the contractor’s GreenPro, EcoWise, GreenShield
    When User deletes the uploaded files of the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Then User can see all the the information showing the contractor’s GreenPro, EcoWise, GreenShield files are deleted
    
    #Scenario-3
  @DeleteFiles
  Scenario: Deleting files from special circumstances for Integrated Pest Management
    Given User has to see the table of uploaded files on special circumstances for Integrated Pest Management
    When User deletes the uploaded files of special circumstances for Integrated Pest Management
    Then User can see all the special circumstances for Integrated Pest Management files are deleted

