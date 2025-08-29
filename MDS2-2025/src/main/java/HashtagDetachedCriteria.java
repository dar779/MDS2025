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

public class HashtagDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nombre;
	public final IntegerExpression nComentarios;
	public final CollectionExpression tweet;
	
	public HashtagDetachedCriteria() {
		super(Hashtag.class, HashtagCriteria.class);
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nComentarios = new IntegerExpression("nComentarios", this.getDetachedCriteria());
		tweet = new CollectionExpression("ORM_tweet", this.getDetachedCriteria());
	}
	
	public HashtagDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, HashtagCriteria.class);
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nComentarios = new IntegerExpression("nComentarios", this.getDetachedCriteria());
		tweet = new CollectionExpression("ORM_tweet", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_tweet"));
	}
	
	public Hashtag uniqueHashtag(PersistentSession session) {
		return (Hashtag) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hashtag[] listHashtag(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

