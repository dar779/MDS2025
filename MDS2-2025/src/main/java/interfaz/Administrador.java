package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import mds2.MainView;
import vistas.VistaListafijadetweetsadministrador;

public class Administrador extends VistaListafijadetweetsadministrador {
	public iAdministrador _iAdministrador = new BDPrincipal();
//	public ListaAdministrador _listaAdministrador;
	public VerticalLayout elverticallayout;
	public boolean usuarioAdministrador = true;
	public ListaFijaTyRA _listaFijaTyRA;
	
	public Administrador(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
		ListaPublicacionesAdministrador();
	}
	
	public void ListaPublicacionesAdministrador() {
		this._listaFijaTyRA = new ListaFijaTyRA(this, true);
		this.getLista().as(VerticalLayout.class).add(_listaFijaTyRA);
	}
	
	public void Botones() {
		getCerrarSesion().addClickListener(event -> {
			
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
		getMasTweets().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaAmpliadaTyRA(elverticallayout, usuarioAdministrador));
		});
	}

	public void ListaAdministrador() {
//		_listaAdministrador = new ListaAdministrador(this);
//		this.getContenido().as(VerticalLayout.class).add(_listaAdministrador);
	}
}