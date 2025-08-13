package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPerspectivabloqueado;

public class PerspectivaBloqueado extends VistaPerspectivabloqueado {

	public VerticalLayout elverticallayout;
	
	public PerspectivaBloqueado(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		
	}

}
