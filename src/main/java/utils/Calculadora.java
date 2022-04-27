package utils;

import java.awt.event.ActionEvent;

public class Calculadora extends CalculadoraForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void btnCalcularClick(ActionEvent eV) {
		// TODO Auto-generated method stub
		
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
