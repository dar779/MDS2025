package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.IronIcon;

@Tag("vista-verperfil")
@JsModule("./views/vista-verperfil.ts")
public class VistaVerperfil extends LitTemplate {

    @Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("foto")
	private Button foto;
	@Id("nombre")
	private TextField nombre;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("inicio")
	private Button inicio;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("numSeguidores")
	private TextField numSeguidores;
	@Id("seguir")
	private Button seguir;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("numSeguidos")
	private TextField numSeguidos;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("tweets1")
	private Button tweets1;
	@Id("retweets")
	private Button retweets;
	@Id("meGustas")
	private Button meGustas;
	@Id("tweets")
	private Element tweets;
	@Id("bloquear")
	private Button bloquear;
	@Id("editar")
	private Button editar;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("noSeguir")
	private Button noSeguir;
	@Id("seguidos")
	private Button seguidos;
	@Id("seguidores")
	private Button seguidores;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	public VistaVerperfil() {
        // You can initialise any data required for the connected UI components here.
    }
	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}
	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
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
	public Button getInicio() {
		return inicio;
	}
	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}
	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}
	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}
	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}
	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}
	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}
	public TextField getNumSeguidores() {
		return numSeguidores;
	}
	public void setNumSeguidores(TextField numSeguidores) {
		this.numSeguidores = numSeguidores;
	}
	public Button getSeguir() {
		return seguir;
	}
	public void setSeguir(Button seguir) {
		this.seguir = seguir;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public TextField getNumSeguidos() {
		return numSeguidos;
	}
	public void setNumSeguidos(TextField numSeguidos) {
		this.numSeguidos = numSeguidos;
	}
	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}
	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}
	public Button getTweets1() {
		return tweets1;
	}
	public void setTweets1(Button tweets1) {
		this.tweets1 = tweets1;
	}
	public Button getRetweets() {
		return retweets;
	}
	public void setRetweets(Button retweets) {
		this.retweets = retweets;
	}
	public Button getMeGustas() {
		return meGustas;
	}
	public void setMeGustas(Button meGustas) {
		this.meGustas = meGustas;
	}
	public Element getTweets() {
		return tweets;
	}
	public void setTweets(Element tweets) {
		this.tweets = tweets;
	}
	public Button getBloquear() {
		return bloquear;
	}
	public void setBloquear(Button bloquear) {
		this.bloquear = bloquear;
	}
	public Button getEditar() {
		return editar;
	}
	public void setEditar(Button editar) {
		this.editar = editar;
	}
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Button getNoSeguir() {
		return noSeguir;
	}
	public void setNoSeguir(Button noSeguir) {
		this.noSeguir = noSeguir;
	}
	public Button getSeguidos() {
		return seguidos;
	}
	public void setSeguidos(Button seguidos) {
		this.seguidos = seguidos;
	}
	public Button getSeguidores() {
		return seguidores;
	}
	public void setSeguidores(Button seguidores) {
		this.seguidores = seguidores;
	}
	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}
	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

}