package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistaampliadadetweetsadministrador;

public class ListaAmpliadaTyRA extends VistaVerlistaampliadadetweetsadministrador{
//	private Image _logo;
	public ListaFijaTyRA _listaFijaTyRA;
//	public ListaTyRA _listaTyRA;
	
	public VerticalLayout elverticallayout;
	public boolean usuarioAdministrador;
	
	public ListaAmpliadaTyRA(VerticalLayout vl, boolean administrador) {
		elverticallayout = vl;
		usuarioAdministrador = administrador;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {

		getVolver().addClickListener(event -> {
			elverticallayout.removeAll();
			if(usuarioAdministrador) {
				elverticallayout.add(new Administrador(elverticallayout));
			} else {
				elverticallayout.add(new UsuarioRegistrado(elverticallayout));
			}
		});
	}
}