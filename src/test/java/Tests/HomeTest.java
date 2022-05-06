package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class HomeTest {
    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sitesini ziyaret eder")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }
    @Step("Kullanıcı gezinti çubuğunda <key> bölümüne gelir.")
    public void clickElectronic(String key){
        homeModel.clickElectronicBtn();
    }
    @Step("Kullanıcı elektronik bölümünden <key> bölümüne gelir.")
    public void hoverPrinter(String key){
        homeModel.hoverPrinterBtn();
    }
    @Step("Kullanıcı <key> sınıfına tıklar.")
    public void click3DPrinter(String key){
        homeModel.click3DPrinterBtn();
    }
}
