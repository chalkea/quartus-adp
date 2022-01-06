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

  Scenario Outline: Check for removed tasks
    Given a user having valid credentials
    And I go to the "Ehrms Dashboard" page
    When I tap the navigation links and see the corresponding task panel
      | <MENU GROUP> | <MENU NAME> | <BAR NAME> |
    Then User should not see "<ITEM NAME>" in LEFT NAVIGATION MENU

    @Smoke
    Examples:
      | MENU GROUP                | MENU NAME                                          | BAR NAME                                       | ITEM NAME                                       |
      | Compensation              | Compensation Reports                               | Reports                                        | Job Grading By Evaluation Points (CMP002)       |
      | People                    | Personnel Actions                                  |                                                | Review Prior Work Experience                    |
    @TaskRemoval
    Examples:
      | MENU GROUP                | MENU NAME                                          | BAR NAME                                       | ITEM NAME                                       |
      | Compensation              | Compensation Reports                               | Reports                                        | Job Code Table (PER709A)                        |
      | Compensation              | Compensation Reports                               | Reports                                        | Database Audit (PER029)                         |
      | Compensation              | Compensation Reports                               | Reports                                        | Currency Rate Table (PER714)                    |
      | Compensation              | Compensation Reports                               | Reports                                        | Currency Code Table (PER713)                    |
      | Compensation              |                                                    |                                                | Long Term Incentives                            |
      | Compensation              |                                                    |                                                | Performance Management                          |
      | Compensation              | Performance-Based Pay Administration               | Compensation Manager and Budget Administration | Allocate/Modify Budget Pool                     |
      | Compensation              | Performance-Based Pay Administration               | Compensation Manager and Budget Administration | Define Compensation Managers & Budgets (CMP010) |
      | Compensation              | Performance-Based Pay Administration               | Merit/Bonus Worksheets                         | Create Detail for Manager Worksheets (CMP011)   |
      | Compensation              | Performance-Based Pay Administration               | Modify Existing Worksheets                     | Add Employee to Worksheets (CMP011)             |
      | People                    | Employee Development (People)                      | Manage Employee Competencies                   | Print Competency Profile (TRN010)               |
      | People                    | Employee Development (People)                      | Manage Employee Competencies                   | Update Suspended KSAs Report (TDUTL008)         |
      | People                    | Reports                                            | People Reports                                 | Competency Profile (TRN010)                     |
      | People                    | Reports                                            | People Reports                                 | Employee Training History Report (TRN004)       |
      | Performance & development | Employee Development (Performance and Development) | Design Career Plan                             | Plan Details                                    |
      | Performance & development | Employee Training                                  |                                                | Design Development Plan                         |
      | Performance & development | Employee Training                                  |                                                | Enroll in Training                              |
      | Performance & development | Employee Training                                  |                                                | Identify Training Gaps                          |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Create Performance Review Worksheets (PER044)   |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Modify Existing Worksheet Assignments           |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Performance Factor Categories                   |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Performance Factor Levels                       |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Performance Factors and Goals                   |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Performance Management Templates                |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Run External Review Software Export (PER046)    |
      | Performance & development | Performance Management Plans                       | Manage Performance Management Plans            | Run External Review Software Import (PER045)    |
      | Performance & development |                                                    |                                                | Performance and Development Reports             |
      | Performance & development |                                                    |                                                | Training Administration                         |
      | System admin              | Human Resources Setup (Optional)                   | Manage Performance-Based Pay                   | Compensation Managers and Budget Pools (CMP010) |
      | System admin              | Human Resources Setup (Optional)                   | Manage Performance-Based Pay                   | Manager Budget Pool Allocation                  |
      | System admin              | Human Resources Setup (Optional)                   | Manage Salary Administration                   | Stock Option Plans                              |
      | System admin              | Training Setup (Optional)                          |                                                | Step 2:  Manage Sessions                        |
