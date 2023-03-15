package conversorTemperatura;

public class Temperatura {

	public double cantidadAConvertir;
	public double resultado;
	
		public double celsiusAFarenheit(double cantidad) {
		this.cantidadAConvertir = cantidad;
		this.resultado = (cantidad*9/5)+32;
		return resultado;
		}
		
		public double celsiusAKelvin(double cantidad) {
		this.cantidadAConvertir = cantidad;
		this.resultado = cantidad+273.15;
		return resultado;		
		}

		public double farenheitACelsius(double cantidad) {
		this.cantidadAConvertir = cantidad;
		this.resultado = ((cantidad-32)*5/9);
		return resultado;		
		}
		
		public double farenheitAKelvin(double cantidad) {
		this.cantidadAConvertir = cantidad;
		this.resultado = (cantidad - 32) * 5/9 + 273.15;
		return resultado;	
		}
		
		
		public double kelvinACelsius(double cantidad) {
		this.cantidadAConvertir = cantidad;
		this.resultado = cantidad-273.15;
		return resultado;			
		}
		
		public double kelvinAFarenheit(double cantidad) {
		this.cantidadAConvertir = cantidad;
		this.resultado = (cantidad-273.15) * 9/5 + 32;
		return resultado;			
		}
}
