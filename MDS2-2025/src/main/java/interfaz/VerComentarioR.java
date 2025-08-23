package interfaz;

import vistas.VistaVercomentarioregistrado;

public class VerComentarioR extends VistaVercomentarioregistrado 
{
//	private Event _darMeGustaE;
//	private Event _quitarMeGustaE;
	private boolean _esMio;
//	private Checkbox _meGustaCB;
//	public ListaComentariosR_item _item;
//	public VerPerfilUR _verPUR;
	
	public VerTweetUR _verTweetUR;
	
	public VerComentarioR(){
	}
	
	public VerComentarioR(VerTweetUR verTweetUR){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._verTweetUR = verTweetUR;
	}
}