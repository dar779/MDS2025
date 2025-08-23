package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import Package2.iACT02UsuarioRegistrado;

import vistas.VistaAct06sesininiciada;

public class UsuarioRegistrado extends VistaAct06sesininiciada {
//	private Label _recomendadoParaTiL;
//	private Button _tuPerfilB;
//	private Button _notificacionesB;
//	private Button _escribirB;
//	private Button _masUsB;
//	private Button _masHB;
//	private Image _notificacionesIcon;
//	private Image _logoImg;
//	private Image _logoTextImg;
//	public iACT02UsuarioRegistrado _iACT02UsuarioRegistrado;
//	public Listafijadeusuariosregistrado _listafijadeusuariosregistrado;
//	public Verpropioperfil _verpropioperfil;
	public EscribirTweet _escribirTweet;
//	public Vernotificaciones _vernotificaciones;
//	public ListaTyRNR _listaTyR;
//	public ListaFijaUR _listaFijaUSR;
//	public VerNotificaciones _verNUR;
//	public VerPerfilUR _perfilAjeno;
	public VerHashtagR _verHUR;
	
	public ListaFijaHUR _listaFijaHUR;
	public ListaFijaUR _listaFijaUR;
	public ListaFijaTyRA _listaFijaTyRA;
	
	public VerticalLayout elverticallayout;
	public boolean usuarioAdministrador = false;
	
	public UsuarioRegistrado(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
		ListaUsuarios__Usuario_registrado_();
		ListaFijaHashtags__Usuario_registrado_();
		ListaPublicaciones__Usuario_registrado_();
	}
	public void ListaUsuarios__Usuario_registrado_() {
		this._listaFijaUR = new ListaFijaUR(this);
		this.getUsuarios().as(VerticalLayout.class).add(_listaFijaUR);
	}
	
	public void ListaFijaHashtags__Usuario_registrado_() {
		this._listaFijaHUR = new ListaFijaHUR(this);
		this.getHashtags().as(VerticalLayout.class).add(_listaFijaHUR);
	}
	
	public void ListaPublicaciones__Usuario_registrado_() {
		this._listaFijaTyRA = new ListaFijaTyRA(this, false);
		this.getTweets().as(VerticalLayout.class).add(_listaFijaTyRA);
	}
	
	public void Botones() {
		getPerfil().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new VerPerfil(elverticallayout));
		});
		
		getCerrarSesion().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioNoRegistrado(elverticallayout));
		});
		
		getNotificacion().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaNotificaciones(elverticallayout));
		});
		
		getMasUsuarios().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaAmpliadaUR(elverticallayout));
		});
		
		getMasHashtags().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaAmpliadaHashtagsUR(elverticallayout));
		});
		
		getEscribir().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new EscribirTweet(elverticallayout));

		});
		
		getMasTweets().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaAmpliadaTyRA(elverticallayout, usuarioAdministrador));
		});
		
	}

	public void VerListaFijaUsuarios() {
		throw new UnsupportedOperationException();
	}

	public void VerListaFijaHashtags() {
		throw new UnsupportedOperationException();
	}

	public void VerPropioPerfil() {
		throw new UnsupportedOperationException();
	}

	public void EscribirTweet() {
		throw new UnsupportedOperationException();
	}

	public void VerNotificaciones() {
		throw new UnsupportedOperationException();
	}

	public void VerListaTweetsYRetweets() {
		throw new UnsupportedOperationException();
	}

	public void VerHashtag() {
		throw new UnsupportedOperationException();
	}

	public void VerUsuario() {
		throw new UnsupportedOperationException();
	}

	public void VerListaAmpliadaUsuarios() {
		throw new UnsupportedOperationException();
	}

	public void VerListaAmpliadaHashtags() {
		throw new UnsupportedOperationException();
	}

	public void VerTweet() {
		throw new UnsupportedOperationException();
	}

	public void VerRetweet() {
		throw new UnsupportedOperationException();
	}
}