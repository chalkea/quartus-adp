Feature: Dashboard and Navigation tests
  As a Practitioner, I should be able to select panel groups
  and navigate to pages required to complete HR tasks

  @PlanningAndAnalysis
  Scenario Outline: People task group navigation 2 to 3 deep task panels
    Given a user having valid credentials
      | Environment | Client    | User Type    | User Id         | Password |
      | DIT         | E5048AWS  | Practitioner | atoole@e5048aws | Adpadp02 |
      | FIT         | E6BOAWS   | Practitioner | atoole1@e6boaws | Adpadp02 |
      | UAT         | trng31uat | Practitioner | atoole1@adp     | Adpadp02 |
    And I go to the "Ehrms Dashboard" page
    Then I tap the navigation links and see the corresponding task panel
      | <Level 0> | <Level 1> | <Level 2> | <Level 3> |
    And I should see the "<Check for>" field is available on "<Landing Page>" page
    And the user logs off
    Examples:
      | Landing Page         | Check for       | Level 0             | Level 1             | Level 2          | Level 3              |
      | Position Information | Position Number | Planning & analysis | Position Management | Update Positions | Position Information |
