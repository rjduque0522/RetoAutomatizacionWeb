package co.com.choucair.certification.proyectoweb.tasks;

import co.com.choucair.certification.proyectoweb.userinterface.BancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private  String course;

    public Search(String course) {
        this.course = course;
    }

    public static Performable the(String course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BancolombiaPage.CERRAR_BARRA),
                Click.on(BancolombiaPage.SERVICE_BUTTON),
               Click.on(BancolombiaPage.LEASING_BUTTON),
                Click.on(BancolombiaPage.LEASIGHAB_BUTTON),
                Click.on(BancolombiaPage.SIMULA_BUTTON),
                Click.on(BancolombiaPage.CALCULAR_BUTTON),
               Click.on(BancolombiaPage.VALOR_LABEL)

               //Enter.theValue("80000000").into(BancolombiaPage.VALOR_LABEL),
                /*Enter.theValue("8").into(BancolombiaPage.AÑO_LABEL),
                Click.on(BancolombiaPage.FECHA_LABEL),
                Enter.theValue("1986").into(BancolombiaPage.SELECT_YEAR),
                Enter.theValue("FEB").into(BancolombiaPage.SELECT_MONTH),
                Enter.theValue("22").into(BancolombiaPage.SELECT_DAY)*/
                                                    );
    }
}
