package com.nuclea.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class FaleComEspec extends Base {

    @FindBy(xpath = "//div[@data-id='492f8c4']")
    public WebElement menuFaleComEspecialista;

    @FindBy(css = "#rd-text_field-lu19zsgm")
    public WebElement campoNome;

    @FindBy(css = "#rd-email_field-lu19zsgn")
    public WebElement mail;

    @FindBy(css = "#rd-phone_field-lu19zsgo")
    public WebElement phone;

    @FindBy(css = "#rd-select_field-lu19zsgp")
    public List<WebElement> cargo;

    @FindBy(css = "#rd-select_field-lu19zsgq")
    public List<WebElement> departamento;

    @FindBy(css = "#rd-text_field-lu19zsgr")
    public WebElement empresa;

    @FindBy(xpath = "//*[@id=\"rd-number_field-lu19zsgs\"]")
    public WebElement cnpj;

    @FindBy(css = "#rd-number_field-lu19zsgs")
    public List<WebElement> solucao;

    @FindBy(css = "#rd-text_area_field-lu19zsgu")
    public WebElement message;

    @FindBy(css = "#rd-checkbox_field-lu19zsgw")
    public WebElement checkAgree;

    @FindBy(css = "#rd-button-l4n31wmp")
    public WebElement btnEnviar;

    @FindBy(xpath = "//h1[contains(.,'Agradecemos sua mensagem!')]")
    public WebElement msgAgradecimento;

    Faker faker = new Faker();

    public FaleComEspec(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void preenchimentoFormulario() throws InterruptedException {
        acessarMenuFaleComEspecialista();
        preencherNome();
        preencherEmail();
        preencherTelefone();
        selecionarCargo();
        selecionarDepartamento();
        preencherNomeEmpresa();
        preencherCNPJ();
        preencherMensagem();
        aceitarTermos();
        enviarForm();
    }


    public void acessarMenuFaleComEspecialista() throws InterruptedException {
        try {
            if (menuFaleComEspecialista.isDisplayed()) {
                wait.until(ExpectedConditions.elementToBeClickable(menuFaleComEspecialista)).click();
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void preencherEmail() {
        try {
            if (mail.isDisplayed()) {
                mail.sendKeys(faker.internet().emailAddress());
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void preencherNome() {
        try {
            if (campoNome.isDisplayed()) {
                campoNome.sendKeys(faker.name().fullName());
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void preencherTelefone() {
        try {
            if (phone.isDisplayed()) {
                phone.sendKeys(faker.phoneNumber().phoneNumber());
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void selecionarCargo() {
        try {
            if (!cargo.isEmpty()) {
                Select selectCargo = new Select(cargo.get(0));
                selectCargo.selectByVisibleText("Estudante");
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void selecionarDepartamento() {
        try {
            if (!departamento.isEmpty()) {
                Select selectDepartamento = new Select(departamento.get(0));
                selectDepartamento.selectByVisibleText("Fraude");
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void preencherCNPJ() {
        try {
            if (cnpj.isDisplayed()) {
                cnpj.sendKeys(faker.numerify("04153469000111"));
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void preencherNomeEmpresa() {
        try {
            if (empresa.isDisplayed()) {
                empresa.sendKeys(faker.numerify("NUCLEA ENTERPRISE"));
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void preencherMensagem() {
        try {
            if (message.isDisplayed()) {
                message.sendKeys("Favor me contatar! Tenho interesse em saber mais!");
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void aceitarTermos() {
        try {
            if (checkAgree.isDisplayed()) {
                wait.until(ExpectedConditions.elementToBeClickable(checkAgree)).click();
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void enviarForm() {
        try {
            if (btnEnviar.isDisplayed()) {
                wait.until(ExpectedConditions.elementToBeClickable(btnEnviar)).click();
            }
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }


}
