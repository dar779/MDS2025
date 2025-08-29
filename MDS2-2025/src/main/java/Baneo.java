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
@Table(name="Baneo")
public class Baneo implements Serializable {
	public Baneo() {
	}
	
	@Column(name="IdBaneo", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="BANEO_IDBANEO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BANEO_IDBANEO_GENERATOR", strategy="native")	
	private long idBaneo;
	
	@Column(name="NDiasBaneado", nullable=false, length=10)	
	private int nDiasBaneado;
	
	@Column(name="EsIndefinido", nullable=false, length=1)	
	private boolean esIndefinido;
	
	private void setIdBaneo(long value) {
		this.idBaneo = value;
	}
	
	public long getIdBaneo() {
		return idBaneo;
	}
	
	public long getORMID() {
		return getIdBaneo();
	}
	
	public void setnDiasBaneado(int value) {
		this.nDiasBaneado = value;
	}
	
	public int getnDiasBaneado() {
		return nDiasBaneado;
	}
	
	public void setEsIndefinido(boolean value) {
		this.esIndefinido = value;
	}
	
	public boolean getEsIndefinido() {
		return esIndefinido;
	}
	
	public String toString() {
		return String.valueOf(getIdBaneo());
	}
	
}
