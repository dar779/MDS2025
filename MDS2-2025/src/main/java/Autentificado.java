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
@Table(name="Autentificado")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Autentificado")
public class Autentificado implements Serializable {
	public Autentificado() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Autentificado))
			return false;
		Autentificado autentificado = (Autentificado)aObj;
		if ((getLogin() != null && !getLogin().equals(autentificado.getLogin())) || (getLogin() == null && autentificado.getLogin() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getLogin() == null ? 0 : getLogin().hashCode());
		return hashcode;
	}
	
	@Column(name="Login", nullable=false, length=255)	
	@Id	
	private String login;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getORMID() {
		return getLogin();
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return String.valueOf(getLogin());
	}
	
}
