package mvc.model.people.personnelActions.hireEmployee;

import mvc.model.ModelInterface;

import java.util.HashMap;
import java.util.Map;

public class EarningsDistributionModel implements ModelInterface {
    private String effectiveDate;
    private String effectiveDateSequence;
    private String action;
    private String reasonCode;
    private String regularShift;
    private String glPayType;
    private String accountFund;
    private String earningsDistributionTypeNone;
    private String earningsDistributionTypeByAmount;
    private String earningsDistributionTypeByHours;
    private String earningsDistributionTypeByPercentage;

    public EarningsDistributionModel() {
     //initialize fields to default values here
    }

    @Override
    public Map<String, String> loadData() {
        HashMap<String, String> earningsDistributionData = new HashMap<>();

        earningsDistributionData.put("Action", this.action);
        return earningsDistributionData;
    }

    @Override
    public String toString() {
        String earningsDistributionInfo =
                "\nEffective Date: " + this.effectiveDate
                        + "\nComp Frequency: " + this.regularShift
                        + "\nEffective Date Sequence No.: " + this.effectiveDateSequence
                        + "\nAnnl Benefits Base: " + this.accountFund
                        + "\nAction: " + this.action
                        + "\nComp Rate: " + this.glPayType
                        + "\nReason Code: " + this.reasonCode
                        + "\nComp Date: " + this.earningsDistributionTypeNone
                        + "\nCurrency Code: " + this.earningsDistributionTypeByAmount
                        + "\nHourly rate: " + this.earningsDistributionTypeByHours
                        + "\nMonthly Rate: " + this.earningsDistributionTypeByPercentage
                ;
        return earningsDistributionInfo;
    }

    public String getEffectiveDate() { return effectiveDate; }

    public String getRegularShift() { return regularShift; }

    public String getEffectiveDateSequence() { return effectiveDateSequence; }

    public String getAccountFund() { return accountFund; }

    public String getAction() { return action; }

    public String getGlPayType() { return glPayType; }

    public String getReasonCode() { return reasonCode; }

    public String getEarningsDistributionTypeNone() { return earningsDistributionTypeNone; }

    public String getEarningsDistributionTypeByAmount() { return earningsDistributionTypeByAmount; }

    public String getEarningsDistributionTypeByHours() { return earningsDistributionTypeByHours; }

    public String getEarningsDistributionTypeByPercentage() { return earningsDistributionTypeByPercentage; }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setEffectiveDateSequence(String effectiveDateSequence) { this.effectiveDateSequence = effectiveDateSequence; }

    public void setAction(String action) { this.action = action; }

    public void setReasonCode(String reasonCode) { this.reasonCode = reasonCode; }

    public void setEarningsDistributionTypeNone(String earningsDistributionTypeNone) { this.earningsDistributionTypeNone = earningsDistributionTypeNone; }

    public void setEarningsDistributionTypeByAmount(String earningsDistributionTypeByAmount) { this.earningsDistributionTypeByAmount = earningsDistributionTypeByAmount; }

    public void setEarningsDistributionTypeByHours(String earningsDistributionTypeByHours) { this.earningsDistributionTypeByHours = earningsDistributionTypeByHours; }

    public void setEarningsDistributionTypeByPercentage(String earningsDistributionTypeByPercentage) { this.earningsDistributionTypeByPercentage = earningsDistributionTypeByPercentage; }
}
