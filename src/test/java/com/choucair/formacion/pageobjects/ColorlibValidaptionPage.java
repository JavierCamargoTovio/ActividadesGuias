package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibValidaptionPage extends PageObject {
    //campo required
    @FindBy(xpath = "//*[@id='req']")
    public WebElementFacade txtRequired;
    //campo de seleccion de deporte1
    @FindBy(xpath = "//*[@id='sport']")
    public WebElementFacade cmbSport1;
    //campo multiple select
    @FindBy(xpath = "//*[@id='sport2']")
    public WebElementFacade txtMultiselect;

    //campo de la url1
    @FindBy(xpath = "//*[@id='url1']")
    public WebElementFacade txtUrl;
    //campo de la email1
    @FindBy(xpath = "//*[@id='email1']")
    public WebElementFacade txtEmail;
    //campo de la password1
    @FindBy(xpath = "//*[@id='pass1']")
    public WebElementFacade txtPass1;
    //campo de la password2
    @FindBy(xpath = "//*[@id='pass2']")
    public WebElementFacade txtPass2;
    //campo de la MinimoSize
    @FindBy(xpath = "//*[@id='minsize1']")
    public WebElementFacade txtMinSize1;
    //campo de la MaximoSize
    @FindBy(xpath = "//*[@id='maxsize1']")
    public WebElementFacade txtMaximo1;
    //campo de number
    @FindBy(xpath = "//*[@id='number2']")
    public WebElementFacade txtNumber;
    //campo de ip
    @FindBy(xpath = "//*[@id='ip']")
    public WebElementFacade txtIp;
    //campo Date
    @FindBy(xpath = "//*[@id='date3']")
    public WebElementFacade txtDate;
    //campo Date Earlier
    @FindBy(xpath = "//*[@id='past']")
    public WebElementFacade txtDateEar;
    //campo boton
    @FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
    public WebElementFacade btnValidate;

    //------------------------------------------------//
    //----globoinformativo--si el caso fue exitoso
    @FindBy(xpath = "//div[@class='formErrorContent'][1]")
    public WebElementFacade globoInformativo;

    //Métodos
    public void required(String datoPrueba) {
        txtRequired.click();
        txtRequired.clear();
        txtRequired.sendKeys(datoPrueba);
    }

    public void select_sport(String datoPrueba) {
        cmbSport1.click();
        cmbSport1.selectByVisibleText(datoPrueba);
    }
    public void multiple_select(String datoPrueba) {
        txtMultiselect.click();
        txtMultiselect.selectByVisibleText(datoPrueba);
    }
    public void url(String datoPrueba) {
        txtUrl.click();
        txtUrl.clear();
        txtUrl.sendKeys(datoPrueba);
    }
    public void email(String datoPrueba) {
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(datoPrueba);
    }
    public void password(String datoPrueba) {
        txtPass1.click();
        txtPass1.clear();
        txtPass1.sendKeys(datoPrueba);
    }
    public void confirmacion_password(String datoPrueba) {
        txtPass2.click();
        txtPass2.clear();
        txtPass2.sendKeys(datoPrueba);
    }
    public void minimun_field_size(String datoPrueba) {
        txtMinSize1.click();
        txtMinSize1.clear();
        txtMinSize1.sendKeys(datoPrueba);
    }
    public void maximun_field_size(String datoPrueba) {
        txtMaximo1.click();
        txtMaximo1.clear();
        txtMaximo1.sendKeys(datoPrueba);
    }
    public void number(String datoPrueba) {
        txtNumber.click();
        txtNumber.clear();
        txtNumber.sendKeys(datoPrueba);
    }
    public void ip(String datoPrueba) {
        txtIp.click();
        txtIp.clear();
        txtIp.sendKeys(datoPrueba);
    }
    public void date(String datoPrueba) {
        txtDate.click();
        txtDate.clear();
        txtDate.sendKeys(datoPrueba);
    }
    public void date_earlier(String datoPrueba) {
        txtDateEar.click();
        txtDateEar.clear();
        txtDateEar.sendKeys(datoPrueba);
    }
    public void validate() {
        btnValidate.click();
    }
//--creamos el método que verifica que no existe el globo informativo
    public void formulario_sin_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(false));
    }
    public void formulario_con_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(true));
    }
}
