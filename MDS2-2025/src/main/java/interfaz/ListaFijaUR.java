package interfaz;

import vistas.VistaListafijadeusuariosregistrado;

public class ListaFijaUR extends VistaListafijadeusuariosregistrado {

	public UsuarioRegistrado _UsuarioRegistrado;
	//public Vector<ListaUR_item> _itemU = new Vector<ListaUR_item>();
	public ListaAmpliadaUR _listaAmpliadaUR;
	
	public ListaFijaUR(){
	}
	
	public ListaFijaUR(UsuarioRegistrado ur){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._UsuarioRegistrado = ur;
	}
	
}
