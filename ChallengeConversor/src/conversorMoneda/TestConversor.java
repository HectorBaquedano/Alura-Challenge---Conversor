package conversorMoneda;

import javax.swing.JOptionPane;

import conversorTemperatura.Temperatura;

public class TestConversor {

	public static void main(String[] args) {
		
		double cantidadAConvertir=0;
		//DECLARACION DE NUEVA DIVISA CON SU VALOR DE INICIALIZACION
		Divisa dolar = new Divisa(24.54); 
		
		Divisa euro = new Divisa(26.15);
		
		Divisa libraEsterlina = new Divisa(29.53);
		
		Divisa yen = new Divisa(0.18);
		
		Divisa won = new Divisa(0.019);

		//INICIALIZACIÓN DE LA VARIABLE QUE DEFINE SI EL PROGRAMA CONTINÚA O TERMINA
		int salida = 0;
		//TRY CATCH PARA ATRAPAR LA EXCEPCION NULLPOINTER EXCEPTION AL MOMENTO DE CERRAR EL PROGRAMA SIN EJECUTAR NADA
		try {
		//EN ESTA PARTE SE CREA Y DISEÑA EL MENU CON TODAS SUS OPCIONES Y FUNCIONES
		
		//MIENTRAS EL VALOR DE SALIDA SEA IGUAL A CERO (CERO EQUIVALE A "SI") HAGA...
		while (salida == 0) {
			//ARRAY CON LOS TIPOS DE CONVERSION QUE DISPONE EL PROGRAMA
			String opciones[] = {"Conversion de Moneda","Conversion de Temperatura"};
			//VARIABLE QUE CAPTURA LA SELECCION DEL ARRAY ANTERIOR			
			String op = (String) JOptionPane.showInputDialog(null,"Qué desea convertir?", "Alura Challenge Conversor", JOptionPane.DEFAULT_OPTION, null, opciones, opciones);
			//DEPENDIENDO DE LA SELECCIÓN, HABRÁ UN CASO PARA RESOLVER MEDIANTE UN SWITCH CASE		
			switch (op) {
					
				case "Conversion de Moneda":
					//NUEVO ARRAY QUE ALMACENARÁ LOS TIPOS DE CONVERSIONES DE MONEDA
					String opcionesDivisa[] = {"Lempira a Dolar","Lempira a Euro","Lempira a Libra Esterlina","Lempira a Yen Japones","Lempira a Won Coreano","Dolar a Lempira","Euro a Lempira","Libra Esterlina a Lempira","Yen Japones a Lempira","Won Coreano a Lempira"};
					//NUEVA VARIABLE QUE ALMACENARÁ LA SELECCIÓN
					String op2 = (String) JOptionPane.showInputDialog(null,"Qué desea convertir?", "Alura Challenge Conversor", JOptionPane.DEFAULT_OPTION, null, opcionesDivisa, opcionesDivisa);
					try {
						//VARIABLE QUE ALMACENARÁ EL DATO NUMERICO QUE INGRESARÁ EL USUARIO
						cantidadAConvertir = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a convertir","Conversor de Moneda")); //variable con el valor que deseamos convertir
						if(cantidadAConvertir<0) {
						JOptionPane.showMessageDialog(null, "No se pueden convertir valores negativos", null, JOptionPane.PLAIN_MESSAGE);
						break;
					}
					}catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Solamente numeros son validos", null, JOptionPane.PLAIN_MESSAGE);
						break;				
					}
						switch (op2) {
							
								case "Lempira a Dolar":
									dolar.lempirasADivisa(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Lempiras equivalen a " + String.format("%.2f", dolar.resultado) + " Dolares.", "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
									
								case "Lempira a Euro":
									euro.lempirasADivisa(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Lempiras equivalen a " + String.format("%.2f", euro.resultado) + " Euros.", "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Lempira a Libra Esterlina":	
									libraEsterlina.lempirasADivisa(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Lempiras equivalen a " + String.format("%.2f", libraEsterlina.resultado) + " Libras Esterlinas.", "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Lempira a Yen Japones":	
									yen.lempirasADivisa(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Lempiras equivalen a " + String.format("%.2f", yen.resultado) + " Yenes.", "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Lempira a Won Coreano":	
									won.lempirasADivisa(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Lempiras equivalen a " + String.format("%.2f", won.resultado) + " Wones.", "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Dolar a Lempira":
									dolar.divisaALempira(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Dolares equivalen a " + String.format("%.2f", dolar.resultado) + " Lempiras","Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Euro a Lempira":	
									euro.divisaALempira(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Euros equivalen a " + String.format("%.2f", euro.resultado) + " Lempiras","Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Libra Esterlina a Lempira":	
									libraEsterlina.divisaALempira(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Libras Esterlinas equivalen a " + String.format("%.2f", libraEsterlina.resultado) + " Lempiras","Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Yen Japones a Lempira":	
									yen.divisaALempira(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Yenes equivalen a " + String.format("%.2f", yen.resultado) + " Lempiras","Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
											
								case "Won Coreano a Lempira":	
									won.divisaALempira(cantidadAConvertir);
									JOptionPane.showMessageDialog(null, cantidadAConvertir + " Wones equivalen a " + String.format("%.2f", won.resultado) + " Lempiras","Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
									break;
								 			
								}break;
								
				case "Conversion de Temperatura":
					
					double valorTemperatura = 0;
					Temperatura celsius = new Temperatura();
					Temperatura farenheit = new Temperatura();
					Temperatura kelvin = new Temperatura();
								
					String opcionesTemperatura[] = {"Celsius a Farenheit","Celsius a Kelvin","Farenheit a Celsius","Farenheit a Kelvin","Kelvin a Celsius","Kelvin a Farenheit"};
								
					String op3 = (String) JOptionPane.showInputDialog(null,"Qué desea convertir?", "Alura Challenge Conversor", JOptionPane.DEFAULT_OPTION, null, opcionesTemperatura, opcionesTemperatura);
					
					try {
						valorTemperatura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a convertir","Conversor de Temperatura")); //variable con el valor que deseamos convertir		
					}catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Solamente numeros son validos", null, JOptionPane.PLAIN_MESSAGE);
						break;						
					}			
					switch (op3) {
									
						case "Celsius a Farenheit":
							celsius.celsiusAFarenheit(valorTemperatura);
							JOptionPane.showMessageDialog(null, valorTemperatura + " Grados Centigrados equivalen a " + String.format("%.2f", celsius.resultado) + " Grados Farenheit.", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
							break;
										
						case "Celsius a Kelvin":
							celsius.celsiusAKelvin(valorTemperatura);
							JOptionPane.showMessageDialog(null, valorTemperatura + " Grados Centigrados equivalen a " + String.format("%.2f", celsius.resultado) + " Grados Kelvin.", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
							break;
										
						case "Farenheit a Celsius":
							farenheit.farenheitACelsius(valorTemperatura);
							JOptionPane.showMessageDialog(null, valorTemperatura + " Grados Farenheit equivalen a " + String.format("%.2f", farenheit.resultado) + " Grados Centigrados.", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
							break;
										
						case "Farenheit a Kelvin":
							farenheit.farenheitAKelvin(valorTemperatura);
							JOptionPane.showMessageDialog(null, valorTemperatura + " Grados Farenheit equivalen a " + String.format("%.2f", farenheit.resultado) + " Grados Kelvin.", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
							break;
										
						case "Kelvin a Celsius":
							kelvin.kelvinACelsius(valorTemperatura);
							JOptionPane.showMessageDialog(null, valorTemperatura + " Grados Kelvin equivalen a " + String.format("%.2f", kelvin.resultado) + " Grados Celsius.", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
							break;
									
						case "Kelvin a Farenheit":
							kelvin.kelvinAFarenheit(valorTemperatura);
							JOptionPane.showMessageDialog(null, valorTemperatura + " Grados Kelvin equivalen a " + String.format("%.2f", kelvin.resultado) + " Grados Farenheit.", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
							break;
					}break;
						
				}	
			salida = JOptionPane.showConfirmDialog(null, "Desea Hacer una nueva conversion?");
			}
		}catch (NullPointerException ex) {}
			
		
		JOptionPane.showMessageDialog(null, "Gracias por usar mi programa, ATTE: Hector Baquedano", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
	}

}
