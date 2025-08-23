package interfaz;

import vistas.VistaVercomentarionoregistrado;

public class VerComentarioNR extends VistaVercomentarionoregistrado 
{
//	public ListaComentariosNR_item _comentarioLista;
//	public VerPerfilNR _verPNR;
	public VerTweetNR _verTweetNR;
	
	public VerComentarioNR(){
	}
	
	public VerComentarioNR(VerTweetNR verTweetNR){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._verTweetNR = verTweetNR;
	}
}