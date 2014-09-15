package es.insa.proyecto.dominio.cartas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Esta clase contiene los m�todos que interact�an con el Jugador. Las
 * operaciones que se pueden realizar son las siguientes:
 * 
 * @author Cristina y Javier
 * 
 */
public class Jugador {

	// nombre del jugador a tratar
	private String nombre;
	// cartas que tiene el jugador
	private List<Carta> manoJugador;
	// Booleano para devolver un error en la operaci�n
	private boolean errorMano = false;

	public Jugador() {
	}

	// Constructor para crear un jugador e inicializar la mano del jugador
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.manoJugador = new ArrayList<Carta>();
	}

	/**
	 * M�todo para a�adir una Carta a la mano del jugador controlando que
	 * no exista y no se tenga ya 4 cartas, en ambos casos devolver� erroMano a true.
	 * 
	 * @param cartaAA�adir
	 *            --> la carta que se pretende a�adir
	 * @return 
	 */
	public boolean a�adirCarta(Carta cartaAA�adir) {
		if (this.manoJugador.size() < 4) {
			this.manoJugador.add(cartaAA�adir);
		}else {
			errorMano = true;
		}
		return errorMano;
	}

	/**
	 * M�todo para quitar una Carta de la mano del jugador controlando que
	 * ya exista, devolver� erroMano a true si no existe.
	 * 
	 * @param cartaAQuitar
	 *            --> la carta que se pretende quitar
	 * @return 
	 */
	public boolean quitarCarta(Carta cartaAQuitar) {
		if (this.manoJugador.contains(cartaAQuitar)) {
			this.manoJugador.remove(cartaAQuitar);
		}else {
			errorMano = true;
		}
		return errorMano;
	}

	/**
	 * La mano del jugador la guardamos como un Set pero la devolvemos como un
	 * Array de Cartas
	 * 
	 * @return devuelve un Array de Carta
	 */
	public Carta[] getMano() {
		return this.manoJugador.toArray(new Carta[0]);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param manoJugador the manoJugador to set
	 */
	public void setManoJugador(List<Carta> manoJugador) {
		this.manoJugador = manoJugador;
	}

	/**
	 * Ordenamos la mano del jugador.
	 */
	public void ordenarMano() {
		Collections.sort(this.manoJugador);
	}
}
