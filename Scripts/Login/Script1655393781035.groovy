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

WebUI.navigateToUrl('https://demo.membrane.trade/sign-in/sign-in?skipCaptcha')

WebUI.setText(findTestObject('Object Repository/Page_Membrane/input_Email_email'), 'testinga13@membrane.trade')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Membrane/input_Password_password'), '4QAB1q7oUv9VprcK01p93A9bWbgBFWRH2qSTlN87QmniU9Gka11DSA==')

WebUI.click(findTestObject('Object Repository/Page_Membrane/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Membrane/input_Enter your 6-digit code_styles_backgr_22ee6f'), '111111')

WebUI.click(findTestObject('Object Repository/Page_Membrane/button_Next'))

WebUI.closeBrowser()

