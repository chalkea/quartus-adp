package mvc.model.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import mvc.model.ModelInterface;
import utils.DateUtilities;

import java.util.HashMap;

public class AutolinkDetailsModel implements ModelInterface {
    private String effectiveDate;
    private String current;
    private String effectiveDateSequence;
    private String action;
    private String reason;
    private int fileNumber;
    private String payGroup, payGroupdescription;
    private String fileNumberStatus;
    private String payrollDeptNumber;
    private String payrollStatus, payStatementMessage, ratesType, retro;
    private String payFrequency, biweekly, payrollStdHours, grossCalc;
    private String flsaOvertime, payGroup2, excludeFromTotalHoursWorked, transferrAccumulators, transferTaxables;
    private String tranferSuiAndSdi, transferDeductionsLiens;

    public AutolinkDetailsModel() {
        this.fileNumber = Faker.instance().number().numberBetween(300000,900000);

    }

    public HashMap<String, String> loadData() {
        HashMap<String, String> employeeInformation = new HashMap<>();

        employeeInformation.put("File Number", String.valueOf(this.fileNumber));

        return employeeInformation;
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

    public int getFileNumber() {
        return fileNumber;
    }

    public String getPayGroup() {
        return payGroup;
    }

    public String getPayGroupdescription() {
        return payGroupdescription;
    }

    public String getFileNumberStatus() {
        return fileNumberStatus;
    }

    public String getPayrollDeptNumber() {
        return payrollDeptNumber;
    }

    public String getPayrollStatus() {
        return payrollStatus;
    }

    public String getPayStatementMessage() {
        return payStatementMessage;
    }

    public String getRatesType() {
        return ratesType;
    }

    public String getRetro() {
        return retro;
    }

    public String getPayFrequency() {
        return payFrequency;
    }

    public String getBiweekly() {
        return biweekly;
    }

    public String getPayrollStdHours() {
        return payrollStdHours;
    }

    public String getGrossCalc() {
        return grossCalc;
    }

    public String getFlsaOvertime() {
        return flsaOvertime;
    }

    public String getPayGroup2() {
        return payGroup2;
    }

    public String getExcludeFromTotalHoursWorked() {
        return excludeFromTotalHoursWorked;
    }

    public String getTransferrAccumulators() {
        return transferrAccumulators;
    }

    public String getTransferTaxables() {
        return transferTaxables;
    }

    public String getTranferSuiAndSdi() {
        return tranferSuiAndSdi;
    }

    public String getTransferDeductionsLiens() {
        return transferDeductionsLiens;
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

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    public void setPayGroup(String payGroup) {
        this.payGroup = payGroup;
    }

    public void setPayGroupdescription(String payGroupdescription) {
        this.payGroupdescription = payGroupdescription;
    }

    public void setFileNumberStatus(String fileNumberStatus) {
        this.fileNumberStatus = fileNumberStatus;
    }

    public void setPayrollDeptNumber(String payrollDeptNumber) {
        this.payrollDeptNumber = payrollDeptNumber;
    }

    public void setPayrollStatus(String payrollStatus) {
        this.payrollStatus = payrollStatus;
    }

    public void setPayStatementMessage(String payStatementMessage) {
        this.payStatementMessage = payStatementMessage;
    }

    public void setRatesType(String ratesType) {
        this.ratesType = ratesType;
    }

    public void setRetro(String retro) {
        this.retro = retro;
    }

    public void setPayFrequency(String payFrequency) {
        this.payFrequency = payFrequency;
    }

    public void setBiweekly(String biweekly) {
        this.biweekly = biweekly;
    }

    public void setPayrollStdHours(String payrollStdHours) {
        this.payrollStdHours = payrollStdHours;
    }

    public void setGrossCalc(String grossCalc) {
        this.grossCalc = grossCalc;
    }

    public void setFlsaOvertime(String flsaOvertime) {
        this.flsaOvertime = flsaOvertime;
    }

    public void setPayGroup2(String payGroup2) {
        this.payGroup2 = payGroup2;
    }

    public void setExcludeFromTotalHoursWorked(String excludeFromTotalHoursWorked) {
        this.excludeFromTotalHoursWorked = excludeFromTotalHoursWorked;
    }

    public void setTransferrAccumulators(String transferrAccumulators) {
        this.transferrAccumulators = transferrAccumulators;
    }

    public void setTransferTaxables(String transferTaxables) {
        this.transferTaxables = transferTaxables;
    }

    public void setTranferSuiAndSdi(String tranferSuiAndSdi) {
        this.tranferSuiAndSdi = tranferSuiAndSdi;
    }

    public void setTransferDeductionsLiens(String transferDeductionsLiens) {
        this.transferDeductionsLiens = transferDeductionsLiens;
    }

    @Override
    public String toString() {
        String employeeInfo = (
                "Social Security: " + this.effectiveDate
                        + "\nFirst Name: " + this.current
                        + "\nMiddle Name: " + this.effectiveDateSequence
                        + "\nLast Name: " + this.action
                        + "\nName Prefix: " + this.reason
                        + "\nApplied For Ssn: " + (this.payGroup)
                        + "\nSsn Is Federal Ein: " + (this.payGroupdescription)
                        + "\nLocal National: " + this.fileNumber
                        + "\nName Suffix: " + this.fileNumberStatus
                        + "\nAlter Derived Name: " + this.payrollDeptNumber
                        + "\nAddress1: " + this.payrollStatus
                        + "\nAddress2: " + this.payStatementMessage
                        + "\nAddress3: " + this.ratesType
                        + "\nCity: " + this.retro
                        + "\nSt Prov: " + this.payFrequency
                        + "\nPostal Zip: " + this.biweekly
                        + "\nCountry: " + this.payrollStdHours
                        + "\nDate Of Residence: " + this.grossCalc
                        + "\nCounty: " + this.flsaOvertime
                        + "\nPhone Type: " + this.payGroup2
                        + "\nPhone: " + this.excludeFromTotalHoursWorked
                        + "\nEmail Business: " + this.transferrAccumulators
                        + "\nEmail Personal: " + this.transferTaxables
        );
        return employeeInfo;
    }
}
