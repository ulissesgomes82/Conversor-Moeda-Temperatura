package modelo.entities;

import javax.swing.JOptionPane;

public class Temperatura {
	public static void convertTemperatura(Object tipoConversao, Double valorTemperatura) {

		double result = 0;
		switch (tipoConversao.toString()) {
		case "Celcius para Farenheint":
			result = valorTemperatura * 1.8 + 32;
			break;
		case "Celcius para Kelvin":
			result = valorTemperatura + 273.15;
			break;
		case "Farenheint para Celcius":
			result = (valorTemperatura - 32) / 1.8;
			break;
		case "Farenheint para Kelvin":
			result = (valorTemperatura - 32) * 1.8 + 273.0;
			break;
		case "Kelvin para Celcius":
			result = valorTemperatura - 273;
			break;
		case "Kelvin para Farenheint":
			result = (valorTemperatura - 273) * 1.8 + 32;
			break;
		default:
			break;
		}
		JOptionPane.showMessageDialog(null, "O valor conversão de " + tipoConversao + " é: " + result);
	}
}
