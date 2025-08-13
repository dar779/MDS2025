package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-verhashtagnoregistrado")
@JsModule("./views/vista-verhashtagnoregistrado.ts")
public class VistaVerhashtagnoregistrado extends LitTemplate {

    @Id("volver")
	private Button volver;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("tweets")
	private Element tweets;
	@Id("hashtag")
	private Element hashtag;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;

	public VistaVerhashtagnoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getVolver() {
		return volver;
	}

	public void setVolver(Button volver) {
		this.volver = volver;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getTweets() {
		return tweets;
	}

	public void setTweets(Element tweets) {
		this.tweets = tweets;
	}

	public Element getHashtag() {
		return hashtag;
	}

	public void setHashtag(Element hashtag) {
		this.hashtag = hashtag;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

}