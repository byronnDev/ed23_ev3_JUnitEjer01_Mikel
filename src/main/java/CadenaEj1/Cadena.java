package CadenaEj1;

import java.util.Iterator;

public class Cadena {
	// Longitid de cadena
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	// Contar vocales minusculas en una cadena
	public int vocales(String cadena) {
		String caracteresMinuscula = "aeiou"; // Vocales
		int cuentaVocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < caracteresMinuscula.length(); j++) {
				if (caracteresMinuscula.charAt(j) == cadena.charAt(i)) {
					cuentaVocales++;
				}
			}
		}
		return cuentaVocales;		
	}
	
	// Invertir cadena
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	
	// Cuenta el número de veces que aparece el carácter en la cadena.
	public int contarLetra(String cadena, char caracter) {
		int cuentaCaracteres = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				cuentaCaracteres++;
			}
		}
		return cuentaCaracteres;
	}
}
