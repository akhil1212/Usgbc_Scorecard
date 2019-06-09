#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name: Verifying uploaded files in Integrated Pest Management Form - Certified IPM Service
# Feature Description:Verifying uploaded files in Integrated Pest Management Form for Certified IPM Service
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying uploaded files in Integrated Pest Management Form


 #Scenario-1
  @SmokeTest
  Scenario: Verifying uploaded files for integrated pest management service contract
    Given User has to see the table of uploaded files on integrated pest management service contract
    Then User verifies the file name uploaded with the file name present in the table of integrated pest management service contract

   #Scenario-2
  @SmokeTest
  Scenario: Verifying uploaded files for the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Given User has to see the table of uploaded files on the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Then User verifies the file name uploaded with the file name present in the table of the information showing the contractor’s GreenPro, EcoWise, GreenShield
    
   #Scenario-3
  @SmokeTest
  Scenario: Verifying uploaded files of special circumstances for Integrated Pest Management
    Given User has to see the table of uploaded files on special circumstances for Integrated Pest Management
    Then User verifies the file name uploaded with the file name present in the table of special circumstances for Integrated Pest Management