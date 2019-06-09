#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Gelli Akhil																			                                                     Reviewer    :
# Date   : 	03.06.2019											                                                                     Reviewed On :
# Last Updated By: Gelli Akhil
# Last Updated On: 03.06.2019
# Feature Name: Verifying the negative cases for file uploads GCP
# Feature Description: Verifying the negative cases for file uploads GCP - Certified cleaning service which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads GCP

  #Scenario-1
  @NegativeTest
  Scenario: 
    Given User should see the radio button option CertifiedCleaningService
    When User clicks on save button without entering any data in GCP
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for Cleaning Contract
    Given User should be able to see the Add File button of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy
    When User uploads a file which is greater than 100mb of Cleaning Contract <Green_Cleaning>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Green_Cleaning |
      | 102MBfile.pdf  |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in Cleaning Contract
  	Given User should be able to see the Add File button of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy
    When User uploads a file of Cleaning Contract <Green_Cleaning>
    Then User clicks on save while the file is uploading in GCP
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Green_Cleaning |
      | 24MBfile.doc   |

 
  #Scenario-4
	@NegativeTest
	Scenario:
		Given User should be able to see the textbox for green cleaning service is certified by
		When User enters data more than 100 characters in green cleaning service is certified by
		Then User should not be able to see the complete entered value in green cleaning service is certified by

 #Scenario-5
@NegativeTest
Scenario:
		Given User should be able to see the textbox for green cleaning service is certified by
		When User enters the data Zero for green cleaning service is certified by
		Then User clicks on save button in GCP
		And User checks the error message saying Please fix the highlighted errors will be displayed in GCP
  
 #Scenario-6
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy
   Given User should be able to see the Add File button of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy
    When User uploads a file which is greater than 100mb of information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy <info_showing>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | info_showing  |
      | 102MBfile.pdf |

 #Scenario-7
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB of information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy
  Given User should be able to see the Add File button of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy
    When User uploads a file of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy <info_showing>
    Then User clicks on save while the file is uploading in GCP
    And An error message saying Please wait running actions to complete will be displayed
    And User clicks on clear draft and confirms in GCP

    Examples: 
      | info_showing |
      | 24MBfile.doc |
      
   
   
