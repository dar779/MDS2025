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

public class MultimediaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idMultimedia;
	public final LongExpression comentarioId;
	public final AssociationExpression comentario;
	public final LongExpression tweetId;
	public final AssociationExpression tweet;
	public final StringExpression tipo;
	public final StringExpression enlace;
	
	public MultimediaDetachedCriteria() {
		super(Multimedia.class, MultimediaCriteria.class);
		idMultimedia = new LongExpression("idMultimedia", this.getDetachedCriteria());
		comentarioId = new LongExpression("comentario.idComentario", this.getDetachedCriteria());
		comentario = new AssociationExpression("comentario", this.getDetachedCriteria());
		tweetId = new LongExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public MultimediaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MultimediaCriteria.class);
		idMultimedia = new LongExpression("idMultimedia", this.getDetachedCriteria());
		comentarioId = new LongExpression("comentario.idComentario", this.getDetachedCriteria());
		comentario = new AssociationExpression("comentario", this.getDetachedCriteria());
		tweetId = new LongExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria createComentarioCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("comentario"));
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("tweet"));
	}
	
	public Multimedia uniqueMultimedia(PersistentSession session) {
		return (Multimedia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Multimedia[] listMultimedia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
	}
}

