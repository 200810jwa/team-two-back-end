package com.agora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AgoraHome {

    private WebDriver driver;
    public WebElement sportsCategoryButton;
    public WebElement scienceCategoryButton;
    public WebElement medicineCategoryButton;
    public WebElement politicsCategoryButton;
    public WebElement coronavirusCategoryButton;
    public WebElement businessCategoryButton;
    public WebElement economicsCategoryButton;
    public WebElement coffeeCategoryButton;
    public WebElement entertainmentCategoryButton;
    public WebElement foodCategoryButton;
    public WebElement technologyCategoryButton;
    public WebElement futureCategoryButton;
    public WebElement aiCategoryButton;
    public WebElement cryptocurrencyCategoryButton;
    public WebElement searchField;
    public WebElement searchButton;


    public AgoraHome(WebDriver driver) {
        super();
        this.driver = driver;
        this.driver.get("http://localhost:4200/landing");
        this.sportsCategoryButton = driver.findElement(By.id("sports-category-button"));
        this.scienceCategoryButton = driver.findElement(By.id("science-category-button"));
        this.medicineCategoryButton = driver.findElement(By.id("medicine-category-button"));
        this.politicsCategoryButton = driver.findElement(By.id("politics-category-button"));
        this.coronavirusCategoryButton = driver.findElement(By.id("coronavirus-category-button"));
        this.businessCategoryButton = driver.findElement(By.id("business-category-button"));
        this.economicsCategoryButton = driver.findElement(By.id("economics-category-button"));
        this.coffeeCategoryButton = driver.findElement(By.id("coffee-category-button"));
        this.entertainmentCategoryButton = driver.findElement(By.id("entertainment-category-button"));
        this.foodCategoryButton = driver.findElement(By.id("food-category-button"));
        this.technologyCategoryButton = driver.findElement(By.id("technology-category-button"));
        this.futureCategoryButton = driver.findElement(By.id("future-category-button"));
        this.aiCategoryButton = driver.findElement(By.id("ai-category-button"));
        this.cryptocurrencyCategoryButton = driver.findElement(By.id("cryptocurrency-category-button"));
        this.searchField = driver.findElement(By.id("queryParam"));
        this.searchButton = driver.findElement(By.id("search-btn"));
    }


    public void clickSportsCategoryButton() {
        this.sportsCategoryButton.click();
    }
    public void clickScienceCategoryButton() {
        this.scienceCategoryButton.click();
    }
    public void clickMedicineCategoryButton() {
        this.medicineCategoryButton.click();
    }
    public void clickPoliticsCategoryButton() {
        this.politicsCategoryButton.click();
    }
    public void clickCoronavirusCategoryButton() {
        this.coronavirusCategoryButton.click();
    }
    public void clickBusinessCategoryButton() {
        this.businessCategoryButton.click();
    }
    public void clickEconomicsCategoryButton() {
        this.economicsCategoryButton.click();
    }
    public void clickCoffeeCategoryButton() {
        this.coffeeCategoryButton.click();
    }
    public void clickEntertainmentCategoryButton(){
        this.entertainmentCategoryButton.click();
    }
    public void clickFoodCategoryButton() {
        this.foodCategoryButton.click();
    }
    public void clickTechnologyCategoryButton() {
        this.technologyCategoryButton.click();
    }
    public void clickFutureCategoryButton() {
        this.futureCategoryButton.click();
    }
    public void clickAiCategoryButton() {
        this.aiCategoryButton.click();
    }
    public void clickCryptocurrencyCategoryButton() {
        this.cryptocurrencyCategoryButton.click();
    }

    public void search(String search) {
        this.searchField.clear();
        this.searchField.sendKeys(search);
        this.searchButton.click();
    }

}
