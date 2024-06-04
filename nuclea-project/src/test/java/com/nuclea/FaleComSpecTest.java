package com.nuclea;


import com.nuclea.pages.Base;
import com.nuclea.pages.FaleComEspec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class FaleComSpecTest extends Base {

    @BeforeEach
    void setUp() throws Exception {
        super.driver.get("https://www.nuclea.com.br/");
    }

    @AfterEach
    public void tearDown() {
       driver.quit();
    }

    @Test
    void faleComEspecialistaTest() throws InterruptedException {
        FaleComEspec spec = new FaleComEspec(driver);
        spec.preenchimentoFormulario();
    }
}
