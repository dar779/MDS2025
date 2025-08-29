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
@Table(name="Multimedia")
public class Multimedia implements Serializable {
	public Multimedia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MULTIMEDIA_TWEET) {
			this.tweet = (Tweet) owner;
		}
		
		else if (key == ORMConstants.KEY_MULTIMEDIA_COMENTARIO) {
			this.comentario = (Comentario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdMultimedia", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="MULTIMEDIA_IDMULTIMEDIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MULTIMEDIA_IDMULTIMEDIA_GENERATOR", strategy="native")	
	private long idMultimedia;
	
	@ManyToOne(targetEntity=Comentario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ComentarioIdComentario", referencedColumnName="IdComentario", nullable=false) }, foreignKey=@ForeignKey(name="insertarMultimediaComentario"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Comentario comentario;
	
	@ManyToOne(targetEntity=Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetIdTweet", referencedColumnName="IdTweet", nullable=false) }, foreignKey=@ForeignKey(name="insertarMultimediaTweet"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Tweet tweet;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Enlace", nullable=true, length=255)	
	private String enlace;
	
	private void setIdMultimedia(long value) {
		this.idMultimedia = value;
	}
	
	public long getIdMultimedia() {
		return idMultimedia;
	}
	
	public long getORMID() {
		return getIdMultimedia();
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setEnlace(String value) {
		this.enlace = value;
	}
	
	public String getEnlace() {
		return enlace;
	}
	
	public void setTweet(Tweet value) {
		if (tweet != null) {
			tweet.multimedia.remove(this);
		}
		if (value != null) {
			value.multimedia.add(this);
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
	
	public void setComentario(Comentario value) {
		if (comentario != null) {
			comentario.multimedia.remove(this);
		}
		if (value != null) {
			value.multimedia.add(this);
		}
	}
	
	public Comentario getComentario() {
		return comentario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comentario(Comentario value) {
		this.comentario = value;
	}
	
	private Comentario getORM_Comentario() {
		return comentario;
	}
	
	public String toString() {
		return String.valueOf(getIdMultimedia());
	}
	
}
