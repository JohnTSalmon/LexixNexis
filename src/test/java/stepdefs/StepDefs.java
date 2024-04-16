package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import pageobjects.RiskSolutions;


public class StepDefs {

    @Steps
    RiskSolutions riskSolutions = new RiskSolutions();

    @Given("I open the Risk Solutions Page")
    public void IOpenTheRiskSolutionsPage() {
        riskSolutions.openPage();
        riskSolutions.handleCookies();
    }

    @Then("I should see the following interactable Industry links :")
    public void ThenICanFollowTheLinks(DataTable dataTable) {
        riskSolutions.checkIndustryLinks(dataTable.asMaps(String.class, String.class));
    }

    @Then("I should see the following interactable Financial Services links :")
    public void shouldSeeTheFollowingInteractableFinancialServicesLinks(DataTable dataTable) {
        riskSolutions.checkFinancialServicesLinks(dataTable.asMaps(String.class, String.class));
    }
}

