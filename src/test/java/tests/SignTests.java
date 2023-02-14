package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTests {
    @Test
    public void testFazerLoginNoTaskit(){
        System.setProperty("webdriver.chrome.driver", "C:\\javatest\\testWeb\\src\\test\\java\\chromeDriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://itera-qa.azurewebsites.net/");

        navegador.findElement(new By.ByLinkText("Login")).click();

        navegador.findElement(By.id("Username")).sendKeys("CharlesSilva");
        navegador.findElement(By.id("Password")).sendKeys("12345");
        navegador.findElement(By.name("login")).click();

        String saudacao = navegador.findElement(By.cssSelector("div>div>h3")).getText();

        assertEquals("Welcome CharlesSilva", saudacao);

        navegador.quit();
    }
}