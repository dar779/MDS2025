package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistaampliadadehashtags;

public class ListaAmpliadaHashtagsNR extends VistaVerlistaampliadadehashtags 
{
	public ListaFijaHNR _listaFijaHNR;
	public ListaHashtagsNR _listaHNR;
	
	public VerticalLayout elverticallayout;
	
	public ListaAmpliadaHashtagsNR(VerticalLayout vl) {
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