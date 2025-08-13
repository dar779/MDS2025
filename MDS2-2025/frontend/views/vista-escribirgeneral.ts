import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-escribirgeneral')
export class VistaEscribirgeneral extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 50%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%;"></vaadin-vertical-layout>
   <vaadin-text-area placeholder="Escribe aquí" id="texto" style="width: 80%; height: 50%; align-self: center;"></vaadin-text-area>
   <vaadin-button id="twittear" style="align-self: center; margin-top: var(--lumo-space-xl);" tabindex="0">
     Twittear 
   </vaadin-button>
   <vaadin-button id="cancelar" style="align-self: center;" tabindex="0">
     Cancelar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 50%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
