Feature: People International
  As a Practitioner I want to be able to address international HR requirements in
  our Enterprise HR Application

  @People
  Scenario Outline: Set up development Factors - Education
    Given a user having valid credentials
      | Environment | Client    | User Type    | User Id         | Password |
      | DIT         | E5048AWS  | Practitioner | atoole@e5048aws | Adpadp02 |
      | FIT         | E6BOAWS   | Practitioner | atoole1@e6boaws | Adpadp02 |
      | UAT         | trng31uat | Practitioner | atoole1@adp     | Adpadp02 |
    And I go to the "Ehrms Dashboard" page
    Then I tap the navigation links and see the corresponding task panel
      | <Level 0> | <Level 1> | <Level 2> | <Level 3> |
    When I click on the "Search" button
    Then I should see the "<Check for>" field is present on "<Landing Page>" page
    #
    Examples:
      | Landing Page | Check for      | Level 0      | Level 1                   | Level 2                             | Level 3   |
      | Education    | Matches found: | System admin | Training Setup (Optional) | Step 3:  Set Up Development Factors | Education |
