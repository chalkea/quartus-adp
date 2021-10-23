Feature: Set Highest Access Mode
  @HighestAccessMode
  Scenario: Set Highest Access Mode
    Given a user having valid credentials
      | Environment | Client    | User Type    | User Id         | Password |
      | DIT         | E5048AWS  | Practitioner | atoole@e5048aws | Adpadp02 |
      | FIT         | E6BOAWS   | Practitioner | atoole1@e6boaws | Adpadp02 |
      | UAT         | trng31uat | Practitioner | atoole1@adp     | Adpadp02 |
    And I tap the navigation links and see the corresponding task panel
      | System Admin | System Administration | Operator |Profile|
    When I invoke the java class
    Then the Java Class should execute actions