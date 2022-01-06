package mvc.model;

public class TotalCompensation {
    private String totalCompensation;
    private String basePay;
    private String companyContributions;

    public String getTotalCompensation() { return totalCompensation; }

    public String getBasePay() { return basePay; }

    public String getCompanyContributions() { return companyContributions; }

    public void setTotalCompensation(String totalCompensation) { this.totalCompensation = totalCompensation; }

    public void setBasePay(String basePay) { this.basePay = basePay; }

    public void setCompanyContributions(String companyContributions) { this.companyContributions = companyContributions; }
}
