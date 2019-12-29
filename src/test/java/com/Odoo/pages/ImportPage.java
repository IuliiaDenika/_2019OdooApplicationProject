package com.Odoo.pages;


import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    public ImportPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//label[@for='my-file-selector']")
    public WebElement LoadButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_import_button o_import_validate']")
    public WebElement TestImportButton;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement fieldForImport;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement CancelButton;

    @FindBy(xpath = "//input[@id='my-file-selector']")
    public WebElement inputFile;
}
