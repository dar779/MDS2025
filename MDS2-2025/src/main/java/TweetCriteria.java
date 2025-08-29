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

public class TweetCriteria extends AbstractORMCriteria {
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
	
	public TweetCriteria(Criteria criteria) {
		super(criteria);
		idTweet = new LongExpression("idTweet", this);
		tweetId = new LongExpression("tweet.idTweet", this);
		tweet = new AssociationExpression("tweet", this);
		administradorId = new StringExpression("administrador.login", this);
		administrador = new AssociationExpression("administrador", this);
		usuarioRetweetId = new StringExpression("usuarioRetweet.login", this);
		usuarioRetweet = new AssociationExpression("usuarioRetweet", this);
		usuarioPublicadorId = new StringExpression("usuarioPublicador.login", this);
		usuarioPublicador = new AssociationExpression("usuarioPublicador", this);
		nMeGusta = new IntegerExpression("nMeGusta", this);
		nRetweet = new IntegerExpression("nRetweet", this);
		nComentarios = new IntegerExpression("nComentarios", this);
		enlaceImagen = new StringExpression("enlaceImagen", this);
		ennlaceVideo = new StringExpression("ennlaceVideo", this);
		texto = new StringExpression("texto", this);
		usuarioAfines = new CollectionExpression("ORM_usuarioAfines", this);
		hashtag = new CollectionExpression("ORM_hashtag", this);
		comentario = new CollectionExpression("ORM_comentario", this);
		esMencionado = new CollectionExpression("ORM_esMencionado", this);
		retweet = new CollectionExpression("ORM_retweet", this);
		multimedia = new CollectionExpression("ORM_multimedia", this);
	}
	
	public TweetCriteria(PersistentSession session) {
		this(session.createCriteria(Tweet.class));
	}
	
	public TweetCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("tweet"));
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public UsuarioCriteria createUsuarioRetweetCriteria() {
		return new UsuarioCriteria(createCriteria("usuarioRetweet"));
	}
	
	public UsuarioCriteria createUsuarioPublicadorCriteria() {
		return new UsuarioCriteria(createCriteria("usuarioPublicador"));
	}
	
	public UsuarioCriteria createUsuarioAfinesCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarioAfines"));
	}
	
	public HashtagCriteria createHashtagCriteria() {
		return new HashtagCriteria(createCriteria("ORM_hashtag"));
	}
	
	public ComentarioCriteria createComentarioCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_comentario"));
	}
	
	public UsuarioCriteria createEsMencionadoCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_esMencionado"));
	}
	
	public TweetCriteria createRetweetCriteria() {
		return new TweetCriteria(createCriteria("ORM_retweet"));
	}
	
	public MultimediaCriteria createMultimediaCriteria() {
		return new MultimediaCriteria(createCriteria("ORM_multimedia"));
	}
	
	public Tweet uniqueTweet() {
		return (Tweet) super.uniqueResult();
	}
	
	public Tweet[] listTweet() {
		java.util.List list = super.list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

