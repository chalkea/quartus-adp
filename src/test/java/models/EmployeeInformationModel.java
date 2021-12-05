package models;

import com.github.javafaker.Faker;
import utils.DateUtilities;

import java.util.HashMap;

public class EmployeeInformationModel {
    private String socialSecurity;
    private String firstName;
    private String middleName;
    private String lastName;
    private String namePrefix;
    private boolean appliedForSsn, ssnIsFederalEin, localNational;
    private String nameSuffix;
    private boolean alterDerivedName;
    private String address1, address2, address3, city;
    private String stProv, postalZip, country, dateOfResidence;
    private String county, phoneType, phone, emailBusiness, emailPersonal;

    public EmployeeInformationModel() {
        this.socialSecurity = Faker.instance().idNumber().ssnValid();
        this.firstName = Faker.instance().name().firstName();
        this.middleName = Faker.instance().name().firstName().substring(1, 2);
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
        this.postalZip = Faker.instance().address().zipCodeByState(this.stProv).replaceAll("#", Faker.instance().number().digits(1));
        this.country = Faker.instance().address().country();
        this.dateOfResidence = DateUtilities.adjustDate("dd/MM/yyyy", -180);
        this.county = "unknown";
        this.phoneType = "CEL1 - Cellular Phone 1";
        this.phone = Faker.instance().phoneNumber().cellPhone();
        this.emailBusiness = System.getProperty("user.name") + ".testBusiness@adp.com";
        this.emailPersonal = System.getProperty("user.name") + ".testPersonal@adp.com";
    }

    public HashMap<String, String> getEmployeeInfoDataMap() {
        HashMap<String, String> employeeInformation = new HashMap<>();

        employeeInformation.put("Social Security", this.socialSecurity);
        employeeInformation.put("First Name", this.firstName);
        employeeInformation.put("Middle Name", this.middleName);
        employeeInformation.put("Last Name", this.lastName);
        employeeInformation.put("Name Prefix", this.namePrefix);
        employeeInformation.put("Applied For Ssn", (this.appliedForSsn ? "Yes" : "no"));
        employeeInformation.put("Ssn Is Federal Ein", (this.ssnIsFederalEin ? "yes" : "no"));
        employeeInformation.put("Local National", this.localNational ? "yes" : "no");
        employeeInformation.put("Name Suffix", this.nameSuffix);
        employeeInformation.put("Alter Derived Name", this.alterDerivedName ? "yes" : "no");
        employeeInformation.put("Address1", this.address1);
        employeeInformation.put("Address2", this.address2);
        employeeInformation.put("Address3", this.address3);
        employeeInformation.put("City", this.city);
        employeeInformation.put("St Prov", this.stProv);
        employeeInformation.put("Postal Zip", this.postalZip);
        employeeInformation.put("Country", this.country);
        employeeInformation.put("Date Of Residence", this.dateOfResidence);
        employeeInformation.put("County", this.county);
        employeeInformation.put("Phone Type", this.phoneType);
        employeeInformation.put("Phone", this.phone);
        employeeInformation.put("Email Business", this.emailBusiness);
        employeeInformation.put("Email Personal", this.emailPersonal);

        return employeeInformation;
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

    @Override
    public String toString() {
        String employeeInfo = (
                "Social Security: " + this.socialSecurity
                        + "\nFirst Name: " + this.firstName
                        + "\nMiddle Name: " + this.middleName
                        + "\nLast Name: " + this.lastName
                        + "\nName Prefix: " + this.namePrefix
                        + "\nApplied For Ssn: " + (this.appliedForSsn)
                        + "\nSsn Is Federal Ein: " + (this.ssnIsFederalEin)
                        + "\nLocal National: " + this.localNational
                        + "\nName Suffix: " + this.nameSuffix
                        + "\nAlter Derived Name: " + this.alterDerivedName
                        + "\nAddress1: " + this.address1
                        + "\nAddress2: " + this.address2
                        + "\nAddress3: " + this.address3
                        + "\nCity: " + this.city
                        + "\nSt Prov: " + this.stProv
                        + "\nPostal Zip: " + this.postalZip
                        + "\nCountry: " + this.country
                        + "\nDate Of Residence: " + this.dateOfResidence
                        + "\nCounty: " + this.county
                        + "\nPhone Type: " + this.phoneType
                        + "\nPhone: " + this.phone
                        + "\nEmail Business: " + this.emailBusiness
                        + "\nEmail Personal: " + this.emailPersonal
        );
        return employeeInfo;
    }
}
