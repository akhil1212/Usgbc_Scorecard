#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Saravana Sabareesh V														                                                     Reviewer    :
# Date   : 	27.05.2019											                                                                     Reviewed On :
# Last Updated By: Saravana Sabareesh V
# Last Updated On: 27.05.2019
# Feature Name: Deleting the table rows except manditory fields in Light Pollution Reduction Form
# Feature Description: Deleting the table rows except manditory fields in Light Pollution Reduction Form
#---------------------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Deleting the table rows except manditory fields in Light Pollution Reduction Form

#Sceanrio-1:
@DeleteFiles
Scenario: Deleting the rows for Contributing Nonroof Measures
Given User should be in Perimeter Measurements
And User can see the Table Site lighting measurements of Perimeter Measurements
When User deletes the rows for Site lighting measurements except mandatory fields
Then User can see all the rows are deleted except the mandatory fields in Site lighting measurements


 