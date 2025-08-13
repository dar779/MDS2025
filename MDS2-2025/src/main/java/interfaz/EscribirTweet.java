package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEscribirgeneral;

public class EscribirTweet extends VistaEscribirgeneral 
{
	public UsuarioRegistrado _usuarioRegistrado;
	
	public VerticalLayout elverticallayout;
	
	public EscribirTweet(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		
		getTwittear().addClickListener(event -> {
			// Aquí se implementaría la lógica para enviar el tweet
			System.out.println("Tweet enviado: " + getTexto().getValue());
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioRegistrado(elverticallayout));
		});
		
		getCancelar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioRegistrado(elverticallayout));
		});

	}
}