/**
 * Licensee: Daniel(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class ListProyectoMDS120242025Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Autentificado...");
		Autentificado[] autentificados = AutentificadoDAO.listAutentificadoByQuery(null, null);
		int length = Math.min(autentificados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(autentificados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		Administrador[] administradors = AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(administradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(administradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		Comentario[] comentarios = ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(comentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hashtag...");
		Hashtag[] hashtags = HashtagDAO.listHashtagByQuery(null, null);
		length = Math.min(hashtags.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(hashtags[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tweet...");
		Tweet[] tweets = TweetDAO.listTweetByQuery(null, null);
		length = Math.min(tweets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tweets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		Usuario[] usuarios = UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(usuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(usuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Multimedia...");
		Multimedia[] multimedias = MultimediaDAO.listMultimediaByQuery(null, null);
		length = Math.min(multimedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(multimedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Baneo...");
		Baneo[] baneos = BaneoDAO.listBaneoByQuery(null, null);
		length = Math.min(baneos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baneos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Autentificado by Criteria...");
		AutentificadoCriteria autentificadoCriteria = new AutentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//autentificadoCriteria.login.eq();
		autentificadoCriteria.setMaxResults(ROW_COUNT);
		Autentificado[] autentificados = autentificadoCriteria.listAutentificado();
		int length =autentificados== null ? 0 : Math.min(autentificados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(autentificados[i]);
		}
		System.out.println(length + " Autentificado record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		AdministradorCriteria administradorCriteria = new AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//administradorCriteria.login.eq();
		administradorCriteria.setMaxResults(ROW_COUNT);
		Administrador[] administradors = administradorCriteria.listAdministrador();
		length =administradors== null ? 0 : Math.min(administradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(administradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		ComentarioCriteria comentarioCriteria = new ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//comentarioCriteria.idComentario.eq();
		comentarioCriteria.setMaxResults(ROW_COUNT);
		Comentario[] comentarios = comentarioCriteria.listComentario();
		length =comentarios== null ? 0 : Math.min(comentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Hashtag by Criteria...");
		HashtagCriteria hashtagCriteria = new HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//hashtagCriteria.nombre.eq();
		hashtagCriteria.setMaxResults(ROW_COUNT);
		Hashtag[] hashtags = hashtagCriteria.listHashtag();
		length =hashtags== null ? 0 : Math.min(hashtags.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(hashtags[i]);
		}
		System.out.println(length + " Hashtag record(s) retrieved."); 
		
		System.out.println("Listing Tweet by Criteria...");
		TweetCriteria tweetCriteria = new TweetCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tweetCriteria.idTweet.eq();
		tweetCriteria.setMaxResults(ROW_COUNT);
		Tweet[] tweets = tweetCriteria.listTweet();
		length =tweets== null ? 0 : Math.min(tweets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tweets[i]);
		}
		System.out.println(length + " Tweet record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//usuarioCriteria.login.eq();
		usuarioCriteria.setMaxResults(ROW_COUNT);
		Usuario[] usuarios = usuarioCriteria.listUsuario();
		length =usuarios== null ? 0 : Math.min(usuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(usuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Multimedia by Criteria...");
		MultimediaCriteria multimediaCriteria = new MultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//multimediaCriteria.idMultimedia.eq();
		multimediaCriteria.setMaxResults(ROW_COUNT);
		Multimedia[] multimedias = multimediaCriteria.listMultimedia();
		length =multimedias== null ? 0 : Math.min(multimedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(multimedias[i]);
		}
		System.out.println(length + " Multimedia record(s) retrieved."); 
		
		System.out.println("Listing Baneo by Criteria...");
		BaneoCriteria baneoCriteria = new BaneoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baneoCriteria.idBaneo.eq();
		baneoCriteria.setMaxResults(ROW_COUNT);
		Baneo[] baneos = baneoCriteria.listBaneo();
		length =baneos== null ? 0 : Math.min(baneos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baneos[i]);
		}
		System.out.println(length + " Baneo record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoMDS120242025Data listProyectoMDS120242025Data = new ListProyectoMDS120242025Data();
			try {
				listProyectoMDS120242025Data.listTestData();
				//listProyectoMDS120242025Data.listByCriteria();
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
