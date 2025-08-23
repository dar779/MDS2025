package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListafijadeusuariosnoregistrado;

public class ListaFijaUNR extends VistaListafijadeusuariosnoregistrado 
{
	public UsuarioNoRegistrado _usNR;
//	public verPerfilNR _verPerfilNR;
	public ListaAmpliadaUsNR _listaAmpliadaUsNR;
//	public Vector<ListaUsuariosNR_item> _item = new Vector<ListaUsuariosNR_item>();
	
	public ListaFijaUNR(){
	}
	public ListaFijaUNR(UsuarioNoRegistrado unr){
	this.getStyle().set("width", "100%");
	this.getStyle().set("height", "100%");
	this._usNR = unr;
	//cargarPublicacionesUNR();
	}
	
	/*public void cargarPublicacionesUNR() {
	    List<UsuarioRegistrado> lista = bd.cargarUsuariosUNR();
	    List<Publicacion> publicacionesComerciales = this.bd.cargarPubliacionesComerciales();

	    this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
	    _item.clear();

	    if (lista != null) {
	        List<Publicacion> publicacionesUsuarios = new ArrayList<>();
	        for (UsuarioRegistrado u : lista) {
	            if (u.getPrivacidad() != 1) {
	                publicacionesUsuarios.addAll(u.publica.getCollection());
	            }
	        }

	        int i = 0, j = 0;
	        while (i < publicacionesUsuarios.size() || j < publicacionesComerciales.size()) {
	            if (i < publicacionesUsuarios.size()) {
	                Publicacion pub = publicacionesUsuarios.get(i++);
	                this.publicacion = new Lista_Publicaciones_Usuario_no_registrado_item(pub, this);  
	                this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
	                _item.add(this.publicacion);
	            }

	            if (j < publicacionesComerciales.size()) {
	                Publicacion pubComercial = publicacionesComerciales.get(j++);
	                this.publicacion = new Lista_Publicaciones_Usuario_no_registrado_item(pubComercial, this);  
	                this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
	                _item.add(this.publicacion);
	            }
	        }
	    }
	}*/
}