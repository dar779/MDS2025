import interfaz.VerComentarioR;
import interfaz.VerRetweetUR;
import interfaz.UsuarioRegistrado;
import interfaz.VerTweetUR;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.EditarCuenta;

public class VerPerfilUR extends VerPerfilUsuarios {
//	private Event _seguirE;
//	private Event _bloquearE;
	private boolean _estoyBloqueado;
//	private Image _logoBloqueo;
//	private Label _infoBloqueoL;
	private boolean _esMiPerfil;
//	private Button _editarCuentaB;
//	private Button _bloquearB;
//	private Event _desbloquearE;
//	private Button _desbloquearB;
//	private Event _dejarSeguirE;
//	private Checkbox _seguirCB;
//	private Label _popUpBloqueoL;
//	private Button _continuarB;
//	private Button _cancelarB;
	public ListaUsR_item _usuarioLista;
	public VerComentarioR _verCUR;
	public VerRetweetUR _verRUR;
	public UsuarioRegistrado _usuarioRegistrado;
	public VerTweetUR _verTUR;
	public VerListaSeguimientoR _verListaSUR;
	public ListaTyRR _listaTyR;
	public EditarCuenta _editarCuenta;
	
	public VerticalLayout elverticallayout;

	public VerPerfilUR(VerticalLayout vl) {
		super(vl);
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {

	}

	public void EditarCuenta() {
		throw new UnsupportedOperationException();
	}

	public void AlternarBloqueo() {
		throw new UnsupportedOperationException();
	}

	public void VerTweet() {
		throw new UnsupportedOperationException();
	}
}