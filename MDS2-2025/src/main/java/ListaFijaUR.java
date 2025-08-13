import interfaz.UsuarioRegistrado;
import interfaz.ListaAmpliadaUR;
import java.util.Vector;

public class ListaFijaUR extends ListaFija {
	public UsuarioRegistrado _usuarioRegistrado;
	public ListaAmpliadaUR _listaAmpliadaUR;
	public Vector<ListaUsR_item> _item = new Vector<ListaUsR_item>();
}