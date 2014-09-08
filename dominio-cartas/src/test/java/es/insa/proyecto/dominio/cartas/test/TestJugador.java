package es.insa.proyecto.dominio.cartas.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import es.insa.proyecto.dominio.cartas.Jugador;

public class TestJugador {
	private String nombre;
	
	@Test
	public void testCrearJugador() {
		// 1� test
		Jugador jugador = new Jugador("Jugador1");
		// 3� aserci�n
		Assert.assertNotNull("El nombre no puede estar vacio", jugador.getNombre());
		Assert.assertEquals("Ej jugador debe tener una mano vac�a", 0, jugador.getMano().length);

	}

	@Test
	public void testA�adirCarta() {
		// 1� preparaci�n
		Object carta = new Object();
		Jugador jugador = new Jugador("Jugador1");
		// 2� ejecuci�n
		jugador.a�adirCarta(carta);
		// 3� aserci�n
		Assert.assertNotEquals("Ej jugador debe tener una mano", 0, jugador.getMano().length);
	}

	@Test
	public void testQuitarCarta() {
		// 1� preparaci�n
		Object carta = new Object();
		Jugador jugador = new Jugador("Jugador1");
		jugador.a�adirCarta(carta);
		// 2� ejecuci�n
		jugador.quitarCarta(carta);
		// 3� aserci�n
		Assert.assertEquals("Ej jugador debe tener una mano vac�a", 0, jugador.getMano().length);
	}

	@Test
	public void testConsultarMano() {
		// 1� preparaci�n
		Object carta1 = new Object();
		Object carta2 = new Object();
		Object carta3 = new Object();
		Object carta4 = new Object();
		Jugador jugador = new Jugador("Jugador1");
		jugador.a�adirCarta(carta1);
		jugador.a�adirCarta(carta2);
		jugador.a�adirCarta(carta3);
		jugador.a�adirCarta(carta4);
		// 2� ejecuci�n
		jugador.getMano();
		// 3� aserci�n
		Assert.assertEquals("Ej jugador debe tener una mano con 4 cartas", 4, jugador.getMano().length);
	}

	

}
