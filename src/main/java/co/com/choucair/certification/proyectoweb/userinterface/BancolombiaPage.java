package co.com.choucair.certification.proyectoweb.userinterface;

import co.com.choucair.certification.proyectoweb.tasks.OpenUp;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaPage extends PageObject {

    public static final Target CERRAR_BARRA =
            Target.the("boton para desplegar menu  productos y servicios")
                    .located(By.xpath("//*[@id=\"modal-prehome-fenix\"]/div/div/div[1]/button/img"));

    public static final Target SERVICE_BUTTON =
            Target.the("boton para desplegar menu  productos y servicios")
            .located(By.xpath("//*[@id=\"menu-productos\"]"));

    public static final Target LEASING_BUTTON =
            Target.the("boton para dirigirse a la pagina de leasing")
                    .located(By.xpath("//*[@id=\"header-productos-leasing\"]"));


    public static final Target LEASIGHAB_BUTTON =
            Target.the("boton para dirigirse al simulador")
                    .located(By.xpath("//*[@id=\"category-detail\"]/div/div/div[2]/div/div[2]/div/a"));


    public static final Target SIMULA_BUTTON =
            Target.the("boton para dirigirse al simulador")
                    .located(By.xpath("//*[@id=\"menu-sticky\"]/div/div/div[1]/div[6]"));

    public static final Target CALCULAR_BUTTON =
            Target.the("boton para INGRESAR AL SIMULADOR")
                    .located(By.xpath("//*[@id=\"calcular-cuotas\"]"));

    public static final Target VALOR_LABEL =
            Target.the("INGRESAR VALOR DE CREDITO")
                    .located(By.xpath("//*[@id=\"valor-simulacion\"]"));


    }

