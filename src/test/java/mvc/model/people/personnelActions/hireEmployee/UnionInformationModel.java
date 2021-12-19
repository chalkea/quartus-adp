package mvc.model.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import mvc.model.ModelInterface;

import java.util.HashMap;

public class UnionInformationModel implements ModelInterface {
    private String effectiveDate;
    private String current;
    private String effectiveDateSequence;
    private String action;
    private String reason;
    private String unionCode;
    private String unionSeniorityDate;
    private String bargainingUnit;
    private String bargUnitSeniorityDate;

    public UnionInformationModel() {

    }

    public HashMap<String, String> loadData() {
        HashMap<String, String> unionInformation = new HashMap<>();
        return unionInformation;
    }
    //Getters

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

    public String getReason() {
        return reason;
    }

    public String getUnionCode() {
        return unionCode;
    }

    public String getUnionSeniorityDate() {
        return unionSeniorityDate;
    }

    public String getBargainingUnit() {
        return bargainingUnit;
    }

    public String getBargUnitSeniorityDate() {
        return bargUnitSeniorityDate;
    }

    //Setters

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

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode;
    }

    public void setUnionSeniorityDate(String unionSeniorityDate) {
        this.unionSeniorityDate = unionSeniorityDate;
    }

    public void setBargainingUnit(String bargainingUnit) {
        this.bargainingUnit = bargainingUnit;
    }

    public void setBargUnitSeniorityDate(String bargUnitSeniorityDate) {
        this.bargUnitSeniorityDate = bargUnitSeniorityDate;
    }

    @Override
    public String toString() {
        String employeeInfo = (
                "Effective Date: " + this.effectiveDate
                        + "\nCurrent: " + this.current
                        + "\nEffective Date Sequence: " + this.effectiveDateSequence
                        + "\nAction: " + this.action
                        + "\nReason: " + this.reason
                        + "\nUnion Code: " + this.unionCode
                        + "\nUnion Security Date: " + this.unionSeniorityDate
                        + "\nBargaining Unit: " + this.bargainingUnit
                        + "\nBargaining Unit Seniority Date: " + this.bargUnitSeniorityDate

        );
        return employeeInfo;
    }
}
