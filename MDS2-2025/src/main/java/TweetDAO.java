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

public class TweetDAO {
	public static Tweet loadTweetByORMID(long idTweet) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadTweetByORMID(session, idTweet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(long idTweet) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getTweetByORMID(session, idTweet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(long idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadTweetByORMID(session, idTweet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(long idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getTweetByORMID(session, idTweet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(PersistentSession session, long idTweet) throws PersistentException {
		try {
			return (Tweet) session.load(Tweet.class, Long.valueOf(idTweet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(PersistentSession session, long idTweet) throws PersistentException {
		try {
			return (Tweet) session.get(Tweet.class, Long.valueOf(idTweet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(PersistentSession session, long idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tweet) session.load(Tweet.class, Long.valueOf(idTweet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(PersistentSession session, long idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tweet) session.get(Tweet.class, Long.valueOf(idTweet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryTweet(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryTweet(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tweet as Tweet");
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
	
	public static List queryTweet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tweet as Tweet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tweet", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTweet(session, condition, orderBy);
			return (Tweet[]) list.toArray(new Tweet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTweet(session, condition, orderBy, lockMode);
			return (Tweet[]) list.toArray(new Tweet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tweet[] tweets = listTweetByQuery(session, condition, orderBy);
		if (tweets != null && tweets.length > 0)
			return tweets[0];
		else
			return null;
	}
	
	public static Tweet loadTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tweet[] tweets = listTweetByQuery(session, condition, orderBy, lockMode);
		if (tweets != null && tweets.length > 0)
			return tweets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tweet as Tweet");
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
	
	public static java.util.Iterator iterateTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tweet as Tweet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tweet", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet createTweet() {
		return new Tweet();
	}
	
	public static boolean save(Tweet tweet) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().saveObject(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Tweet tweet) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().deleteObject(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Tweet tweet)throws PersistentException {
		try {
			if (tweet.getTweet() != null) {
				tweet.getTweet().retweet.remove(tweet);
			}
			
			if (tweet.getAdministrador() != null) {
				tweet.getAdministrador().tweet.remove(tweet);
			}
			
			if (tweet.getUsuarioRetweet() != null) {
				tweet.getUsuarioRetweet().retweeteado.remove(tweet);
			}
			
			if (tweet.getUsuarioPublicador() != null) {
				tweet.getUsuarioPublicador().tweet.remove(tweet);
			}
			
			Usuario[] lUsuarioAfiness = tweet.usuarioAfines.toArray();
			for(int i = 0; i < lUsuarioAfiness.length; i++) {
				lUsuarioAfiness[i].tweetGustar.remove(tweet);
			}
			Hashtag[] lHashtags = tweet.hashtag.toArray();
			for(int i = 0; i < lHashtags.length; i++) {
				lHashtags[i].tweet.remove(tweet);
			}
			Comentario[] lComentarios = tweet.comentario.toArray();
			for(int i = 0; i < lComentarios.length; i++) {
				lComentarios[i].setTweet(null);
			}
			Usuario[] lEsMencionados = tweet.esMencionado.toArray();
			for(int i = 0; i < lEsMencionados.length; i++) {
				lEsMencionados[i].tweetMencion.remove(tweet);
			}
			Tweet[] lRetweets = tweet.retweet.toArray();
			for(int i = 0; i < lRetweets.length; i++) {
				lRetweets[i].setTweet(null);
			}
			Multimedia[] lMultimedias = tweet.multimedia.toArray();
			for(int i = 0; i < lMultimedias.length; i++) {
				lMultimedias[i].setTweet(null);
			}
			return delete(tweet);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Tweet tweet, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tweet.getTweet() != null) {
				tweet.getTweet().retweet.remove(tweet);
			}
			
			if (tweet.getAdministrador() != null) {
				tweet.getAdministrador().tweet.remove(tweet);
			}
			
			if (tweet.getUsuarioRetweet() != null) {
				tweet.getUsuarioRetweet().retweeteado.remove(tweet);
			}
			
			if (tweet.getUsuarioPublicador() != null) {
				tweet.getUsuarioPublicador().tweet.remove(tweet);
			}
			
			Usuario[] lUsuarioAfiness = tweet.usuarioAfines.toArray();
			for(int i = 0; i < lUsuarioAfiness.length; i++) {
				lUsuarioAfiness[i].tweetGustar.remove(tweet);
			}
			Hashtag[] lHashtags = tweet.hashtag.toArray();
			for(int i = 0; i < lHashtags.length; i++) {
				lHashtags[i].tweet.remove(tweet);
			}
			Comentario[] lComentarios = tweet.comentario.toArray();
			for(int i = 0; i < lComentarios.length; i++) {
				lComentarios[i].setTweet(null);
			}
			Usuario[] lEsMencionados = tweet.esMencionado.toArray();
			for(int i = 0; i < lEsMencionados.length; i++) {
				lEsMencionados[i].tweetMencion.remove(tweet);
			}
			Tweet[] lRetweets = tweet.retweet.toArray();
			for(int i = 0; i < lRetweets.length; i++) {
				lRetweets[i].setTweet(null);
			}
			Multimedia[] lMultimedias = tweet.multimedia.toArray();
			for(int i = 0; i < lMultimedias.length; i++) {
				lMultimedias[i].setTweet(null);
			}
			try {
				session.delete(tweet);
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
	
	public static boolean refresh(Tweet tweet) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().refresh(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Tweet tweet) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().evict(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByCriteria(TweetCriteria tweetCriteria) {
		Tweet[] tweets = listTweetByCriteria(tweetCriteria);
		if(tweets == null || tweets.length == 0) {
			return null;
		}
		return tweets[0];
	}
	
	public static Tweet[] listTweetByCriteria(TweetCriteria tweetCriteria) {
		return tweetCriteria.listTweet();
	}
}
