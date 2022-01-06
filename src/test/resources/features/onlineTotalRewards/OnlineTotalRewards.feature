@Web
Feature: Online Total Rewards

  @otr
  Scenario: Practitioner User view Total Compensation verify correct amounts - (myself) vs. employee (someone else)
    Given a practitioner "Bray, Alice - APBEMP2" is logged in for OTR client
    When the practitioner views "Payroll" "Total Compensation" for "Taylor, Andrew - 910901"
    Then I should see the following Total Compensation of
      | Total Compensation    | $216,845 |
      | Base Pay              | $80,000  |
      | Company Contributions | $136,845 |
    But when the practitioner views "MySelf" "Total Compensation"
    Then the practitioner should see their Total Compensation of
      | Total Compensation    | $1,076  |
      | Base Pay              | $1,000  |
      | Company Contributions | $25,326 |
