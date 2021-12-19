package mvc.model.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import mvc.model.ModelInterface;
import utils.DateUtilities;

import java.util.HashMap;
import java.util.Map;

public class JobStatusModel implements ModelInterface {
    private String effectiveDate;
    private String current;
    private String effectiveDateSequence;
    private String employeeStatus;
    private String action;
    private String actionDate;
    private String reasonCode;
    private String primaryJob;
    private String contractJob;
    private String position;
    private String positionEntryDate;
    private String overridePositionData;
    private String updatedByPosition;
    private String department;
    private String departmentEntryDate;
    private String jobCode;
    private String jobEntryDate;
    private String reportTo;
    private String timeInJob;

    public JobStatusModel() {
        this.action = "Hire";
    }

    @Override
    public Map<String, String> loadData() {
        HashMap<String, String> jobStatusData = new HashMap<>();

        jobStatusData.put("Action", this.action);
        return jobStatusData;
    }

    @Override
    public String toString() {
        String jobStatusInfo =
                          "\nEffective Date: " + this.effectiveDate
                        + "\nCurrent: " + this.current
                        + "\nEffective Date Sequence No.: " + this.effectiveDateSequence
                        + "\nEmployee Status: " + this.employeeStatus
                        + "\nAction: " + this.action
                        + "\nAction Date: " + this.actionDate
                        + "\nReason Code: " + this.reasonCode
                        + "\nPrimary Job: " + this.primaryJob
                        + "\nContract Job: " + this.contractJob
                        + "\nPosition: " + this.position
                        + "\nPosition Entry Date: " + this.positionEntryDate
                        + "\nOverride Position Data: " + this.overridePositionData
                        + "\nUpdate by Position: " + this.updatedByPosition
                        + "\nDepartment: " + this.department
                        + "\nDepartment Entry Date: " + this.departmentEntryDate
                        + "\nJob Code: " + this.jobCode
                        + "\nJob Entry Date: " + this.jobEntryDate
                        + "\nReport To: " + this.reportTo
                        + "\nTime in Job: " + this.timeInJob
                ;
        return jobStatusInfo;
    }

    public String getEffectiveDate() { return effectiveDate; }

    public String getCurrent() { return current; }

    public String getEffectiveDateSequence() { return effectiveDateSequence; }

    public String getEmployeeStatus() { return employeeStatus; }

    public String getAction() { return action; }

    public String getActionDate() { return actionDate; }

    public String getReasonCode() { return reasonCode; }

    public String getPrimaryJob() { return primaryJob; }

    public String getContractJob() { return contractJob; }

    public String getPosition() { return position; }

    public String getPositionEntryDate() { return positionEntryDate; }

    public String getOverridePositionData() { return overridePositionData; }

    public String getUpdatedByPosition() { return updatedByPosition; }

    public String getDepartment() { return department; }

    public String getDepartmentEntryDate() { return departmentEntryDate; }

    public String getJobCode() { return jobCode; }

    public String getJobEntryDate() { return jobEntryDate; }

    public String getReportTo() { return reportTo; }

    public String getTimeInJob() { return timeInJob; }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    public void setEffectiveDateSequence(String effectiveDateSequence) { this.effectiveDateSequence = effectiveDateSequence; }

    public void setAction(String action) { this.action = action; }

    public void setReasonCode(String reasonCode) { this.reasonCode = reasonCode; }

    public void setPrimaryJob(String primaryJob) { this.primaryJob = primaryJob; }

    public void setContractJob(String contractJob) { this.contractJob = contractJob; }

    public void setPosition(String position) { this.position = position; }

    public void setPositionEntryDate(String positionEntryDate) { this.positionEntryDate = positionEntryDate; }

    public void setOverridePositionData(String overridePositionData) { this.overridePositionData = overridePositionData; }

    public void setUpdatedByPosition(String updatedByPosition) { this.updatedByPosition = updatedByPosition; }

    public void setDepartment(String department) { this.department = department; }

    public void setDepartmentEntryDate(String departmentEntryDate) { this.departmentEntryDate = departmentEntryDate; }

    public void setJobCode(String jobCode) { this.jobCode = jobCode; }

    public void setJobEntryDate(String jobEntryDate) { this.jobEntryDate = jobEntryDate; }

    public void setReportTo(String reportTo) { this.reportTo = reportTo; }

    public void setTimeInJob(String timeInJob) { this.timeInJob = timeInJob; }
}
