package modelo.entities;

import javax.swing.JOptionPane;

public class Temperatura {
	public static void convertTemperatura(Object tipoConversao, Double valor) {

		double result = 0;
		if (valor.equals(null)) {
			throw new NullPointerException("Value is null!");
		}
		if (valor.equals(0.0)) {
			throw new NullPointerException("Value is 0.0!");
		}
		
		switch (tipoConversao.toString()) {
		case "Celcius para Farenheint":
			result = valor * 1.8 + 32;
			break;
		case "Celcius para Kelvin":
			result = valor + 273.15;
			break;
		case "Farenheint para Celcius":
			result = (valor - 32) / 1.8;
			break;
		case "Farenheint para Kelvin":
			result = (valor - 32) * 1.8 + 273.0;
			break;
		case "Kelvin para Celcius":
			result = valor - 273;
			break;
		case "Kelvin para Farenheint":
			result = (valor - 273) * 1.8 + 32;
			break;
		default:
			break;
		}
		JOptionPane.showMessageDialog(null, "O valor conversão de " + tipoConversao + " é: " + result);
	}
}
