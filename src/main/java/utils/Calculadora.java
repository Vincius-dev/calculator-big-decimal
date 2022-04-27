package utils;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora extends CalculadoraForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal toBigDecimal(String valor) {
		try {
			return new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
		} catch (Exception ex) {
			return BigDecimal.ZERO;
		}
		
	}

	@Override
	protected void btnCalcularClick(ActionEvent eV) {
		BigDecimal capital = toBigDecimal(txtCapital.getText());
		BigDecimal taxaJuros = toBigDecimal(txtTaxaJuros.getText());
		BigDecimal periodo = toBigDecimal(txtPeriodo.getText());
		
		BigDecimal montante = taxaJuros.divide(new BigDecimal(100), RoundingMode.HALF_EVEN);
		montante = montante.add(BigDecimal.ONE);
		montante = montante.pow(periodo.intValue());
		montante = montante.multiply(capital);
		montante = montante.setScale(2, RoundingMode.HALF_EVEN);
		
		txtMontante.setText(montante.toPlainString());
	}

	@Override
	protected void btnLimparClick(ActionEvent eV) {
		txtMontante.setText("");
		txtPeriodo.setText("");
		txtTaxaJuros.setText("");
		txtCapital.setText("");
		
	}

	@Override
	protected void btnFecharClick(ActionEvent eV) {
		this.setVisible(false);
		this.dispose();
	}

}
