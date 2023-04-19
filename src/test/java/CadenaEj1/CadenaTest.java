package CadenaEj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	@Test
	public void testLongitud() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.longitud("cinco");
		assertEquals("Fail in Longitud", expected, actual);
	}
	
	@Test
	public void testVocales() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.vocales("Hola");
		assertEquals("Fail in Vocales", expected, actual);
	}

	@Test
	public void testInvertir() {
		Cadena target = new Cadena();
		String expected = "lekiM";
		String actual = target.invertir("Mikel");
		assertEquals("Fail in Invertir", expected, actual);
	}
	
	@Test
	public void testContarLetra() {
		Cadena target = new Cadena();
		int expected = 1;
		int actual = target.contarLetra("Holaaa", 'l');
		assertEquals("Fail en ContarLetra", expected, actual);
	}
	
	// FAILS
	@Test
	public void testLongitudFail() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.longitud("cincoooo");
		assertEquals("Fail in Longitud", expected, actual);
	}
	
	@Test
	public void testVocalesFail() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.vocales("Holaaaa");
		assertEquals("Fail in Vocales", expected, actual);
	}

	@Test
	public void testInvertirFail() {
		Cadena target = new Cadena();
		String expected = "lekiM";
		String actual = target.invertir("Hola");
		assertEquals("Fail in Invertir", expected, actual);
	}
	
	@Test
	public void testContarLetraFail() {
		Cadena target = new Cadena();
		int expected = 1;
		int actual = target.contarLetra("Hoaaa", 'l');
		assertEquals("Fail en ContarLetra", expected, actual);
	}
}
