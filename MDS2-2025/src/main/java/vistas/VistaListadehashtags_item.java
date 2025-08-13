package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

@Tag("vista-listadehashtags_item")
@JsModule("./views/vista-listadehashtags_item.ts")
public class VistaListadehashtags_item extends LitTemplate {

    @Id("usos")
	private TextField usos;
	@Id("hashtag")
	private Button hashtag;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public VistaListadehashtags_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField getUsos() {
		return usos;
	}

	public void setUsos(TextField usos) {
		this.usos = usos;
	}

	public Button getHashtag() {
		return hashtag;
	}

	public void setHashtag(Button hashtag) {
		this.hashtag = hashtag;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}