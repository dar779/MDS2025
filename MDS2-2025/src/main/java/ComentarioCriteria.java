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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final LongExpression idComentario;
	public final StringExpression administradorId;
	public final AssociationExpression administrador;
	public final LongExpression tweetId;
	public final AssociationExpression tweet;
	public final CollectionExpression usuariosAfines;
	public final IntegerExpression nMeGusta;
	public final StringExpression texto;
	public final StringExpression usuarioComentadorId;
	public final AssociationExpression usuarioComentador;
	public final CollectionExpression multimedia;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		idComentario = new LongExpression("idComentario", this);
		administradorId = new StringExpression("administrador.login", this);
		administrador = new AssociationExpression("administrador", this);
		tweetId = new LongExpression("tweet.idTweet", this);
		tweet = new AssociationExpression("tweet", this);
		usuariosAfines = new CollectionExpression("ORM_usuariosAfines", this);
		nMeGusta = new IntegerExpression("nMeGusta", this);
		texto = new StringExpression("texto", this);
		usuarioComentadorId = new StringExpression("usuarioComentador.login", this);
		usuarioComentador = new AssociationExpression("usuarioComentador", this);
		multimedia = new CollectionExpression("ORM_multimedia", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("tweet"));
	}
	
	public UsuarioCriteria createUsuariosAfinesCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuariosAfines"));
	}
	
	public UsuarioCriteria createUsuarioComentadorCriteria() {
		return new UsuarioCriteria(createCriteria("usuarioComentador"));
	}
	
	public MultimediaCriteria createMultimediaCriteria() {
		return new MultimediaCriteria(createCriteria("ORM_multimedia"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

