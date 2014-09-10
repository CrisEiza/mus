package es.insa.proyecto.dominio.cartas;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Mazo de cartas de mus de la baraja espa�ola
 * 
 * @author insa05
 * 
 */
public class Mazo {

	private int id;
	private String nombre;
	private List<Carta> listaDeCartasDelMazo;
	

	/**
	 * Constructor vac�o de la clase Mazo
	 */
	public Mazo() {
       listaDeCartasDelMazo = new LinkedList<Carta>();
	}

	/**
	 * Constructor con par�metros
	 * @param nombre
	 */
	public Mazo(String nombre) {
		this();		
		this.nombre = nombre;
	}

	/**
	 * Cambiamos el orden de la lista de cartas del mazo
	 */
	public void barajar() {

		Collections.shuffle(listaDeCartasDelMazo);
	}

	/**
	 * Devuelve la carta de arriba del mazo
	 * 
	 * @return la carta que hemos sacado del mazo
	 * 
	 */
	public Carta sacarCarta() {

		// 1� queremos devolver la primera carta de la lista
		// y quitarla de la lista
		Carta cartaADevolver = listaDeCartasDelMazo.remove(0);
		// 2� devolverla
		return cartaADevolver;
	}
	

	/**
	 * A�adimos una carta al mazo
	 * 
	 * @param c
	 */
	public void a�adir(Carta c) {

		// 1� queremos a�adir una carta de la listaDeCartas
		listaDeCartasDelMazo.add(c);
	}

	/**
	 * Cargamos el mazo desde una lista de cartas
	 * 
	 * @param l
	 */
	public void a�adir(List<Carta> l) {

		// 1� queremos a�adir una carta de la listaDeCartas
		listaDeCartasDelMazo.addAll(l);

	}
	
	public void a�adir(Carta...arrayCartas) {

		// 1� queremos a�adir una carta de la listaDeCartas
		// Arrays.asList(arrayCartas);
		listaDeCartasDelMazo.addAll(Arrays.asList(arrayCartas));

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadDeCartas() {
		return this.listaDeCartasDelMazo.size();
	}
	/**
	 * La lista de cartas lo devolvemos como un
	 * Array de Cartas
	 * 
	 * @return devuelve un Array de Carta
	 */
	public Carta[] getListaDeCartasDelMazo() {
		return this.listaDeCartasDelMazo.toArray(new Carta[0]);
	}
	/**
	 * Este setter no hace nada
	 * @param l
	 * @deprecated
	 */
	public void setListaDeCartasDelMazo(Carta[] l) {
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mazo other = (Mazo) obj;
		if (id != other.id)
			return false;
		if (listaDeCartasDelMazo == null) {
			if (other.listaDeCartasDelMazo != null)
				return false;
		} else if (!listaDeCartasDelMazo.equals(other.listaDeCartasDelMazo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mazo [id=" + id + ", nombre=" + nombre
				+ ", listaDeCartasDelMazo=" + listaDeCartasDelMazo + "]";
	}

}
