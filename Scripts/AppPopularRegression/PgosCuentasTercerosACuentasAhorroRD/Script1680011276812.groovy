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

Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.BurgerMenu'), 0)

Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView -SubMenuPagos'), 0)

Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView - Cuentas de terceros'), 0)



if (Mobile.waitForElementPresent(findTestObject('Object Repository/PgosCuentasTercerosACuentasAhorroRD/PopUpTuRequerimientoCtaTerceros'), 30, FailureHandling.CONTINUE_ON_FAILURE)) {
	
	print("Posible....Tu requerimiento")
	KeywordUtil.markFailed("Pago a terceros Option is failing")
	Mobile.tap(findTestObject('Object Repository/PgosCuentasTercerosACuentasAhorroRD/android.widget.Button - CONTINUARPopUp'), 0, )
	CustomKeywords.'AppPersonalBacktoDash.BacktoDash'()
	
} else {
	
Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.DesdeCuenta'), 20)
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.DesdeCuenta'), 0)
Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView - Nomina  account1'), 20)
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView - Nomina  786433300'), 0)
Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView - CuentadeTercero'), 3)
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView - CuentadeTercero'), 0)
Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView account2'), 3)
Mobile.scrollToText('SR JEAN C DURAN MOYA / 798404174', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView -  account 2'), 0)
Mobile.sendKeys(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.EditText - MontoaPagar'), '10')
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.Button - btnContinuarPago'), 0)
Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.Button - btnContinuarConfirmacion'), 0)
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.Button - btnContinuarConfirmacion'), 0)
Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.EditText - DigitaToken'), 0)
Mobile.sendKeys(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.EditText - DigitaToken'), 'tokenconf')
Mobile.tap(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.Button - btnContinuarToken'), 0)

pagoSuccess = Mobile.waitForElementPresent(findTestObject('PgosCuentasTercerosACuentasAhorroRD/android.widget.TextView - Tu pago ha sido realizado'), 
    45)

if (pagoSuccess == true) {
	
	print("Pago realizado satisfactoriamente")
	
} else {
	
	print("El pago no pudo ser realizado")
	Mobile.closeApplication()
}
	}


