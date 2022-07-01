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

WebUI.click(findTestObject('STAGING/menu_right/my_wallets'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/button_ImportToken'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/img_btc'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_Bitcoin'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_BTC'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/img_eth'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_ETH'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_Ethereum'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/img_ltc'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_LTC'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_Litecoin'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/img_bch'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_BCH'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/span_Bitcoin Cash'))

WebUI.click(findTestObject('STAGING/my_wallets/show_tokens'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/box_SNXSynthetix Network Token'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/box_USDCUSD Coin'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/box_TOKETokemak'))

WebUI.verifyElementVisible(findTestObject('STAGING/my_wallets/box_WBTCWrapped BTC'))

