package mvc.model.people.personnelActions.hireEmployee;

import mvc.model.ModelInterface;

import java.util.HashMap;

public class EmploymentInformationModel implements ModelInterface {
    private String hireDate;
    private String hireTime;
    private String retireDate;
    private String acquisitionDate;
    private String referralSource;
    private String serviceDate;
    private String service;
    private String civilServiceDate;
    private String coSeniorityDate;
    private String terminationDate;
    private String dateLastWorked;
    private String retirementDate;
    private String expectedReturnDate;
    private String probationDate;
    private String benefitEligibleDate;
    private String businessTitle;
    private String supervisorId;
    private String securityClearance;
    private String creditAssociationId;
    private String unitedWayAreaCode;
    private String ownsFivePercentOrMore;
    private String fulltimeStudent;
    private String comments;

    public EmploymentInformationModel() {
       //initialize default values here,...
    }

    public HashMap<String, String> loadData() {
        HashMap<String, String> employmentInformation = new HashMap<>();
        return employmentInformation;
    }


    //Getters

    public String getHireDate() { return hireDate; }

    public String getHireTime() { return hireTime; }


    //Setters


    public void setHireDate(String hireDate) { this.hireDate = hireDate; }
    public void setHireTime(String hireTime) { this.hireTime = hireTime; }

    @Override
    public String toString() {
        String benefitProgramInfo = (
                "Social Security: " + this.hireDate
                        + "\nBenefit Program: " + this.hireTime
        );
        return benefitProgramInfo;
    }
}
