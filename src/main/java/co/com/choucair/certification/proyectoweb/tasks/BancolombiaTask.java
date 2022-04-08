package co.com.choucair.certification.proyectoweb.tasks;

import co.com.choucair.certification.proyectoweb.model.DataModel;
import co.com.choucair.certification.proyectoweb.userinterface.BancolombiaPage;
import co.com.choucair.certification.proyectoweb.util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.proyectoweb.userinterface.BancolombiaPage.VALOR_LABEL;

public class BancolombiaTask implements Task {

private List<DataModel> listaData;

public BancolombiaTask (List<DataModel>listaData){
    this.listaData = listaData;
}

    public  static BancolombiaTask onThePage(List<DataModel>listaData){
        return Tasks.instrumented(BancolombiaTask.class, listaData);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BancolombiaPage.CERRAR_BARRA),
                Click.on(BancolombiaPage.SERVICE_BUTTON),
                Click.on(BancolombiaPage.LEASING_BUTTON),
                Click.on(BancolombiaPage.LEASIGHAB_BUTTON),
                Click.on(BancolombiaPage.SIMULA_BUTTON),
                Click.on(BancolombiaPage.CALCULAR_BUTTON),
                Enter.theValue(listaData.get(0).getValor_comercial())
                .into(VALOR_LABEL)
                );
                Wait.Time(50000);
                //Click.on(VALOR_LABEL);
                //actor.attemptsTo( Enter.theValue(listaData.get(0).getValor_comercial())
                        //.into(VALOR_LABEL));

                //Click.on(VALOR_LABEL),
                /*Click.on(BancolombiaPage.AÑO_LABEL),

                Click.on(BancolombiaPage.FECHA_LABEL),
                Click.on(BancolombiaPage.SELECT_YEAR),
                Click.on(BancolombiaPage.SELECT_MONTH),
                Click.on(BancolombiaPage.SELECT_DAY)
                // Click.on(BancolombiaPage.SIMULAR_CREDITO)*/


   }
}
