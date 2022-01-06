@Web
@VisualTest
#@SqlDb
Feature: Dashboard and Navigation tests
  As a Practitioner, I should be able to select panel groups
  and navigate to pages required to complete HR tasks

  Scenario Outline: People task group navigation 2 to 3 deep task panels
    Given a user having valid credentials
    And I go to the "Ehrms Dashboard" page
    And I select global search "<Item Name>" under "<Bar Name>"
    And I should see the "Ok" button is shown
    Examples:
      | Menu Group | Menu Name         | Bar Name      | Item Name             | Panel Group Name |
      | People     | Personnel Actions | Quick Hire    | Hire Employee         | JOB_DATA_EXP1    |
      | People     | Personnel Actions | Hire Employee | HR Information (Hire) | JOB_DATA_HIRE    |

  Scenario Outline: People task group navigation 2 to 3 deep task panels
    Given a user having valid credentials
    And I go to the "Ehrms Dashboard" page
    And I select global search "<Item Name>" under "<Bar Name>"
    Then I should see the "Search" button is shown
    When I click on the "Search" button
    Then I should see "<Item Name>" slide-in title
    Examples:
      | Menu Group      | Menu Name                                | Bar Name                                         | Item Name                             | Panel Group Name   |
      | People          | Leave of Absence Administration (People) | Manage Leave of Absence                          | Absence Details                       | ABSENCE_HISTORY    |
      | People          | Personnel Actions                        | Verify Employee Information                      | View Employee Paychecks               | AL_CHK_DATA        |
      | People          | Personnel Actions                        | Hire Employee                                    | General Deductions                    | AL_GENL_DED_DATA   |
      | People          | Personnel Actions                        | Change Pay Rate                                  | Status Flags/Dates/Other              | AL_USER_DEFINED    |
      | People          | Personnel Actions                        | Rehire/Recall Employee                           | Employee Direct Deposit Accounts      | DIR_DEP            |
      | People          | Personal Information                     | Change Emergency Contact                         | Emergency Contact                     | EMERGENCY_CONTACT  |
      | People          | Employee Discipline (People)             | Post a Note                                      | Notebook                              | GENL_COMMENTS      |
      | People          | Maintain Benefit Coverages (People)      | Maintain Benefits                                | Health Benefits                       | HEALTH_BENEFITS1   |
      | People          | Leave of Absence Administration (People) | Manage Leave of Absence                          | HR User Defined Information           | HR_USER_DEFINED    |
      | People          | Terminations                             | Layoff Employee                                  | Layoff                                | JOB_DATA           |
      | People          | Personnel Actions                        | Assign Employee to Multiple Jobs                 | Multiple Jobs                         | JOB_DATAX          |
      | People          | Personnel Actions                        | Review Personnel Actions History                 | Personnel Actions History             | JOB_SUMMARY        |
      | People          | Employee Development (People)            | Manage Employee Competencies                     | Licenses Certificates and Memberships | LICENSES_CERTIFS   |
      | People          | Personnel Actions                        | Verify Compensation                              | Pay Rate                              | PAY_RT_CHANGE1     |
      | People          | Record Benefit Events (People)           | Family Status & Administrative Correction Events | Personal Information                  | PERSONAL_DATA      |
      | People          | Maintain Benefit Coverages (People)      | Maintain Benefits                                | Savings Plans                         | SAVINGS_PLANS1     |
      | People          | Personnel Actions                        | Transfer Employee                                | Tax Information                       | TAX_DATA           |
      | People          | Terminations                             | Terminate Employee                               | Termination                           | UI_TERM_PROCESS    |
      | People          | Personnel Actions                        | Verify Employee Information                      | Employee Profile                      | VERIFY_EMPLOYMENT  |
      | People          | Personnel Actions                        | View Transferred Employee History                | HR Information                        | VIEW_TRANS_EMP     |
      | People          | Personnel Actions                        | Verify Employee Information                      | View Controlled Hours                 | YTD_CNTL_HOURS     |
      | Payroll         | ProBusiness Payroll Processes            | Step 2: Process/Review Deductions                | Calculate Deductions                  | AL_DEDCALC_RUN     |
      | Payroll         | Autolink Processes                       | Run Autolink Deduction Calculation Processes     | Unconfirm Deductions                  | AL_DEDUNCN_RUN     |
      | Payroll         | Payroll Cycle                            | Step 7: Process Payroll                          | Create ADP Payroll File               | AL_PFT             |
      | Payroll         | Autolink Processes                       | Run Autolink Pay Cycle Processes                 | Transmit Files                        | AL_TRANSMIT_FILES  |
      | Payroll         | Autolink Processes                       | Run Autolink Pay Cycle Processes                 | Transmittal                           | AL_TRANSMITTAL     |
      | Payroll         | Employee Information and Processes       | View Employee Paychecks                          | View Single Check                     | CHECK_REVERSAL     |
      | Payroll         | Post Payroll Cycle                       | CheckMate                                        | Manage Requests                       | CHECKMATE          |
      | Payroll         | Post Payroll Cycle                       | CheckMate                                        | Review/Post/Print Checks              | CHECKMATE_RESULTS  |
      | Payroll         | Employee Information and Processes       | Time and Attendance Interface - TimeSaver        | Employee TLM Identification           | EMPLOYEE_TLM_DATA  |
      | Payroll         | Employee Information and Processes       | Time and Attendance Interface - TimeSaver        | Import Pay Information                | EPIP_FILE_LOAD     |
      | Payroll         | Post Payroll Cycle                       | CheckMate                                        | Enter/Submit Checks                   | HOURS_AND_EARNINGS |
      | Payroll         | Employee Information and Processes       | Administer Liens/Garnishments                    | Employee Lien/Garnishment             | LIEN_DATA          |
      | Payroll         | Payroll Cycle                            | Step 3: Modify Pay Period Information            | Modify Pay Information                | PAYDATA_ENTRY      |
      | Payroll         | Post Payroll Cycle                       | Research/Correct Employee Deductions             | Record Deduction Corrections          | PDE_BATCHES        |
      | Payroll         | Payroll Cycle                            | Step 2: Enter Pay Period Information             | Enter Adjustments: Voids/Corrections  | PPV_BATCHES        |
      | Payroll         | Post Payroll Cycle                       | View Checks/Reversals/Adjustments                | Adjustments: Voids/Corrections        | PREPAID_VOID       |
      | Payroll         | Autolink Processes                       | Run Autolink Pay Cycle Processes                 | QuickView                             | QUICK_VIEW         |
      | Payroll         | Post Payroll Cycle                       | CheckMate                                        | Request                               | REQUEST_DESCR      |
      | Payroll         | ProBusiness Payroll Processes            | Step 1: Start New Payroll Cycle                  | Deduction Calculation Settings        | RUNCTL_AL_DED_CALC |
      | Staffing        | Recruiting Activity                      | Quick Hire Applicant                             | Hire Applicant                        | JOB_DATA_EXP0      |
      | Staffing        | Recruiting Activity                      | Select Applicant                                 | Hire Applicant                        | JOB_DATA0          |
      | Message Monitor | Message Monitor Administration           | Messages                                         | Monitor Messages                      | MESSAGE_MONITOR    |

