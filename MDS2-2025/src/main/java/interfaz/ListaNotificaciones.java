package interfaz;

import vistas.VistaVernotificaciones;
import vistas.VistaListadenotificaciones;
import vistas.VistaVernotificacionesdemenciones;
import vistas.VistaVernotificacionesderetweets;
import vistas.VistaVernotificacionesseguimiento;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaNotificaciones extends VistaVernotificaciones
{
//	public VerNotificaciones _verNUR;
	public Vector<ListaNotificaciones_item> _item = new Vector<ListaNotificaciones_item>();
	
	public VerticalLayout elverticallayout;
	
	public ListaNotificaciones(VerticalLayout vl) {
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