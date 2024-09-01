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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Customer Login/input_Email_loginusername'), 'libosem856@apifan.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Ecomm/Page_Customer Login/input_Password_loginpassword'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Men/a_Jackets'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Jackets - Tops - Men/a_Montana Wind Jacket'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/div_L'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-53'))

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/input_Qty_qty'), '2')

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/span_4'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Montana Wind Jacket/button_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_New Address'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/input_First Name_firstname'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/div_First Name                             _fcb15f'))

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_First Name_firstname'), 'testa')

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_Last Name_lastname'), 'test')

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/div_First Name                             _fcb15f'))

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_Last Name_lastname'), 'testb')

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_Street Address Line 1_street0'), '123 asddf')

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_City_city'), 'bvc')

WebUI.selectOptionByValue(findTestObject('Object Repository/Ecomm/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_ZipPostal Code_postcode'), '123456')

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_Phone Number_telephone'), '123456')

WebUI.setText(findTestObject('Object Repository/Ecomm/Page_Checkout/input_ZipPostal Code_postcode'), '12345')

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_Ship here'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/input_Best Way_ko_unique_4'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Checkout/span_Place Order'))

WebUI.click(findTestObject('Object Repository/Ecomm/Page_Success Page/strong_000017527'))

WebUI.closeBrowser()

