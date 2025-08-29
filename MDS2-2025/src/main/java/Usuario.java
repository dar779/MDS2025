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
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Usuario")
public class Usuario extends Autentificado implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_USUARIOBLOQUEADOR) {
			return ORM_usuarioBloqueador;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIOSEGUIDO) {
			return ORM_usuarioSeguido;
		}
		else if (key == ORMConstants.KEY_USUARIO_COMENTARIOGUSTADO) {
			return ORM_comentarioGustado;
		}
		else if (key == ORMConstants.KEY_USUARIO_COMENTARIOPUBLICADO) {
			return ORM_comentarioPublicado;
		}
		else if (key == ORMConstants.KEY_USUARIO_TWEET) {
			return ORM_tweet;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIOBLOQUEANTE) {
			return ORM_usuarioBloqueante;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIOQUESIGUE) {
			return ORM_usuarioQueSigue;
		}
		else if (key == ORMConstants.KEY_USUARIO_RETWEETEADO) {
			return ORM_retweeteado;
		}
		else if (key == ORMConstants.KEY_USUARIO_TWEETGUSTAR) {
			return ORM_tweetGustar;
		}
		else if (key == ORMConstants.KEY_USUARIO_TWEETMENCION) {
			return ORM_tweetMencion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_ADMINISTRADOR) {
			this.administrador = (Administrador) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_ADMINISTRADORBAN) {
			this.administradorBan = (Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin2", referencedColumnName="Login") }, foreignKey=@ForeignKey(name="eliminarUsuario"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador administrador;
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Autentificado_Autentificado3", joinColumns={ @JoinColumn(name="AutentificadoLogin2") }, inverseJoinColumns={ @JoinColumn(name="AutentificadoLogin") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarioBloqueador = new java.util.HashSet();
	
	@Column(name="FechaRegistro", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaRegistro;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="NSeguidores", nullable=true, length=10)	
	private int nSeguidores;
	
	@Column(name="NSeguidos", nullable=true, length=10)	
	private int nSeguidos;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String nick;
	
	@Column(name="FotoPerfilURL", nullable=true, length=255)	
	private String fotoPerfilURL;
	
	@Column(name="FondoPerfilURL", nullable=true, length=255)	
	private String fondoPerfilURL;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellido", nullable=true, length=255)	
	private String apellido;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="CodigoVerificacion", nullable=true, length=10)	
	private int codigoVerificacion;
	
	@Column(name="Arroba", nullable=true, length=255)	
	private String arroba;
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Autentificado_Autentificado4", joinColumns={ @JoinColumn(name="AutentificadoLogin2") }, inverseJoinColumns={ @JoinColumn(name="AutentificadoLogin") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarioSeguido = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuariosAfines", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarioGustado = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarioComentador", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarioPublicado = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarioPublicador", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tweet = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuarioBloqueador", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarioBloqueante = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuarioSeguido", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarioQueSigue = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarioRetweet", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_retweeteado = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuarioAfines", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tweetGustar = new java.util.HashSet();
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin", referencedColumnName="Login") }, foreignKey=@ForeignKey(name="banearUsuario"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador administradorBan;
	
	@ManyToMany(mappedBy="ORM_esMencionado", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tweetMencion = new java.util.HashSet();
	
	public void setFechaRegistro(java.util.Date value) {
		this.fechaRegistro = value;
	}
	
	public java.util.Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setnSeguidores(int value) {
		this.nSeguidores = value;
	}
	
	public int getnSeguidores() {
		return nSeguidores;
	}
	
	public void setnSeguidos(int value) {
		this.nSeguidos = value;
	}
	
	public int getnSeguidos() {
		return nSeguidos;
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setFotoPerfilURL(String value) {
		this.fotoPerfilURL = value;
	}
	
	public String getFotoPerfilURL() {
		return fotoPerfilURL;
	}
	
	public void setFondoPerfilURL(String value) {
		this.fondoPerfilURL = value;
	}
	
	public String getFondoPerfilURL() {
		return fondoPerfilURL;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCodigoVerificacion(int value) {
		this.codigoVerificacion = value;
	}
	
	public int getCodigoVerificacion() {
		return codigoVerificacion;
	}
	
	public void setArroba(String value) {
		this.arroba = value;
	}
	
	public String getArroba() {
		return arroba;
	}
	
	private void setORM_UsuarioBloqueador(java.util.Set value) {
		this.ORM_usuarioBloqueador = value;
	}
	
	private java.util.Set getORM_UsuarioBloqueador() {
		return ORM_usuarioBloqueador;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarioBloqueador = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIOBLOQUEADOR, ORMConstants.KEY_USUARIO_USUARIOBLOQUEANTE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_UsuarioSeguido(java.util.Set value) {
		this.ORM_usuarioSeguido = value;
	}
	
	private java.util.Set getORM_UsuarioSeguido() {
		return ORM_usuarioSeguido;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarioSeguido = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIOSEGUIDO, ORMConstants.KEY_USUARIO_USUARIOQUESIGUE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(Administrador value) {
		if (administrador != null) {
			administrador.usuarioAdmin.remove(this);
		}
		if (value != null) {
			value.usuarioAdmin.add(this);
		}
	}
	
	public Administrador getAdministrador() {
		return administrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrador(Administrador value) {
		this.administrador = value;
	}
	
	private Administrador getORM_Administrador() {
		return administrador;
	}
	
	private void setORM_ComentarioGustado(java.util.Set value) {
		this.ORM_comentarioGustado = value;
	}
	
	private java.util.Set getORM_ComentarioGustado() {
		return ORM_comentarioGustado;
	}
	
	@Transient	
	public final ComentarioSetCollection comentarioGustado = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_COMENTARIOGUSTADO, ORMConstants.KEY_COMENTARIO_USUARIOSAFINES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_ComentarioPublicado(java.util.Set value) {
		this.ORM_comentarioPublicado = value;
	}
	
	private java.util.Set getORM_ComentarioPublicado() {
		return ORM_comentarioPublicado;
	}
	
	@Transient	
	public final ComentarioSetCollection comentarioPublicado = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_COMENTARIOPUBLICADO, ORMConstants.KEY_COMENTARIO_USUARIOCOMENTADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tweet(java.util.Set value) {
		this.ORM_tweet = value;
	}
	
	private java.util.Set getORM_Tweet() {
		return ORM_tweet;
	}
	
	@Transient	
	public final TweetSetCollection tweet = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_TWEET, ORMConstants.KEY_TWEET_USUARIOPUBLICADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_UsuarioBloqueante(java.util.Set value) {
		this.ORM_usuarioBloqueante = value;
	}
	
	private java.util.Set getORM_UsuarioBloqueante() {
		return ORM_usuarioBloqueante;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarioBloqueante = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIOBLOQUEANTE, ORMConstants.KEY_USUARIO_USUARIOBLOQUEADOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_UsuarioQueSigue(java.util.Set value) {
		this.ORM_usuarioQueSigue = value;
	}
	
	private java.util.Set getORM_UsuarioQueSigue() {
		return ORM_usuarioQueSigue;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarioQueSigue = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIOQUESIGUE, ORMConstants.KEY_USUARIO_USUARIOSEGUIDO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Retweeteado(java.util.Set value) {
		this.ORM_retweeteado = value;
	}
	
	private java.util.Set getORM_Retweeteado() {
		return ORM_retweeteado;
	}
	
	@Transient	
	public final TweetSetCollection retweeteado = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_RETWEETEADO, ORMConstants.KEY_TWEET_USUARIORETWEET, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_TweetGustar(java.util.Set value) {
		this.ORM_tweetGustar = value;
	}
	
	private java.util.Set getORM_TweetGustar() {
		return ORM_tweetGustar;
	}
	
	@Transient	
	public final TweetSetCollection tweetGustar = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_TWEETGUSTAR, ORMConstants.KEY_TWEET_USUARIOAFINES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministradorBan(Administrador value) {
		if (administradorBan != null) {
			administradorBan.usuario.remove(this);
		}
		if (value != null) {
			value.usuario.add(this);
		}
	}
	
	public Administrador getAdministradorBan() {
		return administradorBan;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AdministradorBan(Administrador value) {
		this.administradorBan = value;
	}
	
	private Administrador getORM_AdministradorBan() {
		return administradorBan;
	}
	
	private void setORM_TweetMencion(java.util.Set value) {
		this.ORM_tweetMencion = value;
	}
	
	private java.util.Set getORM_TweetMencion() {
		return ORM_tweetMencion;
	}
	
	@Transient	
	public final TweetSetCollection tweetMencion = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_TWEETMENCION, ORMConstants.KEY_TWEET_ESMENCIONADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
