package com.Odoo.pages;
//everything thats common between the pages
//like top menu elements don't belong to any specific thing, so we can keep them here and extend the class if we need to

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(css = "[class='o_loading']")
    public WebElement loaderMask;


    @FindBy(css = "ol[class='breadcrumb']")
    public WebElement pageSubTitle;

    @FindBy(css ="[class='oe_topbar_name']" )
    public WebElement userName;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;


    @FindBy(linkText = "My Odoo.com account")
    public WebElement myUser;

    @FindBy(css = "[class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list']")
    public WebElement List;




    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //@return true if loader mask is gone, false if something went wrong
    public boolean waitUntilLoaderMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);


        try {
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found");
            e.printStackTrace();
            return true; //no loader mask all good to go
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }


    public void navigateTo(String module, String moduleName) {
        Actions actions = new Actions(Driver.get());

        String tabLocator ="//*[normalize-space()='" + moduleName + "' and @class= 'oe_menu_text']";


        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(tabLocator)));

        WebElement tab = Driver.get().findElement(By.xpath(tabLocator));

        wait.until(ExpectedConditions.visibilityOf(tab));
        wait.until(ExpectedConditions.elementToBeClickable(tab));

        waitUntilLoaderMaskDisappear();
        tab.click();

    }


    public String getPageSubTitle() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    public void logOut() {
        BrowserUtils.wait(2);
        BrowserUtils.clickWithJS(myUser);  //click with a java script, supported by old java
        BrowserUtils.clickWithJS(logOutLink);
    }

    public String getUserName() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }

    public void goToMyUser() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myUser, 5).click();
    }

    public void clickOnList() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.clickWithJS(List);
        List.click();
    }

}
