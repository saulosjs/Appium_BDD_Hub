package br.com.rsinet.hub_appium.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_appium.cucumber.Context;
import br.com.rsinet.hub_appium.util.Hora;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
	private Context contexto;

	public Hooks(Context context) {
		contexto = context;
	}

	@After
	public void finalizaSteps(Scenario scenario) throws IOException {
		String screenshotName = scenario.getName().replace(" ", "_");
		File sourcePath = ((TakesScreenshot) contexto.getDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);

		String caminhoDestino = System.getProperty("user.dir") + "/target/cucumber-reports/" + screenshotName
				+ Hora.dataHoraParaArquivo() + ".png";
		try {

			Files.copy(sourcePath, new File(caminhoDestino));

		} catch (IOException e) {
			System.out.println("erro na escreenshot");
		}
		Reporter.addScreenCaptureFromPath(caminhoDestino);
		contexto.getDriverManager().fecharDriver();
	}

}
