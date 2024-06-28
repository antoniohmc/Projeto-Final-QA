package pages.positivas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroSenha {

    static WebDriver driver;

    public CadastroSenha(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebElement name = driver.findElement(By.name("Passwd"));
        name.sendKeys("henriquecampos11");

        WebElement nameConfirm = driver.findElement(By.name("PasswdAgain"));
        nameConfirm.sendKeys("henriquecampos11");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

    }
}
