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
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('www.timedoctor.com')

not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/Register Button'))

/*
 * Scenario : Handling Question with No - > No -> Try It Fee
 */
'Switching from TDC to TD2'
not_run: if (WebUI.verifyElementPresent(findTestObject('TD2/Registration and Onboarding/Page_Registration/WebsiteVersion'), 
    10, FailureHandling.OPTIONAL)) {
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/SwitchVersion'))
}

' Handing the questions with Yes Yes Yes options'
if (WebUI.verifyElementPresent(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonYes'), 10, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonNo'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonNo1'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonTryItFree'))

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/button_Get Free Account Try It Out'))

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Oops Name field should not be blank'), 
        'Oops! Name field should not be blank.')

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_My name_name'), 
        ' ')

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Oops Name field should not be blank'), 
        'Oops! Name field should not be blank.')

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_My name_name'), 
        'payal')

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Company email_email'), 
        'payal')

    WebUI.setEncryptedText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Password_password'), 
        '6AwaL659tt4=')

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Please enter a valid email address'), 
        'Please enter a valid email address!')

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Enter a password of at least 6 characte_6901e9'))

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Company email_email'), 
        'payal+test')

    WebUI.setEncryptedText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Password_password'), 
        'J7R4ejOak4Y=')

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Please enter a valid email address'), 
        'Please enter a valid email address!')

    WebUI.verifyElementText(findTestObject('TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Enter a password of at least 6 characte_6901e9'), 
        'Enter a password of at least 6 characters. It may include numbers, letters or special characters such as $ or !. Spaces are not allowed.')

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/button_Test It Out'))

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Please enter a valid email address'), 
        'Please enter a valid email address!')

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Company email_email'), 
        'payal+test@')

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/button_Test It Out'))

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_Please enter a valid email address'), 
        'Please enter a valid email address!')

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Company email_email'), 
        'payal+test@timedoctor.com')

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/button_Test It Out'))

    WebUI.setEncryptedText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Password_password'), 
        'kbs23wq117C4z+7JL/PnBA==')

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/button_Test It Out'))

    WebUI.verifyElementText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/div_It looks like this account already exis_db7182'), 
        'It looks like this account already exists in our system. Would you like to Sign In instead?')

    WebUI.setText(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/input_Company email_email'), 
        'payal+test2@timedoctor.com')

    WebUI.click(findTestObject('Object Repository/TD2/Registration and Onboarding/Negative Testing/Page_Smart Employee Time Tracking Software _adb7b6/button_Test It Out'))

    WebDriver driver = DriverFactory.getWebDriver()

    'Generate unique email address'
    String emailAddress = ('payal+' + getDateTime()) + '@timedoctor.com'

    'Wait for email field to be visible, max waiting time 60 seconds'
    WebUI.waitForElementVisible(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), 10)

    'Input generated unique email address to email field'
    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), emailAddress)

    'Entering Password'
    WebUI.setEncryptedText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputPassword'), 'Px/nOzMEHWxU8lgHigNsmA==')

    'Click on ButtonTestItOut'
    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonTestItOut'))

    WebUI.delay(5)

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/ButtonGet 100 account credit'))

    not_run: WebUI.verifyElementText(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/TextPlease enter your card details'), 
        'Please enter your card details.')

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/input_Name on Card_name'), 
        'Payal Choksey')

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/input_Card Number_number'), 
        '4242 4242 2424 4242 424')

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/input_Expiration_expiry'), 
        '04/2022')

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/input_CVC_cvc'), 
        '123')

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/ButtonGet 100 account credit'))

    WebUI.delay(5)

    not_run: WebUI.verifyElementText(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/TextSome error occurred Please check your c_f15526'), 
        'Please enter a valid card number')

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Registration/Registration - Negative/Page_12 - Team Dashboard/ButtonNo I like paying full price'))

    'Click on No I like to Pay'
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_No I like paying'))

    'Entering Company Name'
    not_run: if (WebUI.verifyElementPresent(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Company Name'), 
        10, FailureHandling.OPTIONAL)) {
        not_run: WebUI.sendKeys(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Company Name'), 'QA Team')

        'Clicking on Just Me'
        not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Just Me'))

        'Clicking on Next Button'
        not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next - Company Name'))

        'Click on Industry'
        not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next - Industry'))
    }
    
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next2'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next2'))

    'Clicking on Next Button'
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_Next'))

    'Clicking to Set up your Account '
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next - Set up your Account'))

    'Selecting that you dont have team'
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/I dont have team'))

    'Clicking on Invite Button'
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Submit - Invite'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonSkip'))

    not_run: WebUI.selectOptionByValue(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/DropdownInvite'), 
        '0', true)

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_Submit'))

    'Click on User Menu Button'
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonUserMenu'))

    'Clicking on Logout Button'
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonLogout'))
}

/*
 * 10th Feb : Commenting the below code as we don't require at the moment
 */
/*
 * 
 * else {
    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/RadioAccountOption'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonContinue'))

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputName'), 'payal')

    not_run: WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), 'sandy+aw3@staff.com')

    WebDriver driver = DriverFactory.getWebDriver()

    'Generate unique email address'
    String emailAddress = ('payal+' + getDateTime()) + '@timedoctor.com'

    'Wait for email field to be visible, max waiting time 60 seconds'
    WebUI.waitForElementVisible(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), 20)

    'Input generated unique email address to email field'
    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), emailAddress)

    WebUI.setEncryptedText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputPassword'), 'Px/nOzMEHWxU8lgHigNsmA==')

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonTestItOut'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_No I like paying'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next2'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/RadioButtonVisible'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next2'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_Next'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonSkip'))

    WebUI.selectOptionByValue(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/DropdownInvite'), '0', true)

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_Submit'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonUserMenu'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonLogout'))

    not_run: WebUI.closeBrowser()
}*/
'Close the Browser'
WebUI.closeBrowser()

'Date and Time Function '

String getDateTime() {
    SimpleDateFormat nowDateTime = new SimpleDateFormat('yyMMddHHmmss')

    Date now = new Date()

    String strDate = nowDateTime.format(now)

    return strDate
}

