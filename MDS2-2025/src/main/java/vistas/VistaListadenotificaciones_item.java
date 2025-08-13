package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadenotificaciones_item")
@JsModule("./views/vista-listadenotificaciones_item.ts")
public class VistaListadenotificaciones_item extends LitTemplate {

    @Id("hora")
	private TextField hora;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("vaadinTextField1")
	private TextField vaadinTextField1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;

	public VistaListadenotificaciones_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField getHora() {
		return hora;
	}

	public void setHora(TextField hora) {
		this.hora = hora;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public TextField getVaadinTextField1() {
		return vaadinTextField1;
	}

	public void setVaadinTextField1(TextField vaadinTextField1) {
		this.vaadinTextField1 = vaadinTextField1;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

}