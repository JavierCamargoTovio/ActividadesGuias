package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {
    //menu form
	@FindBy(xpath = "//*[@id='menu']/li[6]/a")
	public WebElementFacade mnuForm;
	// submenu form general 1
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElementFacade mnuFormGeneral;
	//submenu form validation
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[2]/a")
	public WebElementFacade mnuFormValidation;
	//form validaption - label informativo
	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElementFacade lblFormValidation;
	
	public void menuFormValidation() {
		mnuForm.click();
		mnuFormValidation.click();
		String strMensaje = lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
	}
}
