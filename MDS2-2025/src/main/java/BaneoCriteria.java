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

public class BaneoCriteria extends AbstractORMCriteria {
	public final LongExpression idBaneo;
	public final IntegerExpression nDiasBaneado;
	public final BooleanExpression esIndefinido;
	
	public BaneoCriteria(Criteria criteria) {
		super(criteria);
		idBaneo = new LongExpression("idBaneo", this);
		nDiasBaneado = new IntegerExpression("nDiasBaneado", this);
		esIndefinido = new BooleanExpression("esIndefinido", this);
	}
	
	public BaneoCriteria(PersistentSession session) {
		this(session.createCriteria(Baneo.class));
	}
	
	public BaneoCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public Baneo uniqueBaneo() {
		return (Baneo) super.uniqueResult();
	}
	
	public Baneo[] listBaneo() {
		java.util.List list = super.list();
		return (Baneo[]) list.toArray(new Baneo[list.size()]);
	}
}

