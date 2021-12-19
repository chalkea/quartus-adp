package mvc.model.people.personnelActions.hireEmployee;

import mvc.model.ModelInterface;

import java.util.HashMap;
import java.util.Map;

public class JobPayLocationModel implements ModelInterface {
    private String effectiveDate;
    private String current;
    private String effectiveDateSequence;
    private String action;
    private String reasonCode;
    private String company;
    private String payGroup;
    private String employeeType;
    private String workLocation;
    private String reportingLocation;
    private String geogDifferential;
    private String holidaySchedule;
    private String salaryPlan;
    private String salaryGrade;
    private String gradeEntryDate;
    private String salaryStep;
    private String stepEntryDate;
    private String nextStepDate;
    private String variablePlan;
    private String variablePlanEntryDate;
    private String splitBase;
    private String splitVariable;
    private String allowDraw;

    public JobPayLocationModel() {
        this.action = "Hire";
    }

    @Override
    public Map<String, String> loadData() {
        HashMap<String, String> jobPayLocationData = new HashMap<>();
        //Initialize variables here,..
        return jobPayLocationData;
    }

    @Override
    public String toString() {
        String jobStatusInfo =
                          "\nEffective Date: " + this.effectiveDate
                        + "\nCurrent: " + this.current
                        + "\nEffective Date Sequence No.: " + this.effectiveDateSequence
                        + "\nPay Group: " + this.payGroup
                        + "\nAction: " + this.action
                        + "\nCompany: " + this.company
                        + "\nReason Code: " + this.reasonCode
                        + "\nEmployee Type: " + this.employeeType
                        + "\nWork Location: " + this.workLocation
                        + "\nReporting Location: " + this.reportingLocation
                        + "\nGeog Differential: " + this.geogDifferential
                        + "\nHoliday Schedule: " + this.holidaySchedule
                        + "\nSalary Plan: " + this.salaryPlan
                        + "\nSalary Grade: " + this.salaryGrade
                        + "\nGrade Entry Date: " + this.gradeEntryDate
                        + "\nSalary Step: " + this.salaryStep
                        + "\nStep Entry Date: " + this.stepEntryDate
                        + "\nNext Step Date: " + this.nextStepDate
                        + "\nVariable Plan: " + this.variablePlan
                        + "\nVarialbe Plan Entry Date: " + this.variablePlanEntryDate
                        + "\nSplit Base: " + this.splitBase
                        + "\nSplit Variable: " + this.splitVariable
                        + "\nAllow Draw: " + this.allowDraw
                ;
        return jobStatusInfo;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public String getCurrent() {
        return current;
    }

    public String getEffectiveDateSequence() {
        return effectiveDateSequence;
    }

    public String getAction() {
        return action;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public String getCompany() {
        return company;
    }

    public String getPayGroup() {
        return payGroup;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public String getReportingLocation() {
        return reportingLocation;
    }

    public String getGeogDifferential() {
        return geogDifferential;
    }

    public String getHolidaySchedule() {
        return holidaySchedule;
    }

    public String getSalaryPlan() {
        return salaryPlan;
    }

    public String getSalaryGrade() {
        return salaryGrade;
    }

    public String getGradeEntryDate() {
        return gradeEntryDate;
    }

    public String getSalaryStep() {
        return salaryStep;
    }

    public String getStepEntryDate() {
        return stepEntryDate;
    }

    public String getNextStepDate() {
        return nextStepDate;
    }

    public String getVariablePlan() {
        return variablePlan;
    }

    public String getVariablePlanEntryDate() {
        return variablePlanEntryDate;
    }

    public String getSplitBase() {
        return splitBase;
    }

    public String getSplitVariable() {
        return splitVariable;
    }

    public String getAllowDraw() {
        return allowDraw;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public void setEffectiveDateSequence(String effectiveDateSequence) {
        this.effectiveDateSequence = effectiveDateSequence;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPayGroup(String payGroup) {
        this.payGroup = payGroup;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public void setReportingLocation(String reportingLocation) {
        this.reportingLocation = reportingLocation;
    }

    public void setGeogDifferential(String geogDifferential) {
        this.geogDifferential = geogDifferential;
    }

    public void setHolidaySchedule(String holidaySchedule) {
        this.holidaySchedule = holidaySchedule;
    }

    public void setSalaryPlan(String salaryPlan) {
        this.salaryPlan = salaryPlan;
    }

    public void setSalaryGrade(String salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public void setGradeEntryDate(String gradeEntryDate) {
        this.gradeEntryDate = gradeEntryDate;
    }

    public void setSalaryStep(String salaryStep) {
        this.salaryStep = salaryStep;
    }

    public void setStepEntryDate(String stepEntryDate) {
        this.stepEntryDate = stepEntryDate;
    }

    public void setNextStepDate(String nextStepDate) {
        this.nextStepDate = nextStepDate;
    }

    public void setVariablePlan(String variablePlan) {
        this.variablePlan = variablePlan;
    }

    public void setVariablePlanEntryDate(String variablePlanEntryDate) {
        this.variablePlanEntryDate = variablePlanEntryDate;
    }

    public void setSplitBase(String splitBase) {
        this.splitBase = splitBase;
    }

    public void setSplitVariable(String splitVariable) {
        this.splitVariable = splitVariable;
    }

    public void setAllowDraw(String allowDraw) {
        this.allowDraw = allowDraw;
    }
}
