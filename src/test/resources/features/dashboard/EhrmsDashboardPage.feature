@Web
Feature: Dashboard and Navigation tests
  As a Practitioner, I should be able to select panel groups
  and navigate to pages required to complete HR tasks

  @NAS
  Scenario Outline: People task group navigation 2 to 3 deep task panels
    Given a user having valid credentials
    And I go to the "Ehrms Dashboard" page
    When I tap the navigation links and see the corresponding task panel
      | <Level 0> | <Level 1> | <Level 2> | <Level 3> |
    Then I should see the "<Check for>" field is available on "<Landing Page>" page
#    And the user logs off
    Examples:
      | Landing Page         | Check for     | Level 0 | Level 1                       | Level 2                         | Level 3                     |
      | Hire Employee Common | Last Name     | People  | Employee Development (People) | Manage Employee Competencies    | Skills                      |
      | Hire Employee Common | Last Name     | People  | Personnel Actions             | Hire Employee                   | General Deductions          |
      | Hire Employee Common | Last Name     | People  | Personnel Actions             | Hire Employee                   | Status Flags/Dates/Other    |
      | Hire Employee Common | Last Name     | People  | Personnel Actions             | Hire Employee                   | HR User Defined Information |
      | Hire Employee Common | Last Name     | People  | Personnel Actions             | Hire Employee                   | Tax Withholding             |
      | Hire Employee Common | Last Name     | People  | Personnel Actions             | Quick Hire                      | Tax Withholding             |
      | Hire Employee Common | Last Name     | People  | Personnel Actions             | Change Job/Position Information | Change Job/Position         |
      | Hire Employee        | Empl ID Label | People  | Personnel Actions             | Hire Employee                   | HR Information (Hire)       |
      | Hire Employee        | Empl ID Label | People  | Personnel Actions             | Quick Hire                      | Hire Employee               |
