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

public class MultimediaCriteria extends AbstractORMCriteria {
	public final LongExpression idMultimedia;
	public final LongExpression comentarioId;
	public final AssociationExpression comentario;
	public final LongExpression tweetId;
	public final AssociationExpression tweet;
	public final StringExpression tipo;
	public final StringExpression enlace;
	
	public MultimediaCriteria(Criteria criteria) {
		super(criteria);
		idMultimedia = new LongExpression("idMultimedia", this);
		comentarioId = new LongExpression("comentario.idComentario", this);
		comentario = new AssociationExpression("comentario", this);
		tweetId = new LongExpression("tweet.idTweet", this);
		tweet = new AssociationExpression("tweet", this);
		tipo = new StringExpression("tipo", this);
		enlace = new StringExpression("enlace", this);
	}
	
	public MultimediaCriteria(PersistentSession session) {
		this(session.createCriteria(Multimedia.class));
	}
	
	public MultimediaCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public ComentarioCriteria createComentarioCriteria() {
		return new ComentarioCriteria(createCriteria("comentario"));
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("tweet"));
	}
	
	public Multimedia uniqueMultimedia() {
		return (Multimedia) super.uniqueResult();
	}
	
	public Multimedia[] listMultimedia() {
		java.util.List list = super.list();
		return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
	}
}

