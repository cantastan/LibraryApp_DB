package com.cydeo.steps;

import com.cydeo.pages.LoginPage;
import com.cydeo.utility.BrowserUtil;
import io.cucumber.java.en.*;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user logged in  {string} and {string}")
    public void the_user_logged_in_and(String username, String password) {
        loginPage.login(username,password);
        BrowserUtil.waitFor(2);

    }
    @When("user gets username  from user fields")
    public void user_gets_username_from_user_fields() {


    }
    @Then("the username should be same with database")
    public void the_username_should_be_same_with_database() {


    }

}