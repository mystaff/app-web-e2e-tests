import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/*
 * This scripts are to enter valid credentials on TD2
 */


'Entering email address'
WebUI.setText(findTestObject('null'), GlobalVariable.Username)

'Entering password'
WebUI.setEncryptedText(findTestObject('null'), 'kbs23wq117C4z+7JL/PnBA==')

'Clicking on Login Button'
WebUI.click(findTestObject('null'))

'Delay for loading the next page'
WebUI.delay(10)

'Capturing Screenshot'
WebUI.takeScreenshot('/Users/payalchoksey/Katalon Studio/TD2 Screenshot/DashboardScreen')
