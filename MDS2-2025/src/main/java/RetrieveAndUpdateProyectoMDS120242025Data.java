/**
 * Licensee: Daniel(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateProyectoMDS120242025Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ProyectoMDS120242025PersistentManager.instance().getSession().beginTransaction();
		try {
			Autentificado autentificado = AutentificadoDAO.loadAutentificadoByQuery(null, null);
			// Update the properties of the persistent object
			AutentificadoDAO.save(autentificado);
			Administrador administrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			AdministradorDAO.save(administrador);
			Comentario comentario = ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			ComentarioDAO.save(comentario);
			Hashtag hashtag = HashtagDAO.loadHashtagByQuery(null, null);
			// Update the properties of the persistent object
			HashtagDAO.save(hashtag);
			Tweet tweet = TweetDAO.loadTweetByQuery(null, null);
			// Update the properties of the persistent object
			TweetDAO.save(tweet);
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			UsuarioDAO.save(usuario);
			Multimedia multimedia = MultimediaDAO.loadMultimediaByQuery(null, null);
			// Update the properties of the persistent object
			MultimediaDAO.save(multimedia);
			Baneo baneo = BaneoDAO.loadBaneoByQuery(null, null);
			// Update the properties of the persistent object
			BaneoDAO.save(baneo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Autentificado by AutentificadoCriteria");
		AutentificadoCriteria autentificadoCriteria = new AutentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//autentificadoCriteria.login.eq();
		System.out.println(autentificadoCriteria.uniqueAutentificado());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		AdministradorCriteria administradorCriteria = new AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//administradorCriteria.login.eq();
		System.out.println(administradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		ComentarioCriteria comentarioCriteria = new ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//comentarioCriteria.idComentario.eq();
		System.out.println(comentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Hashtag by HashtagCriteria");
		HashtagCriteria hashtagCriteria = new HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//hashtagCriteria.nombre.eq();
		System.out.println(hashtagCriteria.uniqueHashtag());
		
		System.out.println("Retrieving Tweet by TweetCriteria");
		TweetCriteria tweetCriteria = new TweetCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tweetCriteria.idTweet.eq();
		System.out.println(tweetCriteria.uniqueTweet());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//usuarioCriteria.login.eq();
		System.out.println(usuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Multimedia by MultimediaCriteria");
		MultimediaCriteria multimediaCriteria = new MultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//multimediaCriteria.idMultimedia.eq();
		System.out.println(multimediaCriteria.uniqueMultimedia());
		
		System.out.println("Retrieving Baneo by BaneoCriteria");
		BaneoCriteria baneoCriteria = new BaneoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baneoCriteria.idBaneo.eq();
		System.out.println(baneoCriteria.uniqueBaneo());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoMDS120242025Data retrieveAndUpdateProyectoMDS120242025Data = new RetrieveAndUpdateProyectoMDS120242025Data();
			try {
				retrieveAndUpdateProyectoMDS120242025Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoMDS120242025Data.retrieveByCriteria();
			}
			finally {
				ProyectoMDS120242025PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
