package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
 ColorlibLoginPage colorlibLoginPage;
 
 ColorlibMenuPage colorlibMenuPage;
 
 @Step
 public void login_colorlib(String usuario, String clave) {
	//a).Abrir el navegador con la url de prueba
	 colorlibLoginPage.open();
	 /* b).ingresar usuario demo
	  * c).ingresar password demo
	  * d).click en el botón Sign in */
	   colorlibLoginPage.ingresarDatos(usuario, clave);
	   //e).Verificar la autenticación (label home)
	   colorlibLoginPage.verificarHome();
 }
 @Step
 public void ingresar_form_validation() {
	 colorlibMenuPage.menuFormValidation();
 }
}
