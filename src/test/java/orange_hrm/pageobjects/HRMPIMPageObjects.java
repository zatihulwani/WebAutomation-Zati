package orange_hrm.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList")
public class HRMPIMPageObjects extends PageObject {
    //elemen untuk read Employee
    public static Target RESULT_TABLE = Target.the("employee result table")
            .locatedBy("#resultTable");
    public static Target FIRST_EMPLOYEE_LIST= Target.the("first employee list")
            .locatedBy("(//*[contains(@href, '/index.php/pim/viewEmployee/empNumber/')]) [1]");
    public static Target FIRST_EMPLOYEE_CHECKBOX= Target.the("first employee checkbox")
            .locatedBy("//td/*[@type='checkbox']");

    //elemen untuk Search Employee
    public static Target EMPLOYEE_NAME = Target.the("employee name")
            .locatedBy("#empsearch_employee_name_empName");
    public static Target SEARCH_BUTTON = Target.the("search button")
            .locatedBy("#searchBtn");

    //element untuk Add Employee
    public static Target ADD_BUTTON = Target.the("add button")
            .locatedBy("#btnAdd");
    public static Target SAVE_BUTTON = Target.the("save button")
            .locatedBy("#btnSave");
    public static Target FIRST_NAME_FIELD = Target.the("first name field")
            .locatedBy("#firstName");
    public static Target LAST_NAME_FIELD = Target.the("last name field")
            .locatedBy("#lastName");
    public static Target PERSONAL_DETAILS = Target.the("personal details")
            .locatedBy("//div[@id='pdMainContainer']/div/h1");

    // elemen untuk update data employee
    public static Target EDIT_BUTTON= Target.the("edit button")
            .locatedBy("#btnSave");
    public static Target EDIT_MIDDLE_NAME_FIELD= Target.the("middle name field")
            .locatedBy("#personal_txtEmpMiddleName");

    //delete
    public static Target DELETE_BUTTON= Target.the("delete button")
            .locatedBy("#btnDelete");
    public static Target OK_BUTTON= Target.the("ok button")
            .locatedBy("#dialogDeleteBtn");
    public static Target NO_EMPLOYEE= Target.the("empty employee list")
            .locatedBy("//*[text()='No Records Found']");

}
