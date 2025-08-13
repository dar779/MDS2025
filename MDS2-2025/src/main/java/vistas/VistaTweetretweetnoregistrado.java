package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-tweetretweetnoregistrado")
@JsModule("./views/vista-tweetretweetnoregistrado.ts")
public class VistaTweetretweetnoregistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("tweet")
	private HorizontalLayout tweet;
	@Id("comentarios")
	private Element comentarios;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("volver")
	private Button volver;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;

	public VistaTweetretweetnoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getTweet() {
		return tweet;
	}

	public void setTweet(HorizontalLayout tweet) {
		this.tweet = tweet;
	}

	public Element getComentarios() {
		return comentarios;
	}

	public void setComentarios(Element comentarios) {
		this.comentarios = comentarios;
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

	public Button getVolver() {
		return volver;
	}

	public void setVolver(Button volver) {
		this.volver = volver;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

}