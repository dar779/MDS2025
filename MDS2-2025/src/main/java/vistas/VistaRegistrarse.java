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

@Tag("vista-registrarse")
@JsModule("./views/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("foto")
	private Button foto;
	@Id("user")
	private TextField user;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("password")
	private PasswordField password;
	@Id("repeatPassword")
	private PasswordField repeatPassword;
	@Id("registrarse")
	private Button registrarse;
	@Id("cancelar")
	private Button cancelar;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;

	public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
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

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Button getFoto() {
		return foto;
	}

	public void setFoto(Button foto) {
		this.foto = foto;
	}

	public TextField getUser() {
		return user;
	}

	public void setUser(TextField user) {
		this.user = user;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public PasswordField getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(PasswordField repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public Button getRegistrarse() {
		return registrarse;
	}

	public void setRegistrarse(Button registrarse) {
		this.registrarse = registrarse;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

}