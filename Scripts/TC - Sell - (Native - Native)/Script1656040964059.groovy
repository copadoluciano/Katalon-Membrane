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

WebUI.click(findTestObject('header/buy_sell'))

WebUI.click(findTestObject('trades/button_Inbox'))

WebUI.click(findTestObject('trades/button_Outbox'))

WebUI.click(findTestObject('trades/button_Accepted'))

WebUI.click(findTestObject('trades/button_History'))

WebUI.click(findTestObject('trades/button_Create New Order'))

WebUI.click(findTestObject('trades/button_Sell'))

WebUI.setText(findTestObject('trades/input_quantity'), '0.1')

WebUI.setText(findTestObject('trades/input_unit_prince'), '1')

WebUI.setText(findTestObject('trades/input_expiration'), '1')

WebUI.click(findTestObject('trades/open_modal_counterparty'))

WebUI.click(findTestObject('trades/select_chavo'))

WebUI.click(findTestObject('trades/close_modal_counterparty'))

WebUI.click(findTestObject('trades/create_order'))

