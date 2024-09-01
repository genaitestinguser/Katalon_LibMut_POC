import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//Open the browser
WebUI.openBrowser('')

//Navigate to the Ecommerce Application
WebUI.navigateToUrl(GlobalVariable.AppUrl)

WebUI.maximizeWindow()

//Enter the user id and password and sign-in
WebUI.click(findTestObject('Object Repository/Ecomm/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Customer Login/input_Email_loginusername'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Customer Login/input_Password_loginpassword'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Customer Login/span_Sign In'))

//Select the jacket and add to cart
WebUI.click(findTestObject('Object Repository/Ecomm/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Men/a_Jackets'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Jackets - Tops - Men/a_Montana Wind Jacket'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/div_L'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-53'))

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/input_Qty_qty'), quantity)

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/span_Add to Cart'))

//intiate the checkout process with default address
WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/span_4'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/button_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/input_Best Way_ko_unique_4'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_Place Order'))

//Get the Order number generated
WebUI.takeScreenshot()

strOrderNumber = WebUI.getText(findTestObject('Object Repository/Ecomm/Page_Success Page/strong_OrderNumber'))

KeywordUtil.logInfo('Order Number: ' + strOrderNumber)

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Success Page/strong_OrderNumber'))

KeywordUtil.markPassed('Test Passed')

//Execution completed ... close the browser
WebUI.closeBrowser()

