package br.com.rsinet.hub_appium.stepDefinition;

import br.com.rsinet.hub_appium.cucumber.Context;
import cucumber.api.java.After;

public class Hooks {
	private Context contexto;

	public Hooks(Context context) {
		contexto = context;
	}

	@After
	public void finalizaSteps() {
		contexto.getDriverManager().fecharDriver();
	}

}
