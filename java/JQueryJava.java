package projectone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryJava {
	
	private WebDriver driver;
	
	
	@BeforeMethod
	public void BeforeEachMethod() {
		
		try {
			// starting Chrome Browser
			driver = new ChromeDriver();		
			// Navigate URL
			driver.get("https://jqueryui.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}catch (Exception error) {
			System.out.println(error);
		}
		
	}
	
	@AfterMethod
	public void AfterEachMethod() {
		
		driver.close();
		driver.quit();
		
	}
	
	
	
	
	@Test(enabled = false)
	public void testingDraggable() throws InterruptedException {
		
		// Selecting and clicking the link Draggable
		System.out.println("Step 1: Selecting and clicking the link Draggable");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a"));
		element.click();
		
		// Selecting and frame and switching to it
		System.out.println("Step 2: Selecting and Switching to Frame");
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		
		// Dragging the Element using Action
		System.out.println("Step 3: Dragging using Action");
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("draggable"));
		Thread.sleep(1000);
		action.dragAndDropBy(element, 80, 80).build().perform();
		
		//waiting just to see the result
		System.out.println("Step 4: Waiting to See the Result");
		Thread.sleep(3000);
		
		System.out.println("Step 5: Draggable Test Passed");
		
	}
	
	@Test(enabled = false)
	public void testingDroppable() throws InterruptedException {
		// Selecting and clicking the link Droppable
		System.out.println("Step 6: Selecting and clicking the link Droppable");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a"));
		element.click();
		
		// Selecting and frame and switching to it
		System.out.println("Step 7: Selecting and Switching to Frame");
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		
		// Dragging the Element using Action
		System.out.println("Step 8: Dragging and dropping using Action");
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("draggable"));
		//getting drop location as web element
		WebElement delement = driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		action.dragAndDrop(element, delement).build().perform();
		
		//waiting just to see the result
		System.out.println("Step 9: Waiting to See the Result");
		Thread.sleep(3000);
		
		System.out.println("Step 10: Droppable Test Passed");
		
	}

	@Test(enabled = false)
	public void testingResizeable() throws InterruptedException {
		// Selecting and clicking the link Resizeable
		System.out.println("Step 11: Selecting and clicking the link Droppable");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a"));
		element.click();
		
		// Selecting and frame and switching to it
		System.out.println("Step 12: Selecting and Switching to Frame");
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		
		// Dragging the Element using Action
		System.out.println("Step 13: Dragging and dropping using Action");
		Actions action = new Actions(driver);
		element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Thread.sleep(1000);
		action.dragAndDropBy(element, 300, 100).build().perform();
		
		//waiting just to see the result
		System.out.println("Step 14: Waiting to See the Result");
		Thread.sleep(3000);
		
		System.out.println("Step 15: Resizable Test Passed");
		
	}
	@Test(enabled = false)
	public void testingSelectable() throws InterruptedException {
		// Selecting and clicking the link Selectable
		System.out.println("Step 16: Selecting and clicking the link Droppable");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a"));
		element.click();
		
		// Selecting and frame and switching to it
		System.out.println("Step 17: Selecting and Switching to Frame");
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		
		// Selecting buttons
		System.out.println("Step 18: Selecting Two different buttons");

		//Testing one selection
		element = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		Thread.sleep(1000);
		element.click();
		
		//Testing Second selection
		element = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
		Thread.sleep(1000);
		element.click();
		
		//waiting just to see the result
		System.out.println("Step 19: Waiting to See the Result");
		Thread.sleep(3000);
		
		System.out.println("Step 20: Selectable Test Passed");
		
	}
	
	@Test(enabled = false)
	public void testingSortable() throws InterruptedException {
		// Selecting and clicking the link Sortable
		System.out.println("Step 21: Selecting and clicking the link Droppable");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[5]/a"));
		element.click();
		
		// Selecting and frame and switching to it
		System.out.println("Step 22: Selecting and Switching to Frame");
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		
		// Dragging the Element using Action
		System.out.println("Step 23: Moving Two different buttons");
		Actions action = new Actions(driver);
		
		//Testing one Sorting
		element = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));
		WebElement moveLocation = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
		Thread.sleep(3000);
		action.clickAndHold(element).moveToElement(moveLocation).release().build().perform();
		
		//Testing Second Sorting
		element = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6]"));
		moveLocation = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		Thread.sleep(3000);
		action.clickAndHold(element).moveToElement(moveLocation).release().build().perform();
		
		//waiting just to see the result
		System.out.println("Step 24: Waiting to See the Result");
		Thread.sleep(10000);
		
		System.out.println("Step 25: Sortable Test Passed");
		
	}

	@Test(enabled = false)
	public void testingAccordion() throws InterruptedException {
		// Selecting and clicking the link Accordion
		System.out.println("Step 26: Selecting and clicking the link Droppable");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[1]/a"));
		element.click();
		
		// Selecting and frame and switching to it
		System.out.println("Step 27: Selecting and Switching to Frame");
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		
		// Selecting two accordion
		System.out.println("Step 28: Selecting Two different Accordion");
		
		//Testing one Accordion
		element = driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]"));
		element.click();
		Thread.sleep(4000);
		
		
		//Testing Second Accordion
		element = driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]"));
		element.click();
		
		//waiting just to see the result
		System.out.println("Step 29: Waiting to See the Result");
		Thread.sleep(10000);
		
		System.out.println("Step 30: Accordion Test Passed");
		
	}
	
	@Test(enabled = false)
	public void testingAutocomplete() throws InterruptedException {
		//selecting the Autocomplete link
		System.out.println("Step 31: Selecting and clicking the link Autocomplete");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[2]/a"));
		element.click();
		
		// Switching the Frame
		System.out.println("Step 32: Selecting and Switching to Frame");
		element = driver.findElement(By.className("demo-frame")); //Using Id to  try getting frame
		driver.switchTo().frame(element);

		
		// Selecting two accordion
		System.out.println("Step 33: Selecting form and autocompleting it.");
		
		//Testing one Accordion
		element = driver.findElement(By.id("tags"));
		element.sendKeys("javas");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		Thread.sleep(3000);
	
		//waiting just to see the result
		System.out.println("Step 34: Waiting to See the Result");
		Thread.sleep(5000);
		
		System.out.println("Step 35: Autocomplete Test Passed");
		
		
	}
	
	@Test(enabled = false)
	public void testingButton() throws InterruptedException {
		//selecting the Button link
		System.out.println("Step 36: Selecting and clicking the link Button");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]/a"));
		element.click();
		
		// Switching the Frame
		System.out.println("Step 37: Selecting and Switching to Frame");
		element = driver.findElement(By.className("demo-frame")); //Using Id to  try getting frame
		driver.switchTo().frame(element);

		
		// Selecting two Button
		System.out.println("Step 38: Clicking Button.");
		Actions action = new Actions(driver);
		
		//Testing one Accordion
		element = driver.findElement(By.xpath("/html/body/div/button"));
		action.clickAndHold(element).perform();
		Thread.sleep(2000);
		action.release().perform();
		element = driver.findElement(By.xpath("/html/body/input"));
		action.clickAndHold(element).perform();
		Thread.sleep(2000);
		action.release().perform();
		
		//waiting just to see the result
		System.out.println("Step 39: Waiting to See the Result");
		Thread.sleep(5000);
		
		System.out.println("Step 40: Button Test Passed");
		
		
	}
	
	@Test(enabled = false)
	public void testingCheckboxradio() throws InterruptedException {
		//selecting the Checkboxradio link
		System.out.println("Step 41: Selecting and clicking the link Button");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[4]/a"));
		element.click();
		
		// Switching the Frame
		System.out.println("Step 42: Selecting and Switching to Frame");
		element = driver.findElement(By.className("demo-frame")); //Using Id to  try getting frame
		driver.switchTo().frame(element);

		
		// Selecting two Checkboxradio
		System.out.println("Step 43: Checking Checkbox and radio Button.");
		
		//Testing one Accordion
		element = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]"));
		element.click();
		element = driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[3]"));
		element.click();
		element = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[2]"));
		element.click();
		
		
		//waiting just to see the result
		System.out.println("Step 44: Waiting to See the Result");
		Thread.sleep(7000);
		
		System.out.println("Step 45: Checkboxradio Test Passed");
		
	}
	
	@Test(enabled = true)
	public void testingControlgroup() throws InterruptedException {
		//selecting the Controlgroup link
		System.out.println("Step 36: Selecting and clicking the link Button");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[5]/a"));
		element.click();
		
		// Switching the Frame
		System.out.println("Step 37: Selecting and Switching to Frame");
		element = driver.findElement(By.className("demo-frame")); //Using Id to  try getting frame
		driver.switchTo().frame(element);

		
		// Selecting most of the Controlgroup
		System.out.println("Step 38: Clicking most of the Controlgroup.");
		
		//Testing one Accordion
		element = driver.findElement(By.xpath("//*[@id=\"car-type-button\"]"));
		element.click();
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		element = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[2]"));
		element.click();
		Thread.sleep(2000);
		element = driver.findElement(By.id("vertical-spinner"));
		element.sendKeys("21");
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("/html/body/div[1]/fieldset[2]/div/span[2]/a[1]/span[1]"));
		element.click();
		element.click();
		
		//waiting just to see the result
		System.out.println("Step 39: Waiting to See the Result");
		Thread.sleep(5000);
		
		System.out.println("Step 40: Controlgroup Test Passed");
		
		
	}
}
