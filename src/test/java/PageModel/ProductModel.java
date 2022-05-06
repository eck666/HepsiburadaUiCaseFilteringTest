package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductModel extends BaseModel{
    public static By clickBrandFilter = By.xpath("//div[contains(text(),'Anycubic')]");
    public static By clickRating = By.xpath("//*[@class='content-ratingFilterLabel']//*[text()='4  ve 4+']");
    public static By productsList = By.cssSelector("#ProductList .productListContent-item");
    public static By checkProduct = By.xpath("//*[@id='addToCart']");

    public void clickBrandFilterBtn() {
        clickElement(clickBrandFilter);
        waitSeconds(4);
    }
    public void clickRatingBtn(){

        clickElement(clickRating);
        waitSeconds(4);
    }
    List<WebElement> product;
    Random random =new Random();
    public void selectRandomProduct(){
        product = findElements(productsList);
        int productNumber = random.nextInt(product.size());
        clickElement(product.get(productNumber));
        waitSeconds(4);
    }
    public void checkProductBtn() {
        switchToPageElement(1);
        hoverToElement(findElement(checkProduct));
        waitSeconds(2);
    }
}
