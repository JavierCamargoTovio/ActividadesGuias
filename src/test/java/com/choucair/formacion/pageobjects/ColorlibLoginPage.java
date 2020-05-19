package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class ColorlibLoginPage extends PageObject {

	// campo usuario
	@FindBy(xpath = "//*[@id='login']/form/input[1]")
	public WebElementFacade txtUserName;

	// campo password
	@FindBy(xpath = "//*[@id='login']/form/input[2]")
	public WebElementFacade txtPassword;

	// botón Sign in
	@FindBy(xpath = "//*[@id='login']/form/button")
	public WebElementFacade btnSignIn;

	// label de home a verificar
	@FindBy(xpath = "//*[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePrincipal;

	public void ingresarDatos(String usuario, String clave) {
		txtUserName.sendKeys(usuario);
		txtPassword.sendKeys(clave);
		btnSignIn.click();
		
	}

	public void verificarHome() {
		String labelv = "Bootstrap-Admin-Template";
		String strMensaje = lblHomePrincipal.getText();
		assertThat(strMensaje, containsString(labelv));
		
	}
	
	
}
