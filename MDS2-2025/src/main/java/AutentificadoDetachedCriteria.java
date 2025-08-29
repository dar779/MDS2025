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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AutentificadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression login;
	public final StringExpression password;
	
	public AutentificadoDetachedCriteria() {
		super(Autentificado.class, AutentificadoCriteria.class);
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public AutentificadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AutentificadoCriteria.class);
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Autentificado uniqueAutentificado(PersistentSession session) {
		return (Autentificado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autentificado[] listAutentificado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autentificado[]) list.toArray(new Autentificado[list.size()]);
	}
}

