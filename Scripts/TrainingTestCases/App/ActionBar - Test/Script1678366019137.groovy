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

Mobile.startApplication('/Users/gabrielcrooke/Desktop/APK/APIDemos.apk', true)

Mobile.tap(findTestObject('ActionBar/AppOptionMaster'), 0)

Mobile.tap(findTestObject('ActionBar/ActionBarOption'), 0)

Mobile.verifyElementExist(findTestObject('ActionBar/ActionBarMechanics'), 0)

Mobile.verifyElementExist(findTestObject('ActionBar/ActionBarTabs'), 0)

Mobile.verifyElementExist(findTestObject('ActionBar/ActionBarUsage'), 0)

Mobile.verifyElementExist(findTestObject('ActionBar/ActionProvider'), 0)

Mobile.verifyElementExist(findTestObject('ActionBar/DisplayOptions'), 0)

Mobile.tap(findTestObject('ActionBar/ActionBarMechanics'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('ActionBar/ActionBarTabs'), 0)

for (x = 1; x <= 2; x++) {
    Mobile.tap(findTestObject('ActionBar/TOGGLETABMODEBTN'), 0)
}

Mobile.verifyElementText(findTestObject('ActionBar/ActionBarTapTitle'), 'App/Action Bar/Action Bar Tabs')

Mobile.pressBack()

Mobile.tap(findTestObject('ActionBar/ActionBarUsageOption'), 0)

Mobile.tap(findTestObject('ActionBar/FindUp'), 0)

Mobile.sendKeys(findTestObject('ActionBar/SearchBox'), 'Juanito Gomez')

for (x = 1; x <= 2; x++) {
    Mobile.tap(findTestObject('ActionBar/xBtn'), 0)
}

Mobile.pressBack()

Mobile.tap(findTestObject('ActionBar/ActionProviderOption'), 0)

Mobile.tap(findTestObject('ActionBar/SettingsActionProvider'), 0)

Mobile.tap(findTestObject('ActionBar/settingsBtn'), 0)

Mobile.verifyElementText(findTestObject('ActionBar/NetworkInternetSettings'), 'Network & internet')

Mobile.verifyElementText(findTestObject('ActionBar/BatterySettings'), 'Battery')

Mobile.scrollToText('System', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('ActionBar/SystemSettings'), 'System')

for (x = 1; x <= 3; x++) {
	Mobile.pressBack()
}

Mobile.closeApplication()


