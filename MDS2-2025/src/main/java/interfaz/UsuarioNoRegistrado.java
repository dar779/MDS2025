package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import Package2.iACT01UsuarioNoRegistrado;

import vistas.VistaAct01usuarionoregistrado; 

public class UsuarioNoRegistrado extends VistaAct01usuarionoregistrado{
//	private Button _iniciarSesionB;
//	private Button _iniciarSesionGB;
//	private Button _registrarseB;
//	private Button _masUsuariosB;
//	private Button _masHashtagsB;
//	private Label _listaUL;
//	private Label _listaHL;
//	private Image _logoImg;
//	private Image _logoTextImg;
//	public iACT01UsuarioNoRegistrado _iACT01UsuarioNoRegistrado;
	public IniciarSesionGoogle _inSG;
	public Registrarse _registrarse;
	public ListaFijaUNR _listaFijaUNR;
	public RestablecerContrasenia _restablecerC;
	public ListaFijaHNR _listaFijaHNR;
	public IniciarSesion _inS;
	
	public VerticalLayout elverticallayout;
	
	public UsuarioNoRegistrado() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.elverticallayout = this.getVaadinVerticalLayout4().as(VerticalLayout.class);
		this.Botones();
	}
	
	public UsuarioNoRegistrado(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
		ListaUsuarios__Usuario_no_registrado_();
		ListaFijaHashtags__Usuario_no_registrado_();
	}

	public void ListaUsuarios__Usuario_no_registrado_() {
		this._listaFijaUNR = new ListaFijaUNR(this);
		this.getUsuarios().as(VerticalLayout.class).add(_listaFijaUNR);
	}
	
	public void ListaFijaHashtags__Usuario_no_registrado_() {
		this._listaFijaHNR = new ListaFijaHNR(this);
		this.getHashtags().as(VerticalLayout.class).add(_listaFijaHNR);
	}
	
	public void Botones() {
		
		this.getSesion().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new IniciarSesion(elverticallayout));
		});
		
		this.getGoogle().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new IniciarSesion(elverticallayout));
		});
		
		this.getRegistro().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new Registrarse(elverticallayout));
		});
		
		this.getMasHashtags().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaAmpliadaHashtagsNR(elverticallayout));
		});
		
		this.getMasUsuarios().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaAmpliadaUsNR(elverticallayout));
		});
	}

	public void IniciarSesion() {
		throw new UnsupportedOperationException();
	}

	public void IniciarSesionG() {
		throw new UnsupportedOperationException();
	}

	public void VerListaFijaHashtags() {
		throw new UnsupportedOperationException();
	}

	public void VerListaFijaUs() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse() {
		throw new UnsupportedOperationException();
	}

	public void RestablecerContrasenia() {
		throw new UnsupportedOperationException();
	}
}