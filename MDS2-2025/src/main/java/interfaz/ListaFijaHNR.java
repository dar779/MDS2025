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
}