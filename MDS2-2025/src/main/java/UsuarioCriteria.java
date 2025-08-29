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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final StringExpression login;
	public final StringExpression password;
	public final StringExpression administradorId;
	public final AssociationExpression administrador;
	public final CollectionExpression usuarioBloqueador;
	public final DateExpression fechaRegistro;
	public final StringExpression descripcion;
	public final IntegerExpression nSeguidores;
	public final IntegerExpression nSeguidos;
	public final StringExpression nick;
	public final StringExpression fotoPerfilURL;
	public final StringExpression fondoPerfilURL;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression correo;
	public final IntegerExpression codigoVerificacion;
	public final StringExpression arroba;
	public final CollectionExpression usuarioSeguido;
	public final CollectionExpression comentarioGustado;
	public final CollectionExpression comentarioPublicado;
	public final CollectionExpression tweet;
	public final CollectionExpression usuarioBloqueante;
	public final CollectionExpression usuarioQueSigue;
	public final CollectionExpression retweeteado;
	public final CollectionExpression tweetGustar;
	public final StringExpression administradorBanId;
	public final AssociationExpression administradorBan;
	public final CollectionExpression tweetMencion;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		administradorId = new StringExpression("administrador.login", this);
		administrador = new AssociationExpression("administrador", this);
		usuarioBloqueador = new CollectionExpression("ORM_usuarioBloqueador", this);
		fechaRegistro = new DateExpression("fechaRegistro", this);
		descripcion = new StringExpression("descripcion", this);
		nSeguidores = new IntegerExpression("nSeguidores", this);
		nSeguidos = new IntegerExpression("nSeguidos", this);
		nick = new StringExpression("nick", this);
		fotoPerfilURL = new StringExpression("fotoPerfilURL", this);
		fondoPerfilURL = new StringExpression("fondoPerfilURL", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		correo = new StringExpression("correo", this);
		codigoVerificacion = new IntegerExpression("codigoVerificacion", this);
		arroba = new StringExpression("arroba", this);
		usuarioSeguido = new CollectionExpression("ORM_usuarioSeguido", this);
		comentarioGustado = new CollectionExpression("ORM_comentarioGustado", this);
		comentarioPublicado = new CollectionExpression("ORM_comentarioPublicado", this);
		tweet = new CollectionExpression("ORM_tweet", this);
		usuarioBloqueante = new CollectionExpression("ORM_usuarioBloqueante", this);
		usuarioQueSigue = new CollectionExpression("ORM_usuarioQueSigue", this);
		retweeteado = new CollectionExpression("ORM_retweeteado", this);
		tweetGustar = new CollectionExpression("ORM_tweetGustar", this);
		administradorBanId = new StringExpression("administradorBan.login", this);
		administradorBan = new AssociationExpression("administradorBan", this);
		tweetMencion = new CollectionExpression("ORM_tweetMencion", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(ProyectoMDS120242025PersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public UsuarioCriteria createUsuarioBloqueadorCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarioBloqueador"));
	}
	
	public UsuarioCriteria createUsuarioSeguidoCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarioSeguido"));
	}
	
	public ComentarioCriteria createComentarioGustadoCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_comentarioGustado"));
	}
	
	public ComentarioCriteria createComentarioPublicadoCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_comentarioPublicado"));
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("ORM_tweet"));
	}
	
	public UsuarioCriteria createUsuarioBloqueanteCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarioBloqueante"));
	}
	
	public UsuarioCriteria createUsuarioQueSigueCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarioQueSigue"));
	}
	
	public TweetCriteria createRetweeteadoCriteria() {
		return new TweetCriteria(createCriteria("ORM_retweeteado"));
	}
	
	public TweetCriteria createTweetGustarCriteria() {
		return new TweetCriteria(createCriteria("ORM_tweetGustar"));
	}
	
	public AdministradorCriteria createAdministradorBanCriteria() {
		return new AdministradorCriteria(createCriteria("administradorBan"));
	}
	
	public TweetCriteria createTweetMencionCriteria() {
		return new TweetCriteria(createCriteria("ORM_tweetMencion"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

