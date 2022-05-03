package abrirNavegador;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class provaAnderson {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Feature/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inm-test-app.herokuapp.com/accounts/login/");

	}

	@After
	public void tearDown() throws Exception {

		driver.quit();

	}

	@Test
	public void testcadastroUsuario0() {

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[7]/a")).click();
		driver.findElement(By.name("username")).sendKeys("Pedro Henrique Matheus Benjamin Rodrigues");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("confirmpass")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[7]/button")).click();

	}

	@Test
	public void testcadastroUsuario1() {

		driver.findElement(By.name("username")).sendKeys("Pedro Henrique Matheus Benjamin Rodrigues");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[6]/button")).click();

	}

	@Test
	public void testcadastroUsuario2() {

		driver.findElement(By.name("username")).sendKeys("Pedro Henrique Matheus Benjamin Rodrigues");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[6]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
		driver.findElement(By.id("inputNome")).sendKeys("Caleb Roberto Benjamin Aparício");
		driver.findElement(By.id("cpf")).sendKeys("356.688.548-76");
		driver.findElement(By.id("slctSexo")).sendKeys("M");
		driver.findElement(By.id("inputAdmissao")).sendKeys("21/10/2021");
		driver.findElement(By.id("inputCargo")).sendKeys("Analista de Testes Sênior");
		driver.findElement(By.id("dinheiro")).sendKeys("1200000");
		driver.findElement(By.id("clt")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"tabela_filter\"]/label/input")).sendKeys("Caleb Roberto Benjamin Aparício");
		driver.findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[2]/button")).click();
		driver.findElement(By.id("dinheiro")).clear();
		driver.findElement(By.id("dinheiro")).sendKeys("5000000000000");
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"tabela_filter\"]/label/input")).sendKeys("Caleb Roberto Benjamin Aparício");
		driver.findElement(By.id("delete-btn")).click();

	}

}
