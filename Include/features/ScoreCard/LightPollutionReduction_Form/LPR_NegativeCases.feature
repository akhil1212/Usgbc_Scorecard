#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	27.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 28.05.2019
# Feature Name: Filling the Light Pollution Reduction Form - Perimeter Measurements
# Feature Description: Filling the Light Pollution Reduction Form - Perimeter Measurements which is option 2
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Verifying the negative cases for file uploads and table data

  #Scenario-1
  @NegativeTest
  Scenario: 
    Given User should be Fixture Shielding option
    When User clicks on save button without entering any data
    Then An error message saying Please fix the highlighted errors will be displayed

  #Scenario-2
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for shielding information for each luminaire
    Given User should be able to see the Add File button of shielding information for each luminaire
    When User uploads a file which is greater than 100mb of shielding information for each luminaire <Shielding_Info>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Shielding_Info |
      | 102MBfile.pdf  |

  #Scenario-3
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in shielding information for each luminaire
    Given User should be able to see the Add File button of shielding information for each luminaire
    When User uploads a file of shielding information for each luminaire <Shielding_Info>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Shielding_Info |
      | 24MBfile.doc   |

  #Scenario-4
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB for site plan with scale and any related site features
    Given User should be able to see the Add File button for site plan with scale and any related site features
    When User uploads a file which is greater than 100mb for site plan with scale and any related site features <Site_Plan>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Site_Plan     |
      | 102MBfile.pdf |

  #Scenario-5
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in site plan with scale and any related site features
    Given User should be able to see the Add File button for site plan with scale and any related site features
    When User uploads a file for site plan with scale and any related site features <Site_Plan>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed

    Examples: 
      | Site_Plan    |
      | 24MBfile.doc |

  #Scenario-6
  @NegativeTest
  Scenario Outline: Saving the form while uploading the file in special circumstances for fixture shielding in Light Pollution Reduction
    Given User should be able to see the Add File button of special circumstances for fixture shielding in Light Pollution Reduction
    When User uploads a file which is greater than 100mb of special circumstances for fixture shielding in Light Pollution Reduction <Spl_Circ>
    Then An error message saying Maximum allowed file size is 100 MB only will be displayed

    Examples: 
      | Spl_Circ      |
      | 102MBfile.pdf |

  #Scenario-7
  @NegativeTest
  Scenario Outline: Uploading files greater than 100MB of special circumstances for fixture shielding in Light Pollution Reduction
    Given User should be able to see the Add File button of special circumstances for fixture shielding in Light Pollution Reduction
    When User uploads a file of special circumstances for fixture shielding in Light Pollution Reduction <Spl_Circ>
    Then User clicks on save while the file is uploading
    And An error message saying Please wait running actions to complete will be displayed
    And User clicks on clear draft and confirms 

    Examples: 
      | Spl_Circ     |
      | 24MBfile.doc |
      
   
   
