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

public class MultimediaDAO {
	public static Multimedia loadMultimediaByORMID(long idMultimedia) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadMultimediaByORMID(session, idMultimedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(long idMultimedia) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getMultimediaByORMID(session, idMultimedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByORMID(long idMultimedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadMultimediaByORMID(session, idMultimedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(long idMultimedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getMultimediaByORMID(session, idMultimedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByORMID(PersistentSession session, long idMultimedia) throws PersistentException {
		try {
			return (Multimedia) session.load(Multimedia.class, Long.valueOf(idMultimedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(PersistentSession session, long idMultimedia) throws PersistentException {
		try {
			return (Multimedia) session.get(Multimedia.class, Long.valueOf(idMultimedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByORMID(PersistentSession session, long idMultimedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Multimedia) session.load(Multimedia.class, Long.valueOf(idMultimedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(PersistentSession session, long idMultimedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Multimedia) session.get(Multimedia.class, Long.valueOf(idMultimedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMultimedia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryMultimedia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMultimedia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryMultimedia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMultimedia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Multimedia as Multimedia");
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
	
	public static List queryMultimedia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Multimedia as Multimedia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Multimedia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMultimedia(session, condition, orderBy);
			return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMultimedia(session, condition, orderBy, lockMode);
			return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Multimedia[] multimedias = listMultimediaByQuery(session, condition, orderBy);
		if (multimedias != null && multimedias.length > 0)
			return multimedias[0];
		else
			return null;
	}
	
	public static Multimedia loadMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Multimedia[] multimedias = listMultimediaByQuery(session, condition, orderBy, lockMode);
		if (multimedias != null && multimedias.length > 0)
			return multimedias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Multimedia as Multimedia");
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
	
	public static java.util.Iterator iterateMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Multimedia as Multimedia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Multimedia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia createMultimedia() {
		return new Multimedia();
	}
	
	public static boolean save(Multimedia multimedia) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().saveObject(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Multimedia multimedia) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().deleteObject(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Multimedia multimedia)throws PersistentException {
		try {
			if (multimedia.getComentario() != null) {
				multimedia.getComentario().multimedia.remove(multimedia);
			}
			
			if (multimedia.getTweet() != null) {
				multimedia.getTweet().multimedia.remove(multimedia);
			}
			
			return delete(multimedia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Multimedia multimedia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (multimedia.getComentario() != null) {
				multimedia.getComentario().multimedia.remove(multimedia);
			}
			
			if (multimedia.getTweet() != null) {
				multimedia.getTweet().multimedia.remove(multimedia);
			}
			
			try {
				session.delete(multimedia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Multimedia multimedia) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().refresh(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Multimedia multimedia) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().evict(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByCriteria(MultimediaCriteria multimediaCriteria) {
		Multimedia[] multimedias = listMultimediaByCriteria(multimediaCriteria);
		if(multimedias == null || multimedias.length == 0) {
			return null;
		}
		return multimedias[0];
	}
	
	public static Multimedia[] listMultimediaByCriteria(MultimediaCriteria multimediaCriteria) {
		return multimediaCriteria.listMultimedia();
	}
}
