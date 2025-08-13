package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.checkbox.Checkbox;

@Tag("vista-iniciarsesin")
@JsModule("./views/vista-iniciarsesin.ts")
public class VistaIniciarsesin extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("password")
	private PasswordField password;
	@Id("imagen")
	private Button imagen;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cancelar")
	private Button cancelar;
	@Id("usuario")
	private TextField usuario;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("iniciar")
	private Button iniciar;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("checkBoxAdmin")
	private Checkbox checkBoxAdmin;

	public VistaIniciarsesin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	
	
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Checkbox getCheckBoxAdmin() {
		return checkBoxAdmin;
	}

	public void setCheckBoxAdmin(Checkbox checkBoxAdmin) {
		this.checkBoxAdmin = checkBoxAdmin;
	}

	public Button getIniciar() {
		return iniciar;
	}

	public void setIniciar(Button iniciar) {
		this.iniciar = iniciar;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public Button getImagen() {
		return imagen;
	}

	public void setImagen(Button imagen) {
		this.imagen = imagen;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	public TextField getUsuario() {
		return usuario;
	}

	public void setUsuario(TextField usuario) {
		this.usuario = usuario;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

}