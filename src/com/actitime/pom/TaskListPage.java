package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(className = "addNewButton")
private WebElement addNewButton;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerButton;
@FindBy(id="customerLightBox_nameField")
private WebElement custNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement custDescTbx;
@FindBy(xpath="//button[contains(text(),'Select an active customer ')]")
private WebElement companyDropdown;
@FindBy(linkText = "Our Company")
private WebElement ourCompanyOpt;
@FindBy(id="customerLightBox_commitBtn")
private WebElement createCustomerBtn;
@FindBy(xpath="//div[@class='tasksTable hasSelectedCustomer']/div[@class='header']/div[@class='title ellipsis']")
private WebElement createdCustomerName;
@FindBy(id="logoutLink")
private WebElement logoutBtn;
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogout() {
	logoutBtn.click();
}
public WebElement getAddNewButton() {
	return addNewButton;
}
public WebElement getNewCustomerButton() {
	return newCustomerButton;
}
public WebElement getCustNameTbx() {
	return custNameTbx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getCompanyDropdown() {
	return companyDropdown;
}
public WebElement getOurCompanyOpt() {
	return ourCompanyOpt;
}
public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}
public WebElement getCreatedCustomerName() {
	return createdCustomerName;
}

}
