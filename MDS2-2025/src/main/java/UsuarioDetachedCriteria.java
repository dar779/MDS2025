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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public UsuarioDetachedCriteria() {
		super(Usuario.class, UsuarioCriteria.class);
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		administradorId = new StringExpression("administrador.login", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		usuarioBloqueador = new CollectionExpression("ORM_usuarioBloqueador", this.getDetachedCriteria());
		fechaRegistro = new DateExpression("fechaRegistro", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nSeguidores = new IntegerExpression("nSeguidores", this.getDetachedCriteria());
		nSeguidos = new IntegerExpression("nSeguidos", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoPerfilURL = new StringExpression("fotoPerfilURL", this.getDetachedCriteria());
		fondoPerfilURL = new StringExpression("fondoPerfilURL", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		codigoVerificacion = new IntegerExpression("codigoVerificacion", this.getDetachedCriteria());
		arroba = new StringExpression("arroba", this.getDetachedCriteria());
		usuarioSeguido = new CollectionExpression("ORM_usuarioSeguido", this.getDetachedCriteria());
		comentarioGustado = new CollectionExpression("ORM_comentarioGustado", this.getDetachedCriteria());
		comentarioPublicado = new CollectionExpression("ORM_comentarioPublicado", this.getDetachedCriteria());
		tweet = new CollectionExpression("ORM_tweet", this.getDetachedCriteria());
		usuarioBloqueante = new CollectionExpression("ORM_usuarioBloqueante", this.getDetachedCriteria());
		usuarioQueSigue = new CollectionExpression("ORM_usuarioQueSigue", this.getDetachedCriteria());
		retweeteado = new CollectionExpression("ORM_retweeteado", this.getDetachedCriteria());
		tweetGustar = new CollectionExpression("ORM_tweetGustar", this.getDetachedCriteria());
		administradorBanId = new StringExpression("administradorBan.login", this.getDetachedCriteria());
		administradorBan = new AssociationExpression("administradorBan", this.getDetachedCriteria());
		tweetMencion = new CollectionExpression("ORM_tweetMencion", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UsuarioCriteria.class);
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		administradorId = new StringExpression("administrador.login", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		usuarioBloqueador = new CollectionExpression("ORM_usuarioBloqueador", this.getDetachedCriteria());
		fechaRegistro = new DateExpression("fechaRegistro", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nSeguidores = new IntegerExpression("nSeguidores", this.getDetachedCriteria());
		nSeguidos = new IntegerExpression("nSeguidos", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoPerfilURL = new StringExpression("fotoPerfilURL", this.getDetachedCriteria());
		fondoPerfilURL = new StringExpression("fondoPerfilURL", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		codigoVerificacion = new IntegerExpression("codigoVerificacion", this.getDetachedCriteria());
		arroba = new StringExpression("arroba", this.getDetachedCriteria());
		usuarioSeguido = new CollectionExpression("ORM_usuarioSeguido", this.getDetachedCriteria());
		comentarioGustado = new CollectionExpression("ORM_comentarioGustado", this.getDetachedCriteria());
		comentarioPublicado = new CollectionExpression("ORM_comentarioPublicado", this.getDetachedCriteria());
		tweet = new CollectionExpression("ORM_tweet", this.getDetachedCriteria());
		usuarioBloqueante = new CollectionExpression("ORM_usuarioBloqueante", this.getDetachedCriteria());
		usuarioQueSigue = new CollectionExpression("ORM_usuarioQueSigue", this.getDetachedCriteria());
		retweeteado = new CollectionExpression("ORM_retweeteado", this.getDetachedCriteria());
		tweetGustar = new CollectionExpression("ORM_tweetGustar", this.getDetachedCriteria());
		administradorBanId = new StringExpression("administradorBan.login", this.getDetachedCriteria());
		administradorBan = new AssociationExpression("administradorBan", this.getDetachedCriteria());
		tweetMencion = new CollectionExpression("ORM_tweetMencion", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public UsuarioDetachedCriteria createUsuarioBloqueadorCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarioBloqueador"));
	}
	
	public UsuarioDetachedCriteria createUsuarioSeguidoCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarioSeguido"));
	}
	
	public ComentarioDetachedCriteria createComentarioGustadoCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_comentarioGustado"));
	}
	
	public ComentarioDetachedCriteria createComentarioPublicadoCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_comentarioPublicado"));
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_tweet"));
	}
	
	public UsuarioDetachedCriteria createUsuarioBloqueanteCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarioBloqueante"));
	}
	
	public UsuarioDetachedCriteria createUsuarioQueSigueCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarioQueSigue"));
	}
	
	public TweetDetachedCriteria createRetweeteadoCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_retweeteado"));
	}
	
	public TweetDetachedCriteria createTweetGustarCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_tweetGustar"));
	}
	
	public AdministradorDetachedCriteria createAdministradorBanCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administradorBan"));
	}
	
	public TweetDetachedCriteria createTweetMencionCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_tweetMencion"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

