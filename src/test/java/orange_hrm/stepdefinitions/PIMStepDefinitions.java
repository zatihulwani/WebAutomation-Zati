package orange_hrm.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import orange_hrm.pageobjects.HRMPIMPageObjects;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class PIMStepDefinitions {
    // read Employee --Begin
    @And("{actor} access employee list")
    public void accessEmployee(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("HRM Employee List"));
    }

    @And("{actor} can see new employee list result")
    public void listResult(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("Employee List")
        );
    }


    //Search Employee
    @And("{actor} search for new employee")
    public void searchEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                InputText.onField("employeeName", "Zati"),
                ClickOn.button("Search")
        );
    }

    //Add Employee
    @When("{actor} add new employee with required field only")
    public void addEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Add"),
                InputText.onField("firstName", "Zati"),
                InputText.onField("lastName", "Hulwani"),
                ClickOn.button("Save")
        );
    }

    @Then("{actor} can see my Personal Details")
    public void personalDetails(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("Personal Details")
        );
    }

    //update
    @When("{actor} update new employee's middle name")
    public void updateEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.employeeList(),
                ClickOn.button("Edit"),
                InputText.onField("editMiddleName", "Wani"),
                ClickOn.button("Save")
        );
    }

    @Then("{actor} can see the Personal Details has changed")
    public void updateEmployeeData(Actor actor) {
        actor.attemptsTo(
                Ensure.that(HRMPIMPageObjects.EDIT_MIDDLE_NAME_FIELD).value().isEqualTo("Wani")
        );
    }

    // Delete
    @And("{actor} delete new employee")
    public void deleteEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.checkbox(),
                ClickOn.button("Delete"),
                ClickOn.button("Ok")
        );
    }

    @Then("{actor} can't see deleted employee on list")
    public void deletedEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("No Employee")
        );
    }
}



