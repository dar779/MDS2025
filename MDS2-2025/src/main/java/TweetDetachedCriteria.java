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

public class TweetDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idTweet;
	public final LongExpression tweetId;
	public final AssociationExpression tweet;
	public final StringExpression administradorId;
	public final AssociationExpression administrador;
	public final StringExpression usuarioRetweetId;
	public final AssociationExpression usuarioRetweet;
	public final StringExpression usuarioPublicadorId;
	public final AssociationExpression usuarioPublicador;
	public final IntegerExpression nMeGusta;
	public final IntegerExpression nRetweet;
	public final IntegerExpression nComentarios;
	public final StringExpression enlaceImagen;
	public final StringExpression ennlaceVideo;
	public final StringExpression texto;
	public final CollectionExpression usuarioAfines;
	public final CollectionExpression hashtag;
	public final CollectionExpression comentario;
	public final CollectionExpression esMencionado;
	public final CollectionExpression retweet;
	public final CollectionExpression multimedia;
	
	public TweetDetachedCriteria() {
		super(Tweet.class, TweetCriteria.class);
		idTweet = new LongExpression("idTweet", this.getDetachedCriteria());
		tweetId = new LongExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		administradorId = new StringExpression("administrador.login", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		usuarioRetweetId = new StringExpression("usuarioRetweet.login", this.getDetachedCriteria());
		usuarioRetweet = new AssociationExpression("usuarioRetweet", this.getDetachedCriteria());
		usuarioPublicadorId = new StringExpression("usuarioPublicador.login", this.getDetachedCriteria());
		usuarioPublicador = new AssociationExpression("usuarioPublicador", this.getDetachedCriteria());
		nMeGusta = new IntegerExpression("nMeGusta", this.getDetachedCriteria());
		nRetweet = new IntegerExpression("nRetweet", this.getDetachedCriteria());
		nComentarios = new IntegerExpression("nComentarios", this.getDetachedCriteria());
		enlaceImagen = new StringExpression("enlaceImagen", this.getDetachedCriteria());
		ennlaceVideo = new StringExpression("ennlaceVideo", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		usuarioAfines = new CollectionExpression("ORM_usuarioAfines", this.getDetachedCriteria());
		hashtag = new CollectionExpression("ORM_hashtag", this.getDetachedCriteria());
		comentario = new CollectionExpression("ORM_comentario", this.getDetachedCriteria());
		esMencionado = new CollectionExpression("ORM_esMencionado", this.getDetachedCriteria());
		retweet = new CollectionExpression("ORM_retweet", this.getDetachedCriteria());
		multimedia = new CollectionExpression("ORM_multimedia", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TweetCriteria.class);
		idTweet = new LongExpression("idTweet", this.getDetachedCriteria());
		tweetId = new LongExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		administradorId = new StringExpression("administrador.login", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		usuarioRetweetId = new StringExpression("usuarioRetweet.login", this.getDetachedCriteria());
		usuarioRetweet = new AssociationExpression("usuarioRetweet", this.getDetachedCriteria());
		usuarioPublicadorId = new StringExpression("usuarioPublicador.login", this.getDetachedCriteria());
		usuarioPublicador = new AssociationExpression("usuarioPublicador", this.getDetachedCriteria());
		nMeGusta = new IntegerExpression("nMeGusta", this.getDetachedCriteria());
		nRetweet = new IntegerExpression("nRetweet", this.getDetachedCriteria());
		nComentarios = new IntegerExpression("nComentarios", this.getDetachedCriteria());
		enlaceImagen = new StringExpression("enlaceImagen", this.getDetachedCriteria());
		ennlaceVideo = new StringExpression("ennlaceVideo", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		usuarioAfines = new CollectionExpression("ORM_usuarioAfines", this.getDetachedCriteria());
		hashtag = new CollectionExpression("ORM_hashtag", this.getDetachedCriteria());
		comentario = new CollectionExpression("ORM_comentario", this.getDetachedCriteria());
		esMencionado = new CollectionExpression("ORM_esMencionado", this.getDetachedCriteria());
		retweet = new CollectionExpression("ORM_retweet", this.getDetachedCriteria());
		multimedia = new CollectionExpression("ORM_multimedia", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("tweet"));
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public UsuarioDetachedCriteria createUsuarioRetweetCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuarioRetweet"));
	}
	
	public UsuarioDetachedCriteria createUsuarioPublicadorCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuarioPublicador"));
	}
	
	public UsuarioDetachedCriteria createUsuarioAfinesCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarioAfines"));
	}
	
	public HashtagDetachedCriteria createHashtagCriteria() {
		return new HashtagDetachedCriteria(createCriteria("ORM_hashtag"));
	}
	
	public ComentarioDetachedCriteria createComentarioCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_comentario"));
	}
	
	public UsuarioDetachedCriteria createEsMencionadoCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_esMencionado"));
	}
	
	public TweetDetachedCriteria createRetweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_retweet"));
	}
	
	public MultimediaDetachedCriteria createMultimediaCriteria() {
		return new MultimediaDetachedCriteria(createCriteria("ORM_multimedia"));
	}
	
	public Tweet uniqueTweet(PersistentSession session) {
		return (Tweet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tweet[] listTweet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

