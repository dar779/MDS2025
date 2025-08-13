package interfaz;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciarsesin;

public class IniciarSesion extends VistaIniciarsesin{
//	private Event _mensajeErrorInicioSE;
//	private Label _errorCampoL;
//	private Event _contraseniaOlvidadaE;
//	private Label _recibirCorreoL;
//	private Button _continuarB;
//	private Event _reenviarCorreoE;
//	private Button _reenviarCorreoB;
//	private Label _nickOCorreoL;
//	private Label _contraseniaL;
//	private TextArea _nickTA;
//	private TextArea _contraseniaTA;
//	private Button _iniciarSesionGB;
//	private Button _iniciarSesionB;
//	private Button _registrarseB;
//	private Image _logoI;
//	private Label _hasOlvidadoL;
	public UsuarioNoRegistrado _usNR;
	public Registrarse _registrarse;
	public ACT05Google _google;
	public IniciarSesionGoogle _inSG;
	public SistemadeCorreo _sCorreo;

	public VerticalLayout elverticallayout;
	
	public IniciarSesion(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		
		getCancelar().addClickListener(event -> {
			
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
		getIniciar().addClickListener(event -> {

			elverticallayout.removeAll();
			
			if(getCheckBoxAdmin().getValue()) {
				elverticallayout.add(new Administrador(elverticallayout));
			}
			else {
				elverticallayout.add(new UsuarioRegistrado(elverticallayout));
			}
		});
	}
	
	public void ValidarDatos() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse() {
		throw new UnsupportedOperationException();
	}

	public void IniciarSesionG() {
		throw new UnsupportedOperationException();
	}

	public void ContraseniaOlvidada() {
		throw new UnsupportedOperationException();
	}

	public void IniciarSesion() {
		throw new UnsupportedOperationException();
	}
}