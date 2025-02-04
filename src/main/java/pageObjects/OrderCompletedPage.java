package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderCompletedPage extends BasePage{
    public OrderCompletedPage(WebDriver driver) {
        super(driver);
    }

    private final By ORDER_COMPLETED_PAGE_TITLE = By.xpath("//h1[normalize-space()='Thank you']");
    private final By ORDER_PROCESSED_SUCCESS_MESSAGE = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    private final By ORDER_NUMBER_TITLE = By.xpath("//div[@class='order-number']/strong[starts-with(text(), 'Order number:')]");
    public boolean confirmOrderProcessedSuccessMessageIsVisible(){
        return confirmElementIsVisible(ORDER_PROCESSED_SUCCESS_MESSAGE);
    }
    public boolean confirmOrderCompletedPageTitleIsVisible(){
        return confirmElementIsVisible(ORDER_COMPLETED_PAGE_TITLE);
    }
    public boolean confirmOrderNumberTitleIsVisible(){
        return confirmElementIsVisible(ORDER_NUMBER_TITLE);
    }
}
