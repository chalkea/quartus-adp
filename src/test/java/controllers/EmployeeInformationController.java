package controllers;

import cucumber.steps.CommonSteps;
import models.EmployeeInformationModel;
import mvc.view.people.personnelActions.hireEmployee.EmployeeInformationPage;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HireInformationController {
    public static void clickOkButton(String button) {
        CommonSteps.clickOnElement(button);
    }

    public  void populateEmployeePage() {
        poplatePageInfo();
    }
    public  void poplatePageInfo() {
        CommonSteps.enterTextIntoMultipleFields(populateDataMapForEmployeeInfo());
    }

    private List<Map<String, String>> populateDataMapForEmployeeInfo() {
        EmployeeInformationModel employeeInformationModel = new EmployeeInformationModel();
        return employeeInformationModel.getEmployeeInfoDataMap();
    }

    private static void initializeEmployeeInformatonPage() {
        try {
            PageFactory.init(EmployeeInformationPage.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
