package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistadeseguidosregistrado;

public class ListaSeguidosRegistrado extends VistaVerlistadeseguidosregistrado{
	
	public VerticalLayout elverticallayout;
	
	public ListaSeguidosRegistrado(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		
	}

}
