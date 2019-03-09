package n11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * created by MehmetBesli063 on 03.2019
 */
public class n11Project {

    public static WebDriver driver;
    public String urunAdi = "xiaomi";
    public String productName;
    public String favouriteProductName;
    public String LogoutMessage;

    public void goToN11LoginPage() {


        driver.get("https://www.n11.com/");
        if (driver.getCurrentUrl().contains("https://www.n11.com/")) {
            System.out.println("N11 sayfasina gidildi");
        } else {
            throw new WebDriverException("ilgili sayfaya acilamadi");
        }

        driver.findElement(By.className("btnSignIn")).click();
    }

    public void enterUsernameAndPassword() {
        driver.findElement(By.id("email")).sendKeys("beslim063@gmail.com");
        driver.findElement(By.id("password")).sendKeys("mhmtbsln1163");
        driver.findElement(By.id("loginButton")).click();
    }

    public void controlLoginPage() {
        if (driver.getCurrentUrl().contains("https://www.n11.com/")) {
            System.out.println("Login sayfasındasınız");
            System.out.println("-----------------------------");

        } else {
            System.out.println("istenilen sayfaya gidemediniz");
            System.out.println("-----------------------------");
        }
    }

    public void searchProduct() {
        driver.findElement(By.id("searchData")).sendKeys(urunAdi);
        driver.findElement(By.className("searchBtn")).click();
    }

    public void controlSearchedProduct() {
        if (driver.getCurrentUrl().contains("arama") || driver.getCurrentUrl().contains("samsung")) {
            System.out.println("İstenilen arama hakkında sonuçlar bulundu");
            System.out.println("-----------------------------");
        } else {
            System.out.println("arama başarısızı oldu");
            System.out.println("-----------------------------");
        }
    }

    public void gotoSecondPage() {
        //pagination uzerindeki "pagination" class'ina sahip "div" elementi altindaki 2. sayfaya git
        //driver.findElement(By.xpath("(//div[@class='pagination'])/a[contains(text(),'2')]")).click();
        driver.findElement(By.xpath("(//div[@class='pagination'])/a[2]")).click();
    }

    public void controlSecondPage() {
        if (driver.getCurrentUrl().contains("pg=2")) {
            System.out.println("Sayfaya 2 ye geçiş yaptınız");
            System.out.println("-----------------------------");

        } else {
            System.out.println("2. sayfaya gidemediniz");
            System.out.println("-----------------------------");
        }
    }

    public void getThirdProductName() {
        productName = driver.findElement(By.xpath("//div[@id='p-296251844']/div[1]/a/h3")).getText();
        //*[@id="p-296251844"]/div[1]/a/h3

        System.out.println("seçilen 3. ürünün ismi: " + productName);
        System.out.println("-----------------------------");

    }

    public void addThirdProductToFavourite() {
        driver.findElement(By.xpath("//div[@id='view']/ul/li[3]//span[contains(@class,'followBtn')]")).click();
    }

    public void gotoMyFavouriteProduct() {
        //driver.findElement(By.xpath("//a[text()='İstek Listem / Favorilerim']")).click();
        //driver.findElement(By.xpath("//a[@href='https://www.n11.com/hesabim/favorilerim']")).click();
        //driver.findElement(By.linkText("İstek Listem / Favorilerim")).click();
        By css = By.cssSelector("a[href='https://www.n11.com/hesabim/istek-listelerim']");
        WebElement element = driver.findElement(css);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void clickFavouriteProduct() {
        driver.findElement(By.xpath(("//h4[@class='listItemTitle']"))).click();
    }

    public void confirmSameProduct() {
        favouriteProductName = driver.findElement(By.xpath("//div[@class='pro']/a/h3")).getText();
        System.out.println("Favoriye ekelene ürün: " + favouriteProductName);
        System.out.println("-----------------------------");
        if (favouriteProductName.equals(productName)) {
            System.out.println("istenilen urun favoriye eklendi");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Yanlış urun favoriye eklendi");
            System.out.println("-----------------------------");
        }
    }

    public void deleteProductFromFavourite() {
        driver.findElement(By.xpath("//span[@class='deleteProFromFavorites']")).click();
    }

    public void controlDeletedOrNot() {
        WebElement checkProductDelete = driver.findElement(By.xpath("//span[text()='Ürününüz listeden silindi.']"));
        if (checkProductDelete != null) {
            System.out.println("Favori listesinde ürün bulunmamaktadır");
            System.out.println("-----------------------------");
        } else {
            System.out.println("İstediğiniz ürün silinemedi");
            System.out.println("-----------------------------");
        }
    }

    public void closeDeleteConfirmMessagePopup() {
        driver.findElement(By.xpath("//span[@class='btn btnBlack confirm']")).click();
    }

    public void Logout() {
        By css = By.cssSelector("a[href='https://www.n11.com/cikis-yap']");
        WebElement element = driver.findElement(css);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void controlLogourOrNot() {
        LogoutMessage = driver.findElement(By.xpath(("//div[@class='blockWrap']/h2"))).getText();

        if (LogoutMessage.contains("Giriş Yap")) {
            System.out.println("Succesfully Exit");
        } else {
            System.out.println("could not exit");
        }
    }
}