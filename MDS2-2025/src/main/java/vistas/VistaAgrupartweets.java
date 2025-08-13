package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-agrupartweets")
@JsModule("./views/vista-agrupartweets.ts")
public class VistaAgrupartweets extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public VistaAgrupartweets() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}