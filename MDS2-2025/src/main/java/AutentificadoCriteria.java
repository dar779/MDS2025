/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel(University of Almeria)
 * License Type: Academic
 */
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AutentificadoCriteria extends AbstractORMCriteria {
	public final StringExpression login;
	public final StringExpression password;
	
	public AutentificadoCriteria(Criteria criteria) {
		super(criteria);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
	}
	
	public AutentificadoCriteria(PersistentSession session) {
		this(session.createCriteria(Autentificado.class));
	}
	
	public AutentificadoCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public Autentificado uniqueAutentificado() {
		return (Autentificado) super.uniqueResult();
	}
	
	public Autentificado[] listAutentificado() {
		java.util.List list = super.list();
		return (Autentificado[]) list.toArray(new Autentificado[list.size()]);
	}
}

