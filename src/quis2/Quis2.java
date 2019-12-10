/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author User
 */
public class Quis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","D:\\kuliah\\Pengujian perangkat lunak\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String baseUrl ="https://demo.1crmcloud.com/login.php";
        driver.get(baseUrl);
        WebElement username =driver.findElement(By.name("user_name"));
        username.sendKeys("admin");
        WebElement password = driver .findElement(By.name("user_password"));
        password.sendKeys("admin");
        WebElement button = driver.findElement(By.id("login_button"));
        button.click();
        Thread.sleep(10000);
        
        WebElement avatar = driver.findElement(By.className("meta-profile"));
        avatar.click();
        
        if (driver.getPageSource().contains("- admin")){
            System.out.println("Status user : Admin");
        }
        else{
            System.out.println("Status user : Non-Admin");
        }
    }
    
}
