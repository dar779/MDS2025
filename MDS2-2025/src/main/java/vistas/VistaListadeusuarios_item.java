package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadeusuarios_item")
@JsModule("./views/vista-listadeusuarios_item.ts")
public class VistaListadeusuarios_item extends LitTemplate {

    @Id("dejarSeguir")
	private Button dejarSeguir;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("seguir")
	private Button seguir;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("seguidores")
	private TextField seguidores;
	@Id("nombre")
	private TextField nombre;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("foto")
	private Button foto;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout6")
	private Element vaadinVerticalLayout6;
	public VistaListadeusuarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getDejarSeguir() {
		return dejarSeguir;
	}

	public void setDejarSeguir(Button dejarSeguir) {
		this.dejarSeguir = dejarSeguir;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getSeguir() {
		return seguir;
	}

	public void setSeguir(Button seguir) {
		this.seguir = seguir;
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

	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

	public TextField getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(TextField seguidores) {
		this.seguidores = seguidores;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public Button getFoto() {
		return foto;
	}

	public void setFoto(Button foto) {
		this.foto = foto;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout6() {
		return vaadinVerticalLayout6;
	}

	public void setVaadinVerticalLayout6(Element vaadinVerticalLayout6) {
		this.vaadinVerticalLayout6 = vaadinVerticalLayout6;
	}

}