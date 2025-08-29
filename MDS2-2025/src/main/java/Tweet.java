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
@Table(name="Tweet")
public class Tweet implements Serializable {
	public Tweet() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TWEET_USUARIOAFINES) {
			return ORM_usuarioAfines;
		}
		else if (key == ORMConstants.KEY_TWEET_HASHTAG) {
			return ORM_hashtag;
		}
		else if (key == ORMConstants.KEY_TWEET_COMENTARIO) {
			return ORM_comentario;
		}
		else if (key == ORMConstants.KEY_TWEET_ESMENCIONADO) {
			return ORM_esMencionado;
		}
		else if (key == ORMConstants.KEY_TWEET_RETWEET) {
			return ORM_retweet;
		}
		else if (key == ORMConstants.KEY_TWEET_MULTIMEDIA) {
			return ORM_multimedia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TWEET_USUARIOPUBLICADOR) {
			this.usuarioPublicador = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_TWEET_USUARIORETWEET) {
			this.usuarioRetweet = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_TWEET_ADMINISTRADOR) {
			this.administrador = (Administrador) owner;
		}
		
		else if (key == ORMConstants.KEY_TWEET_TWEET) {
			this.tweet = (Tweet) owner;
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
	
	@Column(name="IdTweet", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="TWEET_IDTWEET_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TWEET_IDTWEET_GENERATOR", strategy="native")	
	private long idTweet;
	
	@ManyToOne(targetEntity=Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetIdTweet", referencedColumnName="IdTweet", nullable=false) }, foreignKey=@ForeignKey(name="referenciar"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Tweet tweet;
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin3", referencedColumnName="Login") }, foreignKey=@ForeignKey(name="eliminarTweet"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador administrador;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin2", referencedColumnName="Login", nullable=false) }, foreignKey=@ForeignKey(name="retweetearTweet"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuarioRetweet;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AutentificadoLogin", referencedColumnName="Login", nullable=false) }, foreignKey=@ForeignKey(name="publicarTweet"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuarioPublicador;
	
	@Column(name="NMeGusta", nullable=false, length=10)	
	private int nMeGusta;
	
	@Column(name="NRetweet", nullable=false, length=10)	
	private int nRetweet;
	
	@Column(name="NComentarios", nullable=false, length=10)	
	private int nComentarios;
	
	@Column(name="EnlaceImagen", nullable=true, length=255)	
	private String enlaceImagen;
	
	@Column(name="EnnlaceVideo", nullable=true, length=255)	
	private String ennlaceVideo;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Autentificado_Tweet3", joinColumns={ @JoinColumn(name="TweetIdTweet") }, inverseJoinColumns={ @JoinColumn(name="AutentificadoLogin") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarioAfines = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Hashtag.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Hashtag_Tweet2", joinColumns={ @JoinColumn(name="TweetIdTweet") }, inverseJoinColumns={ @JoinColumn(name="HashtagNombre") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_hashtag = new java.util.HashSet();
	
	@OneToMany(mappedBy="tweet", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentario = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Autentificado_Tweet4", joinColumns={ @JoinColumn(name="TweetIdTweet") }, inverseJoinColumns={ @JoinColumn(name="AutentificadoLogin") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_esMencionado = new java.util.HashSet();
	
	@OneToMany(mappedBy="tweet", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_retweet = new java.util.HashSet();
	
	@OneToMany(mappedBy="tweet", targetEntity=Multimedia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_multimedia = new java.util.HashSet();
	
	public void setnMeGusta(int value) {
		this.nMeGusta = value;
	}
	
	public int getnMeGusta() {
		return nMeGusta;
	}
	
	public void setnRetweet(int value) {
		this.nRetweet = value;
	}
	
	public int getnRetweet() {
		return nRetweet;
	}
	
	public void setnComentarios(int value) {
		this.nComentarios = value;
	}
	
	public int getnComentarios() {
		return nComentarios;
	}
	
	private void setIdTweet(long value) {
		this.idTweet = value;
	}
	
	public long getIdTweet() {
		return idTweet;
	}
	
	public long getORMID() {
		return getIdTweet();
	}
	
	public void setEnlaceImagen(String value) {
		this.enlaceImagen = value;
	}
	
	public String getEnlaceImagen() {
		return enlaceImagen;
	}
	
	public void setEnnlaceVideo(String value) {
		this.ennlaceVideo = value;
	}
	
	public String getEnnlaceVideo() {
		return ennlaceVideo;
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setUsuarioPublicador(Usuario value) {
		if (usuarioPublicador != null) {
			usuarioPublicador.tweet.remove(this);
		}
		if (value != null) {
			value.tweet.add(this);
		}
	}
	
	public Usuario getUsuarioPublicador() {
		return usuarioPublicador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UsuarioPublicador(Usuario value) {
		this.usuarioPublicador = value;
	}
	
	private Usuario getORM_UsuarioPublicador() {
		return usuarioPublicador;
	}
	
	public void setUsuarioRetweet(Usuario value) {
		if (usuarioRetweet != null) {
			usuarioRetweet.retweeteado.remove(this);
		}
		if (value != null) {
			value.retweeteado.add(this);
		}
	}
	
	public Usuario getUsuarioRetweet() {
		return usuarioRetweet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UsuarioRetweet(Usuario value) {
		this.usuarioRetweet = value;
	}
	
	private Usuario getORM_UsuarioRetweet() {
		return usuarioRetweet;
	}
	
	private void setORM_UsuarioAfines(java.util.Set value) {
		this.ORM_usuarioAfines = value;
	}
	
	private java.util.Set getORM_UsuarioAfines() {
		return ORM_usuarioAfines;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarioAfines = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_USUARIOAFINES, ORMConstants.KEY_USUARIO_TWEETGUSTAR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Hashtag(java.util.Set value) {
		this.ORM_hashtag = value;
	}
	
	private java.util.Set getORM_Hashtag() {
		return ORM_hashtag;
	}
	
	@Transient	
	public final HashtagSetCollection hashtag = new HashtagSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_HASHTAG, ORMConstants.KEY_HASHTAG_TWEET, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Comentario(java.util.Set value) {
		this.ORM_comentario = value;
	}
	
	private java.util.Set getORM_Comentario() {
		return ORM_comentario;
	}
	
	@Transient	
	public final ComentarioSetCollection comentario = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_COMENTARIO, ORMConstants.KEY_COMENTARIO_TWEET, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setAdministrador(Administrador value) {
		if (administrador != null) {
			administrador.tweet.remove(this);
		}
		if (value != null) {
			value.tweet.add(this);
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
	
	private void setORM_EsMencionado(java.util.Set value) {
		this.ORM_esMencionado = value;
	}
	
	private java.util.Set getORM_EsMencionado() {
		return ORM_esMencionado;
	}
	
	@Transient	
	public final UsuarioSetCollection esMencionado = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_ESMENCIONADO, ORMConstants.KEY_USUARIO_TWEETMENCION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Retweet(java.util.Set value) {
		this.ORM_retweet = value;
	}
	
	private java.util.Set getORM_Retweet() {
		return ORM_retweet;
	}
	
	@Transient	
	public final TweetSetCollection retweet = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_RETWEET, ORMConstants.KEY_TWEET_TWEET, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Multimedia(java.util.Set value) {
		this.ORM_multimedia = value;
	}
	
	private java.util.Set getORM_Multimedia() {
		return ORM_multimedia;
	}
	
	@Transient	
	public final MultimediaSetCollection multimedia = new MultimediaSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_MULTIMEDIA, ORMConstants.KEY_MULTIMEDIA_TWEET, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTweet(Tweet value) {
		if (tweet != null) {
			tweet.retweet.remove(this);
		}
		if (value != null) {
			value.retweet.add(this);
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
	
	public String toString() {
		return String.valueOf(getIdTweet());
	}
	
}
