package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibValidaptionPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ColorlibFormValidationSteps {

    ColorlibValidaptionPage colorlibValidaptionPage;
    @Step
    public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
        colorlibValidaptionPage.required(data.get(id).get(0).trim());
        colorlibValidaptionPage.select_sport(data.get(id).get(1).trim());
        colorlibValidaptionPage.multiple_select(data.get(id).get(2).trim());
        colorlibValidaptionPage.multiple_select(data.get(id).get(3).trim());
        colorlibValidaptionPage.url(data.get(id).get(4).trim());
        colorlibValidaptionPage.email(data.get(id).get(5).trim());
        colorlibValidaptionPage.password(data.get(id).get(6).trim());
        colorlibValidaptionPage.confirmacion_password(data.get(id).get(7).trim());
        colorlibValidaptionPage.minimun_field_size(data.get(id).get(8).trim());
        colorlibValidaptionPage.maximun_field_size(data.get(id).get(9).trim());
        colorlibValidaptionPage.number(data.get(id).get(10).trim());
        colorlibValidaptionPage.ip(data.get(id).get(11).trim());
        colorlibValidaptionPage.date(data.get(id).get(12).trim());
        colorlibValidaptionPage.date_earlier(data.get(id).get(13).trim());
        colorlibValidaptionPage.validate();
    }
    @Step
    public void verificar_ingreso_datos_exitoso(){
        colorlibValidaptionPage.formulario_sin_errores();
    }
    @Step
    public void verificar_ingreso_datos_con_errorres(){
        colorlibValidaptionPage.formulario_con_errores();
    }
}
