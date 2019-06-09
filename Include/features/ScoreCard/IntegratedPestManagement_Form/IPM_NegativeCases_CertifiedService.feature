#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	04.06.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 04.06.2019
# Feature Name:  Verifying the negative cases for file uploads in Integrated Pest Management Form - Certfied IPM Services
# Feature Description: Verifying the negative cases for file uploads in Integrated Pest Management Form - Certfied IPM Services which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads in Integrated Pest Management Form

  #Scenario-1
  @NegativeTest
  Scenario: 
    Given User should be Certfied IPM Services option
    When User clicks on save button without entering any data
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario: 
    Given User should be able to see the textbox for integrated pest management service is certified and in good standing with
    When User enters the data more than 100 characters for integrated pest management service is certified and in good standing with
    Then User should not be able to see the complete entered value in integrated pest management service is certified and in good standing with

  #Scenario-3
  @NegativeTest
  Scenario: 
    Given User should be able to see the textbox for integrated pest management service is certified and in good standing with
    When User enters the data Zero for integrated pest management service is certified and in good standing with
    Then User clicks on integrated pest management save button
    And User checks the error message saying Please fix the highlighted errors will be displayed

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for integrated pest management service contract
    Given User should be able to see the Add File button for integrated pest management service contract
    When User uploads a file which is greater than 100mb of integrated pest management service contract <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in integrated pest management service contract
    Given User should be able to see the Add File button for integrated pest management service contract
    When User uploads a file of integrated pest management service contract <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Given User should be able to see the Add File button for the information showing the contractor’s GreenPro, EcoWise, GreenShield
    When User uploads a file which is greater than 100mb of the information showing the contractor’s GreenPro, EcoWise, GreenShield <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in the information showing the contractor’s GreenPro, EcoWise, GreenShield
    Given User should be able to see the Add File button for the information showing the contractor’s GreenPro, EcoWise, GreenShield
    When User uploads a file of the information showing the contractor’s GreenPro, EcoWise, GreenShield <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | FileName     |
      | 24MBfile.doc |

  #Scenario-8
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for special circumstances for Integrated Pest Management
    Given User should be able to see the Add File button of special circumstances for In house IPM program in Integrated Pest Management
    When User uploads a file which is greater than 100mb of special circumstances for Integrated Pest Management <FileName>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | FileName      |
      | 102MBfile.pdf |

  #Scenario-9
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in special circumstances for Integrated Pest Management
    Given User should be able to see the Add File button of special circumstances for In house IPM program in Integrated Pest Management
    When User uploads a file of special circumstances for Integrated Pest Management <FileName>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User clicks on clear draft and confirms

    Examples: 
      | FileName     |
      | 24MBfile.doc |
