package interfaz;

import java.util.Vector;

import vistas.VistaListafijadetweetsadministrador;

public class ListaFijaTyRA extends VistaListafijadetweetsadministrador{
	public Administrador _Administrador;
	public UsuarioRegistrado _UsuarioRegistrado;
//	public Vector<ListaTyRA_item> _item = new Vector<ListaTyRA_item>();
	public ListaAmpliadaTyRA _listaAmpliadaTyRA;
	public boolean usuarioAdministrador;
	
	public ListaFijaTyRA(){
	}
	
	public ListaFijaTyRA(Administrador admin, boolean usuarioAdmin){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._Administrador = admin;
	this.usuarioAdministrador = usuarioAdmin;
	}
	
	public ListaFijaTyRA(UsuarioRegistrado user, boolean usuarioAdmin){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._UsuarioRegistrado = user;
	this.usuarioAdministrador = usuarioAdmin;
	}
}