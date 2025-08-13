import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';

@customElement('vista-listadenotificaciones_item')
export class VistaListadenotificaciones_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 15%;" id="vaadinVerticalLayout1">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout" style="height: 100%;"></vaadin-vertical-layout>
  <vaadin-text-field id="vaadinTextField1" style="align-self: center;" type="text" readonly value="Usuario"></vaadin-text-field>
  <vaadin-text-field id="vaadinTextField" style="align-self: center;" type="text" readonly value="notificación"></vaadin-text-field>
  <vaadin-text-field style="align-self: center;" type="text" readonly id="hora" value="01/08/2025 - 18:25"></vaadin-text-field>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
