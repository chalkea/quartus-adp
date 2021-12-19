package mvc.model.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import mvc.model.ModelInterface;

import java.util.HashMap;

public class CostNumberDetailModel implements ModelInterface {
    private String effectiveDate;
    private String current;
    private String effectiveDateSequence;
    private String action;
    private String reason;

    public CostNumberDetailModel() {
        //Initialize default value here,...

    }

    public HashMap<String, String> loadData() {
        HashMap<String, String> costNumberDetailInfo = new HashMap<>();
        return costNumberDetailInfo;
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

    @Override
    public String toString() {
        String employeeInfo = (
                "Social Security: " + this.effectiveDate
                        + "\nFirst Name: " + this.current
                        + "\nMiddle Name: " + this.effectiveDateSequence
                        + "\nLast Name: " + this.action
                        + "\nName Prefix: " + this.reason
        );
        return employeeInfo;
    }
}
