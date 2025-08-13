package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistaampliadadeusuarios;

public class ListaAmpliadaUsNR extends VistaVerlistaampliadadeusuarios 
{
	public ListaFijaUNR _listaFijaUNR;
//	public ListaUsuariosNR _listaUsNR;
	
	public VerticalLayout elverticallayout;
	
	public ListaAmpliadaUsNR(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		getVolver().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
	}
}