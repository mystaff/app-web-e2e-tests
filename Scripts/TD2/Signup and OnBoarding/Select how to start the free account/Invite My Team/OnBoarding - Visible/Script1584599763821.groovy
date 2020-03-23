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

not_run: if (WebUI.verifyElementPresent(findTestObject('TD2/Registration and Onboarding/Page_Registration/WebsiteVersion'), 
    10, FailureHandling.OPTIONAL)) {
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/SwitchVersion'))
}

if (WebUI.verifyElementPresent(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonYes'), 10, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonYes'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonYes2'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonYes3'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/InvitemyTeam'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonContinue'))

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputName'), 'Payal')

    WebDriver driver = DriverFactory.getWebDriver()

    'Generate unique email address'
    String emailAddress = ('payal+' + getDateTime()) + '@timedoctor.com'

    'Wait for email field to be visible, max waiting time 60 seconds'
    WebUI.waitForElementVisible(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), 10)

    'Input generated unique email address to email field'
    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), emailAddress)

    WebUI.setEncryptedText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputPassword'), 'Px/nOzMEHWxU8lgHigNsmA==')

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonTestItOut'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_No I like paying'))

    not_run: if (WebUI.verifyElementPresent(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Company Name'), 
        10, FailureHandling.OPTIONAL)) {
        WebUI.sendKeys(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Company Name'), 'QA Team')

        WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Just Me'))

        WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next - Company Name'))

        WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next - Industry'))
    }
    
    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/span_Next'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Next - Set up your Account'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/I dont have team'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/Submit - Invite'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonUserMenu'))

    not_run: WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Onboarding/ButtonLogout'))
} else {
    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/RadioAccountOption'))

    WebUI.click(findTestObject('TD2/Registration and Onboarding/Page_Registration/ButtonContinue'))

    WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputName'), 'sandy')

    not_run: WebUI.setText(findTestObject('TD2/Registration and Onboarding/Page_Registration/InputCompanyEmail'), 'sandy+aw3@staff.com')

    WebDriver driver = DriverFactory.getWebDriver()

    'Generate unique email address'
    String emailAddress = ('sandy+' + getDateTime()) + '@staff.com'

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
}

WebUI.closeBrowser()

String getDateTime() {
    SimpleDateFormat nowDateTime = new SimpleDateFormat('yyMMddHHmmss')

    Date now = new Date()

    String strDate = nowDateTime.format(now)

    return strDate
}

