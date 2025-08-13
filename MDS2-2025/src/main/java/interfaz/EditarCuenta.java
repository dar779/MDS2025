package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditarcuenta;

public class EditarCuenta extends VistaEditarcuenta{
//	private Event _eliminarCuentaE;
//	private Label _arrobaL;
//	private Label _nickL;
//	private Label _descripcionL;
//	private Label _fondoL;
//	private Label _fotoPerfilL;
//	private Label _previsualizacionL;
//	private Image _imagenPrevisualizacion;
//	private Event _errorEdicionE;
//	private Label _confirmacionEliminarL;
//	private Button _continuarB;
//	private Button _cancelarB;
//	private Button _eliminarCuentaB;
//	private Button _continuarPopUpB;
	private Object _cancelarPopUpB;
//	public VerPerfilUR _verPUR;
	
	public VerticalLayout elverticallayout;
	
	public EditarCuenta(VerticalLayout vl) {
		elverticallayout = vl;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Botones();
	}
	
	public void Botones() {
		
		getCambiarFoto().addClickListener(event -> {
			
		});
		
		getCambiarPassword().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new RestablecerContrasenia(elverticallayout));
		});
		
		getGuardar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new VerPerfil(elverticallayout));
		});
		
		getCancelar().addClickListener(event -> {
			elverticallayout.removeAll();
			elverticallayout.add(new VerPerfil(elverticallayout));
		});
	}

	public void ComprobarNoDuplicadoArrobaNick() {
		throw new UnsupportedOperationException();
	}

	public void Editar() {
		throw new UnsupportedOperationException();
	}

	public void EliminarCuenta() {
		throw new UnsupportedOperationException();
	}
}