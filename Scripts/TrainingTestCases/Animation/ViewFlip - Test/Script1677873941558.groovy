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

Mobile.tap(findTestObject('Events/AnimationOption'), 0)

Mobile.tap(findTestObject('ViewFlip/ViewFlipOption'), 0)

Mobile.verifyElementText(findTestObject('ViewFlip/AnimationViewFlipTitle'), 'Animation/View Flip')

Mobile.verifyElementExist(findTestObject('ViewFlip/OneNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/TwoNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/ThreeNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/FourNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/FiveNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/SixNum'), 0)

Mobile.tap(findTestObject('ViewFlip/btnFLIP'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('ViewFlip/UnNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/DeuxNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/TroisNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/QuatreNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/LeFiveNum'), 0)

Mobile.verifyElementExist(findTestObject('ViewFlip/SixNum (1)'), 0)

Mobile.closeApplication()

