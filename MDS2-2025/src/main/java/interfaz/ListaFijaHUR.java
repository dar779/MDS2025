package interfaz;

import java.util.Vector;

import vistas.VistaListafijadehashtagsregistrado;

public class ListaFijaHUR extends VistaListafijadehashtagsregistrado 
{
	public UsuarioRegistrado _usuarioRegistrado;
//	public ListaAmpliadaHashtagsUR _listaAmpliadaHUR;
//	public Vector<ListaHashtagsUR_item> _item = new Vector<ListaHashtagsUR_item>();
	
	public ListaFijaHUR(){
	}
	
	public ListaFijaHUR(UsuarioRegistrado ur){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._usuarioRegistrado = ur;
	}
}