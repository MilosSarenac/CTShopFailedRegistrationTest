package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.CTShopLogInTest;

import java.util.Random;

public class TestClass extends BaseTest {
    CTShopLogInTest ctShopLogInTest;

    Random random = new Random();
    int randomint = random.nextInt(9999);
    String ime = "test";
    String prezime = "test";
    String email = ime + "@mailinator.com";
    String lozinka = "lozinka" + randomint;


    @Before
    public void setUpTest(){
        ctShopLogInTest = new CTShopLogInTest();
    }

    @Test
    public void ResigrationPageTest(){
        ctShopLogInTest.reklamaXButtonClick()
                .imeInputFieldSendKeys(ime)
                .prezimeInputFieldSendKeys(prezime)
                .emailInputFieldSendKeys(email)
                .checkInButtonUnchecked()
                .passwordInputFieldSendKeys(lozinka)
                .confrimPasswordInputFieldSendKeys(lozinka)
                .skrollPage()
                .posaljiButtonClick()
                .reklama2XButtonClick();
        Assert.assertTrue(ctShopLogInTest.uspesnaRegistracijaBrojac() == 0);
        Assert.assertTrue(ctShopLogInTest.neuspesnaRegistracijaBrojac() != 0);



    }

}
