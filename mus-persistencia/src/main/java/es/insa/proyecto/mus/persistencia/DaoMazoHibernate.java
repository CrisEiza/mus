package es.insa.proyecto.mus.persistencia;

import java.util.List;

import org.hibernate.Session;

import es.insa.proyecto.dominio.cartas.Carta;
import es.insa.proyecto.dominio.cartas.Mazo;
import es.insa.proyecto.mus.contratos.DaoMazo;

/**
 * Inserta, actualiza, elimina, busca 
 * y lista todos los mazos.
 * @author Nazaret y Jose Antonio
 *
 */
public class DaoMazoHibernate
	extends DaoGenericoHibernate<Mazo, Integer>
	implements DaoMazo{
	
	private DaoMazo daoMazo;

	public DaoMazoHibernate() {
		super();
	}

		
	/**
	 * Aņade una Carta al mazo
	 * @param m
	 * @param c
	 * @return
	 */
	public Mazo aņadirCartaMazo(Mazo m,Carta c){
		
		m.aņadir(c);
		// para que se guarde el mazo en la BBDD
		daoMazo.actualizar(m);
		return m;		
		
	}
	/**
	 * Aņade una Lista de Cartas en el Mazo
	 * @param m
	 * @param lista
	 * @return
	 */
	public Mazo aņadirListaCartasMazo(Mazo m, List<Carta> lista){
		
		m.aņadir(lista);
		// para que se guarde el mazo en la BBDD
		daoMazo.actualizar(m);
		
		
		return m;
	}

}
