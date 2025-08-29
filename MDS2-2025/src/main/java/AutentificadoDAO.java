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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AutentificadoDAO {
	public static Autentificado loadAutentificadoByORMID(String login) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadAutentificadoByORMID(session, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado getAutentificadoByORMID(String login) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getAutentificadoByORMID(session, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByORMID(String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadAutentificadoByORMID(session, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado getAutentificadoByORMID(String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getAutentificadoByORMID(session, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByORMID(PersistentSession session, String login) throws PersistentException {
		try {
			return (Autentificado) session.load(Autentificado.class, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado getAutentificadoByORMID(PersistentSession session, String login) throws PersistentException {
		try {
			return (Autentificado) session.get(Autentificado.class, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByORMID(PersistentSession session, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autentificado) session.load(Autentificado.class, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado getAutentificadoByORMID(PersistentSession session, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autentificado) session.get(Autentificado.class, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryAutentificado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryAutentificado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado[] listAutentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listAutentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado[] listAutentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listAutentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Autentificado as Autentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Autentificado as Autentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autentificado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado[] listAutentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAutentificado(session, condition, orderBy);
			return (Autentificado[]) list.toArray(new Autentificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado[] listAutentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAutentificado(session, condition, orderBy, lockMode);
			return (Autentificado[]) list.toArray(new Autentificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadAutentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadAutentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autentificado[] autentificados = listAutentificadoByQuery(session, condition, orderBy);
		if (autentificados != null && autentificados.length > 0)
			return autentificados[0];
		else
			return null;
	}
	
	public static Autentificado loadAutentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autentificado[] autentificados = listAutentificadoByQuery(session, condition, orderBy, lockMode);
		if (autentificados != null && autentificados.length > 0)
			return autentificados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAutentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateAutentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateAutentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Autentificado as Autentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Autentificado as Autentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autentificado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado createAutentificado() {
		return new Autentificado();
	}
	
	public static boolean save(Autentificado autentificado) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().saveObject(autentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Autentificado autentificado) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().deleteObject(autentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Autentificado autentificado) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().refresh(autentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Autentificado autentificado) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().evict(autentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificado loadAutentificadoByCriteria(AutentificadoCriteria autentificadoCriteria) {
		Autentificado[] autentificados = listAutentificadoByCriteria(autentificadoCriteria);
		if(autentificados == null || autentificados.length == 0) {
			return null;
		}
		return autentificados[0];
	}
	
	public static Autentificado[] listAutentificadoByCriteria(AutentificadoCriteria autentificadoCriteria) {
		return autentificadoCriteria.listAutentificado();
	}
}
