import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listadecomentarios_item')
export class VistaListadecomentarios_item extends LitElement {
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
  <vaadin-button id="foto" style="width: 1%; height: 120%; margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-l);" tabindex="0">
   Foto
  </vaadin-button>
  <vaadin-text-field id="nombre" type="text" readonly value="Nombre"></vaadin-text-field>
  <vaadin-text-field id="hora" type="text" readonly value="01/08/2025 - 18:25"></vaadin-text-field>
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 12%; height: 100%;"></vaadin-vertical-layout>
  <vaadin-text-field id="vaadinTextField" style="width: 6%;" type="text" readonly value="999"></vaadin-text-field>
  <vaadin-button id="botonMeGusta" tabindex="0">
   Me Gusta
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 10%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 80%;">
   <vaadin-text-field id="comentario" style="width: 100%; height: 100%;" type="text" readonly value="Comentario"></vaadin-text-field>
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
