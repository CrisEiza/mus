package es.insa.proyecto.dominio.cartas;

import java.util.HashSet;
import java.util.Set;

/**
 * Esta clase contiene los m�todos que interact�an con el Jugador. Las
 * operaciones que se pueden realizar son las siguientes:
 * 
 * - A�adir Carta a la mano del jugador. - Quitar una Carta de la mano del
 * jugador. - Consultar la mano del jugador.
 * 
 * @author Cristina y Javier
 * 
 */
public class Jugador {

	private String nombre;
	private Set<Carta> manoJugador;

	public Jugador() {
	}

	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.manoJugador = new HashSet<Carta>();
	}

	/**
	 * M�todo para a�adir una Carta a la mano del jugador.
	 * 
	 * @param cartaAA�adir
	 *            --> la carta que se pretende a�adir
	 */
	public void a�adirCarta(Carta cartaAA�adir) {
		this.manoJugador.add(cartaAA�adir);
	}

	/**
	 * M�todo para quitar una Carta de la mano del jugador.
	 * 
	 * @param cartaAQuitar
	 *            --> la carta que se pretende quitar
	 */
	public void quitarCarta(Carta cartaAQuitar) {
		this.manoJugador.remove(cartaAQuitar);
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

}
