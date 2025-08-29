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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(String login) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(String login) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, String login) throws PersistentException {
		try {
			return (Usuario) session.load(Usuario.class, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, String login) throws PersistentException {
		try {
			return (Usuario) session.get(Usuario.class, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(Usuario.class, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(Usuario.class, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS120242025PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new Usuario();
	}
	
	public static boolean save(Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Usuario usuario)throws PersistentException {
		try {
			if (usuario.getAdministrador() != null) {
				usuario.getAdministrador().usuarioAdmin.remove(usuario);
			}
			
			Usuario[] lUsuarioBloqueadors = usuario.usuarioBloqueador.toArray();
			for(int i = 0; i < lUsuarioBloqueadors.length; i++) {
				lUsuarioBloqueadors[i].usuarioBloqueante.remove(usuario);
			}
			Usuario[] lUsuarioSeguidos = usuario.usuarioSeguido.toArray();
			for(int i = 0; i < lUsuarioSeguidos.length; i++) {
				lUsuarioSeguidos[i].usuarioQueSigue.remove(usuario);
			}
			Comentario[] lComentarioGustados = usuario.comentarioGustado.toArray();
			for(int i = 0; i < lComentarioGustados.length; i++) {
				lComentarioGustados[i].usuariosAfines.remove(usuario);
			}
			Comentario[] lComentarioPublicados = usuario.comentarioPublicado.toArray();
			for(int i = 0; i < lComentarioPublicados.length; i++) {
				lComentarioPublicados[i].setUsuarioComentador(null);
			}
			Tweet[] lTweets = usuario.tweet.toArray();
			for(int i = 0; i < lTweets.length; i++) {
				lTweets[i].setUsuarioPublicador(null);
			}
			Usuario[] lUsuarioBloqueantes = usuario.usuarioBloqueante.toArray();
			for(int i = 0; i < lUsuarioBloqueantes.length; i++) {
				lUsuarioBloqueantes[i].usuarioBloqueador.remove(usuario);
			}
			Usuario[] lUsuarioQueSigues = usuario.usuarioQueSigue.toArray();
			for(int i = 0; i < lUsuarioQueSigues.length; i++) {
				lUsuarioQueSigues[i].usuarioSeguido.remove(usuario);
			}
			Tweet[] lRetweeteados = usuario.retweeteado.toArray();
			for(int i = 0; i < lRetweeteados.length; i++) {
				lRetweeteados[i].setUsuarioRetweet(null);
			}
			Tweet[] lTweetGustars = usuario.tweetGustar.toArray();
			for(int i = 0; i < lTweetGustars.length; i++) {
				lTweetGustars[i].usuarioAfines.remove(usuario);
			}
			if (usuario.getAdministradorBan() != null) {
				usuario.getAdministradorBan().usuario.remove(usuario);
			}
			
			Tweet[] lTweetMencions = usuario.tweetMencion.toArray();
			for(int i = 0; i < lTweetMencions.length; i++) {
				lTweetMencions[i].esMencionado.remove(usuario);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario.getAdministrador() != null) {
				usuario.getAdministrador().usuarioAdmin.remove(usuario);
			}
			
			Usuario[] lUsuarioBloqueadors = usuario.usuarioBloqueador.toArray();
			for(int i = 0; i < lUsuarioBloqueadors.length; i++) {
				lUsuarioBloqueadors[i].usuarioBloqueante.remove(usuario);
			}
			Usuario[] lUsuarioSeguidos = usuario.usuarioSeguido.toArray();
			for(int i = 0; i < lUsuarioSeguidos.length; i++) {
				lUsuarioSeguidos[i].usuarioQueSigue.remove(usuario);
			}
			Comentario[] lComentarioGustados = usuario.comentarioGustado.toArray();
			for(int i = 0; i < lComentarioGustados.length; i++) {
				lComentarioGustados[i].usuariosAfines.remove(usuario);
			}
			Comentario[] lComentarioPublicados = usuario.comentarioPublicado.toArray();
			for(int i = 0; i < lComentarioPublicados.length; i++) {
				lComentarioPublicados[i].setUsuarioComentador(null);
			}
			Tweet[] lTweets = usuario.tweet.toArray();
			for(int i = 0; i < lTweets.length; i++) {
				lTweets[i].setUsuarioPublicador(null);
			}
			Usuario[] lUsuarioBloqueantes = usuario.usuarioBloqueante.toArray();
			for(int i = 0; i < lUsuarioBloqueantes.length; i++) {
				lUsuarioBloqueantes[i].usuarioBloqueador.remove(usuario);
			}
			Usuario[] lUsuarioQueSigues = usuario.usuarioQueSigue.toArray();
			for(int i = 0; i < lUsuarioQueSigues.length; i++) {
				lUsuarioQueSigues[i].usuarioSeguido.remove(usuario);
			}
			Tweet[] lRetweeteados = usuario.retweeteado.toArray();
			for(int i = 0; i < lRetweeteados.length; i++) {
				lRetweeteados[i].setUsuarioRetweet(null);
			}
			Tweet[] lTweetGustars = usuario.tweetGustar.toArray();
			for(int i = 0; i < lTweetGustars.length; i++) {
				lTweetGustars[i].usuarioAfines.remove(usuario);
			}
			if (usuario.getAdministradorBan() != null) {
				usuario.getAdministradorBan().usuario.remove(usuario);
			}
			
			Tweet[] lTweetMencions = usuario.tweetMencion.toArray();
			for(int i = 0; i < lTweetMencions.length; i++) {
				lTweetMencions[i].esMencionado.remove(usuario);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS120242025PersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
