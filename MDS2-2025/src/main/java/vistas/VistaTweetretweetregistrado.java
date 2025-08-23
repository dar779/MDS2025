package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-tweetretweetregistrado")
@JsModule("./views/vista-tweetretweetregistrado.ts")
public class VistaTweetretweetregistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("meGusta")
	private Button meGusta;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("volver")
	private Button volver;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("comentar")
	private Button comentar;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("comentario")
	private TextArea comentario;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("reTweet")
	private Button reTweet;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("comentarios")
	private Element comentarios;

	public VistaTweetretweetregistrado() {
        // You can initialise any data required for the connected UI components here.
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

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(Button meGusta) {
		this.meGusta = meGusta;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Button getVolver() {
		return volver;
	}

	public void setVolver(Button volver) {
		this.volver = volver;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Element getComentarios() {
		return comentarios;
	}

	public void setComentarios(Element comentarios) {
		this.comentarios = comentarios;
	}

	public Button getComentar() {
		return comentar;
	}

	public void setComentar(Button comentar) {
		this.comentar = comentar;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public TextArea getComentario() {
		return comentario;
	}

	public void setComentario(TextArea comentario) {
		this.comentario = comentario;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public Button getReTweet() {
		return reTweet;
	}

	public void setReTweet(Button reTweet) {
		this.reTweet = reTweet;
	}

	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

}