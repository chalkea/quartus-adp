Feature: Set Highest Access Mode
  @HighestAccessMode
  Scenario: Set Highest Access Mode
    Given a user having valid credentials
    And I tap the navigation links and see the corresponding task panel
      | System Admin | System Administration | Operator |Profile|
    When I invoke the java class
    Then the Java Class should execute actions