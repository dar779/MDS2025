package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTweetretweetnoregistrado;

public class VerTweetNR extends VistaTweetretweetnoregistrado 
{
	public ListaTyRNR_item _itemTyR;
//	public VerPerfilNR _verPNR;
//	public ListaComentariosNR _listaComentariosNR;
	public VerticalLayout elverticallayout;
	public VerComentarioNR _verComentarioNR;
	
	public VerTweetNR(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
		ListaComentarios();
	}
	
	public void ListaComentarios() {
		this._verComentarioNR = new VerComentarioNR(this);
		this.getComentarios().as(VerticalLayout.class).add(_verComentarioNR);
	}
	
	public void Botones() {
		getVolver().addClickListener(event -> {
			
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
	}
}