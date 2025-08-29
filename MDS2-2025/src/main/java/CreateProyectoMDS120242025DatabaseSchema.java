/**
 * Licensee: Daniel(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class CreateProyectoMDS120242025DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(ProyectoMDS120242025PersistentManager.instance());
			ProyectoMDS120242025PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
