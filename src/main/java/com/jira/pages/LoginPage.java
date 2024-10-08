package com.jira.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage extends BaseJiraPage {

    public LoginPage() {
        super("/");
    }

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By continueLoginBtn = By.id("login-submit");

    public void login(String username, String password) {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys("vladislav.adamov.a61@learn.telerikacademy.com");
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(continueLoginBtn)).click();
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys("Vladislav1997*");
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(continueLoginBtn)).click();

    }
}