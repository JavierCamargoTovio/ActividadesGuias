package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ColorlibFormValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	@Steps
	ColorlibFormValidationSteps colorlibFormValidationSteps;

	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
	  popupValidationSteps.login_colorlib(Usuario, Clave);  
	}

	@Given("^Ingreso a la funcionalidad Forms Validaption$")
	public void ingreso_a_la_funcionalidad_Forms_Validaption() {
	    popupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio el formulario Popup Validaption$")
	public void diligencio_el_formulario_Popup_Validaption(DataTable dtsDatosForm) {
		List<List<String>> data = dtsDatosForm.raw();
		for (int i=1; i<data.size();i++){
			colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data,i);
		}
	}

	@Then("^Verifico el ingreso exitoso$")
	public void verifico_el_ingreso_exitoso()  {
	   colorlibFormValidationSteps.verificar_ingreso_datos_exitoso();
	}
	
	
}
