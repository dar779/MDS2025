package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRestablecercontrasea;

public class RestablecerContrasenia extends VistaRestablecercontrasea{
//	private Image _logo;
//	private Image _mensajeImg;
//	private Label _contraseniaL;
//	private TextArea _contraseniaTA;
//	private Event _errorRestablecimientoE;
//	private Label _errorRestablecimientoL;
//	private Button _continuarB;
	public UsuarioNoRegistrado _usNR;
	
	public VerticalLayout elverticallayout;
	
	public RestablecerContrasenia(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		
		getCancelar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioRegistrado(elverticallayout));
		});
		
		getAceptar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioRegistrado(elverticallayout));
			System.out.println("Nueva contrasena: " + getPassword().getValue());
		});
		
	}
}