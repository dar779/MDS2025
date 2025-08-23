package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.ListaHashtagsNR_item;

import vistas.VistaListafijadehashtagsnoregistrado;

public class ListaFijaHNR extends ListaHashtagsNR_item 
{
	public UsuarioNoRegistrado _usNR;
	public ListaAmpliadaHashtagsNR _listaAmpliadaHNR;
	public Vector<ListaHashtagsNR_item> _itemH = new Vector<ListaHashtagsNR_item>();
	
	public ListaFijaHNR(){
	}
	public ListaFijaHNR(UsuarioNoRegistrado unr){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._usNR = unr;
	}
}