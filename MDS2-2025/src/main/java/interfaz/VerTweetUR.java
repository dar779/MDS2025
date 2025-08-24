package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTweetretweetregistrado;

public class VerTweetUR extends VistaTweetretweetregistrado 
{
//	private Event _darMeGustaE;
//	private Event _quitarMeGustaE;
	private boolean _esMio;
//	private Checkbox _meGustaCB;
//	private Button _retweetB;
//	private Button _escribirComentarioB;
//	public ListaTyRR_item _item;
//	public ListaComentariosR _listaCUR;
//	public EscribirComentario _escribirC;
//	public EscribirRetweet _escribirR;
//	public VerPerfilUR _verPUR;
	public VerticalLayout elverticallayout;
	public VerComentarioR _verComentarioR;
	
	public VerTweetUR(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
		ListaComentarios();
	}
	
	public void ListaComentarios() {
		this._verComentarioR = new VerComentarioR(this);
		this.getComentarios().as(VerticalLayout.class).add(_verComentarioR);
	}
	
	public void Botones() {
		getVolver().addClickListener(event -> {
			
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
		getMeGusta().addClickListener(event -> {

		});
		
		getReTweet().addClickListener(event -> {

		});
	}


	public void DarRetweet() {
		throw new UnsupportedOperationException();
	}

	public void EscribirComentario() {
		throw new UnsupportedOperationException();
	}

	public void VerComentario() {
		throw new UnsupportedOperationException();
	}
	
}