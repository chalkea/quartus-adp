package mvc.model.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import mvc.model.ModelInterface;
import utils.DateUtilities;

import java.util.HashMap;
import java.util.Map;

public class PersonalDemographicsModel implements ModelInterface {
    private String raceEthnicity;
    private String gender;
    private String maritalStatus;
    private String maritalStatusDate;
    private String birthdate;
    private String highestEducLevel;
    private String retireeBillingMethod;
    private String medicareDate;
    private String disabled;
    private String dischargeDt;
    private String statusVets4212;
    private String statusVets4212CheckBox;
    private String statusVets100;
    private String statusVets100CheckBox;

    public PersonalDemographicsModel() {
        this.gender = Faker.instance().demographic().sex();
        this.maritalStatus = Faker.instance().demographic().maritalStatus();
        this.birthdate = DateUtilities.adjustDate("MM/dd/yyyy", -7665);
    }

    @Override
    public Map<String, String> loadData() {
        HashMap<String, String> personalDemographicsData = new HashMap<>();

        personalDemographicsData.put("Gender", this.gender);
        personalDemographicsData.put("Marital Status", this.maritalStatus);
        personalDemographicsData.put("Birthdate", this.birthdate);

        return personalDemographicsData;
    }

    @Override
    public String toString() {
        String personalDemographics =
                "\nGender: " + this.gender
                        + "\nMarital Status: " + this.maritalStatus
                        + "\nBirthday: " + this.birthdate;
        return personalDemographics;
    }

    public String getRaceEthnicity() { return raceEthnicity; }

    public void setRaceEthnicity(String raceEthnicity) { this.raceEthnicity = raceEthnicity; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getMaritalStatus() { return maritalStatus; }

    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; }

    public String getMaritalStatusDate() { return maritalStatusDate; }

    public void setMaritalStatusDate(String maritalStatusDate) { this.maritalStatusDate = maritalStatusDate; }

    public String getBirthdate() { return birthdate; }

    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }

    public String getHighestEducLevel() { return highestEducLevel; }

    public void setHighestEducLevel(String highestEducLevel) { this.highestEducLevel = highestEducLevel; }

    public String getRetireeBillingMethod() { return retireeBillingMethod; }

    public void setRetireeBillingMethod(String retireeBillingMethod) { this.retireeBillingMethod = retireeBillingMethod; }

    public String getMedicareDate() { return medicareDate; }

    public void setMedicareDate(String medicareDate) { this.medicareDate = medicareDate; }

    public String getDisabled() { return disabled; }

    public void setDisabled(String disabled) { this.disabled = disabled; }

    public String getDischargeDt() { return dischargeDt; }

    public void setDischargeDt(String dischargeDt) { this.dischargeDt = dischargeDt; }

    public String getStatusVets4212() { return statusVets4212; }

    public void setStatusVets4212(String statusVets4212) { this.statusVets4212 = statusVets4212; }

    public String getStatusVets4212CheckBox() { return statusVets4212CheckBox; }

    public void setStatusVets4212CheckBox(String statusVets4212CheckBox) { this.statusVets4212CheckBox = statusVets4212CheckBox; }

    public String getStatusVets100() { return statusVets100; }

    public void setStatusVets100(String statusVets100) { this.statusVets100 = statusVets100; }

    public String getStatusVets100CheckBox() { return statusVets100CheckBox; }

    public void setStatusVets100CheckBox(String statusVets100CheckBox) { this.statusVets100CheckBox = statusVets100CheckBox; }
}
