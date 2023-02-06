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

Mobile.tap(findTestObject('AccessibilityService/Accessibility1'), 0)

Mobile.tap(findTestObject('AccessibilityService/AccessibilityService'), 0)

Mobile.verifyMatch('Accessibility/Accessibility Service', 'Accessibility/Accessibility Service', false)

Mobile.tap(findTestObject('AccessibilityService/BtnConfiguration'), 0)

Mobile.scrollToText('Audio balance', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.swipe(0, 3, 0, 0)

Mobile.scrollToText('Font size', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('AccessibilityService/FontSizeOption'), 0)

Mobile.tap(findTestObject('AccessibilityService/LastLevelFont'), 0)

Mobile.tap(findTestObject('AccessibilityService/SecondLevelFont'), 0)

	for (x=1; x<=4; x++) {
		
		Mobile.pressBack()
		
	}
	
Mobile.delay(3)

Mobile.closeApplication()


