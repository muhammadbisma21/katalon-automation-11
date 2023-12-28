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

WebUI.callTestCase(findTestCase('SignIn/04_berhasilLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Payment/Page_STORE/a_Samsung galaxy s6'), 0)

WebUI.click(findTestObject('Payment/Page_STORE/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Payment/Page_STORE/btn_Addtocart'))

WebUI.click(findTestObject('Payment/Page_STORE/title_home'))

WebUI.click(findTestObject('Payment/Page_STORE/a_Nokia lumia 1520'))

WebUI.click(findTestObject('Payment/Page_STORE/btn_Addtocart2'))

WebUI.click(findTestObject('Object Repository/Payment/Page_STORE/menu_Cart'))

WebUI.click(findTestObject('Object Repository/Payment/Page_STORE/btn_Order'))

WebUI.setText(findTestObject('Object Repository/Payment/Page_STORE/inputname'), 'bisma')

WebUI.setText(findTestObject('Object Repository/Payment/Page_STORE/inputcountry'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/Payment/Page_STORE/inputcity'), 'magelang')

WebUI.setText(findTestObject('Object Repository/Payment/Page_STORE/inputcard'), '08960830521')

WebUI.setText(findTestObject('Object Repository/Payment/Page_STORE/inputmonth'), '12')

WebUI.setText(findTestObject('Object Repository/Payment/Page_STORE/inputyear'), '2024')

WebUI.click(findTestObject('Object Repository/Payment/Page_STORE/btn_Purchase'))

WebUI.verifyElementPresent(findTestObject('Payment/Page_STORE/h2_Thank you for your purchase'), 0)

WebUI.click(findTestObject('Object Repository/Payment/Page_STORE/button_OK'))

WebUI.closeBrowser()

