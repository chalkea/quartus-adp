Feature: HR Information (HIRE)

  @HrInformationHire
  Scenario Outline: Warriors - Relational Error validation for Phone Type and Phone
    Given Practitioner User is on the "HR Information Hire" page under "Hire Employee"
    And Practitioner enters all employee information and is on the "Additional Rates" page

    When the Practitioner clicks the "Employee Information" link from the "Hire left navigation"
    And selects "CAR - Car Phone" from the "Phone Type" drop
    And clears value from the "Phone" input field
    Then there should be no errors on the "Employee Information" page
    And the Practitioner can click the "Additional Rates" from the left navigation link

    When clicks the "Submit Button"
    Then the "Employee Information" page should display
    And there should be an error message "Phone is required when Phone Type is entered. (1000,601)"
      | Phone is required when Phone Type is entered. (1000,601)                    |
      | Phone is invalid                                                            |
      | You cannot move forward until you have completed everything above. Show me. |

    When the Practitioner clicks the "Employee Information" link from the "Hire left navigation"
    And enters "7705551212" into the "Phone" field
    And clears value from the "Phone Type" input field
    Then there should be no errors on the "Employee Information" page
    And the Practitioner can click the "Additional Rates" from the left navigation link

    When clicks the "Submit Button"
    Then the "Employee Information" page should display
    And there should be an error message ""
      | Phone Type is required when Phone is entered. (1000,601)                    |
      | Phone Type is invalid                                                       |
      | You cannot move forward until you have completed everything above. Show me. |
    @Smoke
    Examples:
      | Phone Type | Phone      | Error Message                                            |
      |            | 6015551212 | Phone Type is required when Phone is entered. (1000,601) |
#    @donotRun
#    Examples:
#      | Phone Type              | Phone      | Error Message                                            |
#      |                         | 6015551212 | Phone Type is required when Phone is entered. (1000,601) |
#      | CEL1 - Cellular Phone 1 |            | Phone is required when Phone Type is entered. (1000,601) |
#      | CEL1 - Cellular Phone 1 | 7705551212 |                                                          |
#      | CEL1 - Cellular Phone 1 | 7705551212 |                                                          |
#      | CEL1 - Cellular Phone 1 | 7705551212 |                                                          |
#      | CEL1 - Cellular Phone 1 | 7705551212 |                                                          |