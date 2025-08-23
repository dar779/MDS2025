package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPublicacinvistaadministrador;

public class VerTweetA extends VistaPublicacinvistaadministrador 
{
//	private Event _eliminarE;
//	private Button _cancelarB;
//	private Button _continuarB;
//	private Button _eliminarB;
//	private Label _eliminarL;
//	public ListaTyRA_item _item;
//	public ListaComentariosA _listaCA;
//	public VerPerfilA _verPA;
	public VerticalLayout elverticallayout;
	public VerComentarioA _verComentarioA;
	
	public VerTweetA(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
		ListaComentarios();
	}
	
	public void ListaComentarios() {
		this._verComentarioA = new VerComentarioA(this);
		this.getComentarios().as(VerticalLayout.class).add(_verComentarioA);
	}
	
	public void Botones() {
		getInicio().addClickListener(event -> {
			
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
		getBorrar().addClickListener(event -> {

		});
		
		getBan().addClickListener(event -> {

		});
	}
	
}