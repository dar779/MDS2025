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
@DiscriminatorValue("Administrador")
public class Administrador extends Autentificado implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_USUARIO) {
			return ORM_usuario;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_COMENTARIO) {
			return ORM_comentario;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_USUARIOADMIN) {
			return ORM_usuarioAdmin;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_TWEET) {
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
	
	@OneToMany(mappedBy="administradorBan", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentario = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarioAdmin = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tweet = new java.util.HashSet();
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final UsuarioSetCollection usuario = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_USUARIO, ORMConstants.KEY_USUARIO_ADMINISTRADORBAN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comentario(java.util.Set value) {
		this.ORM_comentario = value;
	}
	
	private java.util.Set getORM_Comentario() {
		return ORM_comentario;
	}
	
	@Transient	
	public final ComentarioSetCollection comentario = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_COMENTARIO, ORMConstants.KEY_COMENTARIO_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_UsuarioAdmin(java.util.Set value) {
		this.ORM_usuarioAdmin = value;
	}
	
	private java.util.Set getORM_UsuarioAdmin() {
		return ORM_usuarioAdmin;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarioAdmin = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_USUARIOADMIN, ORMConstants.KEY_USUARIO_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tweet(java.util.Set value) {
		this.ORM_tweet = value;
	}
	
	private java.util.Set getORM_Tweet() {
		return ORM_tweet;
	}
	
	@Transient	
	public final TweetSetCollection tweet = new TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_TWEET, ORMConstants.KEY_TWEET_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
