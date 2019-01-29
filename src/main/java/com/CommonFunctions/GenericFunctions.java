package com.CommonFunctions;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Harshad
 *
 */
public class GenericFunctions {
	private static Actions action;
	GenericFunctions(WebDriver driver){
		
		action=new Actions(driver);
		
	}	

	public static Select selectByIndex(WebElement element, int index){
		Select sel=new Select(element);
		sel.selectByIndex(index);
		return sel;

	}
	public static void selectByValue(WebElement element, String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisisbleText(WebElement element, String visibletext) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibletext);

	}
	public static void deSelectByIndex(WebElement element, int deselectbyindex) {
		Select sel=new Select(element);
		sel.deselectByIndex(deselectbyindex);

	}
	public static void deSelectByValue(WebElement element, String deselectbyvalue) {
		Select sel=new Select(element);
		sel.deselectByValue(deselectbyvalue);

	}
	public static void deSelectByVisbleText(WebElement element,String deselectbyvisibletext ) {
		Select sel=new Select(element);
		sel.deselectByVisibleText(deselectbyvisibletext);

	}
	public static void deSelectAll(WebElement element) {
		Select sel=new Select(element);
		sel.deselectAll();

	}
	public static void getAllSelectedOptions(List<WebElement> element) {
		Select sel=new Select((WebElement) element);
		sel.getAllSelectedOptions();
	}
	
	public static void getFirstSelectedOption(WebElement element) {
		Select sel=new Select(element);
		sel.getFirstSelectedOption();

	}
	public static void getOptions(List<WebElement> element) {
		Select sel=new Select((WebElement) element);
		sel.getOptions();

	}

	public static void isMultiple(WebElement element) {
		Select sel=new Select(element);
		sel.isMultiple();

	}

//----------------------generic methods for Actions class---------------------------------------

	public static void contextClick(WebDriver driver,WebElement target) {
//		Actions action=new Actions(driver);
		action.contextClick(target).perform();
	}

	public static void moveToElement(WebDriver driver,WebElement target) {
		
		action.moveToElement(target).perform();
	}

	public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	public static void compositAction(WebDriver driver, WebElement target, CharSequence keys ) {
		Actions action=new Actions(driver);
		action.sendKeys(target, keys).build().perform();
	}
	public static void doubleClick(WebDriver driver,WebElement target ) {
		Actions action=new Actions(driver);
		action.doubleClick(target).perform();
	}
	public static void moveToMouseHover(WebDriver driver,WebElement target ) {
		Actions action=new Actions(driver);
		action.moveToElement(target).perform();
	}
}

