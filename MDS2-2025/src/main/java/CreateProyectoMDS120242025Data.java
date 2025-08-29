/**
 * Licensee: Daniel(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class CreateProyectoMDS120242025Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ProyectoMDS120242025PersistentManager.instance().getSession().beginTransaction();
		try {
			Autentificado autentificado = AutentificadoDAO.createAutentificado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login
			AutentificadoDAO.save(autentificado);
			Administrador administrador = AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			AdministradorDAO.save(administrador);
			Comentario comentario = ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : multimedia, usuarioComentador, nMeGusta, usuariosAfines, tweet
			ComentarioDAO.save(comentario);
			Hashtag hashtag = HashtagDAO.createHashtag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tweet, nComentarios, nombre
			HashtagDAO.save(hashtag);
			Tweet tweet = TweetDAO.createTweet();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : multimedia, retweet, esMencionado, comentario, hashtag, usuarioAfines, nComentarios, nRetweet, nMeGusta, usuarioPublicador, usuarioRetweet, tweet
			TweetDAO.save(tweet);
			Usuario usuario = UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tweetMencion, tweetGustar, retweeteado, usuarioQueSigue, usuarioBloqueante, tweet, comentarioPublicado, comentarioGustado, usuarioSeguido, usuarioBloqueador
			UsuarioDAO.save(usuario);
			Multimedia multimedia = MultimediaDAO.createMultimedia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tweet, comentario
			MultimediaDAO.save(multimedia);
			Baneo baneo = BaneoDAO.createBaneo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esIndefinido, nDiasBaneado
			BaneoDAO.save(baneo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoMDS120242025Data createProyectoMDS120242025Data = new CreateProyectoMDS120242025Data();
			try {
				createProyectoMDS120242025Data.createTestData();
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
