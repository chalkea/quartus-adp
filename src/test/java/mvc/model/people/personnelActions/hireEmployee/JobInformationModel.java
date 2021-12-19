package mvc.model.people.personnelActions.hireEmployee;

import mvc.model.ModelInterface;

import java.util.HashMap;
import java.util.Map;

public class JobInformationModel implements ModelInterface {
    private String effectiveDate;
    private String current;
    private String effectiveDateSequence;
    private String action;
    private String reason;
    private String standHours;
    private String fte;
    private String employeeClass;
    private String eeoExclusion;
    private String flsaStatus;
    private String officerCode;
    private String fullPartTime;
    private String regularTemporary;
    private String workersCompCd;

    @Override
    public Map<String, String> loadData() {
        HashMap<String, String> jobInformationData = new HashMap<>();

        return jobInformationData;
    }

    @Override
    public String toString() {
        String jobStatusInfo =
                          "\nEffective Date: " + this.effectiveDate
                        + "\nCurrent: " + this.current
                        + "\nEffective Date Sequence No.: " + this.effectiveDateSequence
                        + "\nAction: " + this.action
                        + "\nReason Code: " + this.reason
                        + "\nPrimary Job: " + this.standHours
                        + "\nContract Job: " + this.fte
                        + "\nPosition: " + this.employeeClass
                        + "\nPosition Entry Date: " + this.eeoExclusion
                        + "\nOverride Position Data: " + this.flsaStatus
                        + "\nUpdate by Position: " + this.officerCode
                        + "\nDepartment: " + this.fullPartTime
                        + "\nDepartment Entry Date: " + this.regularTemporary
                        + "\nJob Code: " + this.workersCompCd
                ;
        return jobStatusInfo;
    }

    public String getEffectiveDate() { return effectiveDate; }

    public String getCurrent() { return current; }

    public String getEffectiveDateSequence() { return effectiveDateSequence; }


    public String getAction() { return action; }


    public String getReason() { return reason; }

    public String getStandHours() { return standHours; }

    public String getFte() { return fte; }

    public String getEmployeeClass() { return employeeClass; }

    public String getEeoExclusion() { return eeoExclusion; }

    public String getFlsaStatus() { return flsaStatus; }

    public String getOfficerCode() { return officerCode; }

    public String getFullPartTime() { return fullPartTime; }

    public String getRegularTemporary() { return regularTemporary; }

    public String getWorkersCompCd() { return workersCompCd; }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setEffectiveDateSequence(String effectiveDateSequence) { this.effectiveDateSequence = effectiveDateSequence; }

    public void setAction(String action) { this.action = action; }

    public void setReason(String reason) { this.reason = reason; }

    public void setStandHours(String standHours) { this.standHours = standHours; }

    public void setFte(String fte) { this.fte = fte; }

    public void setEmployeeClass(String employeeClass) { this.employeeClass = employeeClass; }

    public void setEeoExclusion(String eeoExclusion) { this.eeoExclusion = eeoExclusion; }

    public void setFlsaStatus(String flsaStatus) { this.flsaStatus = flsaStatus; }

    public void setOfficerCode(String officerCode) { this.officerCode = officerCode; }

    public void setFullPartTime(String fullPartTime) { this.fullPartTime = fullPartTime; }

    public void setRegularTemporary(String regularTemporary) { this.regularTemporary = regularTemporary; }

    public void setWorkersCompCd(String workersCompCd) { this.workersCompCd = workersCompCd; }

}
