package model;

import java.text.DecimalFormat;

public class ImcBeam {

	private float peso;
	private float altura;

	public ImcBeam() {

	}

	public ImcBeam(String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}

	
	@Override
	public String toString() {
		return "Resultado Imc = "+ getResult();
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+") == false ? 0f : Float.parseFloat(peso));
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+") == false ? 0f:Float.parseFloat(altura));
	}

	public String getResult() {
		Float imc = peso / (altura * altura);
		StringBuilder result = new StringBuilder(new DecimalFormat("#.#").format(imc));
		if(imc.isNaN())
			return "\nOps, Algo está Errado. Digite corretamente";
		
		if(imc <18.5) {
			result.append("\nSituação: Abaixo do Peso");
		}else if(imc >=18.5 && imc <=24.9) {
			result.append("\nSituação: Peso Normal");
		}if(imc >=25.0 && imc <=29.9) {
			result.append("\nSituação: Sobre-Peso");
		}else if(imc >=30.0 && imc <=34.9) {
			result.append("\nSituação: Obesidade Grau(I)");
		}if(imc >= 35.0 && imc <=39.9) {
			result.append("\nSituação: Obesidade Severa Grau(II)");
		}else if(imc >=40.0) {
			result.append("\nSituação: Obesidade Mórbida Grau(III)");
		}
		
		return result.toString();
	}

}
