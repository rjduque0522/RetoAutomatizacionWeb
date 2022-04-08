package co.com.choucair.certification.proyectoweb.stepdefinitions;

import co.com.choucair.certification.proyectoweb.model.DataModel;
import co.com.choucair.certification.proyectoweb.tasks.BancolombiaTask;
import co.com.choucair.certification.proyectoweb.tasks.OpenUp;
import co.com.choucair.certification.proyectoweb.tasks.Search;
import co.com.choucair.certification.proyectoweb.userinterface.BancolombiaPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than ricardo wants to calculate the values$")
    public void thanRicardoWantsToCalculateTheValues() {

        OnStage.theActorCalled("ricardo").wasAbleTo(OpenUp.thePage());

    }

    @When("^you use the (.*) leasing simulator$")
    public void youUseTheBancolombiaLeasingSimulator(String course) {

        theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @And("^enter the data required by the simulator$")
    public void enterTheDataRequiredByTheSimulator(List<DataModel>dataModel) {
        theActorInTheSpotlight().attemptsTo(BancolombiaTask.onThePage(dataModel));

    }

}
