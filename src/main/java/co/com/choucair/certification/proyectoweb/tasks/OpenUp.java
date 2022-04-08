package co.com.choucair.certification.proyectoweb.tasks;

import co.com.choucair.certification.proyectoweb.userinterface.BancolombiaPageSimulator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private BancolombiaPageSimulator bancolombiaSimulator;

public static OpenUp thePage(){
    return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(bancolombiaSimulator));
    }
}
