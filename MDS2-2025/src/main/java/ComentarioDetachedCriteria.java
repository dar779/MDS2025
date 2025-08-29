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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComentarioDetachedCriteria() {
		super(Comentario.class, ComentarioCriteria.class);
		idComentario = new LongExpression("idComentario", this.getDetachedCriteria());
		administradorId = new StringExpression("administrador.login", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		tweetId = new LongExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		usuariosAfines = new CollectionExpression("ORM_usuariosAfines", this.getDetachedCriteria());
		nMeGusta = new IntegerExpression("nMeGusta", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		usuarioComentadorId = new StringExpression("usuarioComentador.login", this.getDetachedCriteria());
		usuarioComentador = new AssociationExpression("usuarioComentador", this.getDetachedCriteria());
		multimedia = new CollectionExpression("ORM_multimedia", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ComentarioCriteria.class);
		idComentario = new LongExpression("idComentario", this.getDetachedCriteria());
		administradorId = new StringExpression("administrador.login", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		tweetId = new LongExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		usuariosAfines = new CollectionExpression("ORM_usuariosAfines", this.getDetachedCriteria());
		nMeGusta = new IntegerExpression("nMeGusta", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		usuarioComentadorId = new StringExpression("usuarioComentador.login", this.getDetachedCriteria());
		usuarioComentador = new AssociationExpression("usuarioComentador", this.getDetachedCriteria());
		multimedia = new CollectionExpression("ORM_multimedia", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("tweet"));
	}
	
	public UsuarioDetachedCriteria createUsuariosAfinesCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuariosAfines"));
	}
	
	public UsuarioDetachedCriteria createUsuarioComentadorCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuarioComentador"));
	}
	
	public MultimediaDetachedCriteria createMultimediaCriteria() {
		return new MultimediaDetachedCriteria(createCriteria("ORM_multimedia"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

