package interfaz;

import vistas.VistaVercomentarioregistrado;

public class VerComentarioA extends VistaVercomentarioregistrado 
{
//	private Event _eliminarE;
//	private Button _cancelarB;
//	private Button _continuarB;
//	private Button _eliminarB;
//	private Label _eliminarL;
//	public ListaComentariosA_item _item;
//	public VerPerfilA _verPA;
	
	public VerTweetA _verTweetA;
	
	public VerComentarioA(){
	}
	
	public VerComentarioA(VerTweetA verTweetAd){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._verTweetA = verTweetAd;
	}
	
}