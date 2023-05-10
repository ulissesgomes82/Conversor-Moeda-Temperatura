package modelo.entities;

import javax.swing.JOptionPane;

public class Menu {

	public static void menu() {
		Object[] menu = { "Conversor de Moeda", "Conversor de Temperatura" };
		Object[] tipoMoedas = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
				"De Reais a Peso Argentinos", "De Reais a Peso Chilenos", "De Dólares a Reais", "De Euros a Reais",
				"De Libras a Reais", "De Peso argentino a  Reais", "De Peso Chileno a Reais" };

		Object[] tipoTemperatura = { "Celcius para Farenheint", "Celcius para Kelvin", "Farenheint para Celcius",
				"Farenheint para Kelvin", "Kelvin para Celcius", "Kelvin para Farenheint" };

		Object opcaoMenu = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1, null, menu, "");
		Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor:", "Input", 3));
		try {
			if (opcaoMenu.equals(menu[0])) {
				Object typeConvert = JOptionPane.showInputDialog(null,
						"Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", -1, null, tipoMoedas,
						"");
				Moeda.convert(typeConvert, valor);
			} else if (opcaoMenu.equals(menu[1])) {
				Object typeTemperatura = JOptionPane.showInputDialog(null,
						"Escolha a temperatura a qual voçê deseja converter", "Temperatura", -1, null, tipoTemperatura,
						"");
				Temperatura.convertTemperatura(typeTemperatura, valor);
			}

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão", "Conversão",
					JOptionPane.YES_NO_OPTION);
			if (resposta == JOptionPane.YES_OPTION) {
				menu();
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
