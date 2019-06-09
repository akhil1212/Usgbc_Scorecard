#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name:  Verifying the negative cases for file uploads in Integrated Pest Management Form - In-house IPM Program
# Feature Description: Verifying the negative cases for file uploads in Integrated Pest Management Form - In-house IPM Program which is option 1
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Integrated Pest Management Form

#Scenario-1
  @NegativeTest
  Scenario: 
    Given User should be in In-house IPM Program option
    When User clicks on save button without entering any data
    Then An error message saying Please fix the highlighted errors will be displayed
    
    
 #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for integrated pest management plan
    Given User should be able to see the Add File button for integrated pest management plan
    When User uploads a file which is greater than 100mb of integrated pest management plan <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in integrated pest management plan
    Given User should be able to see the Add File button for integrated pest management plan
    When User uploads a file of integrated pest management plan <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    
    Examples: 
      | FileName     |
      | 24MBfile.doc |
      
      
      #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for the examples of the documentation used by the project
    Given User should be able to see the Add File button for the examples of the documentation used by the project
    When User uploads a file which is greater than 100mb of the examples of the documentation used by the project <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in the examples of the documentation used by the project
    Given User should be able to see the Add File button for the examples of the documentation used by the project
    When User uploads a file of the examples of the documentation used by the project <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |
      
      
     #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Pesticide application list
    Given User should be able to see the Add File button for Pesticide application list
    When User uploads a file which is greater than 100mb of Pesticide application list <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading Pesticide application list
    Given User should be able to see the Add File button for Pesticide application list
    When User uploads a file of special circumstances for Pesticide application list <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User clicks on clear draft and confirms

    Examples: 
      | FileName     |
      | 24MBfile.doc |
    