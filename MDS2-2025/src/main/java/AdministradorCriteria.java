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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression usuario;
	public final CollectionExpression comentario;
	public final CollectionExpression usuarioAdmin;
	public final CollectionExpression tweet;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		usuario = new CollectionExpression("ORM_usuario", this);
		comentario = new CollectionExpression("ORM_comentario", this);
		usuarioAdmin = new CollectionExpression("ORM_usuarioAdmin", this);
		tweet = new CollectionExpression("ORM_tweet", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuario"));
	}
	
	public ComentarioCriteria createComentarioCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_comentario"));
	}
	
	public UsuarioCriteria createUsuarioAdminCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarioAdmin"));
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("ORM_tweet"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

