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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMENTARIO_USUARIOSAFINES) {
			return ORM_usuariosAfines;
		}
		else if (key == ORMConstants.KEY_COMENTARIO_MULTIMEDIA) {
			return ORM_multimedia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_USUARIOCOMENTADOR) {
			this.usuarioComentador = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_TWEET) {
			this.tweet = (Tweet) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_ADMINISTRADOR) {
			this.administrador = (Administrador) owner;
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
	
	@Column(name="IdComentario", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="COMENTARIO_IDCOMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COMENTARIO_IDCOMENTARIO_GENERATOR", strategy="native")	
	private long idComentario;
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin2", referencedColumnName="Login") }, foreignKey=@ForeignKey(name="eliminarComentario"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador administrador;
	
	@ManyToOne(targetEntity=Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetIdTweet", referencedColumnName="IdTweet", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario689142"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Tweet tweet;
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Autentificado_Comentario2", joinColumns={ @JoinColumn(name="ComentarioIdComentario") }, inverseJoinColumns={ @JoinColumn(name="AutentificadoLogin") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuariosAfines = new java.util.HashSet();
	
	@Column(name="NMeGusta", nullable=false, length=10)	
	private int nMeGusta;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin", referencedColumnName="Login", nullable=false) }, foreignKey=@ForeignKey(name="publicarComentario"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuarioComentador;
	
	@OneToMany(mappedBy="comentario", targetEntity=Multimedia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_multimedia = new java.util.HashSet();
	
	public void setnMeGusta(int value) {
		this.nMeGusta = value;
	}
	
	public int getnMeGusta() {
		return nMeGusta;
	}
	
	private void setIdComentario(long value) {
		this.idComentario = value;
	}
	
	public long getIdComentario() {
		return idComentario;
	}
	
	public long getORMID() {
		return getIdComentario();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	private void setORM_UsuariosAfines(java.util.Set value) {
		this.ORM_usuariosAfines = value;
	}
	
	private java.util.Set getORM_UsuariosAfines() {
		return ORM_usuariosAfines;
	}
	
	@Transient	
	public final UsuarioSetCollection usuariosAfines = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_USUARIOSAFINES, ORMConstants.KEY_USUARIO_COMENTARIOGUSTADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setUsuarioComentador(Usuario value) {
		if (usuarioComentador != null) {
			usuarioComentador.comentarioPublicado.remove(this);
		}
		if (value != null) {
			value.comentarioPublicado.add(this);
		}
	}
	
	public Usuario getUsuarioComentador() {
		return usuarioComentador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UsuarioComentador(Usuario value) {
		this.usuarioComentador = value;
	}
	
	private Usuario getORM_UsuarioComentador() {
		return usuarioComentador;
	}
	
	public void setTweet(Tweet value) {
		if (tweet != null) {
			tweet.comentario.remove(this);
		}
		if (value != null) {
			value.comentario.add(this);
		}
	}
	
	public Tweet getTweet() {
		return tweet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tweet(Tweet value) {
		this.tweet = value;
	}
	
	private Tweet getORM_Tweet() {
		return tweet;
	}
	
	public void setAdministrador(Administrador value) {
		if (administrador != null) {
			administrador.comentario.remove(this);
		}
		if (value != null) {
			value.comentario.add(this);
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
	
	private void setORM_Multimedia(java.util.Set value) {
		this.ORM_multimedia = value;
	}
	
	private java.util.Set getORM_Multimedia() {
		return ORM_multimedia;
	}
	
	@Transient	
	public final MultimediaSetCollection multimedia = new MultimediaSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_MULTIMEDIA, ORMConstants.KEY_MULTIMEDIA_COMENTARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdComentario());
	}
	
}
