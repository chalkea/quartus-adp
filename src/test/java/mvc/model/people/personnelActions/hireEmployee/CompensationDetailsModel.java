package mvc.model.people.personnelActions.hireEmployee;

import mvc.model.ModelInterface;

import java.util.HashMap;
import java.util.Map;

public class CompensationDetailsModel implements ModelInterface {
    private String effectiveDate;
    private String effectiveDateSequence;
    private String action;
    private String reasonCode;
    private String compFrequency;
    private String compRate;
    private String annlBenefitsBase;
    private String compDate;
    private String currencyCode;
    private String hourlyRate;
    private String monthlyRate;
    private String annualRate;
    private String aggregateAmt;
    private String aggregatePercentage;
    public CompensationDetailsModel() {
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
                        + "\nComp Frequency: " + this.compFrequency
                        + "\nEffective Date Sequence No.: " + this.effectiveDateSequence
                        + "\nAnnl Benefits Base: " + this.annlBenefitsBase
                        + "\nAction: " + this.action
                        + "\nComp Rate: " + this.compRate
                        + "\nReason Code: " + this.reasonCode
                        + "\nComp Date: " + this.compDate
                        + "\nCurrency Code: " + this.currencyCode
                        + "\nHourly rate: " + this.hourlyRate
                        + "\nMonthly Rate: " + this.monthlyRate
                        + "\nAnnual Rate: " + this.annualRate
                        + "\nAggregate Amt: " + this.aggregateAmt
                        + "\nAgregate Percentage: " + this.aggregatePercentage
                ;
        return jobStatusInfo;
    }

    public String getEffectiveDate() { return effectiveDate; }

    public String getCompFrequency() { return compFrequency; }

    public String getEffectiveDateSequence() { return effectiveDateSequence; }

    public String getAnnlBenefitsBase() { return annlBenefitsBase; }

    public String getAction() { return action; }

    public String getCompRate() { return compRate; }

    public String getReasonCode() { return reasonCode; }

    public String getCompDate() { return compDate; }

    public String getCurrencyCode() { return currencyCode; }

    public String getHourlyRate() { return hourlyRate; }

    public String getMonthlyRate() { return monthlyRate; }

    public String getAnnualRate() { return annualRate; }

    public String getAggregateAmt() { return aggregateAmt; }

    public String getAggregatePercentage() { return aggregatePercentage; }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setEffectiveDateSequence(String effectiveDateSequence) { this.effectiveDateSequence = effectiveDateSequence; }

    public void setAction(String action) { this.action = action; }

    public void setReasonCode(String reasonCode) { this.reasonCode = reasonCode; }

    public void setCompDate(String compDate) { this.compDate = compDate; }

    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }

    public void setHourlyRate(String hourlyRate) { this.hourlyRate = hourlyRate; }

    public void setMonthlyRate(String monthlyRate) { this.monthlyRate = monthlyRate; }

    public void setAnnualRate(String annualRate) { this.annualRate = annualRate; }

    public void setAggregateAmt(String aggregateAmt) { this.aggregateAmt = aggregateAmt; }

    public void setAggregatePercentage(String aggregatePercentage) { this.aggregatePercentage = aggregatePercentage; }

}
