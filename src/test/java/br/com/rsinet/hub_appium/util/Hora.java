package br.com.rsinet.hub_appium.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Hora {
	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
	}
}
