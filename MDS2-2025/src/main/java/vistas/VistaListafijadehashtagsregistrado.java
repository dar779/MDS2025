package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listafijadehashtagsregistrado")
@JsModule("./views/vista-listafijadehashtagsregistrado.ts")
public class VistaListafijadehashtagsregistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public VistaListafijadehashtagsregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}