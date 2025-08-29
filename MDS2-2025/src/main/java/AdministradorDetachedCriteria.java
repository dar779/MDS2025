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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression usuario;
	public final CollectionExpression comentario;
	public final CollectionExpression usuarioAdmin;
	public final CollectionExpression tweet;
	
	public AdministradorDetachedCriteria() {
		super(Administrador.class, AdministradorCriteria.class);
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		comentario = new CollectionExpression("ORM_comentario", this.getDetachedCriteria());
		usuarioAdmin = new CollectionExpression("ORM_usuarioAdmin", this.getDetachedCriteria());
		tweet = new CollectionExpression("ORM_tweet", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AdministradorCriteria.class);
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		comentario = new CollectionExpression("ORM_comentario", this.getDetachedCriteria());
		usuarioAdmin = new CollectionExpression("ORM_usuarioAdmin", this.getDetachedCriteria());
		tweet = new CollectionExpression("ORM_tweet", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public ComentarioDetachedCriteria createComentarioCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_comentario"));
	}
	
	public UsuarioDetachedCriteria createUsuarioAdminCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarioAdmin"));
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_tweet"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

