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

public class HashtagCriteria extends AbstractORMCriteria {
	public final StringExpression nombre;
	public final IntegerExpression nComentarios;
	public final CollectionExpression tweet;
	
	public HashtagCriteria(Criteria criteria) {
		super(criteria);
		nombre = new StringExpression("nombre", this);
		nComentarios = new IntegerExpression("nComentarios", this);
		tweet = new CollectionExpression("ORM_tweet", this);
	}
	
	public HashtagCriteria(PersistentSession session) {
		this(session.createCriteria(Hashtag.class));
	}
	
	public HashtagCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("ORM_tweet"));
	}
	
	public Hashtag uniqueHashtag() {
		return (Hashtag) super.uniqueResult();
	}
	
	public Hashtag[] listHashtag() {
		java.util.List list = super.list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

