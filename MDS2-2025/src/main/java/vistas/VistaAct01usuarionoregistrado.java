package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-act01usuarionoregistrado")
@JsModule("./views/vista-act01usuarionoregistrado.ts")
public class VistaAct01usuarionoregistrado extends LitTemplate {

    @Id("masUsuarios")
	private Button masUsuarios;
	@Id("Imagen")
	private Button imagen;
	@Id("sesion")
	private Button sesion;
	@Id("registro")
	private Button registro;
	@Id("google")
	private Button google;
	@Id("masHashtags")
	private Button masHashtags;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("usuarios")
	private Element usuarios;
	@Id("centro")
	private Element centro;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("hashtags")
	private Element hashtags;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	public VistaAct01usuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
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

	public Element getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Element usuarios) {
		this.usuarios = usuarios;
	}

	public Button getMasUsuarios() {
		return masUsuarios;
	}

	public void setMasUsuarios(Button masUsuarios) {
		this.masUsuarios = masUsuarios;
	}

	public Element getCentro() {
		return centro;
	}

	public void setCentro(Element centro) {
		this.centro = centro;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getImagen() {
		return imagen;
	}

	public void setImagen(Button imagen) {
		this.imagen = imagen;
	}

	public Button getSesion() {
		return sesion;
	}

	public void setSesion(Button sesion) {
		this.sesion = sesion;
	}

	public Button getRegistro() {
		return registro;
	}

	public void setRegistro(Button registro) {
		this.registro = registro;
	}

	public Button getGoogle() {
		return google;
	}

	public void setGoogle(Button google) {
		this.google = google;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getMasHashtags() {
		return masHashtags;
	}

	public void setMasHashtags(Button masHashtags) {
		this.masHashtags = masHashtags;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public Element getHashtags() {
		return hashtags;
	}

	public void setHashtags(Element hashtags) {
		this.hashtags = hashtags;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

}