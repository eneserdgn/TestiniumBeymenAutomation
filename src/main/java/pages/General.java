package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
import utils.ExcelHelper;

public class General {
    WebDriver driver;
    ElementHelper helper;
    private By goBasketButton = By.cssSelector(".m-notification__button.btn");
    private By productName = By.cssSelector(".o-productDetail__description");
    private By productPrice = By.cssSelector("#priceNew");

    public General(WebDriver driver) {
        this.driver = driver;
        helper = new ElementHelper(driver);
    }

    public void clickGoBasketButton() {
        helper.click(goBasketButton);
    }

    public void sendKeysKeyboard(String button) {
        helper.sendKeysKeyboard(button);
    }

    public String getCell(String sheet, int row, int column) {
        return helper.getTextFromCell(sheet, row, column);
    }

    public void saveProductNameAndPrice() {
        helper.saveText(helper.getText(productPrice) + helper.getText(productName));
    }

    public String getTxtString() {
        return helper.readText();
    }

}
