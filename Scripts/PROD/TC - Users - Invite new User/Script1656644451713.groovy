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

WebUI.click(findTestObject('STAGING/header/users'))

WebUI.click(findTestObject('STAGING/users/button_Whitelist'))

WebUI.click(findTestObject('STAGING/users/button_Pending Invites'))

WebUI.click(findTestObject('STAGING/users/span_Invite User'))

WebUI.setText(findTestObject('STAGING/users/input_Email_email'), 'ramoncito.lootgnitset@gmail.com')

WebUI.click(findTestObject('STAGING/users/button_Cancel'))

WebUI.click(findTestObject('STAGING/users/span_Invite User'))

WebUI.setText(findTestObject('STAGING/users/input_Email_email'), 'ramoncito.lootgnitset@gmail.com')

WebUI.click(findTestObject('STAGING/users/button_Send'))

WebUI.verifyElementVisible(findTestObject('STAGING/users/popuo_invite_sent'))

WebUI.click(findTestObject('STAGING/users/button_Pending Invites'))

WebUI.verifyElementVisible(findTestObject('STAGING/users/validate_pending_invite'))

WebUI.click(findTestObject('STAGING/users/cancel_invite'))

WebUI.delay(5)

