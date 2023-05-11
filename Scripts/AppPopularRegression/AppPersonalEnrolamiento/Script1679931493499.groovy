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

Mobile.startApplication('C:\\Users\\Dell\\Desktop\\APK\\SSC_BPDContainer-armeabi-v7a-QA.apk', true)

Mobile.tap(findTestObject('AppPersonalEnrolamiento/android.widget.TextView - Acceso Clientes'), 0)

popupAcceso = Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.Button - ContinuarPopup'), 
    20)


if (popupAcceso == true) {
	
	print('Error al intentar enrrolar el usuario, posible tu requerimiento....')
	Mobile.closeApplication()
	
} else {

Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.EditText - Usuario'), 120)

Mobile.sendKeys(findTestObject('AppPersonalEnrolamiento/android.widget.EditText - Usuario'), user)

Mobile.sendKeys(findTestObject('AppPersonalEnrolamiento/android.widget.EditText - Contrasea'), pass)

Mobile.tap(findTestObject('AppPersonalEnrolamiento/android.widget.Button - Acceder'), 0)

LoginPopUp = Mobile.waitForElementPresent(findTestObject('Object Repository/AppPersonalEnrolamiento/LoginPopUpTuRequerimiento'), 60)

if (LoginPopUp == true) {
	print('Error al intentar enrrolar el usuario, posible tu requerimiento....')
	Mobile.closeApplication()
} else {

txtToken = Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.EditText - Digita el cdigo'), 30)

if (txtToken == true) {

Mobile.sendKeys(findTestObject('AppPersonalEnrolamiento/android.widget.EditText - Digita el cdigo'), '321321')

Mobile.tap(findTestObject('AppPersonalEnrolamiento/android.widget.Button - Continuar'), 0)

} else {

Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.PinConf1'), 120)

CustomKeywords.'AppPersonalPinConfiguration.PinConfiguration'()

Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.Button - Cancelar'), 120)

Mobile.tap(findTestObject('AppPersonalEnrolamiento/android.widget.Button - Cancelar'), 0)

Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.TextView - Lo har luego'), 120)

Mobile.tap(findTestObject('AppPersonalEnrolamiento/android.widget.TextView - Lo har luego'), 0)

Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.PinLogin'), 120)

CustomKeywords.'AppPersonalPinLogin.PinLogin'()

btnSalir = Mobile.waitForElementPresent(findTestObject('AppPersonalEnrolamiento/android.widget.Salir'), 120)

print(btnSalir)

if (btnSalir == true) {
    print('Enrolamiento exitoso')
} else {
    print('Enrolamiento no satisfactorio')
	}

		}
			}
				}
