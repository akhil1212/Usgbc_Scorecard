#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Verifying the negative cases for file uploads GCP
# Feature Description: Verifying the negative cases for file uploads GCP - In-house green cleaning policy which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads GCP

  #Scenario-1
  @NegativeTest
  Scenario: 
    Given User should be In-house green cleaning policy option
    When User clicks on save button without entering any data in GCP
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Green Cleaning Policy
    Given User should be able to see the Add File button of Green Cleaning Policy
    When User uploads a file which is greater than 100mb of Green Cleaning Policy <Green_Cleaning>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Green_Cleaning |
      | 102MBfile.pdf  |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Green_Cleaning
    Given User should be able to see the Add File button of Green Cleaning Policy
    When User uploads a file of Green_Cleaning <Green_Cleaning>
    Then User clicks on save while the file is uploading in GCP
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Green_Cleaning |
      | 24MBfile.doc   |


  #Scenario-4
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in special circumstances for In-house green cleaning policy in Green Cleaning Policy
    Given User should be able to see the Add File button of special circumstances for In-house green cleaning policy in Green Cleaning Policy
    When User uploads a file which is greater than 100mb of special circumstances for In-house green cleaning policy in Green Cleaning Policy <Spl_Circ>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Spl_Circ      |
      | 102MBfile.pdf |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB of special circumstances for In-house green cleaning policy in Green Cleaning Policy
    Given User should be able to see the Add File button of special circumstances for In-house green cleaning policy in Green Cleaning Policy
    When User uploads a file of special circumstances for In-house green cleaning policy in Green Cleaning Policy <Spl_Circ>
    Then User clicks on save while the file is uploading in GCP
    And An error message saying Please wait running actions to complete will be displayed
    And User clicks on clear draft and confirms in GCP

    Examples: 
      | Spl_Circ     |
      | 24MBfile.doc |
      
   
   
