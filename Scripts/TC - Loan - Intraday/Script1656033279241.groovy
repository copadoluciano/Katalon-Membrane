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

WebUI.click(findTestObject('header/lend_borrow'))

WebUI.click(findTestObject('loan/button_create_new_order'))

WebUI.click(findTestObject('loan/select_intraday'))

WebUI.click(findTestObject('loan/select_currency'))

WebUI.click(findTestObject('loan/select_Litecoin'))

WebUI.setText(findTestObject('loan/input_principal_amount'), '1')

WebUI.click(findTestObject('loan/select_counterparty'))

WebUI.click(findTestObject('loan/select_chavo'))

WebUI.click(findTestObject('loan/close_counterparty'))

WebUI.setText(findTestObject('loan/input_hir'), '10')

WebUI.click(findTestObject('loan/select_offer_expiration_intraday'))

WebUI.click(findTestObject('loan/select_hours_intraday'))

WebUI.setText(findTestObject('loan/input_time_duration_offer'), '1')

WebUI.setText(findTestObject('loan/input_collateral'), '50')

WebUI.click(findTestObject('loan/select_collateral_asset_intraday'))

WebUI.click(findTestObject('loan/select_collateral_tokemak'))

WebUI.setText(findTestObject('loan/input_collateral_limit'), '10')

WebUI.click(findTestObject('loan/button_place_offer'))

