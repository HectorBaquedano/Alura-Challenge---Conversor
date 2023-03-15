package conversorMoneda;

public class Divisa {
	
	public double resultado;
	public double valorDivisa;
	
	public Divisa(double valorDivisa) {
		this.valorDivisa = valorDivisa;
	}
	
	public double lempirasADivisa(double cantidad) {
		
		this.resultado = cantidad/this.valorDivisa;
		return resultado;
	}
	
	public double divisaALempira(double cantidad) {
		
		this.resultado = this.valorDivisa*cantidad;
		return resultado;
	}
	
}
