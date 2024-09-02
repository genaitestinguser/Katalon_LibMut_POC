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

//Open the browser
WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Demo/Page_Home Page/a_Support This Project'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Software Testing Board is Creating a c_b0470d/Support 5'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Software Testing Board is Creating a c_b0470d/div_Pay Pay with card'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Software Testing Board is Creating a c_b0470d/input_5_w-full tw-remove-default-styling tw_fa2b0a'), 
    'sfsdfd@test.com')

WebUI.click(findTestObject('Object Repository/Demo/Page_Software Testing Board is Creating a c_b0470d/button_Pay'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Software Testing Board is Creating a c_b0470d/div_Checkout_cursor-pointer rounded-full fl_cc8274'))

