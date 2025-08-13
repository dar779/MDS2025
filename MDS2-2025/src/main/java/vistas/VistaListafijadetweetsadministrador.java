package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listafijadetweetsadministrador")
@JsModule("./views/vista-listafijadetweetsadministrador.ts")
public class VistaListafijadetweetsadministrador extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("Imagen")
	private Button imagen;
	@Id("cerrarSesion")
	private Button cerrarSesion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("masTweets")
	private Button masTweets;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("lista")
	private Element lista;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;

	public VistaListafijadetweetsadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getImagen() {
		return imagen;
	}

	public void setImagen(Button imagen) {
		this.imagen = imagen;
	}

	public Button getMasTweets() {
		return masTweets;
	}

	public void setMasTweets(Button masTweets) {
		this.masTweets = masTweets;
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

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public Button getCerrarSesion() {
		return cerrarSesion;
	}

	public void setCerrarSesion(Button cerrarSesion) {
		this.cerrarSesion = cerrarSesion;
	}

	public Element getLista() {
		return lista;
	}

	public void setLista(Element lista) {
		this.lista = lista;
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

}