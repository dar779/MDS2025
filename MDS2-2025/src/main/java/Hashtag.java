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
@Table(name="Hashtag")
public class Hashtag implements Serializable {
	public Hashtag() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Hashtag))
			return false;
		Hashtag hashtag = (Hashtag)aObj;
		if ((getNombre() != null && !getNombre().equals(hashtag.getNombre())) || (getNombre() == null && hashtag.getNombre() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNombre() == null ? 0 : getNombre().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HASHTAG_TWEET) {
			return ORM_tweet;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Nombre", nullable=false, length=255)	
	@Id	
	private String nombre;
	
	@Column(name="NComentarios", nullable=false, length=10)	
	private int nComentarios;
	
	@ManyToMany(mappedBy="ORM_hashtag", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tweet = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getORMID() {
		return getNombre();
	}
	
	public void setnComentarios(int value) {
		this.nComentarios = value;
	}
	
	public int getnComentarios() {
		return nComentarios;
	}
	
	private void setORM_Tweet(java.util.Set value) {
		this.ORM_tweet = value;
	}
	
	private java.util.Set getORM_Tweet() {
		return ORM_tweet;
	}
	
	@Transient	
	public final TweetSetCollection tweet = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_HASHTAG_TWEET, ORMConstants.KEY_TWEET_HASHTAG, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getNombre());
	}
	
}
