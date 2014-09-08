package es.insa.proyecto.dominio.cartas.test;

import org.junit.Assert;
import org.junit.Test;

import es.insa.proyecto.dominio.cartas.Carta;
import es.insa.proyecto.dominio.cartas.Jugador;
import es.insa.proyecto.dominio.cartas.Palo;

public class TestJugador {
	
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
		Carta carta = new Carta();
		Jugador jugador = new Jugador("Jugador1");
		// 2� ejecuci�n
		jugador.a�adirCarta(carta);
		// 3� aserci�n
		Assert.assertNotEquals("Ej jugador debe tener una mano", 0, jugador.getMano().length);
	}

	@Test
	public void testQuitarCarta() {
		// 1� preparaci�n
		Carta carta = new Carta();
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
		Jugador jugador = new Jugador("Jugador1");
		jugador.a�adirCarta(new Carta(Palo.BASTOS, 10, 10));
		jugador.a�adirCarta(new Carta(Palo.BASTOS, 11, 10));
		jugador.a�adirCarta(new Carta(Palo.BASTOS, 12, 10));
		jugador.a�adirCarta(new Carta(Palo.BASTOS, 7, 7));
		// 2� ejecuci�n
		Carta[] mano = jugador.getMano();
		// 3� aserci�n
		Assert.assertEquals("Ej jugador debe tener una mano con 4 cartas", 4, mano.length);
	}

	

}
