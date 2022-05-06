package Tests;

import PageModel.ProductModel;
import com.thoughtworks.gauge.Step;

public class ProductTest {

    ProductModel productModel = new ProductModel();
    @Step("Kullanıcı marka olarak <key>'i seçer.")
    public void clickBrandFilter(String key) {

        productModel.clickBrandFilterBtn();
    }
    @Step("Kullanıcı Değerlendirme puanını dört ve üzeriyi seçer.")
    public  void clickRating(){
        productModel.clickRatingBtn();
    }
    @Step("Kullanıcı rastgele bir ürün seçer.")
    public void selectRandomPruduct(){
        productModel.selectRandomProduct();
    }
    @Step("Kullanıcı ürünün geldiğini kontrol eder.")
    public void checkProduct(){
        productModel.checkProductBtn();
    }
}
