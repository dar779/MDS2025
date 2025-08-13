import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listadetweetsyretweets_item')
export class VistaListadetweetsyretweets_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 20%;" id="vaadinVerticalLayout3">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; margin-top: var(--lumo-space-s);">
  <vaadin-button id="foto" style="height: 120%; width: 1%; margin-left: var(--lumo-space-l); margin-top: var(--lumo-space-m);" tabindex="0">
    Foto 
  </vaadin-button>
  <vaadin-text-field id="nombre" type="text" readonly value="Nombre"></vaadin-text-field>
  <vaadin-text-field id="hora" type="text" readonly value="01/08/2025 - 18:25"></vaadin-text-field>
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 12%; height: 100%;"></vaadin-vertical-layout>
  <vaadin-text-field type="text" readonly value="999" id="meGusta" style="width: 6%;"></vaadin-text-field>
  <vaadin-button id="botonMeGusta" tabindex="0">
   Me Gusta
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 10%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 80%;" id="vaadinVerticalLayout">
   <vaadin-text-field type="text" readonly value="Tweet" id="tweet" style="height: 100%; width: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
