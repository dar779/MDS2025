package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-act06sesininiciada")
@JsModule("./views/vista-act06sesininiciada.ts")
public class VistaAct06sesininiciada extends LitTemplate {

    @Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("arriba")
	private HorizontalLayout arriba;
	@Id("perfil")
	private Button perfil;
	@Id("cerrarSesion")
	private Button cerrarSesion;
	@Id("Imagen")
	private Button imagen;
	@Id("Notificacion")
	private Button notificacion;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("escribir")
	private Button escribir;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("masHashtags")
	private Button masHashtags;
	@Id("hashtags")
	private Element hashtags;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("masTweets")
	private Button masTweets;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("masUsuarios")
	private Button masUsuarios;
	@Id("usuarios")
	private Element usuarios;
	@Id("vaadinVerticalLayout6")
	private Element vaadinVerticalLayout6;
	@Id("tweets")
	private Element tweets;
	@Id("vaadinVerticalLayout7")
	private Element vaadinVerticalLayout7;
	public VistaAct06sesininiciada() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public HorizontalLayout getArriba() {
		return arriba;
	}

	public void setArriba(HorizontalLayout arriba) {
		this.arriba = arriba;
	}

	public Button getPerfil() {
		return perfil;
	}

	public void setPerfil(Button perfil) {
		this.perfil = perfil;
	}

	public Button getCerrarSesion() {
		return cerrarSesion;
	}

	public void setCerrarSesion(Button cerrarSesion) {
		this.cerrarSesion = cerrarSesion;
	}

	public Button getImagen() {
		return imagen;
	}

	public void setImagen(Button imagen) {
		this.imagen = imagen;
	}

	public Button getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Button notificacion) {
		this.notificacion = notificacion;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Button getEscribir() {
		return escribir;
	}

	public void setEscribir(Button escribir) {
		this.escribir = escribir;
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

	public Element getHashtags() {
		return hashtags;
	}

	public void setHashtags(Element hashtags) {
		this.hashtags = hashtags;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public Button getMasTweets() {
		return masTweets;
	}

	public void setMasTweets(Button masTweets) {
		this.masTweets = masTweets;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

	public Button getMasUsuarios() {
		return masUsuarios;
	}

	public void setMasUsuarios(Button masUsuarios) {
		this.masUsuarios = masUsuarios;
	}

	public Element getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Element usuarios) {
		this.usuarios = usuarios;
	}

	public Element getVaadinVerticalLayout6() {
		return vaadinVerticalLayout6;
	}

	public void setVaadinVerticalLayout6(Element vaadinVerticalLayout6) {
		this.vaadinVerticalLayout6 = vaadinVerticalLayout6;
	}

	public Element getTweets() {
		return tweets;
	}

	public void setTweets(Element tweets) {
		this.tweets = tweets;
	}

	public Element getVaadinVerticalLayout7() {
		return vaadinVerticalLayout7;
	}

	public void setVaadinVerticalLayout7(Element vaadinVerticalLayout7) {
		this.vaadinVerticalLayout7 = vaadinVerticalLayout7;
	}

}