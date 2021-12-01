Feature: Set Highest Access Mode

  @HighestAccessMode
  @SqlDb
  Scenario: Set Highest Access Mode
    Given Practitioner User is on the "Profile" page under "Operator"
    And Practitioner enters "N1234" into the "Operator Id" and select value from search prompt
#    And I tap the navigation links and see the corresponding task panel
#      | System Admin | System Administration | Operator |Profile|
#    When I invoke the java class
#    Then the Java Class should execute actions