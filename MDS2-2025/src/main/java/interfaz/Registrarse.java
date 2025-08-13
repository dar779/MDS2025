package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse{
//	private Image _logo;
//	private Label _camposObligatoriosL;
//	private Label _crearCuentaL;
//	private Event _errorRegistroE;
//	private Label _errorRegistroL;
//	private Button _continuarErrorB;
//	private Label _nombreL;
//	private Label _apellidoL;
//	private Label _correoL;
//	private Label _nickL;
//	private Label _contraseniaL;
//	private Label _arrobaL;
//	private Label _fotoPerfilL;
//	private Label _previsualizacionFotoL;
//	private Label _fondoL;
//	private Label _previsualizacionFondoL;
//	private Label _descripcionL;
//	private TextArea _nombreTA;
//	private TextArea _apellidoTA;
//	private TextArea _correoTA;
//	private TextArea _nickTA;
//	private TextArea _contraseniaTA;
//	private TextArea _arrobaTA;
//	private TextArea _fotoPerfilTA;
//	private Image _preFotoImage;
//	private TextArea _fondoTA;
//	private Image _preFondoImage;
//	private TextArea _descripcionTA;
//	private Button _iniciarSesionGB;
//	private Button _registrarseB;
	public UsuarioNoRegistrado _usNR;
	public IniciarSesion _inS;
	public IntroducirCodigoVerificacion _introducirCV;
	
	public VerticalLayout elverticallayout;
	
	public Registrarse(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		getRegistrarse().addClickListener(event -> {			
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
		getCancelar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
	}

	public void ErrorRegistro() {
		throw new UnsupportedOperationException();
	}

	public void IntroducirCodigoVerificacion() {
		throw new UnsupportedOperationException();
	}

	public void IniciarSesionG() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse() {
		throw new UnsupportedOperationException();
	}

	public void ComprobarNoDuplicadoDatos() {
		throw new UnsupportedOperationException();
	}
}