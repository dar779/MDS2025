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

public class HashtagDAO {
	public static Hashtag loadHashtagByORMID(String nombre) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadHashtagByORMID(session, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(String nombre) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getHashtagByORMID(session, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByORMID(String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadHashtagByORMID(session, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getHashtagByORMID(session, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByORMID(PersistentSession session, String nombre) throws PersistentException {
		try {
			return (Hashtag) session.load(Hashtag.class, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(PersistentSession session, String nombre) throws PersistentException {
		try {
			return (Hashtag) session.get(Hashtag.class, nombre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByORMID(PersistentSession session, String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hashtag) session.load(Hashtag.class, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(PersistentSession session, String nombre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hashtag) session.get(Hashtag.class, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHashtag(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryHashtag(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHashtag(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryHashtag(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listHashtagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listHashtagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHashtag(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Hashtag as Hashtag");
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
	
	public static List queryHashtag(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Hashtag as Hashtag");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hashtag", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHashtag(session, condition, orderBy);
			return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHashtag(session, condition, orderBy, lockMode);
			return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadHashtagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadHashtagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hashtag[] hashtags = listHashtagByQuery(session, condition, orderBy);
		if (hashtags != null && hashtags.length > 0)
			return hashtags[0];
		else
			return null;
	}
	
	public static Hashtag loadHashtagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hashtag[] hashtags = listHashtagByQuery(session, condition, orderBy, lockMode);
		if (hashtags != null && hashtags.length > 0)
			return hashtags[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHashtagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateHashtagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHashtagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateHashtagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHashtagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Hashtag as Hashtag");
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
	
	public static java.util.Iterator iterateHashtagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Hashtag as Hashtag");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hashtag", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag createHashtag() {
		return new Hashtag();
	}
	
	public static boolean save(Hashtag hashtag) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().saveObject(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Hashtag hashtag) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().deleteObject(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Hashtag hashtag)throws PersistentException {
		try {
			Tweet[] lTweets = hashtag.tweet.toArray();
			for(int i = 0; i < lTweets.length; i++) {
				lTweets[i].hashtag.remove(hashtag);
			}
			return delete(hashtag);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Hashtag hashtag, org.orm.PersistentSession session)throws PersistentException {
		try {
			Tweet[] lTweets = hashtag.tweet.toArray();
			for(int i = 0; i < lTweets.length; i++) {
				lTweets[i].hashtag.remove(hashtag);
			}
			try {
				session.delete(hashtag);
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
	
	public static boolean refresh(Hashtag hashtag) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().refresh(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Hashtag hashtag) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().evict(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByCriteria(HashtagCriteria hashtagCriteria) {
		Hashtag[] hashtags = listHashtagByCriteria(hashtagCriteria);
		if(hashtags == null || hashtags.length == 0) {
			return null;
		}
		return hashtags[0];
	}
	
	public static Hashtag[] listHashtagByCriteria(HashtagCriteria hashtagCriteria) {
		return hashtagCriteria.listHashtag();
	}
}
