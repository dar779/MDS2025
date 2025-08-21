package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistadeseguidoresregistrado;

public class ListaSeguidoresRegistrados extends VistaVerlistadeseguidoresregistrado{

	public VerticalLayout elverticallayout;
	
	public ListaSeguidoresRegistrados(VerticalLayout vl) {
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
