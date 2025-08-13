import interfaz.VerRetweetNR;
import interfaz.VerTweetNR;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.VerComentarioNR;
//import interfaz.ListaTyRNR;

public class VerPerfilNR extends VerPerfilUsuarios {
	public VerRetweetNR _verRNR;
	public VerTweetNR _verTNR;
	public ListaComentariosNR_item _listaComentariosNR;
	public ListaUsuariosNR_item _usuarioLista;
	public VerComentarioNR _verComentarioNR;
//	public ListaTyRNR _listaTNR;
	public VerListaSeguimientoNR _verListaSNR;
	
	public VerticalLayout elverticallayout;

	public VerPerfilNR(VerticalLayout vl) {
		super(vl);
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {

	}
}