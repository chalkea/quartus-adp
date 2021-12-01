Feature: Change Job Position functionality
  As a Practitioner, I should be able to select panel groups
  and navigate to pages required to complete HR tasks

  @ChangeJob
  Scenario: People task group navigation 2 to 3 deep task panels
    //@todo: change to only pass environment and credentials in via run configuration
    //@todo: decide on where to pass in the type of user i.e. Practitioner, adpUser, cosUser etc.
    Given a user having valid credentials
#      | Environment | Client    | User Type    | User Id         | Password |
#      | DIT         | E5048AWS  | Practitioner | atoole@e5048aws | Adpadp02 |
#      | FIT         | E6BOAWS   | Practitioner | atoole1@e6boaws | Adpadp03 |
#      | UAT         | trnguat31 | Practitioner | atoole1@adp     | Adpadp02 |
    And I go to the "Change Job" page
