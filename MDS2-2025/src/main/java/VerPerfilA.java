import interfaz.VerTweetA;
import interfaz.VerRetweetA;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.VerComentarioA;
import interfaz.VerPerfil;

public class VerPerfilA extends VerPerfilUsuarios {
//	private Button _eliminarPerfilB;
//	private Button _banearPerfilB;
//	private Event _eliminarPerfilE;
//	private Event _banearE;
//	private Label _popUpL;
//	private Button _cancelarB;
//	private Button _continuarB;
//	private Checkbox _indefinido;
//	private Calendar _calendarioC;
	public VerTweetA _verTA;
	public VerRetweetA _verRA;
	public VerComentarioA _verCA;
	public ListaTyRA _listaTyRA;
	
	public VerticalLayout elverticallayout;

	public VerPerfilA(VerticalLayout vl) {
		super(vl);
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {

	}
}