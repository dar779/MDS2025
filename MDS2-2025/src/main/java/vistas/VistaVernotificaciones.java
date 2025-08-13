package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-vernotificaciones")
@JsModule("./views/vista-vernotificaciones.ts")
public class VistaVernotificaciones extends LitTemplate {

    @Id("volver")
	private Button volver;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("seguimiento")
	private Element seguimiento;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("retweets")
	private Element retweets;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("menciones")
	private Element menciones;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("vaadinVerticalLayout6")
	private Element vaadinVerticalLayout6;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout7")
	private Element vaadinVerticalLayout7;

	public VistaVernotificaciones() {
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

	public Element getSeguimiento() {
		return seguimiento;
	}

	public void setSeguimiento(Element seguimiento) {
		this.seguimiento = seguimiento;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Element getRetweets() {
		return retweets;
	}

	public void setRetweets(Element retweets) {
		this.retweets = retweets;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public Element getMenciones() {
		return menciones;
	}

	public void setMenciones(Element menciones) {
		this.menciones = menciones;
	}

	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

	public Element getVaadinVerticalLayout6() {
		return vaadinVerticalLayout6;
	}

	public void setVaadinVerticalLayout6(Element vaadinVerticalLayout6) {
		this.vaadinVerticalLayout6 = vaadinVerticalLayout6;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout7() {
		return vaadinVerticalLayout7;
	}

	public void setVaadinVerticalLayout7(Element vaadinVerticalLayout7) {
		this.vaadinVerticalLayout7 = vaadinVerticalLayout7;
	}

}