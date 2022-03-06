import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.github.javafaker.Faker
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.pt.E
import cucumber.api.java.pt.Entao
import cucumber.api.java.pt.Quando
import internal.GlobalVariable

public class MyAccount {

	@E("preencho os dados de cadastro com (.*)")
	def preenchoDadosCadastro(String email ) {
//		Faker faker = new Faker()
//		String email = faker.internet.emailAddress()
		WebUI.setText(findTestObject('Page_My Account/input__email'), email)
		WebUI.setEncryptedText(findTestObject('Page_My Account/input__password'), 'DgGkW+/tc8/uNX094byR6g==')
	}
	
	@Quando("clico no botão register")
	def clicoBotaoRegister( ) {
		WebUI.click(findTestObject('Page_My Account/input_botao_register'))
	}
	
	@Entao("visualizo a tela my account logado")
	def visualizoTelaMyAccountLogado( ) {
		WebUI.verifyElementPresent(findTestObject('Page_My Account/div_myaccount_logado'), 0)
		WebUI.closeBrowser()
	}
}
