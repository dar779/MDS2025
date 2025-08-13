package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-perspectivabloqueado")
@JsModule("./views/vista-perspectivabloqueado.ts")
public class VistaPerspectivabloqueado extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("nombre")
	private TextField nombre;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("desbloquear")
	private Button desbloquear;
	@Id("foto")
	private Button foto;
	@Id("inicio")
	private Button inicio;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;

	public VistaPerspectivabloqueado() {
        // You can initialise any data required for the connected UI components here.
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

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public Button getDesbloquear() {
		return desbloquear;
	}

	public void setDesbloquear(Button desbloquear) {
		this.desbloquear = desbloquear;
	}

	public Button getFoto() {
		return foto;
	}

	public void setFoto(Button foto) {
		this.foto = foto;
	}

	public Button getInicio() {
		return inicio;
	}

	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

}