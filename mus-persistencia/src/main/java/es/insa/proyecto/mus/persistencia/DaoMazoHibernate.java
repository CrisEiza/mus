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
	 * A�ade una Carta al mazo
	 * @param m
	 * @param c
	 * @return
	 */
	public Mazo a�adirCartaMazo(Mazo m,Carta c){
		
		m.a�adir(c);
		// para que se guarde el mazo en la BBDD
		daoMazo.actualizar(m);
		return m;		
		
	}
	/**
	 * A�ade una Lista de Cartas en el Mazo
	 * @param m
	 * @param lista
	 * @return
	 */
	public Mazo a�adirListaCartasMazo(Mazo m, List<Carta> lista){
		
		m.a�adir(lista);
		// para que se guarde el mazo en la BBDD
		daoMazo.actualizar(m);
		
		
		return m;
	}

}
