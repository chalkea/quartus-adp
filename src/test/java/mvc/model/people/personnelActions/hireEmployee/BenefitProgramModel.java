package mvc.model.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import mvc.model.ModelInterface;

import java.util.HashMap;

public class BenefitProgramModel implements ModelInterface {
    private String eventDate;
    private String benefitProgram;

    public BenefitProgramModel() {
       //initialize default values here,...
    }

    public HashMap<String, String> loadData() {
        HashMap<String, String> benefitProgramInfo = new HashMap<>();
        return benefitProgramInfo;
    }


    //Getters

    public String getEventDate() { return eventDate; }

    public String getBenefitProgram() { return benefitProgram; }


    //Setters


    public void setEventDate(String eventDate) { this.eventDate = eventDate; }
    public void setBenefitProgram(String benefitProgram) { this.benefitProgram = benefitProgram; }

    @Override
    public String toString() {
        String benefitProgramInfo = (
                "Social Security: " + this.eventDate
                        + "\nBenefit Program: " + this.benefitProgram
        );
        return benefitProgramInfo;
    }
}
