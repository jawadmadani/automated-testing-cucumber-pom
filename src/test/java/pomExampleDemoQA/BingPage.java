package pomExampleDemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BingPage {

	@FindBy(how = How.NAME, using = "q")
	private WebElement searchBox;
	
	public void searchFor(String text) {
		searchBox.sendKeys(text);
		searchBox.submit();
	}
}
