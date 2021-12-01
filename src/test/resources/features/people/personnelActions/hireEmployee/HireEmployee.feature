Feature: Hire Employee Panel Group
  As a ADP or Practitioner  User, I should be able to navigate to HIRE EMPLOYEE"
  panel group and complete various tasks related new hire tasks

  @GeneralDeductions

  Scenario Outline: General Deductions and Summary task
    Given a user having valid credentials
      | Environment | Client    | User Type    | User Id         | Password |
      | DIT         | E5048AWS  | Practitioner | atoole@e5048aws | Adpadp02 |
      | FIT         | E6BOAWS   | Practitioner | atoole1@e6boaws | Adpadp02 |
      | UAT         | trng31uat | Practitioner | atoole1@adp     | Adpadp02 |
    And I tap the navigation links and see the corresponding task panel
      | <Level 0> | <Level 1> | <Level 2> | <Level 3> |
    And user selects employee having emplid "222009"
    And the employee has one or more general deductions

    When the user selects a general deduction by clicking the hyper link
    Then the slide-in should appear with the general deduction details displayed
    And the EMPLOYEES SELECTED item drop-down should have the employees emplid

    Examples:
      | Level 0 | Level 1           | Level 2       | Level 3            |
      | People  | Personnel Actions | Hire Employee | General Deductions |
#      | People  | Personnel Actions | Hire Employee | General Deductions Summary |
#      | People  | Personnel Actions | Hire Employee | General Deductions Summary |
