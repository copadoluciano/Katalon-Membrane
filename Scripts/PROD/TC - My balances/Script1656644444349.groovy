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

WebUI.click(findTestObject('STAGING/menu_right/menu_user'))

WebUI.click(findTestObject('STAGING/menu_right/balances _credits'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/button_BITCOIN'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/button_BITCOIN CASH'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/button_ETHEREUM'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/button_LITECOIN'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/input_search'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/span_Ethereum'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/span_Synthetix Network Token'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/span_Tokemak'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/span_USD Coin'))

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/button_Add New Wallet'))

WebUI.setText(findTestObject('STAGING/my balances/input_search'), 'btc')

WebUI.verifyElementVisible(findTestObject('STAGING/my balances/h2_Nothing to show'))

