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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.tap(findTestObject('PagoTCpropia/android.widget.ImageView-BurgerMenu'), 0)

Mobile.waitForElementPresent(findTestObject('PagoTCpropia/android.widget.TextView - bmPAGOS'), 20)

Mobile.tap(findTestObject('PagoTCpropia/android.widget.TextView - bmPAGOS'), 0)

Mobile.waitForElementPresent(findTestObject('PagoTCpropia/android.widget.ImageView-TarjetaCredito'), 20)

Mobile.tap(findTestObject('PagoTCpropia/android.widget.ImageView-TarjetaCredito'), 0)

Mobile.waitForElementPresent(findTestObject('PagoTCpropia/android.widget.RelativeLayout-DesdeCuenta'), 20)

Mobile.tap(findTestObject('PagoTCpropia/android.widget.RelativeLayout-DesdeCuenta'), 0)

Mobile.waitForElementPresent(findTestObject('PagoTCpropia/android.widget.TextView - Personal  794912725'), 20)

Mobile.tap(findTestObject('PagoTCpropia/android.widget.TextView - Personal  794912725'), 0)

Mobile.waitForElementPresent(findTestObject('PagoTCpropia/android.widget.ImageView-TarjetaCredito'), 20)

Mobile.tap(findTestObject('PagoTCpropia/android.widget.ImageView-TarjetaCredito'), 0)

if (Mobile.waitForElementPresent(findTestObject('PagoTCpropia/android.widget.TextView - TuReqTarjetaCred'), 20)) {
    print('Error tu requerimiento al cargar las TC')

    Mobile.tap(findTestObject('PagoTCpropia/android.widget.Button - btnContinuarTuReq1'), 0)

    KeywordUtil.markFailed('Error tu requerimiento al cargar las TC')
}

