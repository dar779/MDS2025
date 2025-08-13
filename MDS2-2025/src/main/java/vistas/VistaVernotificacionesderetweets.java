package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-vernotificacionesderetweets")
@JsModule("./views/vista-vernotificacionesderetweets.ts")
public class VistaVernotificacionesderetweets extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public VistaVernotificacionesderetweets() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}