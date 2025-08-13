package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listadecomentarios_item")
@JsModule("./views/vista-listadecomentarios_item.ts")
public class VistaListadecomentarios_item extends LitTemplate {

    @Id("comentario")
	private TextField comentario;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("hora")
	private TextField hora;
	@Id("nombre")
	private TextField nombre;
	@Id("foto")
	private Button foto;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	public VistaListadecomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }
	public TextField getComentario() {
		return comentario;
	}
	public void setComentario(TextField comentario) {
		this.comentario = comentario;
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
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Button getBotonMeGusta() {
		return botonMeGusta;
	}
	public void setBotonMeGusta(Button botonMeGusta) {
		this.botonMeGusta = botonMeGusta;
	}
	public TextField getVaadinTextField() {
		return vaadinTextField;
	}
	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}
	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}
	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}
	public TextField getHora() {
		return hora;
	}
	public void setHora(TextField hora) {
		this.hora = hora;
	}
	public TextField getNombre() {
		return nombre;
	}
	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}
	public Button getFoto() {
		return foto;
	}
	public void setFoto(Button foto) {
		this.foto = foto;
	}
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}
	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}
	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}
	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

}