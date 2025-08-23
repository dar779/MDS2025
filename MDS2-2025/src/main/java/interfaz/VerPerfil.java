package interfaz;

import vistas.VistaVerperfil;
import vistas.VistaAgrupartweets;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAgruparretweets;
import vistas.VistaAgrupartweetsgustados;
import vistas.VistaPerspectivabloqueado;
import vistas.VistaVerlistadeseguidoresregistrado;
import vistas.VistaVerlistadeseguidosregistrado;
import vistas.VistaVerlistaseguidosnoregistrado;

public class VerPerfil extends VistaVerperfil{
//	private Event _tweetsUsE;
//	private Event _tweetsGustadosE;
//	private Event _retweetsE;
//	private Image _fotoUs;
//	private Image _bannerUs;
//	private Label _nombreUs;
//	private Label _arrobaUsL;
//	private Label _nSeguidosL;
//	private Label _nSeguidosTextL;
//	private Label _nSeguidoresL;
//	private Label _nSeguidoresTextL;
//	private Label _fechaInicioL;
//	private TextArea _descripcionTA;
//	private Button _tweetsUsB;
//	private Button _tweetsGustadosB;
//	private Button _retweetsB;
	
	public VerticalLayout elverticallayout;
	
	public VerPerfil(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	// LOS BOTONES DE TWEETS, RETWEETS Y ME GUSTAS SE COGE LA INFORMACIÓN DIRECTAMENTE DESDE LA BASE DE DATOS
	// LAS RELACIONES DESEADAS PARA ESTOS SON "publicTweet", "retweetearTweet" y "gustarTweet"
	
	public void Botones() {

		getInicio().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new UsuarioRegistrado(elverticallayout));
		});
		
		getSeguidos().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaSeguidosRegistrado(elverticallayout));
			//elverticallayout.add(new ListaSeguidosNoRegistrado(elverticallayout));
		});
		
		getSeguidores().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new ListaSeguidoresRegistrados(elverticallayout));
			//elverticallayout.add(new ListaSeguidoresNoRegistrados(elverticallayout));
		});
		
		getEditar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new EditarCuenta(elverticallayout));
		});
		
		getSeguir().addClickListener(event -> {
		});
		
		getNoSeguir().addClickListener(event -> {
		});
		
		getBloquear().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new PerspectivaBloqueado(elverticallayout));
		});
		
		getTweets1().addClickListener(event -> {

		});
		
		getMeGustas().addClickListener(event -> {

		});
		
		getRetweets().addClickListener(event -> {

		});
		
	}
}