package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistaseguidoresnoregistrado;

public class ListaSeguidoresNoRegistrados extends VistaVerlistaseguidoresnoregistrado {

	public VerticalLayout elverticallayout;
	
	public ListaSeguidoresNoRegistrados(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		getVolver().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new VerPerfil(elverticallayout));
		});	
	}
}
