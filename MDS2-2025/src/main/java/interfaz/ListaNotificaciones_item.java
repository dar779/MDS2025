package interfaz;

import vistas.VistaVernotificaciones;
import vistas.VistaListadenotificaciones;
import vistas.VistaVernotificacionesdemenciones;
import vistas.VistaVernotificacionesderetweets;
import vistas.VistaVernotificacionesseguimiento;

public class ListaNotificaciones_item extends VistaVernotificaciones{
//	private TextArea _descripcionTA;
//	private Checkbox _vistoCB;
//	private Event _marcarVistoE;
	public ListaNotificaciones _listaNotificaciones;
	
	public ListaNotificaciones_item(ListaNotificaciones listaNotificaciones) {
		_listaNotificaciones = listaNotificaciones;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}