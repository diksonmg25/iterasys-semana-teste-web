package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {
    //Atributos
	// Caixa de Pequisa
	
	@FindBy(id = "search")
	private WebElement busca;

	// Construtor
	public Home(WebDriver driver) {
		super(driver);
	}
	
	// M?todos ou Fun??es
	public void buscarProdutoComEnter(String produto) {
		busca.clear(); // limpa a caixa de pesquisa
		busca.sendKeys(produto + Keys.ENTER);
	}
}
