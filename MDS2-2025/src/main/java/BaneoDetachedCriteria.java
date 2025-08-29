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

public class BaneoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idBaneo;
	public final IntegerExpression nDiasBaneado;
	public final BooleanExpression esIndefinido;
	
	public BaneoDetachedCriteria() {
		super(Baneo.class, BaneoCriteria.class);
		idBaneo = new LongExpression("idBaneo", this.getDetachedCriteria());
		nDiasBaneado = new IntegerExpression("nDiasBaneado", this.getDetachedCriteria());
		esIndefinido = new BooleanExpression("esIndefinido", this.getDetachedCriteria());
	}
	
	public BaneoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, BaneoCriteria.class);
		idBaneo = new LongExpression("idBaneo", this.getDetachedCriteria());
		nDiasBaneado = new IntegerExpression("nDiasBaneado", this.getDetachedCriteria());
		esIndefinido = new BooleanExpression("esIndefinido", this.getDetachedCriteria());
	}
	
	public Baneo uniqueBaneo(PersistentSession session) {
		return (Baneo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Baneo[] listBaneo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Baneo[]) list.toArray(new Baneo[list.size()]);
	}
}

