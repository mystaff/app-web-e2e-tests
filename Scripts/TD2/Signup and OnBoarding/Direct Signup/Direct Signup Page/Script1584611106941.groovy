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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat

/*
 * Scenario : Registration Process which also handles Onboarding through https://2.timedoctor.com/#/signup for Negative and Validation Messages
 * 
 */
'Opening the Browser'
WebUI.openBrowser('')

'Maximimize the Window'
WebUI.maximizeWindow()

' Navigate to https://2.timedoctor.com/#/signup'
WebUI.navigateToUrl('https://2a.timedoctor.com/#/signup')

'Click on Signup'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/Register Button'), FailureHandling.STOP_ON_FAILURE)

' Enter Name'
WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Page_Register/InputName'), 'Sandy')

'Generate unique email address'
String emailAddress = ('Sandy+' + getDateTime()) + '@timedoctor.com'

'Wait for email field to be visible, max waiting time 60 seconds'
WebUI.waitForElementVisible(findTestObject('TD2/Registration and Onboarding/Registration/Page_Register/InputEmailAddress'), 
    15)

'Input generated unique email address to email field'
WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Page_Register/InputEmailAddress'), emailAddress)

'Enter the password'
WebUI.setEncryptedText(findTestObject('TD2/Registration and Onboarding/Registration/Page_Register/InputPassword'), 'Px/nOzMEHWxU8lgHigNsmA==')

'Clicking Signup button'
WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Register/ButtonSignup'))

WebUI.delay(10)

'Enter Company Name'
WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/InputName'), 'QA')

'Activate Blur Screenshot'
WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/ToggleBlurScreenshot'))

'Activate Parmeter'
WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/RemoveQueryParmeter'))

'Handle the popup'
WebUI.verifyElementText(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/TextAreyouSure'), 
    'Are you sure?')

WebUI.verifyElementText(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/TextRemovingQueryParameters'), 
    'Removing query parameters will affect past data. This action cannot be undone.')

WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/ButtonContinue'))

WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/RemoveQueryParmeter'))

WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/RemoveQueryParmeter'))

WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/ButtonCancel'))

'Click on Create Button'
WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_Create New Workspace/button_Create'))

WebUI.delay(5)

'Clicking on I will pay full'
WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/button_No I like paying full price'))

'Clicking on Visible Button'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/md-radio-button_Visible - Employees can sta_7ab782'))

'Clicking on Next'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_Next'))

'Activating Screenshot Feature'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/ScreenshotFeature'))

'Activating Task Feature'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/TaskFeature'))

'Activating Payroll Feature'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/Payroll Feature'))

'Entering Phone Number'
not_run: WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/LargeCompanySetUpPhone'), 
    'h')

'Clicking on Next'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/button_Next'))

'Clicking to Lets Track time'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/md-radio-button_Yes - Let employees track t_281fed'))

'Verifying - Set up Your Account Text'
not_run: WebUI.verifyElementText(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/h1_Set up your Account'), 
    'Set up your Account')

not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/button_Next_1'))

'Clicking on 2 Invitee Button'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/2Invites'))

'Clicking on Submit Button'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/button_Submit'))

'Entering email address'
not_run: WebUI.sendKeys(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/Email1'), 
    'payal+invite1@timedoctor.com')

'Entering email address'
not_run: WebUI.sendKeys(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/Email2'), 
    'payal+invite2@timedoctor.com')

'Clicking on 14-days Free Trial Button'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Page_QA - Team Dashboard/button_Invite to 14-day Free Trial'))

'Clicking on User Menu'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonUserMenu'))

'Clicking on Logout'
not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonLogout'))

'Clicking on Close browser'
WebUI.closeBrowser()

'Time Function'

String getDateTime() {
    SimpleDateFormat nowDateTime = new SimpleDateFormat('yyMMddHHmmss')

    Date now = new Date()

    String strDate = nowDateTime.format(now)

    return strDate
}

