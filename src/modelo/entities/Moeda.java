package modelo.entities;

import javax.swing.JOptionPane;

public class Moeda {
	private static final Double realDolar = 0.19;
	private static final Double realEuro = 0.18;
	private static final Double realLibra = 0.16;
	private static final Double realPesoArgentino = 38.22;
	private static final Double realPesoChileno = 156.7;

	private static final Double dolarReal = 5.14;
	private static final Double euroReal = 5.51;
	private static final Double libraReal = 6.21;
	private static final Double pesoArgentinoReal = 0.03;
	private static final Double pesoChineloReal = 0.03;

	public static void convert(Object typeConvert, Double valor) {

		double resultConvertion = 0.0;
		if (valor.equals(null)) {
			throw new NullPointerException("Value is null!");
		}
		if (valor.equals(0.0)) {
			throw new NullPointerException("Value is 0.0!");
		}
		switch (typeConvert.toString()) {
		case "De Reais a Dólares":
			resultConvertion = valor * realDolar;
			break;
		case "De Reais a Euros":
			resultConvertion = valor * realEuro;
			break;
		case "De Reais a Libras":
			resultConvertion = valor * realLibra;
			break;
		case "De Reais a Peso Argentinos":
			resultConvertion = valor * realPesoArgentino;
			break;
		case "De Reais a Peso Chilenos":
			resultConvertion = valor * realPesoChileno;
			break;
		case "De Dólares a Reais":
			resultConvertion = valor * dolarReal;
			break;
		case "De Euros a Reais":
			resultConvertion = valor * euroReal;
			break;
		case "De Libras a Reais":
			resultConvertion = valor * libraReal;
			break;
		case "De Peso argentino a  Reais":
			resultConvertion = valor * pesoArgentinoReal;
			break;
		case "De Peso Chileno a Reais":
			resultConvertion = valor * pesoChineloReal;
			break;
		default:
			break;
		}
		JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", resultConvertion));
	}
}
