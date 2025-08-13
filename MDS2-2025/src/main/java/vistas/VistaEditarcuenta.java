package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;

@Tag("vista-editarcuenta")
@JsModule("./views/vista-editarcuenta.ts")
public class VistaEditarcuenta extends LitTemplate {

    @Id("repitePassword")
	private PasswordField repitePassword;
	@Id("password")
	private PasswordField password;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("cambiarFoto")
	private Button cambiarFoto;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("cambiarPassword")
	private Button cambiarPassword;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("guardar")
	private Button guardar;
	@Id("cancelar")
	private Button cancelar;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	public VistaEditarcuenta() {
        // You can initialise any data required for the connected UI components here.
    }
	public PasswordField getRepitePassword() {
		return repitePassword;
	}
	public void setRepitePassword(PasswordField repitePassword) {
		this.repitePassword = repitePassword;
	}
	public PasswordField getPassword() {
		return password;
	}
	public void setPassword(PasswordField password) {
		this.password = password;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}
	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}
	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}
	public Button getCambiarFoto() {
		return cambiarFoto;
	}
	public void setCambiarFoto(Button cambiarFoto) {
		this.cambiarFoto = cambiarFoto;
	}
	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}
	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}
	public Button getCambiarPassword() {
		return cambiarPassword;
	}
	public void setCambiarPassword(Button cambiarPassword) {
		this.cambiarPassword = cambiarPassword;
	}
	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}
	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}
	public Button getGuardar() {
		return guardar;
	}
	public void setGuardar(Button guardar) {
		this.guardar = guardar;
	}
	public Button getCancelar() {
		return cancelar;
	}
	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}
	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}
	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}
	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}
	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

}