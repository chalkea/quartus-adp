Feature: Dashboard and Navigation tests
  As a Practitioner, I should be able to select panel groups
  and navigate to pages required to complete HR tasks

  @QuickHire
  Scenario Outline: People task group navigation 2 to 3 deep task panels
    Given a user having valid credentials
    And I go to the "Ehrms Dashboard" page
    Then I tap the navigation links and see the corresponding task panel
      | <Level 0> | <Level 1> | <Level 2> | <Level 3> |
    And I should see the "<Existence of>" field is available on "<Landing Page>" page
    Examples:
    | Landing Page         | Existence of | Level 0 | Level 1           | Level 2                      | Level 3          |
    | Employee Profile     | Last Name    | People  | Personnel Actions | Verify Empoloyee Information | Employee Profile |
    | Hire Employee Common | Last Name    | People  | Personnel Actions | Quick Hire                   | Hire Employee    |
