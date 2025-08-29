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

public class BaneoDAO {
	public static Baneo loadBaneoByORMID(long idBaneo) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadBaneoByORMID(session, idBaneo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo getBaneoByORMID(long idBaneo) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getBaneoByORMID(session, idBaneo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByORMID(long idBaneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadBaneoByORMID(session, idBaneo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo getBaneoByORMID(long idBaneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getBaneoByORMID(session, idBaneo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByORMID(PersistentSession session, long idBaneo) throws PersistentException {
		try {
			return (Baneo) session.load(Baneo.class, Long.valueOf(idBaneo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo getBaneoByORMID(PersistentSession session, long idBaneo) throws PersistentException {
		try {
			return (Baneo) session.get(Baneo.class, Long.valueOf(idBaneo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByORMID(PersistentSession session, long idBaneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Baneo) session.load(Baneo.class, Long.valueOf(idBaneo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo getBaneoByORMID(PersistentSession session, long idBaneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Baneo) session.get(Baneo.class, Long.valueOf(idBaneo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBaneo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryBaneo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBaneo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryBaneo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo[] listBaneoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listBaneoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo[] listBaneoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listBaneoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBaneo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Baneo as Baneo");
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
	
	public static List queryBaneo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Baneo as Baneo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Baneo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo[] listBaneoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBaneo(session, condition, orderBy);
			return (Baneo[]) list.toArray(new Baneo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo[] listBaneoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBaneo(session, condition, orderBy, lockMode);
			return (Baneo[]) list.toArray(new Baneo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadBaneoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadBaneoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Baneo[] baneos = listBaneoByQuery(session, condition, orderBy);
		if (baneos != null && baneos.length > 0)
			return baneos[0];
		else
			return null;
	}
	
	public static Baneo loadBaneoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Baneo[] baneos = listBaneoByQuery(session, condition, orderBy, lockMode);
		if (baneos != null && baneos.length > 0)
			return baneos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBaneoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateBaneoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBaneoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateBaneoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBaneoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Baneo as Baneo");
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
	
	public static java.util.Iterator iterateBaneoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Baneo as Baneo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Baneo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo createBaneo() {
		return new Baneo();
	}
	
	public static boolean save(Baneo baneo) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().saveObject(baneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Baneo baneo) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().deleteObject(baneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Baneo baneo) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().refresh(baneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Baneo baneo) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().evict(baneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Baneo loadBaneoByCriteria(BaneoCriteria baneoCriteria) {
		Baneo[] baneos = listBaneoByCriteria(baneoCriteria);
		if(baneos == null || baneos.length == 0) {
			return null;
		}
		return baneos[0];
	}
	
	public static Baneo[] listBaneoByCriteria(BaneoCriteria baneoCriteria) {
		return baneoCriteria.listBaneo();
	}
}
