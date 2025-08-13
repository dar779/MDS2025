package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistaampliadadeusuarios;

public class ListaAmpliadaUR extends VistaVerlistaampliadadeusuarios 
{
//	public ListaFijaUR _listaFijaUR;
//	public ListaUsR _listaUR;
	
	public VerticalLayout elverticallayout;
	
	public ListaAmpliadaUR(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		getVolver().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioRegistrado(elverticallayout));
		});
		
	}
	
}