/**
 * Licensee: Daniel(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class DeleteProyectoMDS120242025Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ProyectoMDS120242025PersistentManager.instance().getSession().beginTransaction();
		try {
			Autentificado autentificado = AutentificadoDAO.loadAutentificadoByQuery(null, null);
			// Delete the persistent object
			AutentificadoDAO.delete(autentificado);
			Administrador administrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			AdministradorDAO.delete(administrador);
			Comentario comentario = ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			ComentarioDAO.delete(comentario);
			Hashtag hashtag = HashtagDAO.loadHashtagByQuery(null, null);
			// Delete the persistent object
			HashtagDAO.delete(hashtag);
			Tweet tweet = TweetDAO.loadTweetByQuery(null, null);
			// Delete the persistent object
			TweetDAO.delete(tweet);
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			UsuarioDAO.delete(usuario);
			Multimedia multimedia = MultimediaDAO.loadMultimediaByQuery(null, null);
			// Delete the persistent object
			MultimediaDAO.delete(multimedia);
			Baneo baneo = BaneoDAO.loadBaneoByQuery(null, null);
			// Delete the persistent object
			BaneoDAO.delete(baneo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoMDS120242025Data deleteProyectoMDS120242025Data = new DeleteProyectoMDS120242025Data();
			try {
				deleteProyectoMDS120242025Data.deleteTestData();
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
