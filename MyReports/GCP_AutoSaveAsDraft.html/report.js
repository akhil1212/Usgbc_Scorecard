$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/ScoreCard/GreenCleaningPolicy_Form/GCP_AutoSaveAsDraft.feature");
formatter.feature({
  "name": "Verifying the AutoSaveAsDraft functionality in the Green Cleaning Policy Form",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "Verifying form draft is not saved if no change in the form in GCP",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Formv01 of Green Cleaning Policy form",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_is_on_the_Formv_of_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will not modify any field on the Green Cleaning Policy form",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_will_not_modify_any_field_on_the_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should not see saving of draft even after 10 seconds in Green Cleaning Policy form",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_should_not_see_saving_of_draft_even_after_seconds_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying form draft is not saved if upload files in the form in GCP",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be able to see Upload fle on Green Cleaning Policy form",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_should_be_able_to_see_Upload_fle_on_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User uploads any file on Green Cleaning Policy form",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_uploads_any_file_on_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should not see saving of draft even after 10 seconds in GCP",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_should_not_see_saving_of_draft_even_after_seconds_in_GCP()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of form data is saved automatically with date and time every 10 seconds when a change in cleaning service narrative",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be able to see the cleaning service narrative in Green Cleaning Policy form",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_should_be_able_to_see_the_cleaning_service_narrative_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User modifies the cleaning service narrative data in the Green Cleaning Policy form form and waits for 10 seconds",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_modifies_the_cleaning_service_narrative_data_in_the_Green_Cleaning_Policy_form_form_and_waits_for_seconds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the draft is saved automatically with date and time for cleaning service narrative in Green Cleaning Policy form",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_cleaning_service_narrative_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of form data is saved automatically with date and time every 10 seconds when a change in Special Circumstances narrative",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be able to see the Special Circumstances narrative in Green Cleaning Policy form",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_should_be_able_to_see_the_Special_Circumstances_narrative_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User modifies the Special Circumstances narrative data in the Green Cleaning Policy form form and waits for 10 seconds",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_modifies_the_Special_Circumstances_narrative_data_in_the_Green_Cleaning_Policy_form_form_and_waits_for_seconds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the draft is saved automatically with date and time for Special Circumstances narrative in Green Cleaning Policy form",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the form draft warning message is not retained when the form is saved in GCP",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User can see the Draft is saved automatically with date and time in Green Cleaning Policy form",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the save button in Green Cleaning Policy form",
  "keyword": "And "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_save_button_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User saves the Green Cleaning Policy form",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_saves_the_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the form draft warning message is not retained in Green Cleaning Policy form",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_verifies_the_form_draft_warning_message_is_not_retained_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of Clear Draft functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User can see the radio button in Green Cleaning Policy form for Certified cleaning service",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_radio_button_in_Green_Cleaning_Policy_form_for_Certified_cleaning_service()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the radio button of Certified cleaning service and waits for 10 seconds",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_clicks_on_the_radio_button_of_Certified_cleaning_service_and_waits_for_10_seconds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the Clear draft in Green Cleaning Policy form",
  "keyword": "And "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_Clear_draft_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Clear draft in Green Cleaning Policy form",
  "keyword": "And "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_clicks_on_Clear_draft_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the draft is cleared in Green Cleaning Policy form",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_draft_is_cleared_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying draft version is not changed and warning message is displayed with date and time after logout and login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User can see the narrative in Green Cleaning Policy form",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_can_see_the_narrative_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User modifies narrative data in Green Cleaning Policy form",
  "keyword": "When "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_modifies_narrative_data_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will logout from the Green Cleaning Policy form",
  "keyword": "And "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_will_logout_from_the_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in again to Green Cleaning Policy form",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_logs_in_again_to_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the warning message is displayed with date and time at the top of the Green Cleaning Policy form",
  "keyword": "And "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies draft version is not changed after logout and login in Green Cleaning Policy form",
  "keyword": "And "
});
formatter.match({
  "location": "AutoSaveAsDraftGCP.user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Green_Cleaning_Policy_form()"
});
formatter.result({
  "status": "passed"
});
});