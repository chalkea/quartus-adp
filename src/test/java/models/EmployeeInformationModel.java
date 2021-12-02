package models;

import com.github.javafaker.Faker;
import utils.DateUtilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeInformationModel {
    private  String socialSecurity;
    private  String firstName;
    private  String middleName;
    private  String lastName;
    private  String namePrefix;
    private  boolean appliedForSsn, ssnIsFederalEin, localNational;
    private  String nameSuffix;
    private  boolean alterDerivedName;
    private  String address1, address2, address3, city;
    private  String stProv, postalZip, country, dateOfResidence;
    private  String county, phoneType, phone, emailBusiness, emailPersonal;

    public EmployeeInformationModel() {
        this.socialSecurity = Faker.instance().idNumber().ssnValid();
        this.firstName = Faker.instance().name().firstName();
        this.middleName = Faker.instance().name().firstName();
        this.lastName = Faker.instance().name().lastName();
        this.namePrefix = Faker.instance().name().prefix();
        this.appliedForSsn = true;
        this.ssnIsFederalEin = false;
        this.localNational = false;
        this.nameSuffix = Faker.instance().name().suffix();
        this.alterDerivedName = false;
        this.address1 = Faker.instance().address().streetAddress();
        this.address2 = Faker.instance().address().buildingNumber() + " Primary";
        this.address3 = Faker.instance().address().buildingNumber() + " Secondary";
        this.city = Faker.instance().address().city();
        this.stProv = Faker.instance().address().stateAbbr();
        this.postalZip = Faker.instance().address().zipCodeByState(this.stProv);
        this.country = Faker.instance().address().country();
        this.dateOfResidence = DateUtilities.adjustDate("mm/dd/yyy", -180);
        this.county = Faker.instance().address().countyByZipCode(this.postalZip);
        this.phoneType = "CEL1 - Cellular Phone 1";
        this.phone = Faker.instance().phoneNumber().cellPhone();
        this.emailBusiness = System.getenv("user.name") + ".testBusiness@adp.com";
        this.emailPersonal = System.getenv("user.name") + ".testPersonal@adp.com";
    }

    public List<Map<String, String>> getEmployeeInfoDataMap() {
        Map<String, String> employeeInformation = new HashMap<>();
        employeeInformation.put(this.socialSecurity, "Social Security");
        employeeInformation.put(this.socialSecurity, "Social Security");
        employeeInformation.put(this.firstName, "First Name");
        employeeInformation.put(this.middleName, "Middle Name");
        employeeInformation.put(this.lastName, "Last Name");
        employeeInformation.put(this.namePrefix, "Name Prefix");
        employeeInformation.put((this.appliedForSsn ? "Yes" : "no"), "Applied For Ssn");
        employeeInformation.put((this.ssnIsFederalEin ? "yes" : "no"), "Ssn Is Federal Ein");
        employeeInformation.put(this.localNational ? "yes" : "no", "Local National");
        employeeInformation.put(this.nameSuffix, "Name Suffix");
        employeeInformation.put(this.alterDerivedName ? "yes" : "no", "Alter Derived Name");
        employeeInformation.put(this.address1, "Address1");
        employeeInformation.put(this.address2, "Address2");
        employeeInformation.put(this.address3, "Address3");
        employeeInformation.put(this.city, "City");
        employeeInformation.put(this.stProv, "St Prov");
        employeeInformation.put(this.postalZip, "Postal Zip");
        employeeInformation.put(this.country, "Country");
        employeeInformation.put(this.dateOfResidence, "Date Of Residence");
        employeeInformation.put(this.county, "County");
        employeeInformation.put(this.phoneType, "Phone Type");
        employeeInformation.put(this.phone, "Phone");
        employeeInformation.put(this.emailBusiness, "Email Business");
        employeeInformation.put(this.emailPersonal, "Email Personal");

        return (List<Map<String, String>>) employeeInformation;

    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public void setSocialSecurity() {
        this.socialSecurity = Faker.instance().idNumber().ssnValid();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName() {
        this.firstName = Faker.instance().name().firstName();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public boolean isAppliedForSsn() {
        return appliedForSsn;
    }

    public void setAppliedForSsn(boolean appliedForSsn) {
        this.appliedForSsn = appliedForSsn;
    }

    public boolean isSsnisFederalEin() {
        return appliedForSsn;
    }

    public void setSsnisFederalEin(boolean ssnisFederalEin) {
        ssnIsFederalEin = ssnisFederalEin;
    }

    public boolean isLocalNational() {
        return localNational;
    }

    public void setLocalNational(boolean localNational) {
        this.localNational = localNational;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public boolean isAlterDerivedName() {
        return alterDerivedName;
    }

    public void setAlterDerivedName(boolean alterDerivedName) {
        this.alterDerivedName = alterDerivedName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStProv() {
        return stProv;
    }

    public void setStProv(String stProv) {
        this.stProv = stProv;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public void setPostalZip(String postalZip) {
        this.postalZip = postalZip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfResidence() {
        return dateOfResidence;
    }

    public void setDateOfResidence(String dateOfResidence) {
        this.dateOfResidence = dateOfResidence;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailBusiness() {
        return emailBusiness;
    }

    public void setEmailBusiness(String emailBusiness) {
        this.emailBusiness = emailBusiness;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }
}
