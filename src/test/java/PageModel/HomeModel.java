package PageModel;


import org.openqa.selenium.By;

public class HomeModel extends BaseModel {
    public static By clickElectronic = By.xpath("//*[@class='sf-MenuItems-1-U3X'][1]");
    public static By hoverPrinter = By.xpath("//*[@class='sf-ChildMenuItems-3m2LI'][2]");
    public static By click3DPrinterBtn = By.xpath("//*[@class='sf-ChildMenuItems-3R6bj item-512']");

    public void userVisitSite(String key){
        webDriver.get(key);
    }
    public void clickElectronicBtn() {
        clickElement(clickElectronic);
    }
    public void hoverPrinterBtn() {
        hoverToElement(findElement(hoverPrinter));
    }
    public void click3DPrinterBtn() {
        clickElement(click3DPrinterBtn);
    }
}
