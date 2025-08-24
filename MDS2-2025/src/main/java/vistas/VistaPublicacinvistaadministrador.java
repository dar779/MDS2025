package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-publicacinvistaadministrador")
@JsModule("./views/vista-publicacinvistaadministrador.ts")
public class VistaPublicacinvistaadministrador extends LitTemplate {
	
    @Id("inicio")
	private Button inicio;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("ban")
	private Button ban;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("publicacion")
	private HorizontalLayout publicacion;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("comentarios")
	private Element comentarios;
	@Id("borrar")
	private Button borrar;

	public VistaPublicacinvistaadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getInicio() {
		return inicio;
	}

	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}

	public Element getComentarios() {
		return comentarios;
	}

	public void setComentarios(Element comentarios) {
		this.comentarios = comentarios;
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

	public Button getBan() {
		return ban;
	}

	public void setBan(Button ban) {
		this.ban = ban;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Button getBorrar() {
		return borrar;
	}

	public void setBorrar(Button borrar) {
		this.borrar = borrar;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public HorizontalLayout getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(HorizontalLayout publicacion) {
		this.publicacion = publicacion;
	}

	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}
}